# recursion
import java.util.*;

public class Recurion{


		 
		public static void loop(int n) 
		{ 
		 
		  if(n <= 100) {
		 
		       System.out.println(n); 
		         loop(n+1);   }
		}
		 
		public static void main(String args[]) 
		{
		 
		loop(1); 
		 
		 }
		 
}
