package lesson1.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class MyBeanAnnotated {
    public void print() {
        System.out.println("Меня такого всего в аннотациях вызвали");
    }
}
