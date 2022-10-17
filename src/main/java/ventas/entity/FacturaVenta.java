package ventas.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "factura_venta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FacturaVenta extends Base{

    @Column(name = "fecha_compra",nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime fechacompra=LocalDateTime.now();
/*
    @OneToOne(mappedBy = "factura")
    private Venta venta;
*/
}
