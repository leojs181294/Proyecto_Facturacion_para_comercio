package ventas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ventas.entity.Facturaproveedor;
import ventas.entity.Proveedores;

import java.util.List;

@Repository
public interface FacturaProveedorRepository extends BaseRepository<Facturaproveedor,Long> {

}
