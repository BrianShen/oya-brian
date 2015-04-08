/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2015-04-08 15:20:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for saying
-- ----------------------------
DROP TABLE IF EXISTS `saying`;
CREATE TABLE `saying` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sayer_id` int(11) NOT NULL,
  `root_id` int(11) NOT NULL,
  `super_id` int(11) NOT NULL,
  `content` longtext NOT NULL,
  `saying_add_ts` varchar(255) NOT NULL,
  `state` int(11) NOT NULL DEFAULT '0',
  `isRead` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
