package hackerrank;

import java.io.*;
import java.util.*;

public class ExcelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find total wt of Each Stock 
		
		Map<String, Double> symVsFreeFlootMap = new HashMap<>(64);
		ArrayList<String> symOrder = new ArrayList<>(64);
		
		BufferedReader br = null;
		String line;
		String csvFile = "C:\\Users\\DOM2OWT\\Downloads\\index_rebalance_dataset\\stocks_info.csv";
		String cvsSplitBy = ",";
		
		try {
			boolean header = true;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
            	
            	if(header)
            	{
            		header = false;
            	}else{
                // use comma as separator
                String[] values = line.split(cvsSplitBy);
                //System.out.println(line);
                double ff = Double.valueOf(values[3]);                
                symVsFreeFlootMap.put(values[0],ff);
                symOrder.add(values[0]);
               // System.out.println(values[0]+ff);
                
            	}

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		//read portfolio
		
		Map <String , ArrayList<Integer>> symVsQty = new HashMap<>(64);
		
		br = null;
		
		csvFile = "C:\\Users\\DOM2OWT\\Downloads\\index_rebalance_dataset\\portfolio.csv";
		cvsSplitBy = ",";
		
		try {
			boolean header = true;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
            	
            	if(header)
            	{
            		header = false;
            	}else{
                // use comma as separator
                String[] values = line.split(cvsSplitBy);
                //System.out.println(line);
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(Integer.valueOf(values[1]));                
                symVsQty.put(values[0],temp);
               
                
            	}
            	
            /*	for(String sym : symVsPrice.keySet())//Add change of price intelligence
            	{
            		
            		//ArrayList<Double> temp = symVsPrice.get(sym);
            		System.out.println(sym+symVsPrice.get(sym).toString());   		
            	}*/

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		
		//find the Price at Day 0 for each symbol and add intelligence to price
		
		Map <String , ArrayList<Double>> symVsPrice = new HashMap<>(64);
		
		br = null;
		
		csvFile = "C:\\Users\\DOM2OWT\\Downloads\\index_rebalance_dataset\\stocks_closing_prices.csv";
		cvsSplitBy = ",";
		
		try {
			boolean header = true;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
            	
            	if(header)
            	{
            		header = false;
            	}else{
                // use comma as separator
                String[] values = line.split(cvsSplitBy);
                //System.out.println(line);
                ArrayList<Double> temp = new ArrayList<>();
                ArrayList<Double> intelli = new ArrayList<>();
                double prev = 0;
                for(int i=1;i<4;i++)
                {
                double pr = Double.valueOf(values[i]);
                temp.add(pr);
                intelli.add(prev/pr);
                prev = pr;
                }
                temp.addAll(intelli);
                symVsPrice.put(values[0],temp);
               
                
            	}
            	
            /*	for(String sym : symVsPrice.keySet())//Add change of price intelligence
            	{
            		
            		//ArrayList<Double> temp = symVsPrice.get(sym);
            		System.out.println(sym+symVsPrice.get(sym).toString());   		
            	}*/

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		
		Map<String , Double> symVsWt = new HashMap<>(64);
		
		double totalwt = 0;
		
		for(String sym : symVsFreeFlootMap.keySet())
		{
			ArrayList<Double> price = symVsPrice.get(sym);
			double freefloot = symVsFreeFlootMap.get(sym);
			double wt=price.get(0)*freefloot;//day 0 price
			symVsWt.put(sym,wt);
			totalwt+=wt;
		}
		
		for(String sym : symVsWt.keySet())
		{
			double wt = (symVsWt.get(sym))/totalwt;
			//storing as %
			wt = wt *100;
			symVsWt.put(sym, wt);
			//System.out.println(sym+wt);
			
		}
		
		//invest 25 laks each day based on wt % but adjust based on price profit
		//Map<String, ArrayList<Integer>> symVsQty = new HashMap<>(64);
		
		long sday1=0,sday2=0;
		
		for(String sym : symVsPrice.keySet())
		{
			double wtpercent = symVsWt.get(sym);
			ArrayList<Double> price = symVsPrice.get(sym);
			double investPorton = 2910000*wtpercent/100; 
			
			//day1 
			int qty1 = (int) (investPorton/price.get(1));
			if(qty1==0)qty1=1;
			
			sday1+= (qty1*price.get(1));
			
			//day 2
			int qty2 = (int) (investPorton/price.get(2));
			if(qty2==0)qty2=1;
			
			sday2+= (qty2*price.get(2));
			
			ArrayList<Integer> temp = symVsQty.get(sym);
			qty1= temp.get(0)+qty1;
			qty2+=qty1;
			temp.clear();
			temp.add(qty1);
			temp.add(qty2);			
			symVsQty.put(sym, temp);
		}
		
		System.out.println(sday1+" "+sday2);
		
		// Writting in the file 
		csvFile = "C:\\Users\\DOM2OWT\\Downloads\\index_rebalance_dataset\\index_constituents.csv";
		String seperator = ",";
		FileWriter writer;
		try {
			writer = new FileWriter(csvFile);
			
			//add a header 
			writer.append("Symbol,Quantity_Day_1,Quantity_Day_2\n");
			
			for(String sym : symOrder)
			{
				ArrayList<Integer> temp = symVsQty.get(sym);
				
				StringBuilder sb = new StringBuilder();
				
				sb.append(sym);
				
				for(int i : temp)
				{
					sb.append(seperator);
					sb.append(i);					
				}
				writer.append(sb.toString()+"\n");
				
			}
			
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		
		
		

	}

}
