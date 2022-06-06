import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		
		//Synchrodestiny
		
		//red and black tree
		// keys		values
		
		//B wing, 2nd floor,  2030
//Bharat
		
		Country c1 = new Country("India", "New Delhi", "Mr. Narendra Modi", "136.64 Crores", "Rs");
		Country c2 = new Country("Pakistan", "Islamabad", "Mr. Sharif", "21.66 Crores", "Pakistani Rupee");
		Country c3 = new Country("China", "Beijing", "Mr. Xi Jinping", "139.77 Crores", "Yuan");
		Country c4 = new Country("England", "London", "Mr. Boriss Johnson", "6.66 Crores", "Pound Sterling");
		Country c5 = new Country("America", "Washington DC", "Mr. Joe Biden", "32.82 Crores", "USD");
		
		TreeMap<String,Country> countryMap = new TreeMap<String,Country>();
		System.out.println("Map is ready....");
		
		System.out.println("putting the 1 country ");
		countryMap.put("IND", c1);
		
		System.out.println("putting the 2 country ");
		countryMap.put("PAK", c2);
		
		System.out.println("putting the 3 country ");
		countryMap.put("CHI", c3);
		
		System.out.println("putting the 4 country ");
		countryMap.put("UK", c4);
		
		System.out.println("putting the 5 country ");
		countryMap.put("US", c5);
		
		Set<String> allKeys= countryMap.keySet();
		
		Iterator<String> keysIterator= allKeys.iterator();
		
		while(keysIterator.hasNext()) {
			String key = keysIterator.next();
			System.out.println("key : "+key);
			
			Country theCountry = countryMap.get(key);
			System.out.println("Country : "+theCountry);
			System.out.println("-------------------------");	
		}
		System.out.println("===========================");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter key to find : ");
		String keyIn = scan.next();
		
		if(countryMap.containsKey(keyIn)) {
			System.out.println("Key found ");
			Country theCountry = countryMap.get(keyIn);
			System.out.println("Found Country : "+theCountry);
		}
		else {
			System.out.println("Key NOT found ");
		}
		
		
		
		
		
	}
}


class Country
{
	String name;
	String capital;
	String primeMinister;
	String population;
	String currency;
	
	public Country(String name, String capital, String primeMinister, String population, String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.primeMinister = primeMinister;
		this.population = population;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", primeMinister=" + primeMinister + ", population="
				+ population + ", currency=" + currency + "]";
	}
	
	
}
