package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class NewTest {

	public static void main(String[] args) {
		String s="Java";
		Map<Character,Integer> m= new HashMap<Character,Integer>();
		int len=s.length();
		for(int i=0;i<len;i++)
		{
			char ch =s.charAt(i);
			if(m.containsKey(ch))
			{
				m.put(ch, m.get(ch)+1);
			}
			else
			{
			m.put(ch, 1);
			}
		}
		System.out.println(m);
	}

}
