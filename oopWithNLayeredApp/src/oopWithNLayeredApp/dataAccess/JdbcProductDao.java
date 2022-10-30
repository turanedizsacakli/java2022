package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	//db erişim kodları buraya yazılır... SQL
	public void add(Product product) {
		System.out.println("jdbc ile veri tabanına eklendi...");
		}
	
}
