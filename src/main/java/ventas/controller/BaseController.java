package ventas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import ventas.entity.Base;

import java.io.Serializable;

public interface BaseController <E extends Base,ID extends Serializable>{
    ResponseEntity<?> getall();
    ResponseEntity<?> getId(@PathVariable ID id);
    ResponseEntity<?> save(@RequestBody E entity);
    ResponseEntity<?> update(@PathVariable ID id,@RequestBody E entity);
    ResponseEntity<?> delete(@PathVariable ID id);
}
