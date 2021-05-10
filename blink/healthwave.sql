-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: May 10, 2021 at 05:16 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `healthwave`
--

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
CREATE TABLE IF NOT EXISTS `appointment` (
  `ID` int(11) NOT NULL,
  `Pname` varchar(45) NOT NULL,
  `Dep` varchar(45) NOT NULL,
  `Dname` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL,
  `Time` varchar(45) NOT NULL,
  `Pmail` varchar(45) NOT NULL,
  `Pnum` varchar(10) CHARACTER SET utf8 NOT NULL,
  `Message` varchar(100) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`ID`, `Pname`, `Dep`, `Dname`, `Date`, `Time`, `Pmail`, `Pnum`, `Message`, `Status`) VALUES
(703935, 'Prabhashi Hettiarachchi', 'Dentists', 'Wijaya Bandara', '26/05/2021', '8:52 PM', 'pubzzz2002@gmail.com', '0703479616', '', 'Active'),
(916939, 'gdn hettiarachchi', 'Neurology', 'Wijaya Bandara', '30/06/2021', '4:52 PM', 'gdgfdg@gmail.com', '703479616', 'fsfsf', 'Inactive'),
(474664, 'Okith Ranasinghe', 'Cancer Department', 'D.S.A.Silva', '10/05/2021', '12:25 PM', 'okith@gmail.com', '0718965421', '', 'Active'),
(223997, 'Prabhashi Hettiarachchi', 'Neurology', 'Wijaya Bandara', '27/05/2021', '3:54 PM', 'pubzzz2002@gmail.com', '0703479616', '', 'Inactive'),
(569717, 'Prabhashi Hettiarachchi', 'Dentists', 'Wijaya Bandara', '26/05/2021', '8:52 PM', 'pubzzz2002@gmail.com', '0703479616', '', 'Active'),
(401636, 'Vishwa G Pathirana', 'Opthalmology', 'Wijaya Bandara', '26/05/2021', '9:09 PM', 'visse@gmail.com', '0785963214', 'csadasdsa', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `ID` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Description` varchar(100) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`ID`, `Name`, `Description`, `Status`) VALUES
(18, 'pediatrician', 'fsfsdfsdf fsdfsdf fdfsdff', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE IF NOT EXISTS `doctor` (
  `docID` varchar(5) NOT NULL,
  `Fname` varchar(45) DEFAULT NULL,
  `Lname` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  ` pass` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  ` state` varchar(45) DEFAULT NULL,
  ` code` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `bio` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`docID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`docID`, `Fname`, `Lname`, `username`, `email`, ` pass`, `dob`, `gender`, `address`, `country`, `city`, ` state`, ` code`, `phone`, `bio`, `status`) VALUES
('114', 'Chandana', 'Bandara', 'chandana', 'chandana@gmail.com', 'chandana123', '29/11/1990', 'male', '28 Greenland mawatha', 'Sri Lanka', 'Nadimala', 'Colombo', '10350', '0705684932', 'fhsfusfsdf fsdfsfsdfs fsfsdfsfds ss', 'active');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `PID` int(11) NOT NULL,
  `Fname` varchar(45) DEFAULT NULL,
  `Lname` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`PID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`PID`, `Fname`, `Lname`, `username`, `email`, `pass`, `dob`, `gender`, `address`, `country`, `city`, `state`, `code`, `phone`) VALUES
(26847, 'Prabhashi', 'Hettiarachchi', 'pubzzz2002', 'pubzzz2002@gmail.com', '123', '30/04/2021', 'Female', '28 Greenland Mawatha', NULL, 'Dehiwala-Mount Lavinia', NULL, '10350', '0703479616');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
CREATE TABLE IF NOT EXISTS `salary` (
  `SID` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `basic` int(11) DEFAULT NULL,
  `DA` int(11) DEFAULT NULL,
  `HRA` int(11) DEFAULT NULL,
  `Conveyance` int(11) DEFAULT NULL,
  `Allowance` int(11) DEFAULT NULL,
  `medical` int(11) DEFAULT NULL,
  `other1` int(11) DEFAULT NULL,
  `TDS` int(11) DEFAULT NULL,
  `ESI` int(11) DEFAULT NULL,
  `PF` int(11) DEFAULT NULL,
  `Leave` int(11) DEFAULT NULL,
  `Tax` int(11) DEFAULT NULL,
  `welfare` int(11) DEFAULT NULL,
  `fund` int(11) DEFAULT NULL,
  `other2` int(11) DEFAULT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
CREATE TABLE IF NOT EXISTS `schedule` (
  `SCID` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `days` varchar(500) DEFAULT NULL,
  `start` varchar(45) DEFAULT NULL,
  `end` varchar(45) DEFAULT NULL,
  `message` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SCID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`SCID`, `name`, `days`, `start`, `end`, `message`, `status`) VALUES
(90441, 'GDN Hettiarachchi', NULL, '12:30 PM', '1:30 PM', 'dsdfsdfsf', 'Inactive'),
(31458, 'Hettiarachchi', 'Sunday', '10:31 PM', '10:50 PM', 'fsdfsf', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `ID` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `username`, `password`, `email`) VALUES
(100, 'Prabhashi ', '12345', 'pubzzz2002@gmail.com'),
(320, 'Vishwa', '123', 'vishwa@gmail.com'),
(903, 'Hettiarachchi', '12345', 'gdnh57@gmail.com'),
(754, 'Dineth', 'dineth123', 'dineth@gmail.com'),
(257, 'Admin', 'admin123', 'admin2000@healthwave.com'),
(339, 'amaya', 'amaya123', 'amaya@gmail.com'),
(182, 'GDN Hettiarachchi', '1234567890', 'gdnh57@gmail.com');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
