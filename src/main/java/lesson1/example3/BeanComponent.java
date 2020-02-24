package lesson1.example3;

import lesson1.bean.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanComponent {
    //field-based dependency injection
    @Autowired
    private MyBean service;

//	constructor-based dependency injection
//	@Autowired
//	public MyApplication(MessageService svc){
//		this.service=svc;
//	}

   // @Autowired
   // public void setService(MyBean svc){
   //     this.service=svc;
    //}
}
