-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema tiendecita
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema tiendecita
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tiendecita` DEFAULT CHARACTER SET utf8 ;
USE `tiendecita` ;

-- -----------------------------------------------------
-- Table `tiendecita`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendecita`.`Cliente` (
  `idCliente` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Ciudad` VARCHAR(45) NOT NULL,
  `Telefono` INT(10) NOT NULL,
  `Fecha_nacimiento` DATE NULL,
  `Correo` VARCHAR(45) NOT NULL,
  `Contrasena` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tiendecita`.`Articulo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendecita`.`Articulo` (
  `id_Articulo` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Clasificacion` VARCHAR(45) NULL,
  `Costo_base` FLOAT NULL,
  `Iva` INT NULL,
  `Stock` FLOAT NULL,
  PRIMARY KEY (`id_Articulo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tiendecita`.`Proveedor`
-- -------------------------------videovideo----------------------
CREATE TABLE IF NOT EXISTS `tiendecita`.`Proveedor` (
  `idProveedor` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Ciudad` VARCHAR(45) NOT NULL,
  `Telefono` INT(10) NOT NULL,
  `Fecha_nacimiento` DATE NULL,
  `Correo` VARCHAR(45) NOT NULL,
  `Contrasena` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProveedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tiendecita`.`Detalle_Factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendecita`.`Detalle_Factura` (
  `id_factura` INT NOT NULL,
  `id_Articulo` INT NULL,
  `Cantidad` FLOAT NULL,
  `Costo` INT NULL,
  `Porcentaje_iva` INT NULL,
  `Venta` FLOAT NULL,
  `iva` FLOAT NULL,
  PRIMARY KEY (`id_factura`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tiendecita`.`Factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendecita`.`Factura` (
  `idFactura` INT NOT NULL,
  `Id_cliente` INT NOT NULL,
  `Fecha` DATE NOT NULL,
  `Subtotal` FLOAT NOT NULL,
  `iva` INT NOT NULL,
  `Valor_iva` FLOAT NOT NULL,
  `Total` FLOAT NOT NULL,
  PRIMARY KEY (`idFactura`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tiendecita`.`Tendero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tiendecita`.`Tendero` (
  `id_tendero` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellido` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(45) NOT NULL,
  `Ciudad` VARCHAR(45) NOT NULL,
  `Telefono` INT(10) NOT NULL,
  `Fecha_nacimiento` DATE NULL,
  `Correo` VARCHAR(45) NOT NULL,
  `Contrasena` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_tendero`))
ENGINE = InnoDB;


INSERT INTO `tiendecita`.`cliente` (`idCliente`, `Nombre`, `Apellido`, `Direccion`, `Ciudad`, `Telefono`, `Fecha_nacimiento`) VALUES ('1', 'andres', 'asda', 'santa marta', 'santa marta', '123234234', '2000-07-07');
INSERT INTO `tiendecita`.`cliente` (`idCliente`, `Nombre`, `Apellido`, `Direccion`, `Ciudad`, `Telefono`, `Fecha_nacimiento`) VALUES ('2', 'andres', 'asda', 'santa marta', 'santa marta', '123234234', '2000-07-07');
INSERT INTO `tiendecita`.`tendero` (`id_tendero`, `Nombre`, `Apellido`, `Direccion`, `Ciudad`, `Telefono`, `Fecha_nacimiento`) VALUES ('1', 'andres', 'asda', 'santa marta', 'santa marta', '123234234', '2000-07-07');
INSERT INTO `tiendecita`.`tendero` (`id_tendero`, `Nombre`, `Apellido`, `Direccion`, `Ciudad`, `Telefono`, `Fecha_nacimiento`) VALUES ('2', 'andres', 'asda', 'santa marta', 'santa marta', '123234234', '2000-07-07');
INSERT INTO `tiendecita`.`proveedor` (`idProveedor`, `Nombre`, `Apellido`, `Direccion`, `Ciudad`, `Telefono`, `Fecha_nacimiento`) VALUES ('1', 'andres', 'asda', 'santa marta', 'santa marta', '123234234', '2000-07-07');
INSERT INTO `tiendecita`.`proveedor` (`idProveedor`, `Nombre`, `Apellido`, `Direccion`, `Ciudad`, `Telefono`, `Fecha_nacimiento`) VALUES ('2', 'andres', 'asda', 'santa marta', 'santa marta', '123234234', '2000-07-07');


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
