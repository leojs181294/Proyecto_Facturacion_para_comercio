package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
}
