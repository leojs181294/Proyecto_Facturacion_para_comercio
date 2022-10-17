package ventas.repository;

import org.springframework.stereotype.Repository;
import ventas.entity.Vendedor;

import java.util.List;
@Repository
public interface VendedorRepository extends BaseRepository<Vendedor,Long> {
    List<Vendedor> findByNombre(String nombre) throws Exception;
}
