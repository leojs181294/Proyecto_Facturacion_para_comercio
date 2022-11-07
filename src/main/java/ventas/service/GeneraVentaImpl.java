package ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ventas.entity.DetalleVenta;
import ventas.entity.Productos;
import ventas.entity.Venta;
import ventas.repository.DetalleVentaRepository;
import ventas.repository.ProductosRepository;
import ventas.repository.VentaRepository;

import javax.transaction.Transactional;

@Service
public class GeneraVentaImpl implements GeneraVenta {
    @Autowired
    ProductosRepository productosRepository;
    @Autowired
    DetalleVentaRepository detalleVentaRepository;
    @Autowired
    VentaRepository ventaRepository;

    public Productos findByCodigo(String codigo) throws Exception {
        try{
            return productosRepository.findByCodigo(codigo);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public GeneraVentaImpl(ProductosRepository productosRepository, DetalleVentaRepository detalleVentaRepository, VentaRepository ventaRepository) {
        this.productosRepository = productosRepository;
        this.detalleVentaRepository = detalleVentaRepository;
        this.ventaRepository = ventaRepository;
    }

    @Override
    @Transactional
    public Productos save(Productos productos) {
        return productosRepository.save(productos);
    }

    @Override
    @Transactional
    public DetalleVenta saveDetalleVentas(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    @Transactional
    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    @Transactional
    public Productos findByidproductos(Long id) {
        return productosRepository.findById(id).orElse(null);
    }
}
