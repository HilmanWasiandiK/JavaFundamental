package TugasPraktikum6;

public class Composition {
	public static void main(String[] args) {
		CreateAccount acc = new CreateAccount("Kavuzi_doom", "vugjanah");
		acc.getInfo();
	}

}

class CreateAccount {
	private String nickname;
	private String password;
	private PlayerData pd;
	
	public CreateAccount (String nick, String pass) {
		nickname = nick;
		password = pass;
		pd = new PlayerData();
	}
	
	public void getInfo() {
		System.out.println("nickname : "+nickname);
		System.out.println("password : "+password);
		System.out.println("Data	 : ");
		pd.getInfo();
	}
}

class PlayerData {
	private int playerLevel;
	private int playerMoney;
	private int playerGem;
	
	public PlayerData() {
		playerLevel = 1;
		playerMoney = 10000;
		playerGem = 3;
	}
	
	public void getInfo() {
		System.out.println("     -) Level = "+playerLevel);
		System.out.println("     -) Money = "+playerMoney);
		System.out.println("     -) Gem   = "+playerGem);
	}
	
}
