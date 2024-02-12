package JavaLearning;

import java.util.HashMap;
import java.util.Map;

public class Factory {

	public static void main(String[] args) {
		String s= "automation testing";
		int len=s.length();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
		
		for(int i=0;i<=len-1;i++)
		{
			char ch=s.charAt(i);
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+1);
			}
			else
			{
				m.put(ch,1);
			}
		}
		System.out.println(m);
		
	}

}
