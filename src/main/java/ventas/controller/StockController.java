package ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ventas.entity.Stock;
import ventas.service.StockServiceImpl;

@RestController
@CrossOrigin(origins = "*") // utilizada para permitir el acceso de distintos usuarios
@RequestMapping(path = "/stock")
public class StockController extends BaseControllerImpl<Stock, StockServiceImpl>{
    @Autowired
    StockServiceImpl stockService;

    public StockController(StockServiceImpl stockService){
        this.stockService = stockService;
    }

}
