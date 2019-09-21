package hxy.example.springtest;

//这里可以添加lombok注解。从而更加简洁代码
public class HelloWorld {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return getClass().getName() + ": " + "message:" + message;
	}
}
/*
 * --------------------- 作者：英雄策马走天涯 来源：CSDN
 * 原文：https://blog.csdn.net/qq_36360784/article/details/81103244
 * 版权声明：本文为博主原创文章，转载请附上博文链接！
 */