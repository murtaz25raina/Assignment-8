import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
     String input;
     Scanner scan = new Scanner(System.in);
     input=scan.next();
     String reverse="";
     for(int i=input.length()-1;i>=0;i--)
     {
    	 reverse=reverse+input.charAt(i);
     }
     System.out.println(reverse);
	}

}
