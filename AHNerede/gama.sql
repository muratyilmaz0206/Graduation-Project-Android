-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Anamakine: localhost
-- Üretim Zamanı: 25 May 2014, 15:09:20
-- Sunucu sürümü: 5.6.12-log
-- PHP Sürümü: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Veritabanı: `gama`
--
CREATE DATABASE IF NOT EXISTS `gama` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `gama`;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hasta`
--

CREATE TABLE IF NOT EXISTS `hasta` (
  `id` int(10) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` int(10) NOT NULL,
  `name_surname` varchar(255) NOT NULL,
  `doctor_id` int(10) NOT NULL,
  `doctor_name_surname` varchar(255) NOT NULL,
  `role_id` int(10) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `hasta`
--

INSERT INTO `hasta` (`id`, `username`, `password`, `name_surname`, `doctor_id`, `doctor_name_surname`, `role_id`, `role`) VALUES
(1001, 'muratyilmaz', 12345, 'Murat YILMAZ', 6001, 'ALI ISKA', 1, 'hasta'),
(1002, 'devrimseral', 567, 'DEVRIM SERAL', 6002, 'ECE TEKUN', 1, 'hasta'),
(1003, 'erbugcelebi', 789, 'ERBUG CELEBI', 6001, 'ALI ISKA', 1, 'hasta'),
(6001, 'aliiska', 345, 'ALI ISKA', 6024, 'BAHAR OZCAN', 2, 'doktor'),
(6002, 'ecetekun', 123, 'ECE TEKUN', 6023, 'CENK YAVUZ', 2, 'doktor');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `randevu`
--

CREATE TABLE IF NOT EXISTS `randevu` (
  `randevu_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `doctor_id` int(10) NOT NULL,
  `date` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  PRIMARY KEY (`randevu_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=63 ;

--
-- Tablo döküm verisi `randevu`
--

INSERT INTO `randevu` (`randevu_id`, `username`, `doctor_id`, `date`, `time`) VALUES
(58, 'muratyilmaz', 6001, '24-05-2014', '09.00 '),
(60, 'devrimseral', 6002, '24-05-2014', '09.00 '),
(61, 'muratyilmaz', 6001, '25-05-2014', '09.00 '),
(62, 'devrimseral', 6002, '25-05-2014', '09.00 ');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `recete`
--

CREATE TABLE IF NOT EXISTS `recete` (
  `d_id` int(10) NOT NULL,
  `date` varchar(255) NOT NULL,
  `hasta_username` varchar(255) NOT NULL,
  `recete_info` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `recete`
--

INSERT INTO `recete` (`d_id`, `date`, `hasta_username`, `recete_info`) VALUES
(6001, '24-05-2014', 'muratyilmaz', 'ates dusurucu');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sevk`
--

CREATE TABLE IF NOT EXISTS `sevk` (
  `d_id` int(10) NOT NULL,
  `date` varchar(255) NOT NULL,
  `hasta_username` varchar(255) NOT NULL,
  `sevk_info` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Tablo döküm verisi `sevk`
--

INSERT INTO `sevk` (`d_id`, `date`, `hasta_username`, `sevk_info`) VALUES
(6001, '24-05-2014', 'muratyilmaz', 'Nalbantoglu hastanesine sevk edildi.'),
(6001, '24-05-2015', 'muratyilmaz', 'hf');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
