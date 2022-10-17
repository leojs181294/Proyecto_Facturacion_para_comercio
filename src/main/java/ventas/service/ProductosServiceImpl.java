package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.Productos;
import ventas.repository.BaseRepository;
import ventas.repository.ProductosRepository;

import java.util.List;

@Service
public class ProductosServiceImpl extends BaseServiceImpl<Productos,Long>{
    @Autowired
    ProductosRepository productosRepository;

    public ProductosServiceImpl(BaseRepository<Productos, Long> baseRepository, ProductosRepository productosRepository) {
        super(baseRepository);
        this.productosRepository = productosRepository;
    }
    public List<Productos> getDescripcion(String descripcion) throws Exception {
        try {
            return productosRepository.findByDescripcion(descripcion);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
