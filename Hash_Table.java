
import java.util.Enumeration;

import java.util.Hashtable;

	public class Hash_Table {
		
		public static void main(String args[]) {

		// Create a hash map

		Hashtable balance = new Hashtable();

		Enumeration names;

		String str;

		double bal;



		balance.put("Liska", new Double(540.60));

		balance.put("Fatma", new Double(60.45));

		balance.put("Ainun", new Double(56.90));

		balance.put("Ramlah", new Double(-506.5));

		balance.put("Udin", new Double(-40.50));



		// Show all balances in hash table.

		names = balance.keys();

		while(names.hasMoreElements()) {

		str = (String) names.nextElement();

		System.out.println(str + ": " +

		balance.get(str));

		}

		System.out.println();

		// Deposit 1,000 into Zara's account

		bal = ((Double)balance.get("Liska")).doubleValue();

		balance.put("Liska", new Double(bal+1000));

		System.out.println("Liska's new balance: " +

		balance.get("Liska"));

		}
	}
