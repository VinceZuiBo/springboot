package springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.bean.Pet;

/*
主程序类：这是一个Springboot应用
 */
@SpringBootApplication
public class MainApplication {
    private static BeanFactory run;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);

        //从容器中获取组件

        Pet tom01 = run.getBean("tom",Pet.class);
    }
}
