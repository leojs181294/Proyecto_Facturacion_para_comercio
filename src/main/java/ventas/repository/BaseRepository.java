package ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ventas.entity.Base;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends Base,ID extends Serializable> extends JpaRepository<E,ID> {
}
