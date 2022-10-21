package ventas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ventas.entity.Vendedor;

import java.util.List;
@Repository
public interface VendedorRepository extends BaseRepository<Vendedor,Long> {

    @Query(value = "SELECT * FROM ventas.vendedor WHERE vendedor.nombre LIKE %:nombre%",
            nativeQuery = true)
    List<Vendedor> findByNombre(String nombre) throws Exception;
}
