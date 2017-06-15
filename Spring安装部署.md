# Spring Cloud + Kubernetes + Docker #

我们一起来学习

## 1 Spring Cloud 篇 ##

### 1.1 Windows下开发环境搭建 ###

**1.1.1 JDK 安装**
> 下载地址：[http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 

> 当前版本：Java Platform (JDK) 8u131

> 环境变量配置：计算机>右键：属性>高级系统设置>高级>环境变量>用户变量

>- `JAVA_HOME=D:\tools\java` *(D:\tools\java为我本地安装目录)*

>- `Path=%JAVA_HOME%\bin;`

>- 如果没有环境变量的Key就自己新建1个

> 验证：通过Windows+R键, 运行`cmd`命令, 并在命令行中输入`java -version`显示如下提示表示安装成功

>> java version "1.8.0_121"

>>Java(TM) SE Runtime Environment (build 1.8.0_121-b13)

>>Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

**1.1.2 构建工具之Maven安装**

**1.1.3 IDE之Spring Tool Suite安装**

> 下载地址：[https://spring.io/tools/sts/](https://spring.io/tools/sts/)

> 当前版本：3.8.4 RELEASE For Windows

> 安装：直接解压就可以使用，因为内部文件层次较深，容易超出Windows路径名上限，建议选择磁盘根目录解压

> 配置：公司的网络需要代理才能上网的，可以进行如下配置 

**1.1.4 代码仓库之GIT安装**

### 1.2 Linux下部署环境搭建 ###

**1.2.1 系统配置**

**1.2.2 JAVA安装**

**1.2.3 Maven安装**

**1.2.4 GIT安装**

### 1.3 Spring Cloud 组件学习 ###

**1.3.1 服务发现Eureka**

- 单机模式

- 集群模式

**1.3.2 客户端负载均衡Ribbon**

- 简单用法

- 代买级别配置

- Yaml文件配置

**1.3.3 客户端负载均衡Fegin**

- 基于Spring的Feign Client

- 基于Feign原生的Feign Client

**1.3.4 断路器Hystrix**

- Ribbon断路器配置

- Feign断路器配置

- 断路器看板Dashboard

- 断路器看板之Turbine

**1.3.5 API Gateway Zull**

- zuul功能

- sidecar

**1.3.6 配置中心Config Center**

- 加密

- BUS

### 1.4 与同类框架比较 ###

## 2 Docker篇 ##

## 3 Kubernetes 篇 ##

