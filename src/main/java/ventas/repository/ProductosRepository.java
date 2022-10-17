package ventas.repository;

import org.springframework.stereotype.Repository;
import ventas.entity.Productos;

import java.util.List;

@Repository
public interface ProductosRepository extends BaseRepository<Productos,Long> {
    List<Productos> findByDescripcion(String descripcion) throws Exception;
}
