package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager=new ProductManager();
		Product product=new Product();
		product.id=10;
		product.name="tv";
		product.price=1000;
		
		productManager.add(product);
		
		
		DatabaseHelper.Crud.Delete();

	}

}
