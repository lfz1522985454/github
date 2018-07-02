/*
Navicat MySQL Data Transfer

Source Server         : tcmp058
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : login

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2018-06-29 11:28:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `subjectId` int(11) NOT NULL AUTO_INCREMENT,
  `subjectName` varchar(20) NOT NULL,
  `gradeId` int(11) NOT NULL,
  `createDate` datetime DEFAULT NULL,
  PRIMARY KEY (`subjectId`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES ('1', '走进Java编程世界', '1', '2018-03-14 08:23:28');
INSERT INTO `subject` VALUES ('5', '深入.NET平台和C#编程', '2', '2018-03-14 08:23:42');
INSERT INTO `subject` VALUES ('6', '设计MySchool数据库', '2', '2018-03-22 08:23:46');
INSERT INTO `subject` VALUES ('7', '基于.NET平台的软件系统分层开发', '2', '2018-03-19 08:23:49');
INSERT INTO `subject` VALUES ('8', '面向对象程序设计', '2', '2018-03-10 08:23:52');
INSERT INTO `subject` VALUES ('9', '使用JavaScript增强交互效果', '2', '2018-03-04 08:23:56');
INSERT INTO `subject` VALUES ('10', '使用Java EE技术开发新闻发布系统', '2', '2018-03-30 08:24:01');
INSERT INTO `subject` VALUES ('11', '使用ASP.NET技术开发网上书店', '3', '2018-03-06 08:24:05');
INSERT INTO `subject` VALUES ('12', '开发基于Ajax和控件技术的Web应用系', '3', '2018-03-16 08:24:08');
INSERT INTO `subject` VALUES ('13', '使用Java框架技术开发网上信息发布系统', '3', '2018-02-26 08:24:13');
INSERT INTO `subject` VALUES ('14', '实习', '1', null);
INSERT INTO `subject` VALUES ('15', '实习2', '2', null);
INSERT INTO `subject` VALUES ('16', '实习1111', '1', '2014-05-06 00:00:00');
