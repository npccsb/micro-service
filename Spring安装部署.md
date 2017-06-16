# Spring Cloud + Kubernetes + Docker #

我们一起来学习

## 1 Spring Cloud 篇 ##

### 1.1 Windows下开发环境搭建 ###

**1.1.1 JDK 安装**

> **下载地址**：[http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 
> 
> 
> **当前版本**：Java Platform (JDK) 8u131
> 
> 
> **环境变量配置**：计算机>右键：属性>高级系统设置>高级>环境变量>用户变量
> 
> - `JAVA_HOME=D:\tools\java` *(D:\tools\java为我本地安装目录)*
> 
> - `Path=%JAVA_HOME%\bin;`
> 
> - 如果没有环境变量的Key就自己新建1个
> 
> **验证**：通过Windows+R键, 运行`cmd`命令, 并在命令行中输入`mvn -v`显示如下提示表示安装成功

>     $ java -version
    java version "1.8.0_121"
    Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
    Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

**1.1.2 依赖管理之Maven安装**
> **下载地址**：[http://maven.apache.org/download.cgi](http://maven.apache.org/download.cgi)

> **当前版本**：Apache Maven 3.5.0

> **安装**：解压到指定文件夹，例如D:\tools\apache-maven-3.5.0

> **环境变量配置**：计算机>右键：属性>高级系统设置>高级>环境变量>用户变量
> 
> - `M2_HOME=D:\tools\apache-maven-3.5.0` *(D:\tools\apache-maven-3.5.0为我本地安装目录)*
> 
> - `Path=%JAVA_HOME%\bin;%M2_HOME%\bin;`
> 
> - 如果没有环境变量的Key就自己新建1个
> 
> **验证**：通过Windows+R键, 运行`cmd`命令, 并在命令行中输入`java -version`显示如下提示表示安装成功

>     $ mvn -v
    Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-04T03:39:06+08:00)
    Maven home: D:\tools\apache-maven-3.5.0\bin\..
    Java version: 1.8.0_121, vendor: Oracle Corporation
    Java home: D:\tools\Java\jre
    Default locale: zh_CN, platform encoding: GBK
    OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

> **相关配置**：编辑D:\tools\apache-maven-3.5.0\conf\settings.xml

> - 本地仓库路径配置
    <pre><code>在&lt;settings&gt;节点下增加&lt;localRepository&gt;D:\tools\maven-repository(自定义路径)&lt;/localRepository&gt;</code></pre>
> - 国内镜像仓库地址配置
	<pre><code>在&lt;settings&gt;的&lt;mirrors&gt;节点中增加
&lt;mirror&gt;
	   &lt;id&gt;CN&lt;/id&gt;
       &lt;mirrorOf&gt;central&lt;/mirrorOf&gt;
       &lt;name&gt;OSChina Central&lt;/name&gt;
       &lt;url&gt;http://maven.aliyun.com/nexus/content/groups/public/&lt;/url&gt;
	 &lt;/mirror&gt;
</code></pre>

> - 公司网络代理配置(如果有需要)
	<pre><code>在&lt;settings&gt;的&lt;proxies&gt;节点中增加
&lt;proxy&gt;
      &lt;id&gt;取名唯一&lt;/id&gt;
      &lt;active&gt;true&lt;/active&gt;
      &lt;protocol&gt;http&lt;/protocol&gt;
      &lt;username&gt;用户名&lt;/username&gt;
      &lt;password&gt;密码&lt;/password&gt;
      &lt;host&gt;代理域名或者IP&lt;/host&gt;
      &lt;port&gt;代理端口&lt;/port&gt;
      &lt;nonProxyHosts&gt;local.net|some.host.com&lt;/nonProxyHosts&gt;
    &lt;/proxy&gt;
</code></pre>

**1.1.3 IDE之Spring Tool Suite安装**

> **下载地址**：[https://spring.io/tools/sts/](https://spring.io/tools/sts/)
>
> **当前版本**：3.8.4 RELEASE For Windows
>
> **安装**：直接解压就可以使用，因为内部文件层次较深，容易超出Windows路径名上限，建议选择磁盘根目录解压
>
> **配置**：比如JDK、Maven、字体、字符集等配置
>
> - 代理配置(比如公司需要代理上网的情况下)：顶部导航>Window>Preferences>General>Network Connections
    <pre>
    1) Active Provider：选择 Manual
    2) Proxy entries：在HTTP和HTTPS中输入域名、端口、用户、密码
    3) 点击Apply应用
    </pre>
> - JDK配置：顶部导航>Window>Preferences>java>Installed JREs，将JDK路径指定到JAVA安装路径*(D:\tools\java)*
>
> - Maven配置：顶部导航>Window>Preferences>Maven>User Settings
    <pre>
	1) Global Settings: 选择Maven安装目录下的conf\settings.xml (如D:\tools\apache-maven-3.5.0\conf\settings.xml)
	2) User Settings: 选择Maven安装目录下的conf\settings.xml (如D:\tools\apache-maven-3.5.0\conf\settings.xml)
	3) 点击Apply应用
	</pre>
>
> - 字符集配置：顶部导航>Window>Preferences>General>Workspace 在左下角Text file encoding勾选Other并选UTF-8并应用

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

