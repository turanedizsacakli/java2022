package interfacesDemo;

public class CustomerManager {

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
		//işkodları buraya yazılır... (müşterinin adı girilmiş mi? doğru mu? )
		
		customerDal.add();
	}
	
}
