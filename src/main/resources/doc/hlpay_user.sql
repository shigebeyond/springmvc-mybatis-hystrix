/*
 Navicat Premium Data Transfer

 Source Server         : mysql-localhost
 Source Server Type    : MySQL
 Source Server Version : 50616
 Source Host           : localhost
 Source Database       : mybatis-plus

 Target Server Type    : MySQL
 Target Server Version : 50616
 File Encoding         : utf-8

 Date: 06/25/2017 20:53:49 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `hlpay_user`
-- ----------------------------
DROP TABLE IF EXISTS `hlpay_user`;
CREATE TABLE `hlpay_user` (
  `id` bigint(20) NOT NULL COMMENT '用户ID',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `state` int(3) DEFAULT NULL COMMENT '认证状态: 0 未认证 1 部分认证 3 全部认证',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='认证用户表';

-- ----------------------------
--  Records of `hlpay_user`
-- ----------------------------
BEGIN;
INSERT INTO `hlpay_user`(id,name,state) VALUES (1,'li',0);
INSERT INTO `hlpay_user`(id,name,state) VALUES (2,'wang',1);
INSERT INTO `hlpay_user`(id,name,state) VALUES (3,'shi',1);
INSERT INTO `hlpay_user`(id,name,state) VALUES (4,'zhao',2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
