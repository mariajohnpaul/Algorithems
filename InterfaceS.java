package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;


class InterfaceS {
	
	public static void main(String[] Args){
		
		Singleton obj = Singleton.getinstance();
		obj.value = 2;
		
		Singleton.getinstance().value = 4;
		
		//System.out.println(obj.value);
		
		//System.out.println(obj.compareTo(obj2));

ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3));
//System.out.println(Collections.binarySearch(arr, 5));

try{
URL url = new URL("http://www.google.com");
HttpURLConnection http = (HttpURLConnection)url.openConnection();
http.setDoInput(true);
http.setRequestMethod("GET");

StringBuilder sb = new StringBuilder();
if(http.getResponseCode()== HttpURLConnection.HTTP_OK){
	BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream(),"utf-8"));
	String s;
	while((s = br.readLine())!= null){
		sb.append(s);
	}
	System.out.println(sb.toString());
}

}
catch(Exception e)
{
	e.printStackTrace();
}



Queue queue = new LinkedList();

Stack<Integer> stack = new Stack<>();

List<Integer> list = new ArrayList<>();

stack.push(1);
stack.push(2);
stack.push(3);
queue.add(1);
queue.add(2);
queue.add(3);

PriorityQueue<String> pq = new PriorityQueue<>();


pq.addAll(Arrays.asList("gg","aa"));
while(!pq.isEmpty())System.out.println(pq.poll());



/*Iterator<Integer> it = stack.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	//stack.pop();
}

for(Integer v:stack)
System.out.println(v);

for(int i=stack.size();i>0;i--)
	System.out.println(stack.pop());
*/
Collections.sort(list, new Comparator<Integer>(){
	public int compare(Integer ob1,Integer ob2)
	{
		return 1;
	}
});


String inp="abcd";
String out="";
/*for(int i=0;i<inp.length();i++)
{
	out+=((char)(inp.charAt(i)+1));
}*/
StringBuilder sb = new StringBuilder();
for(char c : inp.toCharArray())
{
	sb.append((char)((c+1)));
}
System.out.println(sb.toString());

int arr1[]=new int[]{1,2,3};
Arrays.toString(arr1);
	
}
}

	


