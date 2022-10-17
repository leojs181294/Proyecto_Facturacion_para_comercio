package ventas.repository;

import org.springframework.stereotype.Repository;
import ventas.entity.Venta;

@Repository
public interface VentaRepository extends BaseRepository<Venta,Long> {
}
