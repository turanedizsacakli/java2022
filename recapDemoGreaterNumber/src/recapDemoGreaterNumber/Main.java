package recapDemoGreaterNumber;

public class Main {

	public static void main(String[] args) {

		int number1=20;
		int number2=3;
		int number3=15;
		int greater=number1;
		
		if (greater<number2) {
			greater=number2;
			}else if(greater<number3) {
				greater=number3;
			}
		
		System.out.println(greater + "is the biggest one...");
		
	
	}
}
