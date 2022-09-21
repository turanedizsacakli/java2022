package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();

		// set value
		//product1.name = "Delonghi Kahve Makinesi";
		product1.setName("delonghi kahve makinası ");

		// get value
		System.out.println(product1.getName(product1) +" ilk yazım...");

		Product product2 = new Product();

		// set value
		product2.setName("ke kahve makinası ");


		Product product3 = new Product();

		// set value
		//product3.name = "KE Kahve Makinesi";
		product3.setName("sg kahve makinası ");



		Product[] products= {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName(product));
		}
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("123246546");
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setFirstName("turan ediz");
		individualCustomer.setLastName("saçaklı");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("1321354");
		corporateCustomer.setCustomerNumber("132132");
		
		Customer[] customer= {individualCustomer,corporateCustomer};
		
		
		
	}

}









