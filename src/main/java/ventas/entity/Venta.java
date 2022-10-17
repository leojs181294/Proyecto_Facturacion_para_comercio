package ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "venta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Venta extends Base{

    @Column(name = "cantidad_productos", nullable = false)
    private Integer cantidad;

    @Column(name = "precio_total", nullable = false)
    private Float precio_total;
    //se crea de la venta
    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "factura")
    private FacturaVenta factura;

    @ManyToOne()
    @JoinColumn(name = "metodo_pago")
    private MetodoPago metodo_pago;

    @ManyToOne()
    @JoinColumn(name = "vendedor")
    private Vendedor vendedor;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "detalle_productos_venta",
            joinColumns = @JoinColumn(name = "venta"),
            inverseJoinColumns = @JoinColumn(name = "productos"))
    private List<DetalleVenta> detalleventas = new ArrayList<DetalleVenta>();
}