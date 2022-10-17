package ventas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ventas.entity.FacturaVenta;

import java.util.List;

@Repository
public interface FacturaVentaRepository extends BaseRepository<FacturaVenta,Long> {
  /*  @Query(value = "select venta.id,cantidad_productos,precio_total,metodo_pago,vendedor,fecha_compra from ventas.venta inner join ventas.factura_venta on venta.factura=factura_venta.id and fecha_compra like %:fecha%:",
            nativeQuery = true)
    List<FacturaVenta> findByFecha(@Param("fecha_compra") String fecha) throws Exception;
*/
}
