import java.util.*;
public class Contains {

	public static void main(String[] args) {
     String input;
     String s;
     Scanner scan=new Scanner(System.in);
     input=scan.nextLine();
     s=scan.nextLine();
     if(input.contains(s))
     {
    	 System.out.println("yes");
     }
     else
    	 System.out.println("No");
     
	}

}
