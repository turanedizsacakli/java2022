package methodSecondLesson;

public class Main {

	public static void main(String[] args) {
		
		int number= GimmeANumber();
		System.out.println("your number is : "+number+ "\n\n");
		
		int sayAddition= addition(12,15);
		
		System.out.println(sayAddition+"\n\n");
		
		
		sayAddition= addition2(12,15);
		
		System.out.println(sayAddition+"\n");
		
	}

	public static void Add() {System.out.println("added...");}
	public static void Delete() {System.out.println("deleted...");}
	public static void Update() {System.out.println("updated...");}
	
	public static int GimmeANumber() {return 5;}
	
	public static int addition(int m1, int m2) 
	{
		return m1+m2;
	}
	
	
	public static int addition2(int... numbers) 
	{
		int total=0;
		for (int number:numbers) 
		{
		total +=number;	
		}
		
		return total;
	}
	
}
