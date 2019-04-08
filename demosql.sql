-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 08, 2019 lúc 10:35 AM
-- Phiên bản máy phục vụ: 10.1.38-MariaDB
-- Phiên bản PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `demosql`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `masv` varchar(50) NOT NULL,
  `link` varchar(100) NOT NULL,
  `DTB` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`id`, `name`, `masv`, `link`, `DTB`) VALUES
(24, 'Vu Khac Dien', 'DTC155D4802010018', 'https://www.facebook.com/photo.php?fbid=2296376584018062&set=pcb.2296377054018015&type=3&theater', 8.4),
(29, 'Ma The Thiem', 'DTC155D43556567', 'https://scontent.fhan4-1.fna.fbcdn.net/v/t1.0-9/56398278_2067417396712857_8599590803762839552_n.jpg?', 10),
(30, 'Hoang Van Phu', 'DTC155D43556567454', 'https://scontent.fhan4-1.fna.fbcdn.net/v/t1.0-9/56547435_2065824750205455_7402165191632224256_n.jpg?', 7);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lichhoc`
--

CREATE TABLE `lichhoc` (
  `thu` int(11) NOT NULL,
  `monhoc` varchar(100) NOT NULL,
  `giaovien` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `lichhoc`
--

INSERT INTO `lichhoc` (`thu`, `monhoc`, `giaovien`) VALUES
(3, 'android Nang Cao', 'namnv'),
(4, 'Tin hoc co so', 'namnv'),
(5, 'Unity 2D', 'namnv'),
(6, 'Tin hoc van phong', 'khanhnv'),
(7, 'Co so du lieu', 'dinhnv');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lop11305`
--

CREATE TABLE `lop11305` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `masv` varchar(50) NOT NULL,
  `link` varchar(100) NOT NULL,
  `DTB` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `lop11305`
--

INSERT INTO `lop11305` (`id`, `name`, `masv`, `link`, `DTB`) VALUES
(4, 'Huynh Bao Ty', 'Pd01813', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe1.jpg', 9),
(5, 'Huynh Bao Ty 01', 'PD1997', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe2.jpg', 8.5),
(6, 'Huynh Bao Ty 02', 'PD7991', 'http://10.18.101.40/Android_Sever_MOB401/Anhthe/anhthe2.jpg', 8.9);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `monhoc`
--

CREATE TABLE `monhoc` (
  `id` int(50) NOT NULL,
  `tenmon` varchar(50) NOT NULL,
  `thuocnganh` varchar(50) NOT NULL,
  `linkpdf` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `monhoc`
--

INSERT INTO `monhoc` (`id`, `tenmon`, `thuocnganh`, `linkpdf`) VALUES
(1, 'Tin hoc co so', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2UlBSMUJiX3NxaDA/view?usp=sharing'),
(3, 'Android Nang cao', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2NkxHSmxURVRqZTg/view?usp=sharing'),
(5, 'Tin hoc van phong', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2ZUJ1TXZjS2xGMms/view?usp=sharing'),
(6, 'Android co ban', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2aFlvMEVSRjU4bUE/view?usp=sharing'),
(7, 'Unity 2D ', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2RjVDZTJlWWpTUDA/view?usp=sharing'),
(8, 'Sever Android (php&nodejs)', 'Mobile', 'https://drive.google.com/file/d/0BwJk9UVfV1Q2czZ1YnZxOUxHbUk/view?usp=sharing');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `passs` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `Username`, `passs`) VALUES
(1, 'Tien', '123');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `lichhoc`
--
ALTER TABLE `lichhoc`
  ADD PRIMARY KEY (`thu`);

--
-- Chỉ mục cho bảng `lop11305`
--
ALTER TABLE `lop11305`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `monhoc`
--
ALTER TABLE `monhoc`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT cho bảng `lichhoc`
--
ALTER TABLE `lichhoc`
  MODIFY `thu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `lop11305`
--
ALTER TABLE `lop11305`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `monhoc`
--
ALTER TABLE `monhoc`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
