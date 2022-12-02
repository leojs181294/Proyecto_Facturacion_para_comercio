package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.FacturaVenta;
import ventas.repository.BaseRepository;
import ventas.repository.FacturaVentaRepository;

@Service
public class FacturaVentaServiceImpl extends BaseServiceImpl<FacturaVenta,Long>{
    @Autowired
    FacturaVentaRepository facturaVentaRepository;
    public FacturaVentaServiceImpl(BaseRepository<FacturaVenta, Long> baseRepository) {
        super(baseRepository);
    }

}
