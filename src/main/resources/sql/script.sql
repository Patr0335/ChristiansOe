-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema christiansoe
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema christiansoe
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `christiansoe` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `christiansoe` ;

-- -----------------------------------------------------
-- Table `christiansoe`.`exercise`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `christiansoe`.`exercise` (
                                                         `id` INT NOT NULL,
                                                         `name` VARCHAR(45) NULL DEFAULT NULL,
    `description` VARCHAR(500) NULL DEFAULT NULL,
    `duration` INT NULL DEFAULT NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `christiansoe`.`file`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `christiansoe`.`file` (
                                                     `id` INT NOT NULL,
                                                     `name` VARCHAR(45) NULL DEFAULT NULL,
    `timestamp` DATE NULL DEFAULT NULL,
    `type` VARCHAR(45) NULL DEFAULT NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `christiansoe`.`tourguide`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `christiansoe`.`tourguide` (
                                                          `id` INT NOT NULL,
                                                          `username` VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `christiansoe`.`tour_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `christiansoe`.`tour_type` (
                                                          `id` INT NOT NULL AUTO_INCREMENT,
                                                          `type` VARCHAR(45) NULL DEFAULT NULL,
    `season` VARCHAR(45) NULL DEFAULT NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 5
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `christiansoe`.`tour`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `christiansoe`.`tour` (
                                                     `id` INT NOT NULL AUTO_INCREMENT,
                                                     `name` VARCHAR(45) NULL DEFAULT NULL,
    `type_id` INT NULL DEFAULT NULL,
    `duration` INT NULL DEFAULT NULL,
    `exercise_id` INT NULL DEFAULT NULL,
    `tourguide_id` INT NULL DEFAULT NULL,
    `file_id` INT NULL DEFAULT NULL,
    PRIMARY KEY (`id`),
    INDEX `id_idx` (`exercise_id` ASC) VISIBLE,
    INDEX `id_idx1` (`tourguide_id` ASC) VISIBLE,
    INDEX `type_idx` (`type_id` ASC) VISIBLE,
    INDEX `file_id_idx` (`file_id` ASC) VISIBLE,
    CONSTRAINT `exercise_id`
    FOREIGN KEY (`exercise_id`)
    REFERENCES `christiansoe`.`exercise` (`id`),
    CONSTRAINT `file_id`
    FOREIGN KEY (`file_id`)
    REFERENCES `christiansoe`.`file` (`id`),
    CONSTRAINT `tourguide_id`
    FOREIGN KEY (`tourguide_id`)
    REFERENCES `christiansoe`.`tourguide` (`id`),
    CONSTRAINT `type`
    FOREIGN KEY (`type_id`)
    REFERENCES `christiansoe`.`tour_type` (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 2
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
