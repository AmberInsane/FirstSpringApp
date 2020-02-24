package lesson1.example1;

import lesson1.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFromXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        MyBean bean = context.getBean("myBean", MyBean.class);
        bean.print();
    }
}
