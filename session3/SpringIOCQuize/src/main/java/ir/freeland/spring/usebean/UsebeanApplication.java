package ir.freeland.spring.usebean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsebeanApplication {
	@SuppressWarnings("resource")
  public static void main(String[] args) {
	  
	  
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("usebeanapplication.xml");
    InternetbankServices internetbankServices = context.getBean(InternetbankServices.class);

    internetbankServices.doCardToCard("6274.1211.6623.6810","6037.9919.1267.1343");
    }
}
