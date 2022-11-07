package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ventas.entity.DetalleVenta;
import ventas.entity.Productos;
import ventas.entity.Venta;
import ventas.repository.ProductosRepository;
import ventas.repository.VentaRepository;
import ventas.service.GeneraVentaImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/vender")
public class GeneraVentaController{

    @Autowired
    GeneraVentaImpl generaVenta;

    private ArrayList<DetalleVenta> obtenerCarrito(HttpServletRequest request) {
        ArrayList<DetalleVenta> carrito = (ArrayList<DetalleVenta>) request.getSession().getAttribute("carrito");
        if (carrito == null) {
            carrito = new ArrayList<>();
        }
        return carrito;
    }
    private void guardarCarrito(ArrayList<DetalleVenta> carrito, HttpServletRequest request) {
        request.getSession().setAttribute("carrito", carrito);
    }

    private void limpiarCarrito(HttpServletRequest request) {
        this.guardarCarrito(new ArrayList<>(), request);
    }

    @GetMapping(value = "/limpiar")
    public String cancelarVenta(HttpServletRequest request, RedirectAttributes redirectAttrs) {
        this.limpiarCarrito(request);
        redirectAttrs
                .addFlashAttribute("mensaje", "Venta cancelada")
                .addFlashAttribute("clase", "info");
        return "redirect:/vender/";
    }

    @PostMapping (value = "/quitar/{indice}")
    public String quitarDelCarrito(@PathVariable Integer indice, HttpServletRequest request){
        ArrayList<DetalleVenta> carrito=this.obtenerCarrito(request);
        if (carrito != null && carrito.size() > 0 && carrito.get(indice) != null) {
            carrito.remove(indice);
            this.guardarCarrito(carrito, request);
        }
        return "redirect:/vender/";
    }
    @PostMapping(value = "/terminar")
    public String terminarVenta(HttpServletRequest request, RedirectAttributes redirectAttrs) {
        ArrayList<DetalleVenta> carrito = this.obtenerCarrito(request);
        if (carrito == null || carrito.size() <= 0) {
            return "redirect:/vender/";
        }
        Venta v= generaVenta.saveVenta(new Venta());
        // Recorrer el carrito
        for(DetalleVenta detalleVenta:carrito){
        // Obtener el producto fresco desde la base de datos
            Productos p = generaVenta.findByidproductos(detalleVenta.getId());
            if (p == null) continue; // Si es nulo o no existe, ignoramos el siguiente código con continue
            // Le restamos existencia
            p.restarStock(detalleVenta.getCantidad());
            // Lo guardamos con la existencia ya restada
            generaVenta.save(p);
        }
        // Al final limpiamos el carrito
        this.limpiarCarrito(request);
        // e indicamos una venta exitosa
        redirectAttrs
                .addFlashAttribute("mensaje", "Venta realizada correctamente")
                .addFlashAttribute("clase", "success");
        return "redirect:/vender/";
    }

}
