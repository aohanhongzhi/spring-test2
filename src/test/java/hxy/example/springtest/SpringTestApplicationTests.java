package hxy.example.springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import hxy.example.springtest.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestApplicationTests {
	@Autowired
	HelloService HelloService;
	@Test
	public void contextLoads() {
		HelloService.printHello();
	}

}
