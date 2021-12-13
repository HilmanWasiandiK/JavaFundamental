package TugasTeori11;

import java.util.*;

public class Uncle implements Comparable<Uncle> {
	private String name;
	private Map<Niece, String> presents = new HashMap<Niece, String>();
	
	public void setDataUncle(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean addPresent(Niece recipient, String description) {
		System.out.print("Status penambahan hadiah " + description + " kepada " + recipient.getName() + ": ");
		if(!presents.containsValue(description) && !recipient.getPresents().containsValue(description) || description == null) {
			presents.put(recipient, description);
			recipient.getPresents().put(this, description);
			System.out.println("SUKSES!");
			return true;
		}
		System.out.println("GAGAL!");
		return false;
	}
	
	public void listPresents() {
		System.out.println("Hadiah dari paman " + this.name + ": ");
		for(Map.Entry<Niece, String> entry : presents.entrySet()) {
			System.out.print((entry.getValue()==null? "- Tidak ada hadiah untuk ": "- " + entry.getValue() + " untuk "));
			System.out.println(entry.getKey().getName());
		}
	}
	
	@Override
	public String toString() {
		return "nama: " + name;
	}
	
	@Override
	public int compareTo(Uncle another) {
		return name.compareTo(another.name);
	}
}
