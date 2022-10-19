package overriding;

public class StudentCreditManager extends BaseCreditManager{
	
public double calc(double total) {
		
		return total*1.10;
		
	}

}
