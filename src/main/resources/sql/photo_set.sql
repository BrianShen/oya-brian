/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2015-04-08 15:20:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for photo_set
-- ----------------------------
DROP TABLE IF EXISTS `photo_set`;
CREATE TABLE `photo_set` (
  `id` int(11) NOT NULL,
  `host_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `add_ts` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `password` varchar(500) DEFAULT NULL,
  `cover_img_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
