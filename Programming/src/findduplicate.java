import java.util.HashMap;
import java.util.Map;

public class findduplicate {
	public static void main(String[] args) {
		
		int count=1;
		String name="Syed mohammad soban e";
		char[] array=name.toCharArray();
		Map<Character,Integer> map =new HashMap<Character,Integer>();
		for(int i =0;i<array.length;i++){
			if(map.containsKey(array[i])){
				count= map.get(array[i]);
				map.put(array[i], ++count);
			}else{
					map.put(array[i], count);
					
				}
				
				
				
			
		}
		System.out.println(map);
	}

}
