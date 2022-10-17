package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.Facturaproveedor;
import ventas.repository.BaseRepository;
import ventas.repository.FacturaProveedorRepository;

@Service
public class FacturaProveedorServiceImpl extends BaseServiceImpl<Facturaproveedor,Long> {
    @Autowired
    private FacturaProveedorRepository facturaProveedorRepository;
    //      GENERAMOS EL CONSTRUCTOR
    public FacturaProveedorServiceImpl(BaseRepository<Facturaproveedor,Long> baseRepository) {
        super(baseRepository);
    }

}
