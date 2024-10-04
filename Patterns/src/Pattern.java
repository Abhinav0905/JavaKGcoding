import java.util.Scanner;

public
class Pattern {
	public static
	void main ( String[] args ) {
		System.out.println ( "Please enter the number of rows you want to generate: " );
		Scanner input = new Scanner ( System.in );
		int     num   = input.nextInt ( );
		pattern ( num );

	}

	public static
	void pattern ( int num ) {
		int i = 0;
		int j = 0;
		for (i = 0; i < num ; i++) {
			for (j = 0; j <= i ; j++) {
				System.out.print ( "*" );
			}
			System.out.println ( );
		}

	}

}

