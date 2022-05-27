import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		ArrayList<String> weaks = new ArrayList<String>();
		weaks.add("peas");
		ZombieBase.update("Standard", weaks);
		System.out.println(ZombieBase.duplicate("Standard", "Conehead"));
		System.out.println(ZombieBase.duplicate("Standard", "Buckethead"));
		weaks.add("lawnmowers");
		ZombieBase.update("Standard", weaks);
		String[] batch = {"Newspaper", "Screen Door", "Footballer"};
		ZombieBase.update(batch, weaks);
		System.out.println(ZombieBase.get("Standard"));
		System.out.println(ZombieBase.get("Sunflower"));
		System.out.println(ZombieBase.toStr());
	}
}
