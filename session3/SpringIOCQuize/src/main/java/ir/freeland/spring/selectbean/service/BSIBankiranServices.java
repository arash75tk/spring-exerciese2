package ir.freeland.spring.selectbean.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class BSIBankiranServices implements BankiranServices {
    @Autowired
	@Override
	public File accountTransaction(String accountNumber) {
		return new File("account-report");
	}
}