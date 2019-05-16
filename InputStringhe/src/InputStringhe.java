//import java.lang.String;
import java.util.Scanner;

public class InputStringhe {
	public static void main( String[] args )
	{
		String s1, s2, s3;
		
		Scanner input = new Scanner ( System.in );
		
		System.out.println( "Vuoi continuare ? [S/N]" );
		char scelta = input.next().charAt( 0 ); //Legge il primo carattere della prossima parola
		
		switch ( scelta ) {
		case 'S': case 's': System.out.println( "continua" ); break;
		
		case 'N': case 'n': {System.out.println( "basta" ); input.close(); return;}
		
		default : {System.out.println( "ERRORE" ); input.close(); return;}
		}
		
		System.out.println( "Inserisci due righe di testo: " );
		
		s1 = input.nextLine(); //Legge la prima riga
		s2 = input.next(); //Legge la prima parola della seconda riga
		s3 = input.nextLine(); //Legge il resto della seconda riga
		
		System.out.println( "s1 --" + s1 );
		System.out.println( "s2 --" + s2 );
		System.out.println( "s3 --" + s3 );
	
		input.close();
	}

}
