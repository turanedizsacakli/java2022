package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String message = " you are so beautiful... " ;
		System.out.println ( message ) ;
		System.out.println ( " all of them :" + message.length ( ) ) ;
		System.out.println ( " 5 .char : "+ message.charAt ( 4 ) ) ;
		System.out.println ( message.concat ( " yuppiiiiii ! " ) ) ;
		System.out.println ( message.startsWith ( " B " ) ) ;
		System.out.println ( message.endsWith ( " . " ) ) ;
		char [ ] characters = new char [ 5 ] ;
		message.getChars ( 0 ,  4 , characters , 0 ) ; //srcBegin : srcEnd : dstBegin :
		System.out.println ( characters ) ;
		System.out.println(message.indexOf("ar"));
		System.out.println(message.lastIndexOf("ar"));
		
		
		String newMessage = message.replace (" " ,  " - " ) ;   //oldChar :newChar :
		System.out.println ( newMessage ) ;
		System.out.println ( message.substring ( 2,5 ) ) ;
		for ( String word : message.split ( " " ) ) { 
		   System.out.println ( word ) ;
		}
		System.out.println ( message.toLowerCase ( ) ) ;
		System.out.println ( message.toUpperCase ( ) ) ;
		System.out.println ( message.trim ( ) ) ;
		
		

	}

}
