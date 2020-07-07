package Player;
import Weapon.*;
import MyInterface.*;
public class Player implements Attackable, Defensible{
	private String name;
	private int hp;
	private int power;
	private Weapon weapon;

	public Player() {
	}
	public void attack() {
		System.out.println(">>"+this.name+"�� �����մϴ�!");
	}
	
	public void showWeapon() {
		System.out.println(">>"+this.weapon.getName()+"�� ����մϴ�!");
		this.weapon.attack();
		this.weapon.setHp(this.weapon.getHp()-1);
	}
	
	public void showHp() {
		System.out.println("**********************************************************");
		System.out.println(">>"+this.name+"�� ���� hp : "+this.hp+"       ���� hp : "+this.weapon.getHp());
		System.out.println("**********************************************************");
	}
	
	public static void chooseWeapon(Player p) {
		p.power-=p.weapon.getPower();
		int a=(int)(Math.random()*100%3);
		switch(a) {
		case 0:
			System.out.println(">>�ƹ� ���⵵ ã�� ���߽��ϴ�.. �ָ����� �ο�ϴ�!");
			p.weapon=new Fist();
			break;
		case 1:
			System.out.println(">>���� �ֿ����ϴ�! ���� ����� ����մϴ�!");
			p.weapon=new Gun();
			break;
		case 2:
			System.out.println(">>Į�� �ֿ����ϴ�! Į�� ����� ����մϴ�!");
			p.weapon=new Sword();
			break;
		}
		p.power+=p.weapon.getPower();
	}
	public boolean defense() {
		if(this.weapon instanceof Fist==false) {
				System.out.println(">>"+this.name+"�� ���⸦ ����ؼ� ���Ƴ½��ϴ�!hp�� �� ���Դϴ�!");
				this.weapon.setHp(this.weapon.getHp()-3);
				return true;
		}
		return false;
	}
	
	public void myTurn() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println(">>"+this.name+"�� ���� �����Դϴ�.");
		System.out.println("--------------------------------------------------------------------");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	

}
