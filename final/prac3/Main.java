

package assign3;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int depo, withdrawl;
		
		Transaction t1 = new Transaction(1000,2567);
		t1.open_account();
		System.out.println("Enter the amount to be deposited");
		depo = Integer.parseInt(br.readLine());
		System.out.println("The entered amount is: " + depo);
		t1.deposit(depo);
		System.out.println("Enter the amount to be withdraw");
		withdrawl = Integer.parseInt(br.readLine());
		t1.withdraw(withdrawl);
		t1.suspended();
		t1.closed();
	}
}