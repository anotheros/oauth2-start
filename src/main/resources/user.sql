/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50519
Source Host           : 127.0.0.1:3306
Source Database       : reader

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2014-03-04 16:33:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` varchar(32) NOT NULL COMMENT 'UUID',
  `username` varchar(32) DEFAULT NULL COMMENT '用户名称',
  `password` varchar(128) DEFAULT NULL COMMENT '密码',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `lastupdate` datetime DEFAULT NULL COMMENT '最后更新时间',
  `email` varchar(63) DEFAULT NULL COMMENT '电子邮件地址',
  `status` int(11) DEFAULT NULL COMMENT '0:禁用,1:启用',
  `uri` varchar(32) DEFAULT NULL,
  `isadmin` int(11) NOT NULL DEFAULT '0' COMMENT '1是超级管理员，非1不是超级管理员，默认值0',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('098f6bcd4621d373cade4e832627b4f6', 'test', '098f6bcd4621d373cade4e832627b4f6', '2013-09-16 11:37:22', '2013-03-28 00:00:00', '', '1', '', '0');
INSERT INTO `user` VALUES ('0f86c82c39d64f76b7caf65fb0f1af63', 'Frank520', 'e10adc3949ba59abbe56e057f20f883e', '2013-09-16 11:37:22', '2013-09-16 11:37:22', 'liuyan567@gmail.com', '1', null, '0');
INSERT INTO `user` VALUES ('21232f297a57a5a743894a0e4a801fc3', 'admin', '21232f297a57a5a743894a0e4a801fc3', '2013-09-16 11:37:22', '2013-08-02 13:55:27', 'admin@admin.com', '1', 'FDVBNM', '1');
INSERT INTO `user` VALUES ('2f88837703ec46dab5556a4614014365', 'BlackGlory', '25f9e794323b453885f5181f1b624d0b', '2013-09-19 08:47:55', '2013-09-19 08:47:55', '417635640@qq.com', '1', null, '0');
INSERT INTO `user` VALUES ('bba50b8c4a4d4331b9f4d86398cb9537', 'Frank', '26253c50741faa9c2e2b836773c69fe6', '2013-08-15 18:40:18', '2013-08-15 18:40:18', null, '1', null, '0');
