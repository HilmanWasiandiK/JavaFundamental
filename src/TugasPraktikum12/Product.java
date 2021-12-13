package TugasPraktikum12;

public class Product {
	private Status status;
	private ServicePackage servicePackage;
	private City city;
	private long weight;
	private long quantity;
	private long priceItem;
	private String productName;
	
	@Override
	public String toString() {
		return "Barang(" + productName + " | " + quantity + " | " + weight +
				" | " + city.getDestination() + " | " + servicePackage.getService() +
				" | " +servicePackage.getValue() + " | " + ((priceItem*quantity)+servicePackage.getValue());
	}
}
