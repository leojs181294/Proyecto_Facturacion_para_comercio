package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ventas.entity.Facturaproveedor;
import ventas.service.FacturaProveedorServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/factproveedor")
public class FacturaProveedorController extends BaseControllerImpl<Facturaproveedor, FacturaProveedorServiceImpl>{
    @Autowired
    FacturaProveedorServiceImpl facturaProveedorService;

    public FacturaProveedorController(FacturaProveedorServiceImpl facturaProveedorService){
        this.facturaProveedorService = facturaProveedorService;
    }

}
