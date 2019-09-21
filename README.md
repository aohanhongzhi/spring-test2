# spring-test2
这个是基于start.spring.io官网下载的东西来开发的。仅仅从官网下载的Project可能会遇到Maven configuration problem的错误。其中会遇到有些问题，在pom.xml中有解决方案。
```xml
	<properties>
		<java.version>1.8</java.version>
		<!--出现maven configuration problem的错误就需要加上这个东西 -->
		<maven-jar-plugin.version>3.0.0</maven-jar-plugin.version>
	</properties>
```
* spring的文件加载
* SpringBoot控制翻转与Bean注入