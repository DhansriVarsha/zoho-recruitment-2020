package zoho1;

import java.util.Scanner;

public class ZohoRoundOne {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt(); 

		for (int i = 1; i <= a; i++)  
	    { 
	        for (int j = 1; j <= a; j++)  
	        { 
	            int min = i < j ? i : j; 
	            System.out.print(a - min + 1); 
	        } 
	        System.out.println(); 
	    } 
		sc.close();
	}

}
