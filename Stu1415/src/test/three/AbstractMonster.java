package test.three;

public class AbstractMonster {
	protected String name;
	protected int hp;
	protected int attack;
	protected int defense;
	
	
	protected String getName() {
		return name;
	}
	protected int getHp() {
		return hp;
	}
	protected int getAttack() {
		return attack;
	}
	protected int getDefender() {
		return defense;
	}
	
	
	protected AbstractMonster(String name, int hp, int attack, int defender) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defender;
	}
	
	public void defense(boolean mobattack) {
		if(attack > defense) {
			hp = hp - attack;
			mobattack = true;
		}
		else {
			hp = hp;
			mobattack = false;
		}
		
	}
}
