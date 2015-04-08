/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2015-04-08 15:20:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for log_comment
-- ----------------------------
DROP TABLE IF EXISTS `log_comment`;
CREATE TABLE `log_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commenter_id` int(11) NOT NULL,
  `log_id` int(11) NOT NULL,
  `content` longtext NOT NULL,
  `add_ts` varchar(255) NOT NULL,
  `state` tinyint(4) NOT NULL,
  `super_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
