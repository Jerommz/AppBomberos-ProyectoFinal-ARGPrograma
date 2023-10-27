-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 00:41:50
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
  `celular` int(15) NOT NULL,
  `codBrigada` int(11) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id_bombero`, `dni`, `nombre_ape`, `grupo_sang`, `fecha`, `celular`, `codBrigada`, `estado`) VALUES
(3, 11111111, 'Pepe Argento', 'O+', '1993-04-01', 1111111111, 1, 1),
(4, 77777777, 'Tito Llama', 'O+', '2003-04-01', 777777777, 7, 1),
(5, 22222222, 'Conan ElBarbaro', 'B-', '1998-05-09', 222222222, 12, 1),
(6, 33333333, 'Pipo Pescador', 'O-', '1991-09-09', 333333333, 8, 1),
(7, 44444444, 'Roger Waters', 'A-', '1990-10-09', 444444444, 12, 1),
(8, 55555555, 'Roberto Humito', 'AB-', '1997-12-09', 555555555, 7, 1),
(9, 66666666, 'Angela Fire', 'A-', '2000-12-30', 666666666, 2, 1),
(10, 88888888, 'Lorena Ceniza', 'B+', '2001-01-01', 888888888, 1, 1),
(11, 99999999, 'Juana Balde', 'AB+', '1991-01-01', 999999999, 5, 1),
(12, 11111222, 'Esperanza Llama', 'A+', '2001-02-01', 1111112222, 2, 1),
(13, 87654321, 'Bombero Loco', 'AB-', '1983-06-23', 1187654321, 9, 1),
(15, 21111111, 'Elvio Tartuolo', 'B-', '2000-04-01', 211111111, 11, 1),
(20, 67777777, 'Steve Wonders', 'O+', '2001-07-01', 677777777, 26, 1),
(21, 32222222, 'Pan Triste', 'A-', '1995-09-09', 322222222, 6, 1),
(23, 31111111, 'Jerry Lee Lewis', 'O-', '1993-04-01', 311111111, 7, 1),
(24, 99999998, 'Roberto Gota', 'A+', '1981-01-01', 999999998, 5, 1),
(25, 33222222, 'Pan Dulce', 'A+', '1996-09-12', 332222222, 6, 1),
(26, 33333332, 'Franco Lepera', 'A+', '1981-10-10', 333333332, 8, 1),
(27, 97654321, 'Lucrecia Pineda', 'AB-', '1981-07-20', 1197654321, 9, 1),
(28, 11211111, 'Moni Argento', 'O+', '1993-04-01', 1111211111, 10, 1),
(29, 77654321, 'Coqui Argento', 'B-', '1981-07-20', 1177654321, 24, 1),
(31, 77754321, 'Fatiga Argento', 'B-', '1981-12-20', 1177754321, 7, 1),
(32, 33333331, 'Jhonny Alon', 'O+', '1981-09-09', 333333331, 8, 1),
(33, 77654322, 'Paola Argento', 'B+', '1982-07-21', 1177654322, 24, 1),
(34, 66654322, 'Dardo Fuseneco', 'A+', '1980-02-23', 1166654322, 25, 1),
(35, 66654422, 'Maria Elena Fuseneco', 'A-', '1981-02-28', 1166654422, 25, 1),
(36, 66654522, 'Pablo Lamponne', 'A+', '1985-02-23', 1166654522, 26, 1),
(37, 66654722, 'Emilio Ravenna', 'B+', '1982-02-23', 1166654722, 26, 1),
(38, 66654922, 'Mario Santos', '0+', '1983-02-23', 1166654922, 26, 1),
(39, 66655922, 'Gabriel Medina', '0-', '1983-02-23', 1166655922, 26, 1),
(40, 32122222, 'Pan Salado', 'AB-', '1998-09-09', 321222222, 6, 1),
(41, 32102222, 'Pan SinTACC', 'AB+', '1997-10-09', 321022222, 6, 1),
(42, 32101222, 'Pan Salvado', 'B-', '1994-09-09', 321012222, 6, 1),
(43, 66666665, 'Lord Farquaad', 'A-', '2001-12-30', 666666665, 1, 0),
(44, 66666664, 'Homero Simpson', 'A-', '2001-12-30', 666666664, 2, 0),
(45, 66666663, 'Bart Simpson', 'A-', '2001-12-31', 666666663, 2, 1),
(46, 66666662, 'Lisa Simpson', 'A-', '2001-12-29', 666666662, 2, 1),
(47, 21011111, 'Marge Simpson', 'B-', '2002-04-01', 210111111, 11, 1),
(48, 21012111, 'Ned Flanders', 'B-', '2002-04-01', 210121111, 11, 1),
(49, 21012311, 'Montgomery Burns', 'B-', '2002-03-01', 210123111, 11, 1),
(50, 22252222, 'Moe Szyslak', 'B-', '1978-05-09', 222522222, 12, 1),
(51, 12252222, 'Abraham Simpson', 'B-', '1958-05-09', 122522222, 12, 1),
(52, 32252222, 'Waylon Smithers', 'B+', '1988-05-09', 322522222, 12, 1),
(53, 99998799, 'David Bowie', 'AB-', '1971-01-01', 999987999, 5, 1),
(54, 99998789, 'Elvis Presley', 'AB-', '1961-01-01', 999987899, 5, 1),
(55, 99998787, 'John Lennon', 'A+', '1968-01-01', 999987879, 5, 1),
(56, 32111111, 'James Brown', 'O-', '1973-04-01', 321111111, 7, 1),
(57, 33333321, 'Paul McCartney', 'O-', '1971-09-09', 333333321, 8, 1),
(58, 11221111, 'Mick Jagger', 'O+', '1973-04-01', 1111221111, 10, 1),
(59, 11222111, 'Freddie Mercury', 'B+', '1973-04-01', 1111222111, 10, 1),
(60, 11221131, 'Bob Marley', 'O-', '1973-04-01', 1111221131, 10, 1),
(61, 97654322, 'Michael Jackson', 'AB+', '1991-07-20', 1197654322, 9, 1),
(62, 97654342, 'Whitney Houston', 'A+', '1977-07-20', 1197654342, 9, 1),
(63, 97624342, 'Jim Morrison', 'A-', '1979-07-24', 1197624342, 9, 1),
(64, 87888888, 'Rod Stewart', 'B-', '2000-01-01', 878888888, 1, 1),
(65, 87688888, 'Axl Rose', 'B+', '2000-01-01', 876888888, 1, 1),
(66, 87658888, 'B.B. King', 'B+', '1970-01-01', 876588888, 1, 1),
(67, 67877777, 'Steven Tyler', 'O+', '2002-07-01', 678777777, 27, 1),
(68, 67897777, 'Aretha Franklin', 'O+', '1999-07-01', 678977777, 27, 0),
(69, 67890777, 'Roy Orbison', 'O+', '1994-07-01', 678907777, 27, 1),
(70, 66754422, 'Hank Williams', 'A-', '1988-05-28', 1166754422, 25, 1),
(71, 66754322, 'Janis Joplin', 'A-', '1989-09-29', 1166753422, 25, 1),
(72, 21111112, 'Vincent van Gogh', 'B+', '2001-04-02', 211111112, 11, 1),
(73, 11221121, 'Pablo Picasso', 'O+', '1960-04-01', 1111221121, 10, 1),
(74, 66754421, 'Claude Monet', 'A+', '1986-05-28', 1166754421, 25, 1),
(75, 67890177, 'Leonardo da Vinci', 'O+', '1994-02-01', 678901777, 27, 1),
(76, 67890127, 'Miguel Ángel', 'O+', '1990-02-01', 678901277, 27, 1),
(77, 67890123, 'Tom Cruise', 'O+', '1995-02-01', 678901237, 27, 1),
(78, 77657322, 'Leonardo DiCaprio', 'B-', '1987-07-22', 1177657322, 24, 1),
(79, 32254222, 'Dwayne Johnson', 'B+', '1989-05-09', 322542222, 12, 1),
(80, 33334321, 'Vin Diesel', 'O+', '1974-08-08', 333334321, 8, 1);

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
(1, 'Alpha', '(1) Incendios en viviendas e industrias', 0, 3),
(2, 'Beta', '(2) Salvamento en derrumbes', 1, 2),
(5, 'Gama', '(3) Rescates en ámbito montaña', 1, 7),
(6, 'Omega', '(4) Rescate de personas atrapadas en accidentes de tráfico', 1, 1),
(7, 'Ipsilon', '(5) Socorrer inundaciones', 1, 4),
(8, 'Delta', '(6) Operativos de prevención', 1, 5),
(9, 'Zeta', '(1) Incendios en viviendas e industrias', 1, 6),
(10, 'Alpha', '(1) Incendios en viviendas e industrias', 1, 1),
(11, 'Beta', '(2) Salvamento en derrumbes', 1, 1),
(12, 'Gama', '(3) Rescates en ámbito montaña', 1, 1),
(21, 'Gama', '(3) Rescates en ámbito montaña', 1, 2),
(22, 'Alpha', '(1) Incendios en viviendas e industrias', 1, 2),
(23, 'Alpha', '(1) Incendios en viviendas e industrias', 1, 7),
(24, 'Ipsilon', '(5) Socorrer inundaciones', 1, 5),
(25, 'Ipsilon', '(5) Socorrer inundaciones', 0, 6),
(26, 'Omega', '(4) Rescate de personas atrapadas en accidentes de tráfico', 1, 3),
(27, 'Omega', '(4) Rescate de personas atrapadas en accidentes de tráfico', 1, 4);

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
  `telefono` int(15) NOT NULL,
  `correo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`) VALUES
(1, 'Ituzaingo', 'Olivera 578', 22, 55, 11113333, 'ituzaingo@bomberos.com.ar'),
(2, 'Moron', '9 de Julio 127', 66, 48, 22223333, 'moron@bomberos.com.ar'),
(3, 'Palermo', 'Av. Nafta 500', 12, 95, 33334444, 'palermo@bomberos.com.ar'),
(4, 'Caballito', 'Rivadavia 16000', 87, 47, 44445555, 'caballito@bomberos.com.ar'),
(5, 'Merlo', 'Av. Baldazo 33000', 35, 60, 55556666, 'merlo@bomberos.com.ar'),
(6, 'Ciudadela', 'Av. Rio 6300', 30, 94, 66667777, 'ciudadela@bomberos.com.ar'),
(7, 'San Justo', 'Av. Fuego 700', 28, 65, 77778888, 'sanjusto@bomberos.com.ar'),
(8, 'Demo Cuartel', 'zaraza 123', 11, 22, 123, 'zaraza@blabla.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(80) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalles` text NOT NULL,
  `fecha_resol` date DEFAULT NULL,
  `puntuacion` int(11) DEFAULT NULL,
  `codBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigo`, `tipo`, `fecha_siniestro`, `coord_X`, `coord_Y`, `detalles`, `fecha_resol`, `puntuacion`, `codBrigada`) VALUES
(1, '(5)Socorrer inundaciones.', '2023-10-26', 44, 60, 'asasas\n\n\nfffff', '2023-10-26', 7, 24),
(2, '(2) Salvamento en derrumbes', '2023-10-25', 77, 48, 'asasas\nsdfsfsdf\nssssss\naaaaaa\nbbbbbb', '2023-10-26', 9, 21),
(3, '(1)Incendios en viviendas e industrias.', '2023-10-26', 55, 48, 'dwdsd', '2023-10-26', 0, 21),
(4, '(1)Incendios en viviendas e industrias.', '2023-10-26', 55, 48, 'dwdsd', '2023-10-26', 0, 21),
(5, '(1)Incendios en viviendas e industrias.', '2023-10-26', 55, 60, 'asas', '2023-10-26', 0, 24),
(6, '(1)Incendios en viviendas e industrias.', '2023-10-26', 55, 48, 'asas', '2023-10-26', 0, 22),
(7, '(1)Incendios en viviendas e industrias.', '2023-10-27', 33, 55, 'dfddd', '2023-10-27', 7, 10),
(8, '(1)Incendios en viviendas e industrias.', '2023-10-27', 55, 60, 'gfftf', '2023-10-27', 0, 24),
(9, '(1)Incendios en viviendas e industrias.', '2023-10-27', 44, 60, 'hghgh', '2023-10-27', 0, 24),
(10, '(1)Incendios en viviendas e industrias.', '2023-10-27', 66, 48, 'asasaaaaaaaaaa', '2023-10-27', 0, 21),
(11, '(2)Salvamento en derrumbes.', '2023-10-27', 66, 48, 'hhhhhhhhhhh', '2023-10-27', 0, 2),
(12, '(2)Salvamento en derrumbes.', '2023-10-27', 66, 48, 'hhhhhhhhhhh', '2023-10-27', 0, 21),
(13, '(2)Salvamento en derrumbes.', '2023-10-27', 55, 48, 'ffffffffffffff', '2023-10-27', 0, 2),
(14, '(2)Salvamento en derrumbes.', '2023-10-27', 55, 48, 'ffffffffffffff', '2023-10-27', 0, 2),
(15, '(2)Salvamento en derrumbes.', '2023-10-27', 55, 48, 'ffffffffffffff', '2023-10-27', 0, 2),
(16, '(3)Rescates en ambito montaña.', '2023-10-27', 55, 48, 'hhhhhhhh', '2023-10-27', 0, 21),
(17, '(6)Operativos de prevencion.', '2023-10-27', 33, 65, 'FFFFFFFFF', '2023-10-27', 0, 23),
(18, '(5)Socorrer inundaciones.', '2023-10-27', 55, 48, 'GGGGGGG', '2023-10-27', 0, 2),
(19, '(1)Incendios en viviendas e industrias.', '2023-10-27', 44, 60, 'dsdsd', '2023-10-27', 8, 24),
(20, '(2)Salvamento en derrumbes.', '2023-10-27', 44, 60, '44', '2023-10-27', 0, 24),
(21, '(1)Incendios en viviendas e industrias.', '2023-10-27', 44, 60, 'sdsdsdsdsdsdsd', '2023-10-27', 0, 24),
(22, '(1)Incendios en viviendas e industrias.', '2023-10-27', 88, 47, 'sddddddddddddddd', '2023-10-27', 0, 27),
(23, '(1)Incendios en viviendas e industrias.', '2023-10-27', 44, 60, 'LLLLLLLLLLL', '2023-10-27', 0, 24);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id_bombero`),
  ADD UNIQUE KEY `dni` (`dni`),
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
  MODIFY `id_bombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=81;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

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
