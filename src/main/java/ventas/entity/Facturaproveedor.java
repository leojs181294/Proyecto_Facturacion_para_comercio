package ventas.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "factura_proveedor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Facturaproveedor extends Base{

    @Column(name = "n_factura")
    private String n_factura;

    @Column(name = "fecha_compra",nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime fecha_compra=LocalDateTime.now();

//desde la factura se generan los productosProv
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<ProductosProv> productos_prov = new ArrayList<>();

    @ManyToOne
    private Proveedores proveedores;
    public double getPrecio_final() {
        double total = 00.00;

        for(ProductosProv productosProv: productos_prov) {
            total += productosProv.getprecio_total();
        }
        return total;
    }

}
