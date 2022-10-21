package ventas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ventas.entity.Marcas;

import java.util.List;

@Repository
public interface MarcasRepository extends BaseRepository<Marcas,Long> {

    @Query(value = "SELECT * FROM ventas.marcas WHERE marcas.nombre LIKE %:nombre%",
            nativeQuery = true)
    List<Marcas> findByNombre(String nombre) throws Exception;
}
