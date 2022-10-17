package ventas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ventas.entity.Proveedores;

import java.util.List;

@Repository
public interface ProveedoresRepository extends BaseRepository<Proveedores,Long> {

    @Query(value = "SELECT * FROM ventas.proveedores WHERE proveedores.nombre_proveedor LIKE %:nombreProveedor%",
            nativeQuery = true)
    List<Proveedores> findByNombreProveedor(@Param("nombreProveedor") String nombreProveedor) throws Exception;

    @Query(value = "SELECT * FROM ventas.proveedores WHERE proveedores.nombre_distribuidora LIKE %:nombreDistribuidora%",
            nativeQuery = true)
    List<Proveedores> findByNombreDistribuidora(@Param("nombreDistribuidora") String nombreDistribuidora) throws Exception;

}
