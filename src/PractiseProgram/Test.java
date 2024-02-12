package PractiseProgram;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
            String n="3343433";	
            int len=n.length();
            Map<Character,Integer> m = new HashMap<Character,Integer>();
            for(int i=0;i<=len-1;i++)
            {
            	char ch=n.charAt(i);
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
