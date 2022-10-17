package ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "marcas")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Marcas extends Base{

    @Column(name = "nombre",length = 50,nullable = false)
    private String nombre;
    /*
    @OneToMany(mappedBy = "Marcas")
    private Set<Productos> Producto=new HashSet<>();
*/}
