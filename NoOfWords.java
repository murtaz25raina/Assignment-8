import java.util.*;
public class NoOfWords {

	public static void main(String[] args) {
     String input;
     Scanner scan=new Scanner(System.in);
     input=scan.nextLine();
     int count=1;
     for(int i=0;i<input.length()-1;i++)
     {
    	 if(input.charAt(i)==' ' && input.charAt(i+1)!=' ')
    	 {
    		 count++;
    	 }
     }
     System.out.println(count);
	}
}
