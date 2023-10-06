-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-10-2023 a las 01:40:08
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
CREATE DATABASE IF NOT EXISTS `bomberos` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bomberos`;

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
  `celular` varchar(15) NOT NULL,
  `codBrigada` int(11) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `dni`, `nombre_ape`, `grupo_sang`, `fecha`, `celular`, `codBrigada`, `estado`) VALUES
(3, 11111111, 'Pepe Argento', '0+', '1993-04-01', '1111111111', NULL, 1),
(4, 77777777, 'Tito Llama', '0+', '2003-04-01', '7777777777', NULL, 1),
(5, 22222222, 'Conan ElBarbaro', '0-', '1998-05-09', '2222222222', NULL, 1),
(6, 33333333, 'Pipo Pescador', 'A+', '1991-09-09', '3333333333', NULL, 1),
(7, 44444444, 'Roger Waters', '0+', '1990-10-09', '4444444444', NULL, 1),
(8, 55555555, 'Roberto Humito', '0-', '1997-12-09', '5555555555', NULL, 1),
(9, 66666666, 'Angela Fire', 'A-', '2000-12-30', '6666666666', NULL, 1),
(10, 88888888, 'Lorena Ceniza', '0+', '2001-01-01', '8888888888', NULL, 1),
(11, 99999999, 'Juana Balde', '0+', '1991-01-01', '9999999999', NULL, 1),
(12, 11111222, 'Esperanza Llama', 'A+', '2001-02-01', '1111112222', NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` varchar(80) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `codCuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombre_br`, `especialidad`, `libre`, `codCuartel`) VALUES
(1, 'Alpha', '(1) Incendios en viviendas e industrias', 1, 3),
(2, 'Beta', '(2) Salvamento en derrumbes', 1, 2),
(5, 'Gama', '(3) Rescates en ámbito montaña', 1, 7),
(6, 'Omega', '(4) Rescate de personas atrapadas en accidentes de tráfico', 1, 1),
(7, 'Ipsilon', '(5) Socorrer inundaciones', 1, 4),
(8, 'Delta', '(6) operativos de prevención', 1, 5),
(9, 'Zeta', '(1) Incendios en viviendas e industrias', 1, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codCuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`) VALUES
(1, 'Ituzaingo', 'Martin Fierro 2000', 12, 59, '11112222', 'ituzaingo@bomberos.com.ar'),
(2, 'Moron', '9 de Julio 127', 66, 48, '22223333', 'moron@bomberos.com.ar'),
(3, 'Palermo', 'Av. Nafta 500', 12, 95, '33334444', 'palermo@bomberos.com.ar'),
(4, 'Caballito', 'Rivadavia 16000', 87, 47, '44445555', 'caballito@bomberos.com.ar'),
(5, 'Merlo', 'Av. Baldazo 33000', 35, 60, '55556666', 'merlo@bomberos.com.ar'),
(6, 'Ciudadela', 'Av. Rio 6300', 30, 94, '66667777', 'ciudadela@bomberos.com.ar'),
(7, 'San Justo', 'Av. Fuego 700', 28, 65, '77778888', 'sanjusto@bomberos.com.ar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalles` text NOT NULL,
  `fecha_resol` date NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `codBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codBrigada`),
  ADD KEY `codCuartel` (`codCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigo`),
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
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`codCuartel`) REFERENCES `cuartel` (`codCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
