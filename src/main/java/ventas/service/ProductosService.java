package ventas.service;

import ventas.entity.Marcas;
import ventas.entity.Productos;

import java.util.List;

public interface ProductosService extends BaseService<Productos,Long>{
    List<Marcas> findAllMarcas(Long id);
}
