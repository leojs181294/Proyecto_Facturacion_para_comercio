package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.MetodoPago;
import ventas.repository.BaseRepository;
import ventas.repository.MetodoPagoRepository;

@Service
public class MetodoPagoServiceImpl extends BaseServiceImpl<MetodoPago,Long> {
    @Autowired
    private MetodoPagoRepository metodoPagoRepository;
    //      GENERAMOS EL CONSTRUCTOR
    public MetodoPagoServiceImpl(BaseRepository<MetodoPago,Long> baseRepository) {
        super(baseRepository);
    }

}
