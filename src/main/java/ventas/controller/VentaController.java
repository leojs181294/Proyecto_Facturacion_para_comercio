package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ventas.entity.DetalleVenta;
import ventas.entity.Productos;
import ventas.entity.Venta;
import ventas.service.GeneraVentaImpl;
import ventas.service.VentaServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/venta")
public class VentaController extends BaseControllerImpl<Venta, VentaServiceImpl> {
    @Autowired
    VentaServiceImpl ventaService;
    @Autowired
    GeneraVentaImpl generaVenta;

    public VentaController(VentaServiceImpl ventaService) {
        this.ventaService = ventaService;
    }
    /*@PostMapping("/generar")
    public ResponseEntity<?> save(@RequestBody Venta venta,HttpServletRequest request){
        try {
            ArrayList<DetalleVenta> carrito = this.obtenerCarrito(request);
            if (carrito == null || carrito.size() <= 0) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Carrito sin productos.\"}");
            }
            // Recorrer el carrito
            for(DetalleVenta detalleVenta:carrito){
                // Obtener el producto fresco desde la base de datos
                Productos p = generaVenta.findByidproductos(detalleVenta.getId());
                if (p == null) continue; // Si es nulo o no existe, ignoramos el siguiente código con continue
                // Le restamos existencia
                p.restarStock(detalleVenta.getCantidad());
                // Lo guardamos con la existencia ya restada
                 generaVenta.save(p);
                return ResponseEntity.status((HttpStatus.OK)).body(generaVenta.save(p));
            }

            return ResponseEntity.status((HttpStatus.OK)).body(service.save(venta));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. No se pudo guardar.\"}");
        }
    }
    */




    private ArrayList<DetalleVenta> obtenerCarrito(HttpServletRequest request) {
        ArrayList<DetalleVenta> carrito = (ArrayList<DetalleVenta>) request.getSession().getAttribute("carrito");
        if (carrito == null) {
            carrito = new ArrayList<>();
        }
        return carrito;
    }
}
