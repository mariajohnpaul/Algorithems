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
        
        
        TreeSet <Point> setinp = new TreeSet<>(new zcomp());
        
        int T=sc.nextInt();
        int b=sc.nextInt();
        while(T-->0)
            {
            int k= sc.nextInt();
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
setinp.add(new Point(k,x,y,z));
        }
        
        Map <Integer,Point> newmap = new HashMap<>();
        
        Iterator it = setinp.iterator();
        int buc = b;
        while(it.hasNext()){
            if(buc--<=0)break;
            Point in = (Point)it.next();
            //System.out.println(in.k);
            newmap.put(in.k,in);
            it.remove();
            //Point tmp = in;
            //setinp.remove(tmp);
            
        }
     
        
        sc.nextLine();
        
        while(sc.hasNextLine())
            {
            String q = sc.nextLine();
            //System.out.println(q);
            char C = q.contains("F")||q.contains("f") ?  'F' : 'R';
            String keys = q.substring(2);
            
            int key = Integer.parseInt(keys);
            //System.out.println(key);
            if(C=='F')
                {
            if(newmap.containsKey(key))
                {
                Point value = newmap.get(key);
                BigDecimal bx= new BigDecimal(value.x);
                bx = bx.setScale(3,BigDecimal.ROUND_HALF_UP);
                BigDecimal by= new BigDecimal(value.y);
                by = by.setScale(3,BigDecimal.ROUND_HALF_UP);
                BigDecimal bz= new BigDecimal(value.z);
                bz = bz.setScale(3,BigDecimal.ROUND_HALF_UP);
                
                System.out.print(key+" = (");
                System.out.printf("%.3f,%.3f,%.3f)\n",bx,by,bz);
                
            }else
                {
                System.out.println("Point doesn't exist in the bucket.");
            }
            }else
                {
                if(setinp.isEmpty() && newmap.containsKey(key))
                    {
                    System.out.println("No more points can be deleted.");
                    continue;
                }else if(newmap.containsKey(key))
                    {
                    newmap.remove(key);
                    System.out.println("Point id "+key+" removed.");
                    Point tmp = setinp.pollFirst();
                    
                    newmap.put(tmp.k,tmp);
                }else
                    {
                    System.out.println("Point doesn't exist in the bucket.");
                }
            }
            
        }
        
    }   

}
    class Point{
            int k;
            double x;
            double y;
            double z;
            Point(int ki,double xi,double yi,double zi)
                {
                k=ki;
                x=xi;
                y=yi;
                z=zi;
            }
        }
        
         class zcomp implements Comparator<Point>{
 
    @Override
    public int compare(Point e1, Point e2) {
        int ret=0;
            if(e1.z > e2.z){
            ret = -1;
        }else if(e1.z < e2.z)
            {
            ret = 1;
        }
            
        return ret;
    }
         }
