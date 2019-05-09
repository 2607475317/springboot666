/*
 Navicat Premium Data Transfer

 Source Server         : king
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : jpa6

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 20/03/2019 08:30:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (4, 18, '123', '王');
INSERT INTO `tb_user` VALUES (2, 88, '123', '123');
INSERT INTO `tb_user` VALUES (3, 45, '123', '张');
INSERT INTO `tb_user` VALUES (5, 99, 'lll', '刘');
INSERT INTO `tb_user` VALUES (6, 32, '123', '关');

SET FOREIGN_KEY_CHECKS = 1;
