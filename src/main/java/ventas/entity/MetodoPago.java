package ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "metodo_de_pago")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MetodoPago extends Base{

    @Column(name = "tipo_pago",length = 50,nullable = false)
    private String tipo_pago;
}
