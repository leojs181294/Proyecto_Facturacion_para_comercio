package ventas.service;

import ventas.entity.DetalleVenta;
import ventas.entity.Productos;
import ventas.entity.Venta;

public interface GeneraVenta {
    public Productos save(Productos productos);
    public DetalleVenta saveDetalleVentas(DetalleVenta detalleVenta);
    public Venta saveVenta(Venta venta);
    public Productos findByidproductos(Long id);
}
