
public class Main {

	public static void main(String[] args) {
		
		char grade='D';
		
		switch ( grade ) {
	    case 'A' :
	        System.out.println ( " congratulations... passed... " ) ;
	        break ;
	   case 'B' :
	        System.out.println ( " very good... passed... " ) ;
	        break ;
	    case 'C' :
	    case 'D' :
	        System.out.println ( " good... passed... " ) ;
	        break ;
	   case 'F' :
	        System.out.println ( " unfortunately couldnt passed... " ) ;
	        break ;
	        
	        default:
	        	System.out.println("plz write true note...");
		}
	}

}
