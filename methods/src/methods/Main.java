package methods;

public class Main {

	public static void main(String[] args) {
		
	findNumber();	

	}
	
	
	public static void findNumber() 
	{
		int[] numbers = new int[] {1,2,5,7,9,0};
		int find = 7;
		boolean isThere =false;
		
		for (int number : numbers){
			if (number == find) {
				isThere = true;
				break;
		 		}
		}
	
		if (isThere){
			giveMessage(find);
			}else{
				System. out.println ("there is no number..." + find);
			}	
	}
	
	public static void giveMessage(int find) 
	{
		System.out.println("find number..." +  find);
	}
	
}
