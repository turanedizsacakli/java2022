package classesWithAttributes;

public class Main {

	public static void main(String[] args) 
	{
		Product product = new Product();
		product.name="laptop";
		product.id=1;
		product.price=1000;
		product.description="asus laptop";
		product.stockAmount=20;
		
		ProductManager productManager=new ProductManager ();
		productManager.Add(product);	
	}

}
