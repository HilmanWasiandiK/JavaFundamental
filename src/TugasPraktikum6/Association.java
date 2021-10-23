package TugasPraktikum6;

public class Association {
	public static void main(String[] args) {
		Religion r1 = new Religion("Islam");
		Religion r2 = new Religion("Kristen");
		
		Person a = new Person("Andi");
		Person b = new Person("Budi");
		Person c = new Person("Coki");
		Person d = new Person("Doni");
		Person e = new Person("Edo");
		
		System.out.println(a.getName()+", "+c.getName()+", dan "+d.getName()+" beragama "+r1.getName());
		System.out.println(b.getName()+" dan "+e.getName()+" beragama "+r2.getName());
	}
}

class Person {
	private String personName;
	
	public Person(String name) {
		personName = name;
	}
	
	public String getName() {
		return personName;
	}
}

class Religion {
	private String religionName;
	
	public Religion(String religion) {
		religionName = religion;
	}
	
	public String getName() {
		return religionName;
	}
}
