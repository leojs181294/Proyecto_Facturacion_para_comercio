package ventas.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Productos extends Base{


    @Column(name = "descripcion",length = 100,nullable = false)
    private String descripcion;

    @Column(name = "precio_unitario",nullable = false)
    private Float precio_unitario;

    @Column(name = "stock",nullable = false)
    private Integer stock;

    //primero debe estar creada la marca
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "marcas")
    private Marcas marcas;
    /*
    @ManyToOne(fetch = FetchType.LAZY,optional = false) //lazy es carga peresoza nos trae el dato cuando le indiquemos
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//para evitar el error(lazy initialization exception) de serialization
    @JoinColumn (name = "Marcas ")
    private Marcas Marcas;
*/
}
