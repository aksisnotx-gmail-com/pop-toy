-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot20g2h564
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springboot20g2h564`
--

/*!40000 DROP DATABASE IF EXISTS `springboot20g2h564`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot20g2h564` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot20g2h564`;

--
-- Table structure for table `aboutus`
--

DROP TABLE IF EXISTS `aboutus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aboutus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `subtitle` varchar(200) DEFAULT NULL COMMENT '副标题',
  `content` longtext NOT NULL COMMENT '内容',
  `picture1` longtext COMMENT '图片1',
  `picture2` longtext COMMENT '图片2',
  `picture3` longtext COMMENT '图片3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='关于我们';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aboutus`
--

LOCK TABLES `aboutus` WRITE;
/*!40000 ALTER TABLE `aboutus` DISABLE KEYS */;
INSERT INTO `aboutus` VALUES (1,'2050-04-27 03:02:04','关于我们','ABOUT US','当你设想门外是寒冷可怕的世界时，你还应该开门出去看看，是否真的如此。如果你有信心，你对前途就不犹豫了。如果你有勇气，你就不怕前途是否有困难或危险了每个人心中都应有两盏灯，一盏是希望的灯，一盏是勇气的灯。有了这两盏灯，我们就不怕海上的黑暗和风涛的险恶了。人的一生很像是在雾中行走。远远望去，只是迷蒙一片，辨不出方向和吉凶。可是，当你鼓起勇气，放下恐惧和怀疑，一步一步向前走去的时候，你就会发现，每走一步，你都能把下一步路看得清楚一点。“往前走，别站在远远的地方观望！”你就可以找到你的方向。','upload/aboutus_picture1.jpg','upload/aboutus_picture2.jpg','upload/aboutus_picture3.jpg');
/*!40000 ALTER TABLE `aboutus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2050-04-27 03:02:04',11,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2050-04-27 03:02:04',12,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2050-04-27 03:02:04',13,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2050-04-27 03:02:04',14,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2050-04-27 03:02:04',15,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2050-04-27 03:02:04',16,'宇宙银河系月球1号','月某','13823888886','是'),(7,'2050-04-27 03:02:04',17,'宇宙银河系黑洞1号','黑某','13823888887','是'),(8,'2050-04-27 03:02:04',18,'宇宙银河系地球1号','地某','13823888888','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) DEFAULT 'shoubanshangpin' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` longtext COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double DEFAULT NULL COMMENT '单价',
  `goodtype` varchar(200) DEFAULT NULL COMMENT '商品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussshoubanshangpin`
--

DROP TABLE IF EXISTS `discussshoubanshangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussshoubanshangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='手办商品评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussshoubanshangpin`
--

LOCK TABLES `discussshoubanshangpin` WRITE;
/*!40000 ALTER TABLE `discussshoubanshangpin` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussshoubanshangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext COMMENT '头像',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  `istop` int(11) DEFAULT '0' COMMENT '是否置顶',
  `toptime` datetime DEFAULT NULL COMMENT '置顶时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='手办论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (91,'2050-04-27 03:02:03','帖子标题1','帖子内容1',0,1,'用户名1','upload/forum_avatarurl1.jpg,upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg','开放',0,'2050-04-27 11:02:03'),(92,'2050-04-27 03:02:03','帖子标题2','帖子内容2',0,2,'用户名2','upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg','开放',0,'2050-04-27 11:02:03'),(93,'2050-04-27 03:02:03','帖子标题3','帖子内容3',0,3,'用户名3','upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg','开放',0,'2050-04-27 11:02:03'),(94,'2050-04-27 03:02:03','帖子标题4','帖子内容4',0,4,'用户名4','upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg','开放',0,'2050-04-27 11:02:03'),(95,'2050-04-27 03:02:03','帖子标题5','帖子内容5',0,5,'用户名5','upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg','开放',0,'2050-04-27 11:02:03'),(96,'2050-04-27 03:02:03','帖子标题6','帖子内容6',0,6,'用户名6','upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg','开放',0,'2050-04-27 11:02:03'),(97,'2050-04-27 03:02:03','帖子标题7','帖子内容7',0,7,'用户名7','upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg','开放',0,'2050-04-27 11:02:03'),(98,'2050-04-27 03:02:03','帖子标题8','帖子内容8',0,8,'用户名8','upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg,upload/forum_avatarurl10.jpg','开放',0,'2050-04-27 11:02:03');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext COMMENT '头像',
  `content` longtext NOT NULL COMMENT '留言内容',
  `cpicture` longtext COMMENT '留言图片',
  `reply` longtext COMMENT '回复内容',
  `rpicture` longtext COMMENT '回复图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=169 DEFAULT CHARSET=utf8 COMMENT='留言板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (161,'2050-04-27 03:02:04',1,'用户名1','upload/messages_avatarurl1.jpg','留言内容1','upload/messages_cpicture1.jpg','回复内容1','upload/messages_rpicture1.jpg'),(162,'2050-04-27 03:02:04',2,'用户名2','upload/messages_avatarurl2.jpg','留言内容2','upload/messages_cpicture2.jpg','回复内容2','upload/messages_rpicture2.jpg'),(163,'2050-04-27 03:02:04',3,'用户名3','upload/messages_avatarurl3.jpg','留言内容3','upload/messages_cpicture3.jpg','回复内容3','upload/messages_rpicture3.jpg'),(164,'2050-04-27 03:02:04',4,'用户名4','upload/messages_avatarurl4.jpg','留言内容4','upload/messages_cpicture4.jpg','回复内容4','upload/messages_rpicture4.jpg'),(165,'2050-04-27 03:02:04',5,'用户名5','upload/messages_avatarurl5.jpg','留言内容5','upload/messages_cpicture5.jpg','回复内容5','upload/messages_rpicture5.jpg'),(166,'2050-04-27 03:02:04',6,'用户名6','upload/messages_avatarurl6.jpg','留言内容6','upload/messages_cpicture6.jpg','回复内容6','upload/messages_rpicture6.jpg'),(167,'2050-04-27 03:02:04',7,'用户名7','upload/messages_avatarurl7.jpg','留言内容7','upload/messages_cpicture7.jpg','回复内容7','upload/messages_rpicture7.jpg'),(168,'2050-04-27 03:02:04',8,'用户名8','upload/messages_avatarurl8.jpg','留言内容8','upload/messages_cpicture8.jpg','回复内容8','upload/messages_rpicture8.jpg');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT 'shoubanshangpin' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` longtext COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` double NOT NULL DEFAULT '0' COMMENT '价格',
  `total` double NOT NULL DEFAULT '0' COMMENT '总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) DEFAULT NULL COMMENT '收货人',
  `logistics` longtext COMMENT '物流',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `goodtype` varchar(200) DEFAULT NULL COMMENT '商品类型',
  `sfsh` varchar(200) DEFAULT '' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `role` varchar(200) DEFAULT NULL COMMENT '用户角色',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shejifangan`
--

DROP TABLE IF EXISTS `shejifangan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shejifangan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `shejiriqi` date DEFAULT NULL COMMENT '设计日期',
  `tupian` longtext COMMENT '图片',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `shejifangan` longtext COMMENT '设计方案',
  `caizhi` varchar(200) DEFAULT NULL COMMENT '材质',
  `gongyijianyi` longtext COMMENT '工艺建议',
  `shhf` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='设计方案';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shejifangan`
--

LOCK TABLES `shejifangan` WRITE;
/*!40000 ALTER TABLE `shejifangan` DISABLE KEYS */;
INSERT INTO `shejifangan` VALUES (71,'2050-04-27 03:02:03','工号1','姓名1','用户账号1','用户姓名1','2050-04-27','upload/shejifangan_tupian1.jpg,upload/shejifangan_tupian2.jpg,upload/shejifangan_tupian3.jpg','标题1','设计方案1','材质1','工艺建议1',''),(72,'2050-04-27 03:02:03','工号2','姓名2','用户账号2','用户姓名2','2050-04-27','upload/shejifangan_tupian2.jpg,upload/shejifangan_tupian3.jpg,upload/shejifangan_tupian4.jpg','标题2','设计方案2','材质2','工艺建议2',''),(73,'2050-04-27 03:02:03','工号3','姓名3','用户账号3','用户姓名3','2050-04-27','upload/shejifangan_tupian3.jpg,upload/shejifangan_tupian4.jpg,upload/shejifangan_tupian5.jpg','标题3','设计方案3','材质3','工艺建议3',''),(74,'2050-04-27 03:02:03','工号4','姓名4','用户账号4','用户姓名4','2050-04-27','upload/shejifangan_tupian4.jpg,upload/shejifangan_tupian5.jpg,upload/shejifangan_tupian6.jpg','标题4','设计方案4','材质4','工艺建议4',''),(75,'2050-04-27 03:02:03','工号5','姓名5','用户账号5','用户姓名5','2050-04-27','upload/shejifangan_tupian5.jpg,upload/shejifangan_tupian6.jpg,upload/shejifangan_tupian7.jpg','标题5','设计方案5','材质5','工艺建议5',''),(76,'2050-04-27 03:02:03','工号6','姓名6','用户账号6','用户姓名6','2050-04-27','upload/shejifangan_tupian6.jpg,upload/shejifangan_tupian7.jpg,upload/shejifangan_tupian8.jpg','标题6','设计方案6','材质6','工艺建议6',''),(77,'2050-04-27 03:02:03','工号7','姓名7','用户账号7','用户姓名7','2050-04-27','upload/shejifangan_tupian7.jpg,upload/shejifangan_tupian8.jpg,upload/shejifangan_tupian9.jpg','标题7','设计方案7','材质7','工艺建议7',''),(78,'2050-04-27 03:02:03','工号8','姓名8','用户账号8','用户姓名8','2050-04-27','upload/shejifangan_tupian8.jpg,upload/shejifangan_tupian9.jpg,upload/shejifangan_tupian10.jpg','标题8','设计方案8','材质8','工艺建议8','');
/*!40000 ALTER TABLE `shejifangan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shejishi`
--

DROP TABLE IF EXISTS `shejishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shejishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhiwei` varchar(200) DEFAULT NULL COMMENT '职位',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `jianjie` longtext COMMENT '简介',
  `touxiang` longtext COMMENT '头像',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `money` double DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='设计师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shejishi`
--

LOCK TABLES `shejishi` WRITE;
/*!40000 ALTER TABLE `shejishi` DISABLE KEYS */;
INSERT INTO `shejishi` VALUES (11,'2050-04-27 03:02:03','工号1','123456','姓名1','男','职位1','13823888881','简介1','upload/shejishi_touxiang1.jpg',1,1,200),(12,'2050-04-27 03:02:03','工号2','123456','姓名2','男','职位2','13823888882','简介2','upload/shejishi_touxiang2.jpg',2,2,200),(13,'2050-04-27 03:02:03','工号3','123456','姓名3','男','职位3','13823888883','简介3','upload/shejishi_touxiang3.jpg',3,3,200),(14,'2050-04-27 03:02:03','工号4','123456','姓名4','男','职位4','13823888884','简介4','upload/shejishi_touxiang4.jpg',4,4,200),(15,'2050-04-27 03:02:03','工号5','123456','姓名5','男','职位5','13823888885','简介5','upload/shejishi_touxiang5.jpg',5,5,200),(16,'2050-04-27 03:02:03','工号6','123456','姓名6','男','职位6','13823888886','简介6','upload/shejishi_touxiang6.jpg',6,6,200),(17,'2050-04-27 03:02:03','工号7','123456','姓名7','男','职位7','13823888887','简介7','upload/shejishi_touxiang7.jpg',7,7,200),(18,'2050-04-27 03:02:03','工号8','123456','姓名8','男','职位8','13823888888','简介8','upload/shejishi_touxiang8.jpg',8,8,200);
/*!40000 ALTER TABLE `shejishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shejituzhi`
--

DROP TABLE IF EXISTS `shejituzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shejituzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `jiaofuriqi` date DEFAULT NULL COMMENT '交付日期',
  `shejituzhi` longtext COMMENT '设计图纸',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `shoubanxiangqing` longtext COMMENT '手办详情',
  `shejifeiyong` int(11) DEFAULT NULL COMMENT '设计费用',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='设计图纸';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shejituzhi`
--

LOCK TABLES `shejituzhi` WRITE;
/*!40000 ALTER TABLE `shejituzhi` DISABLE KEYS */;
INSERT INTO `shejituzhi` VALUES (81,'2050-04-27 03:02:03','工号1','姓名1','用户账号1','用户姓名1','2050-04-27','upload/shejituzhi_shejituzhi1.jpg,upload/shejituzhi_shejituzhi2.jpg,upload/shejituzhi_shejituzhi3.jpg','标题1','手办详情1',1,'未支付'),(82,'2050-04-27 03:02:03','工号2','姓名2','用户账号2','用户姓名2','2050-04-27','upload/shejituzhi_shejituzhi2.jpg,upload/shejituzhi_shejituzhi3.jpg,upload/shejituzhi_shejituzhi4.jpg','标题2','手办详情2',2,'未支付'),(83,'2050-04-27 03:02:03','工号3','姓名3','用户账号3','用户姓名3','2050-04-27','upload/shejituzhi_shejituzhi3.jpg,upload/shejituzhi_shejituzhi4.jpg,upload/shejituzhi_shejituzhi5.jpg','标题3','手办详情3',3,'未支付'),(84,'2050-04-27 03:02:03','工号4','姓名4','用户账号4','用户姓名4','2050-04-27','upload/shejituzhi_shejituzhi4.jpg,upload/shejituzhi_shejituzhi5.jpg,upload/shejituzhi_shejituzhi6.jpg','标题4','手办详情4',4,'未支付'),(85,'2050-04-27 03:02:03','工号5','姓名5','用户账号5','用户姓名5','2050-04-27','upload/shejituzhi_shejituzhi5.jpg,upload/shejituzhi_shejituzhi6.jpg,upload/shejituzhi_shejituzhi7.jpg','标题5','手办详情5',5,'未支付'),(86,'2050-04-27 03:02:03','工号6','姓名6','用户账号6','用户姓名6','2050-04-27','upload/shejituzhi_shejituzhi6.jpg,upload/shejituzhi_shejituzhi7.jpg,upload/shejituzhi_shejituzhi8.jpg','标题6','手办详情6',6,'未支付'),(87,'2050-04-27 03:02:03','工号7','姓名7','用户账号7','用户姓名7','2050-04-27','upload/shejituzhi_shejituzhi7.jpg,upload/shejituzhi_shejituzhi8.jpg,upload/shejituzhi_shejituzhi9.jpg','标题7','手办详情7',7,'未支付'),(88,'2050-04-27 03:02:03','工号8','姓名8','用户账号8','用户姓名8','2050-04-27','upload/shejituzhi_shejituzhi8.jpg,upload/shejituzhi_shejituzhi9.jpg,upload/shejituzhi_shejituzhi10.jpg','标题8','手办详情8',8,'未支付');
/*!40000 ALTER TABLE `shejituzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoubandingzhi`
--

DROP TABLE IF EXISTS `shoubandingzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoubandingzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `dingzhixuqiu` longtext COMMENT '定制需求',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `dingzhiriqi` date DEFAULT NULL COMMENT '定制日期',
  `yangshitupian` longtext COMMENT '样式图片',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='手办定制';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoubandingzhi`
--

LOCK TABLES `shoubandingzhi` WRITE;
/*!40000 ALTER TABLE `shoubandingzhi` DISABLE KEYS */;
INSERT INTO `shoubandingzhi` VALUES (51,'2050-04-27 03:02:03','标题1','定制需求1','工号1','姓名1','2050-04-27','upload/shoubandingzhi_yangshitupian1.jpg,upload/shoubandingzhi_yangshitupian2.jpg,upload/shoubandingzhi_yangshitupian3.jpg','用户账号1','用户姓名1'),(52,'2050-04-27 03:02:03','标题2','定制需求2','工号2','姓名2','2050-04-27','upload/shoubandingzhi_yangshitupian2.jpg,upload/shoubandingzhi_yangshitupian3.jpg,upload/shoubandingzhi_yangshitupian4.jpg','用户账号2','用户姓名2'),(53,'2050-04-27 03:02:03','标题3','定制需求3','工号3','姓名3','2050-04-27','upload/shoubandingzhi_yangshitupian3.jpg,upload/shoubandingzhi_yangshitupian4.jpg,upload/shoubandingzhi_yangshitupian5.jpg','用户账号3','用户姓名3'),(54,'2050-04-27 03:02:03','标题4','定制需求4','工号4','姓名4','2050-04-27','upload/shoubandingzhi_yangshitupian4.jpg,upload/shoubandingzhi_yangshitupian5.jpg,upload/shoubandingzhi_yangshitupian6.jpg','用户账号4','用户姓名4'),(55,'2050-04-27 03:02:03','标题5','定制需求5','工号5','姓名5','2050-04-27','upload/shoubandingzhi_yangshitupian5.jpg,upload/shoubandingzhi_yangshitupian6.jpg,upload/shoubandingzhi_yangshitupian7.jpg','用户账号5','用户姓名5'),(56,'2050-04-27 03:02:03','标题6','定制需求6','工号6','姓名6','2050-04-27','upload/shoubandingzhi_yangshitupian6.jpg,upload/shoubandingzhi_yangshitupian7.jpg,upload/shoubandingzhi_yangshitupian8.jpg','用户账号6','用户姓名6'),(57,'2050-04-27 03:02:03','标题7','定制需求7','工号7','姓名7','2050-04-27','upload/shoubandingzhi_yangshitupian7.jpg,upload/shoubandingzhi_yangshitupian8.jpg,upload/shoubandingzhi_yangshitupian9.jpg','用户账号7','用户姓名7'),(58,'2050-04-27 03:02:03','标题8','定制需求8','工号8','姓名8','2050-04-27','upload/shoubandingzhi_yangshitupian8.jpg,upload/shoubandingzhi_yangshitupian9.jpg,upload/shoubandingzhi_yangshitupian10.jpg','用户账号8','用户姓名8');
/*!40000 ALTER TABLE `shoubandingzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoubanfenlei`
--

DROP TABLE IF EXISTS `shoubanfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoubanfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shoubanfenlei` varchar(200) DEFAULT NULL COMMENT '手办分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='手办分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoubanfenlei`
--

LOCK TABLES `shoubanfenlei` WRITE;
/*!40000 ALTER TABLE `shoubanfenlei` DISABLE KEYS */;
INSERT INTO `shoubanfenlei` VALUES (31,'2050-04-27 03:02:03','手办分类1'),(32,'2050-04-27 03:02:03','手办分类2'),(33,'2050-04-27 03:02:03','手办分类3'),(34,'2050-04-27 03:02:03','手办分类4'),(35,'2050-04-27 03:02:03','手办分类5'),(36,'2050-04-27 03:02:03','手办分类6'),(37,'2050-04-27 03:02:03','手办分类7'),(38,'2050-04-27 03:02:03','手办分类8');
/*!40000 ALTER TABLE `shoubanfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoubanshangpin`
--

DROP TABLE IF EXISTS `shoubanshangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoubanshangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shoubanmingcheng` varchar(200) DEFAULT NULL COMMENT '手办名称',
  `shoubanfenlei` varchar(200) DEFAULT NULL COMMENT '手办分类',
  `jianjie` longtext COMMENT '简介',
  `shangpinxiangqing` longtext COMMENT '商品详情',
  `tupian` longtext COMMENT '图片',
  `onelimittimes` int(11) DEFAULT NULL COMMENT '单限',
  `alllimittimes` int(11) DEFAULT NULL COMMENT '库存',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `price` double NOT NULL COMMENT '价格',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='手办商品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoubanshangpin`
--

LOCK TABLES `shoubanshangpin` WRITE;
/*!40000 ALTER TABLE `shoubanshangpin` DISABLE KEYS */;
INSERT INTO `shoubanshangpin` VALUES (41,'2050-04-27 03:02:03','手办名称1','手办分类1','简介1','商品详情1','upload/shoubanshangpin_tupian1.jpg,upload/shoubanshangpin_tupian2.jpg,upload/shoubanshangpin_tupian3.jpg',1,99,'2050-04-27 11:02:03',0,99.9,1),(42,'2050-04-27 03:02:03','手办名称2','手办分类2','简介2','商品详情2','upload/shoubanshangpin_tupian2.jpg,upload/shoubanshangpin_tupian3.jpg,upload/shoubanshangpin_tupian4.jpg',2,99,'2050-04-27 11:02:03',0,99.9,2),(43,'2050-04-27 03:02:03','手办名称3','手办分类3','简介3','商品详情3','upload/shoubanshangpin_tupian3.jpg,upload/shoubanshangpin_tupian4.jpg,upload/shoubanshangpin_tupian5.jpg',3,99,'2050-04-27 11:02:03',0,99.9,3),(44,'2050-04-27 03:02:03','手办名称4','手办分类4','简介4','商品详情4','upload/shoubanshangpin_tupian4.jpg,upload/shoubanshangpin_tupian5.jpg,upload/shoubanshangpin_tupian6.jpg',4,99,'2050-04-27 11:02:03',0,99.9,4),(45,'2050-04-27 03:02:03','手办名称5','手办分类5','简介5','商品详情5','upload/shoubanshangpin_tupian5.jpg,upload/shoubanshangpin_tupian6.jpg,upload/shoubanshangpin_tupian7.jpg',5,99,'2050-04-27 11:02:03',0,99.9,5),(46,'2050-04-27 03:02:03','手办名称6','手办分类6','简介6','商品详情6','upload/shoubanshangpin_tupian6.jpg,upload/shoubanshangpin_tupian7.jpg,upload/shoubanshangpin_tupian8.jpg',6,99,'2050-04-27 11:02:03',0,99.9,6),(47,'2050-04-27 03:02:03','手办名称7','手办分类7','简介7','商品详情7','upload/shoubanshangpin_tupian7.jpg,upload/shoubanshangpin_tupian8.jpg,upload/shoubanshangpin_tupian9.jpg',7,99,'2050-04-27 11:02:03',0,99.9,7),(48,'2050-04-27 03:02:03','手办名称8','手办分类8','简介8','商品详情8','upload/shoubanshangpin_tupian8.jpg,upload/shoubanshangpin_tupian9.jpg,upload/shoubanshangpin_tupian10.jpg',8,99,'2050-04-27 11:02:03',0,99.9,8);
/*!40000 ALTER TABLE `shoubanshangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemintro`
--

DROP TABLE IF EXISTS `systemintro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemintro` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `subtitle` varchar(200) DEFAULT NULL COMMENT '副标题',
  `content` longtext NOT NULL COMMENT '内容',
  `picture1` longtext COMMENT '图片1',
  `picture2` longtext COMMENT '图片2',
  `picture3` longtext COMMENT '图片3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统简介';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemintro`
--

LOCK TABLES `systemintro` WRITE;
/*!40000 ALTER TABLE `systemintro` DISABLE KEYS */;
INSERT INTO `systemintro` VALUES (1,'2050-04-27 03:02:04','系统简介','SYSTEM INTRODUCTION','在平静的海平面上，每个人都可以成为领航员。但如果只有阳光而没有阴影，只有欢乐而没有痛苦，那就不是完整的人生。就拿最幸福的人来说吧——他的幸福是一团纠结的纱线。痛苦和幸福轮番而至，让我们悲喜交集，甚至死亡都让人生更加可爱。人在生命的严肃时刻，在悲伤与丧亲的阴影下，才最接近真实的自我。在生活和事业的各个方面，才智的功能远不如性格，头脑的功能远不如心性，天分远不如自制力、毅力与教养。我始终认为内心开始过严肃生活的人，他外在的生活会开始变得更为俭朴。在一个奢侈浪费的年代，但愿我能让世人了解：人类真正的需求是多么的稀少。不重蹈覆辙才是真正的醒悟。比别人优秀并无任何高贵之处，真正的高贵在于超越从前的自我。','upload/systemintro_picture1.jpg','upload/systemintro_picture2.jpg','upload/systemintro_picture3.jpg');
/*!40000 ALTER TABLE `systemintro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'admin','users','管理员','ej32cninfpdf8lw6q8fy38zn10vo4t11','2050-04-27 03:23:05','2050-04-27 04:23:05'),(2,18,'工号8','shejishi','管理员','km7sldcxckcc0c1sotadrppyyayff4yr','2050-04-27 03:23:15','2050-04-27 04:23:16'),(3,28,'用户账号8','yonghu','用户','7g2w1rx2jqa0s2is054xt633u6c2he0m','2050-04-27 03:23:52','2050-04-27 04:23:53');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2050-04-27 03:02:04');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `touxiang` longtext COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `money` double DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (21,'2050-04-27 03:02:03','用户账号1','123456','用户姓名1','upload/yonghu_touxiang1.jpg','男',1,'13823888881',200),(22,'2050-04-27 03:02:03','用户账号2','123456','用户姓名2','upload/yonghu_touxiang2.jpg','男',2,'13823888882',200),(23,'2050-04-27 03:02:03','用户账号3','123456','用户姓名3','upload/yonghu_touxiang3.jpg','男',3,'13823888883',200),(24,'2050-04-27 03:02:03','用户账号4','123456','用户姓名4','upload/yonghu_touxiang4.jpg','男',4,'13823888884',200),(25,'2050-04-27 03:02:03','用户账号5','123456','用户姓名5','upload/yonghu_touxiang5.jpg','男',5,'13823888885',200),(26,'2050-04-27 03:02:03','用户账号6','123456','用户姓名6','upload/yonghu_touxiang6.jpg','男',6,'13823888886',200),(27,'2050-04-27 03:02:03','用户账号7','123456','用户姓名7','upload/yonghu_touxiang7.jpg','男',7,'13823888887',200),(28,'2050-04-27 03:02:03','用户账号8','123456','用户姓名8','upload/yonghu_touxiang8.jpg','男',8,'13823888888',200);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zaixianzixun`
--

DROP TABLE IF EXISTS `zaixianzixun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zaixianzixun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `zixunshijian` datetime DEFAULT NULL COMMENT '咨询时间',
  `tupian` longtext COMMENT '图片',
  `tiwen` varchar(200) DEFAULT NULL COMMENT '提问',
  `shhf` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='在线咨询';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zaixianzixun`
--

LOCK TABLES `zaixianzixun` WRITE;
/*!40000 ALTER TABLE `zaixianzixun` DISABLE KEYS */;
INSERT INTO `zaixianzixun` VALUES (61,'2050-04-27 03:02:03','工号1','姓名1','用户账号1','用户姓名1','2050-04-27 11:02:03','upload/zaixianzixun_tupian1.jpg,upload/zaixianzixun_tupian2.jpg,upload/zaixianzixun_tupian3.jpg','提问1',''),(62,'2050-04-27 03:02:03','工号2','姓名2','用户账号2','用户姓名2','2050-04-27 11:02:03','upload/zaixianzixun_tupian2.jpg,upload/zaixianzixun_tupian3.jpg,upload/zaixianzixun_tupian4.jpg','提问2',''),(63,'2050-04-27 03:02:03','工号3','姓名3','用户账号3','用户姓名3','2050-04-27 11:02:03','upload/zaixianzixun_tupian3.jpg,upload/zaixianzixun_tupian4.jpg,upload/zaixianzixun_tupian5.jpg','提问3',''),(64,'2050-04-27 03:02:03','工号4','姓名4','用户账号4','用户姓名4','2050-04-27 11:02:03','upload/zaixianzixun_tupian4.jpg,upload/zaixianzixun_tupian5.jpg,upload/zaixianzixun_tupian6.jpg','提问4',''),(65,'2050-04-27 03:02:03','工号5','姓名5','用户账号5','用户姓名5','2050-04-27 11:02:03','upload/zaixianzixun_tupian5.jpg,upload/zaixianzixun_tupian6.jpg,upload/zaixianzixun_tupian7.jpg','提问5',''),(66,'2050-04-27 03:02:03','工号6','姓名6','用户账号6','用户姓名6','2050-04-27 11:02:03','upload/zaixianzixun_tupian6.jpg,upload/zaixianzixun_tupian7.jpg,upload/zaixianzixun_tupian8.jpg','提问6',''),(67,'2050-04-27 03:02:03','工号7','姓名7','用户账号7','用户姓名7','2050-04-27 11:02:03','upload/zaixianzixun_tupian7.jpg,upload/zaixianzixun_tupian8.jpg,upload/zaixianzixun_tupian9.jpg','提问7',''),(68,'2050-04-27 03:02:03','工号8','姓名8','用户账号8','用户姓名8','2050-04-27 11:02:03','upload/zaixianzixun_tupian8.jpg,upload/zaixianzixun_tupian9.jpg,upload/zaixianzixun_tupian10.jpg','提问8','');
/*!40000 ALTER TABLE `zaixianzixun` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2050-05-07 17:35:16
