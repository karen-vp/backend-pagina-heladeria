-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema heladeria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema heladeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `heladeria` DEFAULT CHARACTER SET utf8 ;
USE `heladeria` ;

-- -----------------------------------------------------
-- Table `heladeria`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `heladeria`.`categoria` (
  `categoria_id` INT NOT NULL AUTO_INCREMENT,
  `nombre_categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`categoria_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `heladeria`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `heladeria`.`productos` (
  `product_id` INT NOT NULL AUTO_INCREMENT,
  `nombre_producto` VARCHAR(150) NOT NULL,
  `precio` INT NOT NULL,
  `descripcion` VARCHAR(1000) NOT NULL,
  `categoria_id` INT NOT NULL,
  `imagen` VARCHAR(1000) NOT NULL,
  PRIMARY KEY (`product_id`),
  INDEX `fk_productos_has_categoria_idx` (`categoria_id` ASC) VISIBLE,
  CONSTRAINT `fk_productos_has_categoria`
    FOREIGN KEY (`categoria_id`)
    REFERENCES `heladeria`.`categoria` (`categoria_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `heladeria`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `heladeria`.`roles` (
  `rol_id` INT NOT NULL,
  `rol_nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`rol_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `heladeria`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `heladeria`.`usuarios` (
  `usuario_id` INT NOT NULL AUTO_INCREMENT,
  `nombre_de_usuario` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(200) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  `ubicacion` VARCHAR(200) NOT NULL,
  `rol_id` INT NOT NULL,
  PRIMARY KEY (`usuario_id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `fk_usuarios_roles_idx` (`rol_id` ASC) VISIBLE,
  CONSTRAINT `fk_usuarios_roles`
    FOREIGN KEY (`rol_id`)
    REFERENCES `heladeria`.`roles` (`rol_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `heladeria`.`ordenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `heladeria`.`ordenes` (
  `orden_id` INT NOT NULL AUTO_INCREMENT,
  `fk_usuarios_id` INT NOT NULL,
  PRIMARY KEY (`orden_id`),
  INDEX `fk_ordenes_has_usuarios_idx` (`fk_usuarios_id` ASC) VISIBLE,
  CONSTRAINT `fk_ordenes_has_usuarios`
    FOREIGN KEY (`fk_usuarios_id`)
    REFERENCES `heladeria`.`usuarios` (`usuario_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `heladeria`.`productos_has_ordenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `heladeria`.`productos_has_ordenes` (
  `productos_product_id` INT NOT NULL,
  `ordenes_orden_id` INT NOT NULL,
  `cantidad_productos` INT NOT NULL,
  PRIMARY KEY (`productos_product_id`, `ordenes_orden_id`),
  INDEX `fk_productos_has_ordenes_ordenes1_idx` (`ordenes_orden_id` ASC) VISIBLE,
  INDEX `fk_productos_has_ordenes_productos1_idx` (`productos_product_id` ASC) VISIBLE,
  CONSTRAINT `fk_productos_has_ordenes_productos1`
    FOREIGN KEY (`productos_product_id`)
    REFERENCES `heladeria`.`productos` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_productos_has_ordenes_ordenes1`
    FOREIGN KEY (`ordenes_orden_id`)
    REFERENCES `heladeria`.`ordenes` (`orden_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `heladeria`.`usuarios_roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `heladeria`.`usuarios_roles` (
  `usuarios_roles_id` INT NOT NULL,
  PRIMARY KEY (`usuarios_roles_id`),
  CONSTRAINT `fk_usuarios_rol`
    FOREIGN KEY (`usuarios_roles_id`)
    REFERENCES `heladeria`.`roles` (`rol_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
