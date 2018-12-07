-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 07, 2018 at 01:43 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `btg`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nama` varchar(40) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `no_hp` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`, `nama`, `email`, `no_hp`) VALUES
('admin', 'admin', 'mimin', 'mimin@mimin.com', '081308130813'),
('admin', 'admin', 'mimin', 'mimin@mimin.com', '081308130813');

-- --------------------------------------------------------

--
-- Table structure for table `angkot`
--

CREATE TABLE `angkot` (
  `no_pol` varchar(20) NOT NULL,
  `tarif` double NOT NULL,
  `kapasitas` int(11) DEFAULT NULL,
  `kode` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `no_pol` varchar(20) NOT NULL,
  `tarif` double NOT NULL,
  `kapasitas` int(11) DEFAULT NULL,
  `nama` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nama` varchar(40) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `no_hp` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`username`, `password`, `nama`, `email`, `no_hp`) VALUES
('jaka', 'jaka', 'jak', 'jaka', '0813291');

-- --------------------------------------------------------

--
-- Table structure for table `non-wisata`
--

CREATE TABLE `non-wisata` (
  `id` varchar(6) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(70) DEFAULT NULL,
  `deskripsi` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `non-wisata`
--

INSERT INTO `non-wisata` (`id`, `nama`, `alamat`, `deskripsi`) VALUES
('001', 'Non Wisata BK 1', 'Bandung Kota', 'mantap'),
('002', 'Non Wisata BK 2', 'Bandung Kota', 'mantap'),
('003', 'Non Wisata BB 1', 'Bandung Barat', 'mantap'),
('004', 'Non Wisata BB 2', 'Bandung Barat', 'mantap'),
('005', 'Non Wisata BU 1', 'Bandung Utara', 'mantap'),
('006', 'Non Wisata BU 2', 'Bandung Utara', 'mantap'),
('007', 'Non Wisata BS 1', 'Bandung Selatan', 'mantap'),
('008', 'Non Wisata BS 2', 'Bandung Selatan', 'mantap');

-- --------------------------------------------------------

--
-- Table structure for table `nonwisata`
--

CREATE TABLE `nonwisata` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(70) NOT NULL,
  `deskripsi` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rute`
--

CREATE TABLE `rute` (
  `noPolisi` varchar(20) NOT NULL,
  `lokasi` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `wisata`
--

CREATE TABLE `wisata` (
  `id` varchar(6) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(70) DEFAULT NULL,
  `deskripsi` varchar(150) DEFAULT NULL,
  `harga_tiket` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wisata`
--

INSERT INTO `wisata` (`id`, `nama`, `alamat`, `deskripsi`, `harga_tiket`) VALUES
('001', 'Wisata BK 1', 'Bandung Kota', 'mantap', 30000),
('002', 'Wisata BK 2', 'Bandung Kota', 'mantap', 20000),
('003', 'Wisata BB 1', 'Bandung Barat', 'mantap', 20000),
('004', 'Wisata BB 2', 'Bandung Barat', 'mantap', 40000),
('005', 'Wisata BU 1', 'Bandung Utara', 'mantap', 50000),
('006', 'Wisata BU 2', 'Bandung Utara', 'mantap', 10000),
('007', 'Wisata BS 1', 'Bandung Selatan', 'mantap', 10000),
('008', 'Wisata BS 2', 'Bandung Selatan', 'mantap', 20000),
('009', 'a', 'Bandung Kota', 'a', 130000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
