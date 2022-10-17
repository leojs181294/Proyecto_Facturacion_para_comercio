package ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "detalle_venta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetalleVenta extends Base{

    @Column(name = "precio_total",nullable = false)
    private Float precio_total;

    @Column(name = "cantidad",nullable = false)
    private Integer cantidad;
/*
    @ManyToMany()
    private List<Productos> productos = new ArrayList<Productos>();
*/
    @ManyToOne()
    @JoinColumn(name = "producto")
    private Productos producto;


}
