-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 06, 2017 at 03:13 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `demosql`
--

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE IF NOT EXISTS `khachhang` (
`id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `masv` varchar(50) NOT NULL,
  `link` varchar(100) NOT NULL,
  `DTB` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`id`, `name`, `masv`, `link`, `DTB`) VALUES
(7, 'Ngoc Trinh', 'PD01834', 'http://192.168.1.14/Android_Sever_MOB401/Anhthe/anhthe4.jpg', 7),
(10, 'anh ong vang', 'pd0283', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe1.jpg', 9.7),
(11, 'Khanh Nam', 'PD01834', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe1.jpg', 8.5),
(12, 'Bui Vinh', 'PD018361', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe2.jpg', 8.2),
(13, 'Minh Nhat', 'PD01242', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe3.jpg', 7),
(14, 'Ngoc Hoi', 'PD019376', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe1.jpg', 8.3),
(15, 'Thi No', 'PD01382', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe4.jpg', 8.8),
(16, 'A Han', 'PD013834', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe5.jpg', 9.2),
(17, 'Anh la Vo dich', 'PD91424', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe1.jpg', 9.8),
(19, 'Huynh', 'Pd92742', 'null', 8),
(21, 'ff', 'f', 'f', 0),
(22, 'Them moi ten', 'pgo2u44', 'null', 9.5);

-- --------------------------------------------------------

--
-- Table structure for table `lichhoc`
--

CREATE TABLE IF NOT EXISTS `lichhoc` (
`thu` int(11) NOT NULL,
  `monhoc` varchar(100) NOT NULL,
  `giaovien` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lichhoc`
--

INSERT INTO `lichhoc` (`thu`, `monhoc`, `giaovien`) VALUES
(2, 'Androi co ban t', 'namnv'),
(3, 'android Nang Cao', 'namnv'),
(4, 'Tin hoc co so', 'namnv'),
(5, 'Unity 2D', 'namnv'),
(6, 'Tin hoc van phong', 'khanhnv'),
(7, 'Co so du lieu', 'dinhnv');

-- --------------------------------------------------------

--
-- Table structure for table `lop11305`
--

CREATE TABLE IF NOT EXISTS `lop11305` (
`id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `masv` varchar(50) NOT NULL,
  `link` varchar(100) NOT NULL,
  `DTB` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lop11305`
--

INSERT INTO `lop11305` (`id`, `name`, `masv`, `link`, `DTB`) VALUES
(4, 'Huynh Bao Ty', 'Pd01813', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe1.jpg', 9),
(5, 'Huynh Bao Ty 01', 'PD1997', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe2.jpg', 8.5),
(6, 'Huynh Bao Ty 02', 'PD7991', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe2.jpg', 8.9);

-- --------------------------------------------------------

--
-- Table structure for table `monhoc`
--

CREATE TABLE IF NOT EXISTS `monhoc` (
`id` int(50) NOT NULL,
  `tenmon` varchar(50) NOT NULL,
  `thuocnganh` varchar(50) NOT NULL,
  `linkpdf` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monhoc`
--

INSERT INTO `monhoc` (`id`, `tenmon`, `thuocnganh`, `linkpdf`) VALUES
(1, 'Tin hoc co so', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2UlBSMUJiX3NxaDA/view?usp=sharing'),
(3, 'Android Nang cao', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2NkxHSmxURVRqZTg/view?usp=sharing'),
(5, 'Tin hoc van phong', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2ZUJ1TXZjS2xGMms/view?usp=sharing'),
(6, 'Android co ban', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2aFlvMEVSRjU4bUE/view?usp=sharing'),
(7, 'Unity 2D ', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2RjVDZTJlWWpTUDA/view?usp=sharing'),
(8, 'Sever Android (php&nodejs)', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2czZ1YnZxOUxHbUk/view?usp=sharing');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lichhoc`
--
ALTER TABLE `lichhoc`
 ADD PRIMARY KEY (`thu`);

--
-- Indexes for table `lop11305`
--
ALTER TABLE `lop11305`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `monhoc`
--
ALTER TABLE `monhoc`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `khachhang`
--
ALTER TABLE `khachhang`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `lichhoc`
--
ALTER TABLE `lichhoc`
MODIFY `thu` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `lop11305`
--
ALTER TABLE `lop11305`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `monhoc`
--
ALTER TABLE `monhoc`
MODIFY `id` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
