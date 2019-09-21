package hxy.example.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hxy.example.springtest.service.HelloService;

@SpringBootApplication
public class SpringTestApplication {
	//如果使用new 则这里的自动注入不会起作用
	@Autowired
	HelloService helloService;

	void test() {
		helloService.printHello();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
		System.out.println("Spring Project Starting");
		//下面这种new 关键字使用，是不可以成功加载bean的，因为不会被SpringBean管理
		//可以在SpringBootTest测试
//		new SpringTestApplication().test();

	}

}
