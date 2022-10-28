package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.Proveedores;
import ventas.repository.BaseRepository;
import ventas.repository.ProveedoresRepository;

import java.util.List;

@Service
public class ProveedoresServiceImpl extends BaseServiceImpl<Proveedores,Long> implements ProveedoresService {
    @Autowired
    private final ProveedoresRepository proveedoresRepository;

    //      GENERAMOS EL CONSTRUCTOR

    public ProveedoresServiceImpl(BaseRepository<Proveedores, Long> baseRepository, ProveedoresRepository proveedoresRepository) {
        super(baseRepository);
        this.proveedoresRepository = proveedoresRepository;
    }

    //  SERVICE PROPIOS DE PROVEEDORES_REPOSITORY
    public List<Proveedores> getNombreProveedor(String nombreProveedor) throws Exception {
        try {
            return proveedoresRepository.findByNombreProveedor(nombreProveedor);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public List<Proveedores> getNombreDistribuidora(String nombreDistribuidora) throws Exception {
        try {
            return proveedoresRepository.findByNombreDistribuidora(nombreDistribuidora);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
