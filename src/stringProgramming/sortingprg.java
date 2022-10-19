package stringProgramming;

import java.util.Scanner;

public class sortingprg {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str= input.nextLine();
		StringBuilder strbd= new StringBuilder(str);
		StringBuilder rev= strbd.reverse();
		String checkpalindrome= rev.toString();
		if(str.equals(checkpalindrome)) {
			System.out.print(strbd +" "+"is palindrome");
		}
		else
		{
			System.out.print(strbd +" "+"is not palindrome");
		}
		// TODO Auto-generated method stub

	}

}
