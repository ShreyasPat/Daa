 import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {

	    int  firstTerm = 0, secondTerm = 1;
	    Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of terms:");
	    int n= sc.nextInt();
	    
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	  }
}
