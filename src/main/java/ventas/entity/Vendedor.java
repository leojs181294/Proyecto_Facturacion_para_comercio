package ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vendedor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vendedor extends Base{

    @Column(unique = true, length = 20)
    private String username;

    @Column(length = 60)
    private String password;

    @Column(name = "apellido",length = 50,nullable = false)
    private String apellido;

    @Column(name = "nombre",length = 50,nullable = false)
    private String nombre;

    @Column(name = "cel")
    private Integer cel;

    @Column(unique = true)
    private String email;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Roles> roles;
}
