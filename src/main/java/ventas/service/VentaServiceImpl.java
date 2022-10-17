package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.Venta;
import ventas.repository.BaseRepository;
import ventas.repository.VentaRepository;


@Service
public class VentaServiceImpl extends BaseServiceImpl<Venta,Long> {
    @Autowired
    VentaRepository ventaRepository;


    public VentaServiceImpl(BaseRepository<Venta, Long> baseRepository, VentaRepository ventaRepository) {
        super(baseRepository);
        this.ventaRepository = ventaRepository;

    }

}

