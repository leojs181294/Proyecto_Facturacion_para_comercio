package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ventas.entity.Venta;
import ventas.service.VentaServiceImpl;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/venta")
public class VentaController extends BaseControllerImpl<Venta, VentaServiceImpl> {
    @Autowired
    VentaServiceImpl ventaService;

    public VentaController(VentaServiceImpl ventaService) {
        this.ventaService = ventaService;
    }
}
