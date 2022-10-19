package overriding;

public class BaseCreditManager {
	
	//eğer override edilmesini istemiyorsan "public final double" yazarak engel olabilirsin...
	public double calc(double total) {
		
		return total*1.18;
		
	}

}
