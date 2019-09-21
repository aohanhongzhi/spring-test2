package hxy.example.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	/**
	 * 
	 * Spring的学习
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// 怎么一劳永逸，难道所有地方的调用都需要这样调用文件？SSM框架有自己的解决方案，具体需要学习SSM整体的部署即可
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");
		System.out.println(obj);// 自动把对象转成String，从而会调用类里面的toString方法。虽然有点扯,但是这样解释应该还算完美。
		obj.setMessage("Today is sunny");
		System.out.println(obj.getMessage());
		System.out.println(obj);
		System.out.println(obj.toString());
	}

}
/*
 * 环境配置参考: https://blog.csdn.net/csdnsjg/article/details/80152815
 * 
 * --------------------- 作者：英雄策马走天涯 来源：CSDN
 * 原文：https://blog.csdn.net/qq_36360784/article/details/81103244
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */