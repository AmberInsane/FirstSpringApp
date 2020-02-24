package lesson1.example3;

import lesson1.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;

public class BeanFromComponent {
    @Autowired
    MyBean myBean;

    public static void main(String[] args) {


    }
}
