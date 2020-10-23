package com.ccarlos.springboot;

import com.ccarlos.config.SimpleBean;
import com.ccarlos.controller.HelloController;
import com.ccarlos.pojo.MyProperties;
import com.ccarlos.pojo.Person;
import com.ccarlos.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)  //测试启动器，并加载spring boot测试注解
@SpringBootTest
//标记该类为spring boot单元测试类，并加载项目的applicationContext上下文环境
public class SpringbootDemoApplicationTests {

    //入门案例测试
    @Autowired
    private HelloController helloController;

    @Test
    public void contextLoad1() {
        String demo = helloController.demo();
        System.out.println(demo);
    }

        /*
      配置文件properties配置测试
     */

    @Autowired
    private Person person;

    @Test
    public void configurationTest() {
        System.out.println(person);
    }

    /*
      @Value进行测试
     */

    @Autowired
    private Student student;

    @Test
    public void studentTest() {
        System.out.println(student);
    }

        /*
      @propertySource进行测试
     */

    @Autowired
    private MyProperties myProperties;

    @Test
    public void myPropertiesTest() {
        System.out.println(myProperties);
    }

      /*
      @Configuration进行测试
     */

    @Autowired
    private ApplicationContext context;

    @Test
    public void iocTest() {
        System.out.println(context.containsBean("iservice"));
    }

    /*
  测试随机数及参数间引用
 */
    @Value("${tom.description}")
    private String description;


    @Test
    public void placeholderTest() {
        System.out.println(description);
    }

    @Autowired
    private SimpleBean simpleBean;

    @Test
    public void zdyStarterTest() {
        System.out.println(simpleBean);
    }

}
