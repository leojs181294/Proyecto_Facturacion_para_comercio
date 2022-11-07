package ventas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "detalle_venta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DetalleVenta extends Base{

    @Column(name = "cantidad",nullable = false)
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "producto")
    private Productos producto;

    public Double getprecio_total() {
        return cantidad.doubleValue()*producto.getPrecio_unitario();
    }

    public void aumentarCantidad() {
        this.cantidad++;
    }
}
