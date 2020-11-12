-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3308
-- Generation Time: Nov 12, 2020 at 03:51 PM
-- Server version: 8.0.18
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rustyrepairdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `nic` varchar(10) NOT NULL,
  `cus_name` varchar(30) DEFAULT NULL,
  `cus_address` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `telphone` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`nic`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`nic`, `cus_name`, `cus_address`, `email`, `telphone`) VALUES
('465V', 'sdasdas', 'spijhp', 'xzcv@lk.com', ' 35464324'),
('46512355V', 'mhtgvb', 'dfvg', ' ty@opp.com', ' 000000');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `EID` varchar(5) NOT NULL,
  `NIC` varchar(10) DEFAULT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Tel` int(11) DEFAULT NULL,
  `J_Allocate` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`EID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EID`, `NIC`, `Name`, `Address`, `Tel`, `J_Allocate`) VALUES
('E01', '98651V', 'poaifup', 'iou', 9875, 'FREE'),
('E02', '85258V', ';plpmuj', 'rtyv', 195784, 'Restoration');

-- --------------------------------------------------------

--
-- Table structure for table `repairjobs`
--

DROP TABLE IF EXISTS `repairjobs`;
CREATE TABLE IF NOT EXISTS `repairjobs` (
  `rj_id` varchar(5) NOT NULL,
  `rj_job_name` varchar(30) DEFAULT NULL,
  `customer` varchar(10) DEFAULT NULL,
  `e_id` varchar(5) DEFAULT NULL,
  `cost` float DEFAULT NULL,
  `sales` float DEFAULT NULL,
  `status` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `s_date` date DEFAULT NULL,
  `e_date` date DEFAULT NULL,
  PRIMARY KEY (`rj_id`),
  KEY `rj2` (`customer`),
  KEY `rj3` (`e_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `repairjobs`
--

INSERT INTO `repairjobs` (`rj_id`, `rj_job_name`, `customer`, `e_id`, `cost`, `sales`, `status`, `s_date`, `e_date`) VALUES
('RP001', 'Sunbaru', '465V', 'E01', 456, 600, 'Pending', '2010-11-11', '2010-11-11'),
('RP002', 'Toyota', '46512355V', 'E02', 1000, 12000, 'Completed', '2010-05-25', '2010-05-25');

-- --------------------------------------------------------

--
-- Table structure for table `spareparts`
--

DROP TABLE IF EXISTS `spareparts`;
CREATE TABLE IF NOT EXISTS `spareparts` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `partname` varchar(30) DEFAULT NULL,
  `cost` float DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `supplierid` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  KEY `s1` (`supplierid`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `spareparts`
--

INSERT INTO `spareparts` (`s_id`, `partname`, `cost`, `quantity`, `supplierid`) VALUES
(3, 'Clutch', 255, 300, '');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE IF NOT EXISTS `supplier` (
  `psid` varchar(5) NOT NULL,
  `sup_name` varchar(20) DEFAULT NULL,
  `tele` int(11) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`psid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`psid`, `sup_name`, `tele`, `address`) VALUES
('SP002', 'nsnhsd', 89321, 'poikj');

-- --------------------------------------------------------

--
-- Table structure for table `vehicalrestore`
--

DROP TABLE IF EXISTS `vehicalrestore`;
CREATE TABLE IF NOT EXISTS `vehicalrestore` (
  `vr_id` varchar(5) NOT NULL,
  `vr_job_name` varchar(30) DEFAULT NULL,
  `customer` varchar(10) DEFAULT NULL,
  `e_id` varchar(5) DEFAULT NULL,
  `cost` float DEFAULT NULL,
  `sales` float DEFAULT NULL,
  `status` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `s_date` date DEFAULT NULL,
  `e_date` date DEFAULT NULL,
  PRIMARY KEY (`vr_id`),
  KEY `r2` (`customer`),
  KEY `r3` (`e_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `vehicalrestore`
--

INSERT INTO `vehicalrestore` (`vr_id`, `vr_job_name`, `customer`, `e_id`, `cost`, `sales`, `status`, `s_date`, `e_date`) VALUES
('VR001', 'Prius', '', '', 5000, 6000, 'Completed', '2000-10-11', '2000-10-11');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
