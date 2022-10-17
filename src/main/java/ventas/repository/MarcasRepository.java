package ventas.repository;

import org.springframework.stereotype.Repository;
import ventas.entity.Marcas;

import java.util.List;

@Repository
public interface MarcasRepository extends BaseRepository<Marcas,Long> {
    List<Marcas> findByNombre(String nombre) throws Exception;
}
