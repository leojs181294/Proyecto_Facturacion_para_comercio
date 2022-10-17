package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ventas.entity.FacturaVenta;
import ventas.service.FacturaVentaServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/factura_venta")
public class FacturaVentaController extends BaseControllerImpl<FacturaVenta, FacturaVentaServiceImpl>{
    @Autowired
    FacturaVentaServiceImpl facturaVentaService;

    public FacturaVentaController(FacturaVentaServiceImpl facturaVentaService) {
        this.facturaVentaService = facturaVentaService;
    }
    /*
    @GetMapping("/fecha/{fecha_compra}")
    public ResponseEntity<?> getFecha_compra(@PathVariable("fecha_compra")String fecha_compra){
        try {
            return ResponseEntity.status((HttpStatus.OK)).body(facturaVentaService.getFecha(fecha_compra));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Factura no encontrada\"}");
        }
    }*/
}
