-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2018 at 10:54 PM
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

--
-- Dumping data for table `angkot`
--

INSERT INTO `angkot` (`no_pol`, `tarif`, `kapasitas`, `kode`) VALUES
('D13027BTZ', 5000, 10, 1),
('D13102BSJD', 5000, 10, 2);

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

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`no_pol`, `tarif`, `kapasitas`, `nama`) VALUES
('D13027BTZ', 5000, 10, 'majalengka');

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
('jaka', 'jaka', 'jaka', 'jaka', '123123123123'),
('jaka', 'jaka', 'jaka', 'jaka', '123123123123'),
('mantap', 'mantap', 'mantap', 'mantap', '081322291482'),
('a', 'a', 'a', 'a', 'a');

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
('1', 'mantap', 'Tega Lega', 'mantap'),
('Tempat', 'mantap', 'Tega Lega', 'mantap');

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
('1', 'Nama Tempat', 'Tega Lega', '', 130000),
('Tempat', 'mantap', 'Tega Lega', 'mantap', 130000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
