package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.ProductosProv;
import ventas.repository.BaseRepository;
import ventas.repository.ProductosProvRepository;

@Service
public class ProductosProvServiceImpl extends BaseServiceImpl<ProductosProv,Long>{
    @Autowired
    ProductosProvRepository productosProvRepository;

    public ProductosProvServiceImpl(BaseRepository<ProductosProv, Long> baseRepository, ProductosProvRepository productosProvRepository) {
        super(baseRepository);
        this.productosProvRepository = productosProvRepository;
    }
}
