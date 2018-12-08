-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 08, 2018 at 06:56 AM
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
('D1324ZDC', 5000, 10, 1),
('D1425DCX', 7500, 10, 2),
('D1422DFD', 10000, 10, 3);

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
('D1123FFD', 3000, 40, 'Bus A'),
('D3241FRE', 5000, 40, 'Bus B'),
('D6582KJL', 7000, 40, 'Bus C');

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
  `deskripsi` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `non-wisata`
--

INSERT INTO `non-wisata` (`id`, `nama`, `alamat`, `deskripsi`) VALUES
('001', 'Paskal Food Market', 'Bandung Kota', 'Food Market yang terletak di pasir kaliki'),
('002', 'Yoghurt Cisangkuy', 'Bandung Kota', 'Menjual yoghurt'),
('004', 'Pinisi Resto', 'Bandung Selatan', 'Alamat : Patengan, Rancabali, Bandung, Jawa Barat 40973'),
('005', 'Saung Pengkolan', 'Bandung Utara', 'Alamat : KM 12.3 No 35, Jl. Raya Lembang, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391'),
('006', 'Floating Market', 'Bandung Utara', 'Alamat : Jl. Grand Hotel No.33E, Jalur Kampung Leuit No.A1, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391'),
('008', 'Waroeng Kuliner', 'Bandung Barat', 'Alamat : Kota Baru Parahyangan, Jalan Pitaniaga No. 7, Cipeundeuy, Padalarang, Cipeundeuy, Padalarang, Kabupaten Bandung Barat, Jawa Barat 40553');

-- --------------------------------------------------------

--
-- Table structure for table `nonwisata`
--

CREATE TABLE `nonwisata` (
  `id` varchar(20) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(70) NOT NULL,
  `deskripsi` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rute`
--

CREATE TABLE `rute` (
  `noPolisi` varchar(20) NOT NULL,
  `lokasi` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rute`
--

INSERT INTO `rute` (`noPolisi`, `lokasi`) VALUES
('D1324ZDC', 'Bandung Kota'),
('D1324ZDC', 'Bandung Barat'),
('D1425DCX', 'Bandung Kota'),
('D1425DCX', 'Bandung Barat'),
('D1425DCX', 'Bandung Utara'),
('D1422DFD', 'Bandung Kota'),
('D1422DFD', 'Bandung Barat'),
('D1422DFD', 'Bandung Utara'),
('D1422DFD', 'Bandung Selatan'),
('D1123FFD', 'Bandung Kota'),
('D1123FFD', 'Bandung Utara'),
('D3241FRE', 'Bandung Kota'),
('D3241FRE', 'Bandung Utara'),
('D3241FRE', 'Bandung Selatan'),
('D6582KJL', 'Bandung Kota'),
('D6582KJL', 'Bandung Utara'),
('D6582KJL', 'Bandung Selatan'),
('D6582KJL', 'Bandung Barat');

-- --------------------------------------------------------

--
-- Table structure for table `wisata`
--

CREATE TABLE `wisata` (
  `id` varchar(6) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(70) DEFAULT NULL,
  `deskripsi` varchar(500) DEFAULT NULL,
  `harga_tiket` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wisata`
--

INSERT INTO `wisata` (`id`, `nama`, `alamat`, `deskripsi`, `harga_tiket`) VALUES
('001', 'Babakan Siliwangi', 'Bandung Kota', 'Babakan Siliwangi atau yang dikenal disingkat dengan Baksil adalah salah satu kawasan hutan kota di Bandung, tepatnya berada di Kelurahan Babakan Siliwangi, Kecamatan Coblong, Kota Bandung. Lokasi Babakan Siliwangi yang tidak jauh dari pusat kota (berada di utara pusat kota Bandung) membuat Babakan Siliwangi menjadi Ruang Terbuka Hijau (RTH) yang paling terjangkau oleh masyarakat kota Bandung. ', 0),
('002', 'Trans Studio Bandung', 'Bandung Kota', 'Taman hiburan keluarga indoor dengan wahana seru, bioskop, & area bermain untuk anak usia dini.', 180000),
('003', 'Kawah Putih Ciwidey', 'Bandung Selatan', 'Kawah Putih adalah sebuah tempat wisata di Jawa Barat yang terletak di kawasan Ciwidey. Kawah putih merupakan sebuah danau yang terbentuk dari letusan Gunung Patuha. Tanah yang bercampur belerang di sekitar kawah ini berwarna putih, lalu warna air yang berada di kawah ini berwarna putih kehijauan, yang unik dari kawah ini adalah airnya kadang berubah warna. Kawah ini berada pada ketinggian +2090 m dpl dibawah puncak/titik tertinggi Gunung Patuha. ', 18000),
('004', 'Situ Cileunca', 'Bandung Selatan', 'Situ Cileunca adalah sebuah danau buatan dengan luas mencapai 1.400 hektar dengan latar belakang perbukitan dan pegunungan yang indah. Selain difungsikan sebagai objek wisata, Situ Cileunca juga berfungsi sebagai pembangkit listrik tenaga air (PLTA). Air yang berasal dari danau tersebut dialirkan melalui Sungai Palayangan. Sungai ini pula yang sering dijadikan sebagai arena ber-arung jeram.', 2500),
('005', 'Tangkuban Parahu', 'Bandung Utara', 'Tangkuban Parahu atau Gunung Tangkuban Perahu adalah salah satu gunung yang terletak di Provinsi Jawa Barat, Indonesia. Sekitar 20 km ke arah utara Kota Bandung, dengan rimbun pohon pinus dan hamparan kebun teh di sekitarnya, Gunung Tangkuban Perahu mempunyai ketinggian setinggi 2.084 meter. Bentuk gunung ini adalah Stratovulcano dengan pusat erupsi yang berpindah dari timur ke barat', 20000),
('007', 'Curug Malela', 'Bandung Barat', 'Curug Malela atau dalam bahasa Indonesia berarti Air Terjun Malela memiliki sumber air terjun yang  berasal dari hulu sungai bagian Utara Gunung Kendeng, yaitu sebuah gunung berapi yang terletak di sebelah barat Ciwidey yang telah mati dan kemudian mengalir melintasi sungai cidadap ? Gunung Halu.', 10000),
('008', 'Dago Dream Park', 'Bandung Barat', 'Dago Dream Park adalah resort di Bandung yang dibuat dengan mengusung konsep sebuah resort paduan etnik Jawa ? Sunda & Bali yang sangat eksotik. Lingkungan Tempat wisata di Bandung Utara ini didesain dengan tata ruang bernuansa kental pulau Dewata dengan arsitektur bangunan kombinasi Jawa ? Sunda yang unik.', 20000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
