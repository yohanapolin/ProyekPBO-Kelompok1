-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.12-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for db_lemonshop
CREATE DATABASE IF NOT EXISTS `db_lemonshop` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_lemonshop`;

-- Dumping structure for table db_lemonshop.buah
CREATE TABLE IF NOT EXISTS `buah` (
  `Id_buah` varchar(50) NOT NULL,
  `nama_buah` varchar(50) DEFAULT NULL,
  `Stok` int(11) DEFAULT NULL,
  `Harga` int(11) DEFAULT NULL,
  `Tanggal_Kadaluarsa` date DEFAULT NULL,
  `ID_Rak` varchar(40) NOT NULL,
  PRIMARY KEY (`Id_buah`),
  KEY `ID_Rak` (`ID_Rak`),
  CONSTRAINT `buah_ibfk_1` FOREIGN KEY (`ID_Rak`) REFERENCES `rakbuah` (`ID_Rak`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table db_lemonshop.buah: ~10 rows (approximately)
/*!40000 ALTER TABLE `buah` DISABLE KEYS */;
INSERT INTO `buah` (`Id_buah`, `nama_buah`, `Stok`, `Harga`, `Tanggal_Kadaluarsa`, `ID_Rak`) VALUES
	('120001', 'belimbing', 20, 20000, '2020-12-12', '140001'),
	('120003', 'Jeruk', 100, 20000, '2020-06-09', '140002'),
	('120004', 'Mangga', 20, 30000, '2020-06-17', '140004'),
	('120005', 'Jeruk', 40, 20000, '2020-06-22', '140002'),
	('120006', 'Pir', 70, 30000, '2020-06-15', '140005'),
	('120009', 'Lemon', 100, 80000, '2020-06-09', '140007'),
	('120013', 'mangga', 20, 25000, '2020-12-12', '140011'),
	('120020', 'Mangga Harus Manis', 10, 30000, '2020-06-09', '140011'),
	('120021', 'Mangga Harum Manis', 20, 25000, '2020-06-30', '140001'),
	('120030', 'Anggur', 43, 50000, '2020-12-12', '140011');
/*!40000 ALTER TABLE `buah` ENABLE KEYS */;

-- Dumping structure for table db_lemonshop.kasir
CREATE TABLE IF NOT EXISTS `kasir` (
  `ID_Pengawai` varchar(50) NOT NULL,
  `Nama` varchar(100) DEFAULT NULL,
  `Alamat` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID_Pengawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table db_lemonshop.kasir: ~3 rows (approximately)
/*!40000 ALTER TABLE `kasir` DISABLE KEYS */;
INSERT INTO `kasir` (`ID_Pengawai`, `Nama`, `Alamat`) VALUES
	('12012', 'Suriani', 'jl Yosudarso, Kec. Rantu Laban, Kota Tebing Tinggi'),
	('12014', 'Supratman ', 'jl M.H Thamrin, Pasar Gambir Kec. Tebing Tinggi Kota,  Kota Tebing Tinggi'),
	('12026', 'Tejo Alexander', 'jl Imam Bonjo, Kota Tebing Tinggi');
/*!40000 ALTER TABLE `kasir` ENABLE KEYS */;

-- Dumping structure for table db_lemonshop.laporan
CREATE TABLE IF NOT EXISTS `laporan` (
  `No_Laporan` varchar(50) NOT NULL,
  `JenisLaporan` varchar(50) DEFAULT 'Pejualan',
  `Tanggal_Laporan` date DEFAULT NULL,
  `Kasir` varchar(50) DEFAULT NULL,
  `Pengawai` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`No_Laporan`),
  KEY `Kasir` (`Kasir`),
  KEY `Pengawai` (`Pengawai`),
  CONSTRAINT `laporan_ibfk_1` FOREIGN KEY (`Kasir`) REFERENCES `pelayan_toko` (`ID_Pegawai`),
  CONSTRAINT `laporan_ibfk_2` FOREIGN KEY (`Pengawai`) REFERENCES `kasir` (`ID_Pengawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table db_lemonshop.laporan: ~4 rows (approximately)
/*!40000 ALTER TABLE `laporan` DISABLE KEYS */;
INSERT INTO `laporan` (`No_Laporan`, `JenisLaporan`, `Tanggal_Laporan`, `Kasir`, `Pengawai`) VALUES
	('130001', 'Pejualan', '2020-06-09', '12004', NULL),
	('130002', 'Stok', '2018-06-09', NULL, '12012'),
	('130004', 're-Stok', '2020-06-09', NULL, '12014'),
	('130005', 'Pejualan', '2020-06-09', '12004', '12012');
/*!40000 ALTER TABLE `laporan` ENABLE KEYS */;

-- Dumping structure for table db_lemonshop.pelayan_toko
CREATE TABLE IF NOT EXISTS `pelayan_toko` (
  `ID_Pegawai` varchar(50) NOT NULL,
  `Nama` varchar(50) DEFAULT NULL,
  `Alamat` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID_Pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table db_lemonshop.pelayan_toko: ~4 rows (approximately)
/*!40000 ALTER TABLE `pelayan_toko` DISABLE KEYS */;
INSERT INTO `pelayan_toko` (`ID_Pegawai`, `Nama`, `Alamat`) VALUES
	('12001', 'Rifaldi Harahap', 'Jl St. Ka Sei Bamban Kec. Sei Bamban, Kabupaten Serdang Bedagai'),
	('12003', 'Syafitri', 'Komplek Tanjug Gading Inalum, Kec. Batubara, Kab Sumatera Utara'),
	('12004', 'Mantissa A.O.K', NULL),
	('12006', 'Syaputra', 'komlek Tanjung Gading Inalu, Kec. Batubara,  Kab Sumutera Utara');
/*!40000 ALTER TABLE `pelayan_toko` ENABLE KEYS */;

-- Dumping structure for table db_lemonshop.pemiliktoko
CREATE TABLE IF NOT EXISTS `pemiliktoko` (
  `Nama` varchar(50) NOT NULL,
  `umur` int(11) DEFAULT NULL,
  `Alamat` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Nama`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table db_lemonshop.pemiliktoko: ~1 rows (approximately)
/*!40000 ALTER TABLE `pemiliktoko` DISABLE KEYS */;
INSERT INTO `pemiliktoko` (`Nama`, `umur`, `Alamat`) VALUES
	('Pak Lemon', 50, 'jl K.F Tandean Kec Tebing Tinggi Kota, Kota Tebing Tnggi');
/*!40000 ALTER TABLE `pemiliktoko` ENABLE KEYS */;

-- Dumping structure for table db_lemonshop.rakbuah
CREATE TABLE IF NOT EXISTS `rakbuah` (
  `ID_Rak` varchar(50) NOT NULL,
  `Kapasitas` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Rak`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table db_lemonshop.rakbuah: ~10 rows (approximately)
/*!40000 ALTER TABLE `rakbuah` DISABLE KEYS */;
INSERT INTO `rakbuah` (`ID_Rak`, `Kapasitas`) VALUES
	('140001', 100),
	('140002', 100),
	('140004', 100),
	('140005', 100),
	('140006', 100),
	('140007', 100),
	('140008', 100),
	('140009', 100),
	('140010', 100),
	('140011', 100);
/*!40000 ALTER TABLE `rakbuah` ENABLE KEYS */;

-- Dumping structure for table db_lemonshop.transaksi
CREATE TABLE IF NOT EXISTS `transaksi` (
  `No_Transaksi` varchar(50) NOT NULL,
  `Tanggal` date DEFAULT NULL,
  `JumlahTransaksi` bigint(20) DEFAULT NULL,
  `Kasir` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`No_Transaksi`),
  KEY `Kasir` (`Kasir`),
  CONSTRAINT `Kasir` FOREIGN KEY (`Kasir`) REFERENCES `kasir` (`ID_Pengawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table db_lemonshop.transaksi: ~4 rows (approximately)
/*!40000 ALTER TABLE `transaksi` DISABLE KEYS */;
INSERT INTO `transaksi` (`No_Transaksi`, `Tanggal`, `JumlahTransaksi`, `Kasir`) VALUES
	('09062020001', '2020-06-09', 20000, '12014'),
	('09062020002', '2020-06-09', 100000, '12014'),
	('09062020003', '2020-06-09', 4000000, '12014'),
	('09062020004', '2020-06-09', 60000, '12014');
/*!40000 ALTER TABLE `transaksi` ENABLE KEYS */;

-- Dumping structure for table db_lemonshop.transaksi_restok
CREATE TABLE IF NOT EXISTS `transaksi_restok` (
  `ID_Transaksi` varchar(50) NOT NULL,
  `Tanggal` date NOT NULL,
  `nama_buah` varchar(50) NOT NULL,
  `Jumlah (kg)` int(11) DEFAULT NULL,
  `Supplier` varchar(50) NOT NULL,
  `Harga beli (rupiah/kg)` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID_Transaksi`,`Tanggal`,`nama_buah`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table db_lemonshop.transaksi_restok: ~3 rows (approximately)
/*!40000 ALTER TABLE `transaksi_restok` DISABLE KEYS */;
INSERT INTO `transaksi_restok` (`ID_Transaksi`, `Tanggal`, `nama_buah`, `Jumlah (kg)`, `Supplier`, `Harga beli (rupiah/kg)`) VALUES
	('2100001', '2020-06-13', 'Apel', 20, 'Masayu ', 20000),
	('2100001', '2020-06-13', 'Jeruk', 30, 'Masayu', 15000),
	('2100001', '2020-06-13', 'mangga', 20, 'Masayu', 20000);
/*!40000 ALTER TABLE `transaksi_restok` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
