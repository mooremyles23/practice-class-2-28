import java.util.Scanner;
public class lastchar {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your name");
		
		String text= scan.nextLine();
		int index=text.length()-1;
		
		System.out.print (text.charAt(index));	
		
		
	}
}
