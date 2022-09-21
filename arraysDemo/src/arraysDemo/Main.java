package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String [ ] students = new String [ 4 ] ;
		students [ 0 ] = " john " ;
		students [ 1 ] = " micheal " ;
		students [ 2 ] = " adam " ;
		students [ 3 ] = " smith " ;
		                                     
		for ( int i = 0 ; i < students.length ; i ++ ) {
		   System.out.println ( students [ i ] ) ;
		}

		for ( String student : students ) {
		    System.out.println ( student ) ;
		}
	}

}
