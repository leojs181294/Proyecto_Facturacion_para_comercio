package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.DetalleVenta;
import ventas.repository.BaseRepository;
import ventas.repository.DetalleVentaRepository;

@Service
public class DetalleVentaServiceImpl extends BaseServiceImpl<DetalleVenta,Long> {


    @Autowired
    private DetalleVentaRepository detalleventaRepository;
    //      GENERAMOS EL CONSTRUCTOR
    public DetalleVentaServiceImpl(BaseRepository<DetalleVenta,Long> baseRepository) {
        super(baseRepository);
    }

}
