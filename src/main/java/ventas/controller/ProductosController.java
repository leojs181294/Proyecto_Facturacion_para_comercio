package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ventas.entity.Productos;
import ventas.service.ProductosServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/productos")
public class ProductosController extends BaseControllerImpl<Productos, ProductosServiceImpl>{
    @Autowired
    ProductosServiceImpl productosService;

    public ProductosController(ProductosServiceImpl productosService) {
        this.productosService = productosService;
    }

    @GetMapping("/{descripcion}")
    public ResponseEntity<?> getProducto(@PathVariable("descripcion")String descripcion){
        try {
            return ResponseEntity.status((HttpStatus.OK)).body(productosService.getDescripcion(descripcion));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Producto no encontrado\"}");
        }
    }
}
