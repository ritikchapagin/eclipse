
package cs19B;

import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		Scanner day=new Scanner (System.in);
		System.out.println("Please enter day value:");
		
		int daycode = day.nextInt();	
		String schedule;
		String name = null;
		
		
		switch (daycode) {
		
		case 1 :
			name="monday";
			schedule= "Gym in the morning.";
			break;
		
		case 2 :
			schedule="Class after work.";
			break;
		
		case 3 :
			schedule="Meetings all day.";
			break;
			
		case 4 :
			schedule="Work from home.";
			break;
			
		case 5 :
			schedule="Game night after work.";
			break;
			
		case 6 :
			schedule="Free!";
			break;
			
		case 7 :
			schedule="Free!";
			break;
			
		default :
			schedule="Invalid";
			
		}
	System.out.println((" Its"+name)+("Your Schedule is "+schedule));	
	}

}
