package springboot.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.bean.Pet;
import springboot.bean.User;

@Configuration //告诉Springboot这是一个配置类，相当于以前的bean.xml
public class MyConfig {

    @Bean  //给容器中添加组件，以方法名作为组件id，返回类型就是组件类型，返回值就是组件在容器的实例
    public User User01(){
        return new User("zhangsan",18);
    }

    @Bean()  //自定义组件名
    public Pet Tomcat(){

        return new Pet("tomcat");
    }
}
