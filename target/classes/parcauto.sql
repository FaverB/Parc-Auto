-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Lun 16 Novembre 2015 à 16:35
-- Version du serveur: 5.5.46-0ubuntu0.14.04.2
-- Version de PHP: 5.5.9-1ubuntu4.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `parcauto`
--
CREATE DATABASE IF NOT EXISTS `parcauto` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `parcauto`;

-- --------------------------------------------------------

--
-- Structure de la table `chauffeurs`
--

CREATE TABLE IF NOT EXISTS `chauffeurs` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nom` varchar(35) NOT NULL,
  `prenom` varchar(66) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `garages`
--

CREATE TABLE IF NOT EXISTS `garages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nom` varchar(35) NOT NULL,
  `localisation` varchar(66) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `voitures`
--

CREATE TABLE IF NOT EXISTS `voitures` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `immatriculation` varchar(35) NOT NULL,
  `marque` varchar(35) NOT NULL,
  `couleur` varchar(35) NOT NULL,
  `garage_id` bigint(20) NOT NULL,
  `chauffeur_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `garage_id` (`garage_id`),
  KEY `chauffeur_id` (`chauffeur_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `voitures`
--
ALTER TABLE `voitures`
  ADD CONSTRAINT `fk_chauffeurs` FOREIGN KEY (`chauffeur_id`) REFERENCES `chauffeurs` (`id`),
  ADD CONSTRAINT `fk_garages` FOREIGN KEY (`garage_id`) REFERENCES `garages` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
