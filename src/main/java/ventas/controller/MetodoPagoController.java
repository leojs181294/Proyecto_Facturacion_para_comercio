package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ventas.entity.MetodoPago;
import ventas.service.MetodoPagoServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/metodo_pago")
public class MetodoPagoController extends BaseControllerImpl<MetodoPago, MetodoPagoServiceImpl>{
    @Autowired
    MetodoPagoServiceImpl metodoPagoService;

    public MetodoPagoController(MetodoPagoServiceImpl metodoPagoService){
        this.metodoPagoService = metodoPagoService;
    }

}
