package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dependencyinjectionseter {
	private firstworker frstwrkr;
	private secondworker scndwrkr;
	
	  public void dosomething() {
		    frstwrkr.dosomething("start");
		    scndwrkr.work(3); 
		  }

		  @Autowired
		  public void setfirstworker(firstworker firstworker) {
		    this.frstwrkr = firstworker;
		  }

		  @Autowired
		  public void setsecondworker(secondworker secondworker) {
		    this.scndwrkr = secondworker;
		  }

}
