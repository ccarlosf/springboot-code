
CREATE DATABASE springbootdata;

USE springbootdata;

 DROP TABLE IF EXISTS t_article;
CREATE TABLE t_article (
 id int(20) NOT NULL AUTO_INCREMENT COMMENT '',
 title varchar(200) DEFAULT NULL COMMENT '',
 content longtext COMMENT '෈ᒍٖ਻',
 PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
 INSERT INTO t_article VALUES ('1', 'Spring Boot', '从入门到精通...');
 INSERT INTO t_article VALUES ('2', 'Spring Cloud从入门到精通', '从入门到精通...');

 DROP TABLE IF EXISTS t_comment;
 CREATE TABLE t_comment (
 id int(20) NOT NULL AUTO_INCREMENT COMMENT '',
 content longtext COMMENT '',
 author varchar(200) DEFAULT NULL COMMENT '',
 a_id int(20) DEFAULT NULL COMMENT '',
 PRIMARY KEY (id)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
 INSERT INTO t_comment VALUES ('1', '从入门到精通1', 'luccy', '1');
 INSERT INTO t_comment VALUES ('2', '从入门到精通2', 'tom', '1');
 INSERT INTO t_comment VALUES ('3', '从入门到精通3', 'eric', '1');
 INSERT INTO t_comment VALUES ('4', '从入门到精通4', 'eq', '1');
 INSERT INTO t_comment VALUES ('5', '从入门到精通5', 'we', '2');