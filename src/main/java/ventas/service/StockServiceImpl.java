package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.Stock;
import ventas.repository.BaseRepository;
import ventas.repository.StockRepository;

@Service
public class StockServiceImpl extends BaseServiceImpl<Stock,Long> {
    @Autowired
    private StockRepository stockRepository;
    //      GENERAMOS EL CONSTRUCTOR
    public StockServiceImpl(BaseRepository<Stock,Long> baseRepository) {
        super(baseRepository);
    }

}
