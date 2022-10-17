package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ventas.entity.Marcas;
import ventas.service.MarcasServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/marcas")
public class MarcasController extends BaseControllerImpl<Marcas, MarcasServiceImpl>{
    @Autowired
    MarcasServiceImpl marcasService;

    public MarcasController(MarcasServiceImpl marcasService){
        this.marcasService = marcasService;
    }


    @GetMapping("/nom/{nombre}")
    public ResponseEntity<?> getVendedor(@PathVariable("nombre")String nombre){
        try {
            return ResponseEntity.status((HttpStatus.OK)).body(marcasService.getNombre(nombre));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Marca no encontrado\"}");
        }
    }

}
