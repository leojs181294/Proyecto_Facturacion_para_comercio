package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ventas.entity.Vendedor;
import ventas.service.VendedorServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/vendedor")
public class VendedorController extends BaseControllerImpl<Vendedor, VendedorServiceImpl>{
    @Autowired
    VendedorServiceImpl vendedorService;

    public VendedorController(VendedorServiceImpl vendedorService){
        this.vendedorService = vendedorService;
    }


    @GetMapping("/nom/{nombre}")
    public ResponseEntity<?> getVendedor(@PathVariable("nombre")String nombre){
        try {
            return ResponseEntity.status((HttpStatus.OK)).body(vendedorService.getNombre(nombre));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Vendedor no encontrado\"}");
        }
    }

}
