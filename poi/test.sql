/*
 Navicat Premium Data Transfer

 Source Server         : king
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 20/03/2019 08:25:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张', '321');
INSERT INTO `user` VALUES (2, '王', '123');
INSERT INTO `user` VALUES (3, '李', '666');
INSERT INTO `user` VALUES (4, '赵', '999');
INSERT INTO `user` VALUES (5, '大魔王', '1241545');
INSERT INTO `user` VALUES (6, '大白菜', '1241545');
INSERT INTO `user` VALUES (7, '大名', '1212');
INSERT INTO `user` VALUES (8, '小明', '1212');
INSERT INTO `user` VALUES (9, '三皇', '454');
INSERT INTO `user` VALUES (10, '弟弟', '41545');
INSERT INTO `user` VALUES (11, '明明', '4454');
INSERT INTO `user` VALUES (12, '可积极', '44');
INSERT INTO `user` VALUES (13, '埃及', '47887');

SET FOREIGN_KEY_CHECKS = 1;
