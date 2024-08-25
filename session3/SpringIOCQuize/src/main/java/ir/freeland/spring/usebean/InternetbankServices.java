package ir.freeland.spring.usebean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InternetbankServices {
	private CardServices cardservice;
	private DatabaseManagment database;
	public InternetbankServices(CardServices crdsrvs,DatabaseManagment dbms) {
		cardservice = crdsrvs;
		database = dbms;
	}
	@Autowired
  public void doCardToCard(String sourceCard, String destinationCard) {  
    String result = cardservice.cardToCard(sourceCard, destinationCard);
    database.save( result );
    
  }
}
