import java.util.*;
public class Vowels{

	public static void main(String[] args) {
     String input;
     String s="";
     Scanner scan=new Scanner(System.in);
     input=scan.nextLine();
     for(int i=0;i<input.length();i++)
     {
    	if(input.charAt(i)!='a' && input.charAt(i)!='e' && input.charAt(i)!='i' && input.charAt(i)!='o' && input.charAt(i)!='u' && input.charAt(i)!='A' && input.charAt(i)!='E' && input.charAt(i)!='I' && input.charAt(i)!='O' && input.charAt(i)!='U')
    	 s=s+input.charAt(i);
     }
     System.out.println(s);
	}

}
