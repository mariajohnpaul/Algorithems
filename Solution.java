package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0)
            {
            BigInteger  n=sc.nextBigInteger();
            BigInteger  k= sc.nextBigInteger();
            BigInteger b= sc.nextBigInteger();
            BigInteger mid=BigInteger.ZERO;
            BigInteger max =BigInteger.ZERO;
            
            
            n.compareTo(b);
            if(n.compareTo(b) == -1)
                  {
               System.out.println("-1");
               continue;
           }
/*            if(n.mod(b) != BigInteger.ZERO)
                {
            	
            mid	= n.divide(b).add(((n.mod(b)).divide(BigInteger.valueOf(2))));
            //mid = n/b+((n%b)/2);
            }else*/
                {
                 mid = n.divide(b);
            }
            
            
            //System.out.println(mid);
            
            	max= mid.add(b.divide(BigInteger.valueOf(2)));
      
                //max = mid+(b/2);
            
                
           //System.out.println(max);
            //if(b%2!=0)max=max+1;
           if( max.compareTo(k) == 1 )
               {
              System.out.println("-1");
               continue;
           }
           
           //BigInteger calc = ((b.multiply(b.add(BigInteger.ONE))).divide(BigInteger.valueOf(2)));
           //System.out.println(calc);
           
           	if(((b.multiply(b.add(BigInteger.ONE))).divide(BigInteger.valueOf(2))).compareTo(n) == 1)
              //if( b*(b+1)/2 > n)
               {
               System.out.println("-1");
               continue;
           }
            
           // long []arr = new long[b];
            
            BigInteger sum= BigInteger.ZERO;
            BigInteger diff= BigInteger.ZERO;
            
            //Fill the elements
            for(BigInteger i= b;i.compareTo(BigInteger.ZERO) != -1;i=i.subtract(BigInteger.ONE))
            //for(long i=b-1;i>=0;i--)11
                {
                
                //arr[i]=max-i;
                //sum+=arr[i];
                sum = sum.add(max.subtract(i));
                //sum += max-i;
                //if(arr[i]+diff < k)
               //System.out.print(arr[i]+" ");
            }
            System.out.println(sum);
            if(sum!=n)
                {
            	diff = n.subtract(sum);
               // diff=sum-n;
            }
                     System.out.println(max);
                     System.out.println(diff);

            //Fill the elements
            String s = "";
            if(diff.compareTo(BigInteger.ZERO)!= -1)
            {
            for(BigInteger i= b;i.compareTo(BigInteger.ZERO) != 0;i=i.subtract(BigInteger.ONE))    
            //for(long i=b-1;i>=0 ;i--)
                {
                BigInteger value = BigInteger.ZERO;
                if(diff.compareTo(BigInteger.ZERO) == 1)
                    {
                    //value = max.subtract(i).subtract(BigInteger.ONE);
                	value = max.add(BigInteger.ONE);
                	//value = max-i -1;
                }else
                    {
                    //value = max-i;
                	value = max;
                }
                //arr[i]=arr[i]-1;
                //sum+=arr[i];
                diff = diff.subtract(BigInteger.ONE);
                max = max.subtract(BigInteger.ONE);
                //diff--;
                //if(arr[i]+diff < k)
                if(i.compareTo(BigInteger.ONE) != 0)
                //if(i!=0)
                    {
                //System.out.print(value+" ");
                    s+=value+" ";
                }else{
                    //System.out.print(value);
                    s+=value;
                }
            }
            }else
            {
            	for(BigInteger i= b;i.compareTo(BigInteger.ZERO) != 0;i=i.subtract(BigInteger.ONE))    
                    //for(long i=b-1;i>=0 ;i--)
                        {
                        BigInteger value = BigInteger.ZERO;
                        if(diff.compareTo(BigInteger.ZERO) == 1)
                            {
                            //value = max.subtract(i).subtract(BigInteger.ONE);
                        	value = max.subtract(BigInteger.ONE);
                        	//value = max-i -1;
                        }else
                            {
                            //value = max-i;
                        	value = max;
                        }
                        //arr[i]=arr[i]-1;
                        //sum+=arr[i];
                        diff = diff.add(BigInteger.ONE);
                        max = max.subtract(BigInteger.ONE);
                        //diff--;
                        //if(arr[i]+diff < k)
                        if(i.compareTo(BigInteger.ONE) != 0)
                        //if(i!=0)
                            {
                        //System.out.print(value+" ");
                            s+=value+" ";
                        }else{
                            //System.out.print(value);
                            s+=value;
                        }
                    }
            }
            
            
            /* for(int i=b-1;i>=0;i--)
                {
                 System.out.print(arr[i]+" ");
             }*/
    
            System.out.println(s);
            
        }
    }
}