package ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "productos_prov")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductosProv extends Base{

    @Column(name = "cantidad",nullable = false)
    private Integer cantidad;
    @Column(name = "precio_costo",nullable = false)
    private Double precio_costo;

    //tiene que estar el producto creado para poder asignarlo
    @ManyToOne()
    @JoinColumn(name = "id_producto")
    private Productos productos;

    public Double getprecio_total() {
        return cantidad.doubleValue()*precio_costo;
    }

}
