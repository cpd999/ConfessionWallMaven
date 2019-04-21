/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : biaobai

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-04-21 09:12:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_user
-- ----------------------------
DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user` (
  `aid` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nicheng` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_user
-- ----------------------------
INSERT INTO `admin_user` VALUES ('1', 'admin', 'admin', '超级管理员1');

-- ----------------------------
-- Table structure for biao
-- ----------------------------
DROP TABLE IF EXISTS `biao`;
CREATE TABLE `biao` (
  `nid` int(30) NOT NULL AUTO_INCREMENT,
  `uname` varchar(50) DEFAULT NULL,
  `pname` varchar(255) DEFAULT NULL,
  `neirong` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of biao
-- ----------------------------
INSERT INTO `biao` VALUES ('57', '测试1', '1234567', '12345678');
INSERT INTO `biao` VALUES ('58', '测试1', 'WDSZ', '我爱你');

-- ----------------------------
-- Table structure for pin
-- ----------------------------
DROP TABLE IF EXISTS `pin`;
CREATE TABLE `pin` (
  `pid` int(50) NOT NULL AUTO_INCREMENT,
  `nid` varchar(50) DEFAULT NULL,
  `uname` varchar(255) DEFAULT NULL,
  `huifurei` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pin
-- ----------------------------
INSERT INTO `pin` VALUES ('27', '57', '测试1', '123');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `userNicheng` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '测试1', '123');
INSERT INTO `user` VALUES ('20', '1234', '测试2', '1234');
