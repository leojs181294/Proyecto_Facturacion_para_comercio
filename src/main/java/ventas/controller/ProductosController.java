package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ventas.entity.Marcas;
import ventas.entity.Productos;
import ventas.service.ProductosServiceImpl;

import java.util.List;

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
    @GetMapping("/produc")
    public ResponseEntity<?> index() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productosService.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente mas tarde.\"}");
        }
    }
    @GetMapping("/marcas/{id}")
    public List<Marcas> listarMarcas(Long id) {
        return productosService.findAllMarcas(id);
    }
}
