import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class P1 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       
        for(;n>0;n--)
        {
        	 String Even="",Odd="";
        	String Str=scanner.nextLine();
        	int len=Str.length()-1;
        	for(int j=0;j<=len;j++)
        	{
        		if(j%2==0)
        		{
        			Even=Even+Str.charAt(j);
        		}
        		else
        		{
        			Odd=Odd+Str.charAt(j);
        		}
        	}
        	 System.out.println(Even+" "+Odd);
        }
       
        scanner.close();
}
}
