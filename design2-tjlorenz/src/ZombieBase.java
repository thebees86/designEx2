import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZombieBase {
	private static Map<String, List<String>> zList = new HashMap<String, List<String>>();
	
	//Adds and updates types (same functionality as put() in Maps)
	public static void update(String type, ArrayList<String> weaknesses) {
		zList.put(type, weaknesses);
	}
	
	public static void update(String[] type, ArrayList<String> weaknesses) {
		for(String s : type) {
			zList.put(s, weaknesses);
		}
	}
	
	//Duplicates weaknesses of existing type
	//returns false if parent type doesn't exist
	public static boolean duplicate(String parent, String child) {
		if(!zList.containsKey(parent))
			return false;
		zList.put(child, new ArrayList<>((ArrayList<String>)zList.get(parent)));
		return true;
	}
	
	//Gets type
	public static String get(String type) {
		if(!zList.containsKey(type))
			return String.format("TYPE NOT FOUND: \"%s\"",type);
		//used string return instead of thrown error b/c I assume this would have a GUI to display this
		
		return String.format("TYPE: %s, WEAKNESSES: %s", type, zList.get(type));
	}
	
	public static String toStr() { //Can't use toString because static method
		return "" + zList;
	}
}