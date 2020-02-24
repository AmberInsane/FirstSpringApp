package lesson1.example2;

import lesson1.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean(name = "myBean")
    public MyBean getMyBean() {
        return new MyBean();
    }
}
