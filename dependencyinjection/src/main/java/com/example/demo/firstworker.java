package com.example.demo;

import org.springframework.stereotype.Service;
@Service
public class firstworker {
	public void dosomething(String command) {
		System.out.println("do some command from first worker: "+ command);
	}

}
