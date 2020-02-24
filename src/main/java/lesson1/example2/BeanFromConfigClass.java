package lesson1.example2;

import lesson1.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFromConfigClass {
    public static void main(String[] args) {
        //макетная аннотация
        @SuppressWarnings("deprecation")
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        MyBean myBean = context.getBean("myBean", MyBean.class);
        myBean.print();
    }
}
