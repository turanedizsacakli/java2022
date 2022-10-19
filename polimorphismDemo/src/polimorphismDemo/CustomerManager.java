package polimorphismDemo;

public class CustomerManager {
	
	private BaseLogger _baseLogger;
	
	public CustomerManager( BaseLogger baseLogger) {
		this._baseLogger=baseLogger;
		
	}
	
	public void add() {
		System.out.println("müşteri eklendi...  ");
		this._baseLogger.log("customerManager Log mesajı...");
	}
}
