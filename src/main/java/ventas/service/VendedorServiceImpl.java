package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.Vendedor;
import ventas.repository.BaseRepository;
import ventas.repository.VendedorRepository;

import java.util.List;

@Service
public class VendedorServiceImpl extends BaseServiceImpl<Vendedor,Long> {
    @Autowired
    private final VendedorRepository vendedorRepository;
    //      GENERAMOS EL CONSTRUCTOR

    public VendedorServiceImpl(BaseRepository<Vendedor, Long> baseRepository, VendedorRepository vendedorRepository) {
        super(baseRepository);
        this.vendedorRepository = vendedorRepository;
    }

    public List<Vendedor> getNombre(String nombre) throws Exception {
        try {
            return vendedorRepository.findByNombre(nombre);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
