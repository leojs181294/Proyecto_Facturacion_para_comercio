package ventas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ventas.entity.Productos;
import ventas.entity.Marcas;

import java.util.List;

@Repository
public interface ProductosRepository extends BaseRepository<Productos,Long> {


    @Query(value = "SELECT * FROM ventas.productos WHERE productos.descripcion LIKE %:descripcion%",
            nativeQuery = true)
    List<Productos> findByDescripcion(String descripcion) throws Exception;
    @Query(value = "SELECT * FROM ventas.productos WHERE productos.marcas =id",
            nativeQuery = true)
    List<Marcas> findAllMarcas(Long id);
    Productos findByCodigo(String codigo) throws Exception;
}
