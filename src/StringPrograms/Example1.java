package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		Map<String,Integer> m = new HashMap<String,Integer>();
		String[] words=string.split(" ");
		for(String word:words)
		{
			if(m.containsKey(word))
			{
				m.put(word, m.get(word)+1);
			}
			else
			{
				m.put(word, 1);
			}
			
		}
		System.out.println(m);

	}

}
