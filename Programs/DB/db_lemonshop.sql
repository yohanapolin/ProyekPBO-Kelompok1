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

-- Data exporting was unselected.

-- Dumping structure for table db_lemonshop.kasir
CREATE TABLE IF NOT EXISTS `kasir` (
  `ID_Pengawai` varchar(50) NOT NULL,
  `Nama` varchar(100) DEFAULT NULL,
  `Alamat` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID_Pengawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

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

-- Data exporting was unselected.

-- Dumping structure for table db_lemonshop.pelayan_toko
CREATE TABLE IF NOT EXISTS `pelayan_toko` (
  `ID_Pegawai` varchar(50) NOT NULL,
  `Nama` varchar(50) DEFAULT NULL,
  `Alamat` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ID_Pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table db_lemonshop.pemiliktoko
CREATE TABLE IF NOT EXISTS `pemiliktoko` (
  `Nama` varchar(50) NOT NULL,
  `umur` int(11) DEFAULT NULL,
  `Alamat` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Nama`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table db_lemonshop.rakbuah
CREATE TABLE IF NOT EXISTS `rakbuah` (
  `ID_Rak` varchar(50) NOT NULL,
  `Kapasitas` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Rak`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

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

-- Data exporting was unselected.

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

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
