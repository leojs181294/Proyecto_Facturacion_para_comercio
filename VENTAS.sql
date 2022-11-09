CREATE DATABASE ventas;

USE ventas;
delimiter $$
DROP TRIGGER IF EXISTS trgActualizarStockVenta $$
CREATE TRIGGER trgActualizarStockVenta
BEFORE INSERT ON detalle_venta
FOR EACH ROW
BEGIN
    UPDATE productos SET stock= stock - NEW.cantidad WHERE productos.id=NEW.producto;
END $$
delimiter ;

USE ventas;
delimiter $$
DROP TRIGGER IF EXISTS trgActualizarStockCompra $$
CREATE TRIGGER trgActualizarStockCompra
AFTER INSERT ON productos_prov
FOR EACH ROW
BEGIN
    UPDATE productos SET stock= stock + NEW.cantidad WHERE productos.id=NEW.id_producto;
END $$
delimiter ;


