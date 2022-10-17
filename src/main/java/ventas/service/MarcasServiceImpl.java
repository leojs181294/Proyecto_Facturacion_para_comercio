package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.Marcas;
import ventas.repository.BaseRepository;
import ventas.repository.MarcasRepository;

import java.util.List;

@Service
public class MarcasServiceImpl extends BaseServiceImpl<Marcas,Long> {
    @Autowired
    private MarcasRepository marcasRepository;
    //      GENERAMOS EL CONSTRUCTOR
    public MarcasServiceImpl(BaseRepository<Marcas,Long> baseRepository) {
        super(baseRepository);
    }

    public List<Marcas> getNombre(String nombre) throws Exception {
        try {
            return marcasRepository.findByNombre(nombre);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
