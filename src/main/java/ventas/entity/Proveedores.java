package ventas.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "proveedores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EnableJpaAuditing
public class Proveedores extends Base {

    @Column(name = "nombre_proveedor", nullable = false, length = 20)
    private String nombreProveedor;
    @Column(name = "cel", nullable = false)
    private Integer cel;
    @Column(name = "nombre_distribuidora", length = 50, nullable = false)
    private String nombreDistribuidora;

    @Column(name = "direccion", length = 50)
    private String direccion;
//desde proveedores se puede generar una nueva factura
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "facturas_del_proveedor",
            joinColumns = @JoinColumn(name = "proveedores"),
            inverseJoinColumns = @JoinColumn(name = "factura"))
    private List<Facturaproveedor> facturaProveedor = new ArrayList<Facturaproveedor>();
}