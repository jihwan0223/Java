package test.three;

public class Attacker extends AbstractMonster{

	public Attacker(String name, int hp, int attack, int defender) {
		super(name, hp, attack, defender);
		this.name = "Attacker";
		this.hp = 30;
		this.attack = 20;
		this.defense = 10;
	}
	public void attack() {
		System.out.println("Attacker - Very Strong Attack");
		return;
	}
}
