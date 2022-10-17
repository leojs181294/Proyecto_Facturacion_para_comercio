package ventas.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @Column(name = "N_factura")
    private String N_factura;

    @Column(name = "fecha_compra",nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime fecha_compra=LocalDateTime.now();

//desde la factura se generan los productosProv
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<ProductosProv> productos_prov = new ArrayList<ProductosProv>();

    /*
    @ManyToOne(fetch = FetchType.LAZY,optional = false,cascade = CascadeType.PERSIST)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //para evitar el error(lazy initialization exception) de serialization
    @JoinColumn(name = "proveedor",nullable = false)
    private Proveedores proveedor;
  */
}
