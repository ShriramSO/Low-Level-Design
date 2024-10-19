package Bank_Application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Transaction {
	
	HashMap<Integer , List<Integer>> map;
	
	public Transaction()
	{
		map = new HashMap<>();
	}
	
	public void transaction(int key , int amount)
	{
		if(map.containsKey(key))
		{
			map.get(key).add(amount);
		}
		else {
			List<Integer> list = new ArrayList<>();
			list.add(amount);
			map.put(key, list);
		}
	}
	
	public void printTrasaction(int id)
	{
		List<Integer> temp = map.get(id);
		System.out.println(temp);
 	}
}
