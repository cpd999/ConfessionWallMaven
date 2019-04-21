# ConfessionWallMaven

SSM（Maven）整合川科表白墙

------

### 文件目录说明：

​	1.pom.xml（Maven仓库下载项目需要的jar包）

​	2.src （存放java源码+jsp页面）

​	3.src > main （java源码+配置文件+网页文件）

​	4.java源码路径下有sql建表文件

### 项目功能：

#### 	1.用户：登录 、注册、 发布表白内容、评论、注销

​	/ConfessionWallMaven 访问

#### 	2.管理员：登录、查看所有用户、修改用户信息、查看所有表白、

#### 					所有评论、删除表白+评论、退出

​	/ConfessionWallMaven/admin.html

### 配置文件说明：

​	1.config.properties （配置数据库连接信息）

​	2.log4j.properties （日志显示配置文件）

​	3.spring.xml （Spring核心配置文件）

​	4.spring-mvc.xml（SpringMvc配置文件）

​	5.spring-mybatis.xml (Spring 与Mybatis整合配置)

​	注意：web.xml配置（根据需要更改）

### JAVA源码结构：

​	controller （访问）

​	service	（逻辑业务）

​	po			（实体类）

​	dao		（持久层）

​	mapper	（持久层sql映射）

### 

