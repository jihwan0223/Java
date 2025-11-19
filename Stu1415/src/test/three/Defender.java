package test.three;

public class Defender extends AbstractMonster{

	public Defender(String name, int hp, int attack, int defender) {
		super(name, hp, attack, defender);
		this.name = "Defender";
		this.hp = 20;
		this.attack = 13;
		this.defense = 25;
	}
	public void attack() {
		System.out.println("Defender - Attack");
	}

}
