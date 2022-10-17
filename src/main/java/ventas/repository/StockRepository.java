package ventas.repository;

import org.springframework.stereotype.Repository;
import ventas.entity.Stock;

@Repository
public interface StockRepository extends BaseRepository<Stock,Long> {
}
