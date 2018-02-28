import java.util.Scanner;
public class secondtolast {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a word");
		
		String text= scan.nextLine();
		
		System.out.print (secondtolast(text));

	}
		
		public static String secondtolast (String word){	
	
		char first=word.charAt(0);
		int index=word.length()-2;
		char aboutlast=word.charAt(index);
		
		String firstandlast= first+ " " + aboutlast;
		
		return firstandlast;
		
				}}	



	
