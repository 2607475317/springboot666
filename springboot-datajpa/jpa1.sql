/*
 Navicat Premium Data Transfer

 Source Server         : king
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : jpa1

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 20/03/2019 08:24:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `last_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES (1, '6666666@163.com', '王');
INSERT INTO `tbl_user` VALUES (2, '5555555@qq.com', '张');
INSERT INTO `tbl_user` VALUES (3, '55555', '3');
INSERT INTO `tbl_user` VALUES (4, '44444', '4');
INSERT INTO `tbl_user` VALUES (5, '55555555', '5');
INSERT INTO `tbl_user` VALUES (6, '666666', '6');
INSERT INTO `tbl_user` VALUES (7, '7777777', '7');
INSERT INTO `tbl_user` VALUES (8, '888888', '8');
INSERT INTO `tbl_user` VALUES (9, '9999999', '9');

SET FOREIGN_KEY_CHECKS = 1;
