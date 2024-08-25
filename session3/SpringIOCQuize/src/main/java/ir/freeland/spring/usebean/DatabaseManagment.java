package ir.freeland.spring.usebean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseManagment {
	@Autowired
  public void save(String value) {
    System.out.println("Save to database result: " + value);
   
  }
}
