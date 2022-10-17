package ventas.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Stock extends Base{

    @Column(name = "cantidad",nullable = false)
    private Integer cantidad;

}
