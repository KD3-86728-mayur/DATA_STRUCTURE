package Assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q1 {

	public static void main(String args[])
	{
		//Count occurrences of each word in a line/file.
		
		String line="hii this is my line hii this is";
		String word[]=line.split(" ");
		Map<String,Integer> m=new HashMap<>();
		
		for(int i=0;i<word.length;i++)
		{
		    m.put(word[i],m.getOrDefault(word[i], 0)+1);
		}
		
		for(Map.Entry<String, Integer> map:m.entrySet())
		{
			String words=map.getKey();
			int count=map.getValue();
			System.out.println(words+" "+count);
		}
		
		
		

	}
}
