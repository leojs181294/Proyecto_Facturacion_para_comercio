package ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "vendedor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vendedor extends Base{

    @Column(name = "nombre",length = 50,nullable = false)
    private String nombre;

    @Column(name = "cel")
    private Integer cel;
}
