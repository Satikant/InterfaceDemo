package list.interfaces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Repeated {	 
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a string to delete repeated char ");
 String actst=sc.nextLine();

 int noofLetter=actst.length();
 System.out.println(" No of letter in a string "+noofLetter);
 char letter[]=actst.toCharArray();
 Set st=new HashSet();
 StringBuilder sb=new StringBuilder();
 for(char obj :letter)
 {
	 if(!st.contains(obj))
	 {
		 st.add(obj);
		 sb.append(obj);
	 }
 }
System.out.println("String after duplicatge tremovet "+sb.toString());
		 
 
	}
}
