
import java.util.*;
import java.util.Scanner;

public class lastword {
    public static void main(String args[]){
      int b=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        String ne = s.trim();
        for(int i =0;i<ne.length();i++){
            if(s.charAt(i)==' '){
             b = 0;
             
            }
            else 
            b++;
        }
    
        System.out.print(b);
    }
}
