package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
public class Husband {
    private String name;
    private Wife wife;
    //...
}

public class Wife {
    private String name;
    private Husband husband;
    //...
}
用 Spring 配置
John 的老婆是 Mary
Mary 的丈夫是 John
*/

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Husband husband = ctx.getBean(Husband.class);
		Wife wife = ctx.getBean(Wife.class);
		System.out.println(husband);
		System.out.println(wife);
		System.out.printf("%s 的老婆是 %s\n", husband.getName(), husband.getWife().getName());
		System.out.printf("%s 的丈夫是 %s\n", wife.getName(), wife.getHusband().getName());
	}

}
