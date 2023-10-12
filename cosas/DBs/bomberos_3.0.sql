-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-10-2023 a las 00:07:30
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `id_bombero` int(11) NOT NULL,
  `dni` int(8) NOT NULL,
  `nombre_ape` varchar(50) NOT NULL,
  `grupo_sang` varchar(8) NOT NULL,
  `fecha` date NOT NULL,
  `celular` int(15) NOT NULL,
  `codBrigada` int(11) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `dni`, `nombre_ape`, `grupo_sang`, `fecha`, `celular`, `codBrigada`, `estado`) VALUES
(3, 11111111, 'Pepe Argento', '0+', '1993-04-01', 1111111111, 1, 1),
(4, 77777777, 'Tito Llama', '0+', '2003-04-01', 2147483647, NULL, 1),
(5, 22222222, 'Conan ElBarbaro', '0-', '1998-05-09', 2147483647, NULL, 1),
(6, 33333333, 'Pipo Pescador', 'A+', '1991-09-09', 2147483647, NULL, 1),
(7, 44444444, 'Roger Waters', '0+', '1990-10-09', 2147483647, NULL, 1),
(8, 55555555, 'Roberto Humito', '0-', '1997-12-09', 2147483647, NULL, 1),
(9, 66666666, 'Angela Fire', 'A-', '2000-12-30', 2147483647, 2, 0),
(10, 88888888, 'Lorena Ceniza', '0+', '2001-01-01', 2147483647, 1, 1),
(11, 99999999, 'Juana Balde', '0+', '1991-01-01', 2147483647, 5, 1),
(12, 11111222, 'Esperanza Llama', 'A+', '2001-02-01', 1111112222, 2, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombero`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
