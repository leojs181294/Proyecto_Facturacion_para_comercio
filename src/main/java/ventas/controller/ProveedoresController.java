package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ventas.entity.Proveedores;
import ventas.service.ProveedoresServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/proveedores")
public class ProveedoresController extends BaseControllerImpl<Proveedores, ProveedoresServiceImpl> {
    @Autowired
    ProveedoresServiceImpl proveedoresService;

    public ProveedoresController(ProveedoresServiceImpl proveedoresService){
        this.proveedoresService = proveedoresService;
    }


    @GetMapping("/proveedor/{nombreProveedor}")
    public ResponseEntity<?> getProveedor(@PathVariable ("nombreProveedor")String nombreProveedor){
        try {
            return ResponseEntity.status((HttpStatus.OK)).body(proveedoresService.getNombreProveedor(nombreProveedor));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Proveedor no encontrado\"}");
        }
    }
    @GetMapping("/distribuidora/{nombreDistribuidora}")
    public ResponseEntity<?> getDistribuidora(@PathVariable ("nombreDistribuidora")String nombreDistribuidora){
        try {
            return ResponseEntity.status((HttpStatus.OK)).body(proveedoresService.getNombreDistribuidora(nombreDistribuidora));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Distribuidora no encontrado\"}");
        }
    }
   }

