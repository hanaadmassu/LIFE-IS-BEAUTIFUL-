package java;
import java.util.Scanner;

public class java {
	
	private static Scanner sc;

	public static void main(String[] args) {
	    System.out.print("inout your age:");
	        sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        int age = Integer.parseInt(s);

	        if (age >= 18) {
	            System.out.println("input your food");
	            String food = sc.nextLine();

	            if(food.equals("pizza")){
	                System.out.println("not mine");
	            }
	        }
	        if (age >= 13) {
	            System.out.println("you are a teenager");
	        }

	    }
	
}
	



