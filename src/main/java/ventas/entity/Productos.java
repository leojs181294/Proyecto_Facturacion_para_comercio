package ventas.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Productos extends Base{

    @NotNull(message = "Debes especificar el código")
    @Size(min = 1, max = 50, message = "El código debe medir entre 1 y 50")
    private String codigo;

    @NotNull(message = "Debes especificar una descripcion")
    @Size(min = 1, max = 150, message = "La descripcion debe contener entre 1 y 150 caracteres")
    @Column(name = "descripcion",length = 100,nullable = false)
    private String descripcion;

    /*@NotNull(message = "Debes especificar el precio")*/
    @Min(value = 0, message = "El precio mínimo es 0")
    @Column(name = "precio_unitario")
    private Double precio_unitario;

    /*@NotNull(message = "Debes especificar el stock")*/
    @Min(value = 0, message = "El stock mínimo es 0")
    @Column(name = "stock")
    private Integer stock;

    //primero debe estar creada la marca
    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//para evitar el error(lazy initialization exception) de serialization
    @JoinColumn(name = "marcas")
    private Marcas marcas;

    public void restarStock(Integer stock) {
        this.stock -= stock;
    }

}
