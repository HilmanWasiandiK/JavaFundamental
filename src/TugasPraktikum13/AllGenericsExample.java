package TugasPraktikum13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AllGenericsExample {
	//GENERIC METHOD
	public static <T> boolean isEqual(GenericGetSet<T> g1, GenericGetSet<T> g2){  
		return g1.get().equals(g2.get()); 
	} 
	
	public static void main(String args[]) {
		//GENERIC CLASS (GENERICGETSET) IMPLEMENTATION
		GenericGetSet<String> title = new GenericGetSet<>("DAFTAR HEWAN :");
		System.out.println(title.get());
		//GENERIC WILDCARD IMPLEMENTATION
		AnimalList.dispAnimalList(AnimalList.declareAnimalList());
		
		//GENERIC CLASS (GENERICGETSET) IMPLEMENTATION
		GenericGetSet<String> title2 = new GenericGetSet<>("\nDAFTAR BERAT HEWAN (KG) :");
		System.out.println(title2.get());
		GenericGetSet<Integer> elephantWeight = new GenericGetSet<>(7000);
		System.out.println(" - Gajah => "+ elephantWeight.get());
		GenericGetSet<Integer> catWeight = new GenericGetSet<>(4);
		System.out.println(" - Kucing => "+ catWeight.get());
		GenericGetSet<Integer> eagleWeight = new GenericGetSet<>(2);
		System.out.println(" - Elang => "+ eagleWeight.get());
		GenericGetSet<Integer> jellyfishWeight = new GenericGetSet<>(1);
		System.out.println(" - Ubur-Ubur => "+ jellyfishWeight.get());
		GenericGetSet<Integer> roosterWeight = new GenericGetSet<>(2);
		System.out.println(" - Ayam Jago => "+ roosterWeight.get());
		
		//GENERIC INTERFACE (MINMAX) IMPLEMENtAtION
		System.out.println("======================");
		Integer allWeight[] = { elephantWeight.get(), catWeight.get(), eagleWeight.get(), jellyfishWeight.get(), roosterWeight.get() };
		MyClass<Integer> a = new MyClass<Integer>(allWeight); 
		System.out.println(" # Berat hewan paling besar => "+ a.max());  
		System.out.println(" # Berat hewan paling kecil => "+ a.min()); 
		
		GenericGetSet<String> title3 = new GenericGetSet<>("\nCONTOH PERSAMAAN BERAT ANTAR HEWAN :");
		System.out.println(title3.get());
		//GENERIC METHOD (ISEQUAL) IMPLEMENTATION
		boolean isEqual = AllGenericsExample.isEqual(eagleWeight, roosterWeight);
		System.out.println(" - Berat Elang = berat Ayam Jago? "+ isEqual);
		isEqual = AllGenericsExample.isEqual(elephantWeight, catWeight);
		System.out.println(" - Berat Gajah = berat Kucing? "+ isEqual);
	}
}

//GENERIC WILDCARD
class AnimalList {
	public static Map<String, String> declareAnimalList() {
		Map<String, String> animalList = new LinkedHashMap<String, String>();
		animalList.put("Gajah","Mammal");
		animalList.put("Kucing", "Mammal");
		animalList.put("Elang", "Aves");
		animalList.put("Ubur-Ubur", "Animal");
		animalList.put("Ayam Jago", "Aves");
		return animalList;
	}
	public static void dispAnimalList(Map<?, ?> m) {
		int i = 1;
		for(Entry<?, ?> e : m.entrySet()) {
			System.out.print( " "+ i +". "+ e.getKey() +" ");
			i++;
			
			//GENERIC BOUNDED IMPLEMENTATION
			if(e.getValue().equals("Mammal")) {
				Classification<Mammal> elephant = new Classification<Mammal>(new Mammal());
				elephant.determineClassification();

			}
			else if(e.getValue().equals("Aves")) {
				Classification<Aves> eagle = new Classification<Aves>(new Aves());
				eagle.determineClassification();
			}
			else {
				Classification<Animal> animal = new Classification<Animal>(new Animal());
				animal.determineClassification();
			}
			
		}
	}
}

//GENERIC BOUNDED
class Animal {
	private String name;
	private int weight;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void dispStatus() {
		System.out.println("merupakan Hewan");
	}
}
class Mammal extends Animal {
	@Override
	public void dispStatus() {
		System.out.println("merupakan Mamalia");
	}
}
class Aves extends Animal {
	@Override
	public void dispStatus() {
		System.out.println("merupakan Unggas");
	}
}
class Classification<T extends Animal> {
	public T obj;
	
	public Classification(T obj) {
		this.obj = obj;
	}
	
	public void determineClassification() {
		this.obj.dispStatus();
	}
}

//GENERIC CLASS
class GenericGetSet<T> {
	private T t;
	
	public GenericGetSet(T t) {
		this.t = t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}
}