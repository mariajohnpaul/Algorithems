package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        String rs = "";
        int [] arr = new int[26];
        Arrays.fill(arr,0);
        char pc='\0';
        for(int i=0;i<s.length();i++)
            {
            char cc = s.charAt(i);
            int buc = cc-'a';
            arr[buc]++;
            if(pc==cc)
                {
                rs=rs+cc;
                //arr[buc]=-1;
                //remove all char decided
                String news = "";
                for(int k=0;k<s.length();k++)
                    {
                    char temp = s.charAt(k);
                    if(temp!=cc)
                        {
                        news = news + temp;
                    }
                    
                    
                }
                s = news;
                i=-1;
                System.out.println(s);
                Arrays.fill(arr,0);
              
            }else
                {
                pc=cc;
            }
            
        }

        Arrays.sort(arr);
        int length = arr.length;
        if(arr[length-1]!=0 || arr[length-2]!=0 )
            {
        System.out.println(arr[length-1]+arr[length-2]);
        }else
            {
            System.out.println(0);
        }
    }
}
