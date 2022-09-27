package gettersSetters;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(10, "lenovo", 2000 );
		
		//Product product = new Product();
		//product.setId(1);
		//product.setDescription("best one");
		//product.setName("asus computer");		
		//product.setPrice(1000);
		//product.setStockAmount(5);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		
		
	}

}
