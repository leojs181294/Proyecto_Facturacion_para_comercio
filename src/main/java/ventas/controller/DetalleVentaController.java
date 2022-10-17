package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ventas.entity.DetalleVenta;
import ventas.service.DetalleVentaServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/detalle_venta")
public class DetalleVentaController extends BaseControllerImpl<DetalleVenta, DetalleVentaServiceImpl>{
    @Autowired
    DetalleVentaServiceImpl detalleVentaService;

    public DetalleVentaController(DetalleVentaServiceImpl detalleVentaService){
        this.detalleVentaService = detalleVentaService;
    }

}
