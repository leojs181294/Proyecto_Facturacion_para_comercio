package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ventas.entity.ProductosProv;
import ventas.service.ProductosProvServiceImpl;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/productos_prov")
public class ProductosProvController extends BaseControllerImpl<ProductosProv, ProductosProvServiceImpl>{
    @Autowired
    ProductosProvServiceImpl productosProvService;

    public ProductosProvController(ProductosProvServiceImpl productosProvService) {
        this.productosProvService = productosProvService;
    }
}
