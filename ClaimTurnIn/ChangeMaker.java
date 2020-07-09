import java.util.Scanner;
public class ChangeMaker {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter the amount of change needed:");
		
		int amount = myScanner.nextInt();
		if (amount>=100){System.out.println("Enter number of cents less than 100.   Please enter the amount of change needed:");
		amount = myScanner.nextInt();}
		
			
		int quarters = 0;
		int dimes=0;
		int nickles=0;
		int pennies=0;
		int remaining =0;
		
			quarters = amount/25;
			remaining = amount%25;
			dimes = remaining/10;
			remaining = remaining%10;
			nickles = remaining/5;
			remaining = remaining%5;
			pennies = remaining;
		
			while(quarters !=0){
			System.out.println("Number of quarters: "+quarters);break;}
			while(dimes >0){
			System.out.println("Number of dimes: "+dimes);break;}
			while(nickles >0){
			System.out.println("Number of nickles: "+nickles);break;}
			while(pennies >0){
			System.out.println("Number of pennies: "+pennies);break;}
			
			myScanner.close();
	}
}
