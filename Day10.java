import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

 static int rec(int x)
   {
    
    int a,count=0,t=0;
    String G="";
    for(int i=0;x>0;i++){
    a=x%2;
    x=x/2;
    G=G+a;
     if(G.charAt(i)=='0'){
        count=0; 
    }
    else
        count++;
        if(count>=t)
        {
            t=count;
        }
    }
   // System.out.println(G);
     return t;
    }
   
   

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int res=rec(n);
      System.out.println(res);

        scanner.close();
    }
}
