package lesson1.example3;

import lesson1.bean.MyBean;
import lesson1.bean.MyBeanAnnotated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFromComponent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MyBeanAnnotated myBeanAnnotated = context.getBean(MyBeanAnnotated.class);
        myBeanAnnotated.print();
    }
}
