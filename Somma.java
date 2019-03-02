import java.util.Scanner;  // Import the Scanner class

	public class Somma {
	  public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    Scanner myObjk = new Scanner(System.in);  // Create a Scanner object
	    int A = myObj.nextInt();  // Read user input
	    int B = myObjk.nextInt();
	    int somma = (A+B);
	    System.out.print(somma);  // Output user input 
	  }
	}

