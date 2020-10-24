package java;

import java.util.Scanner;

public class iifStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	    System.out.print("inout your age:");
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        int age = Integer.parseInt(s);

	        if (age >= 18) {
	            System.out.println("input your food");
	            String food = sc.nextLine();
	        }
	            if(food.equals("pizza")){
	                System.out.println("not mine");
	            }
	        
	        if (age >= 13) {
	            System.out.println("you are a teenager");
	        }

	    }
	
}
	


