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
		System.out.println(">>"+this.name+"이 공격합니다!");
	}
	
	public void showWeapon() {
		System.out.println(">>"+this.weapon.getName()+"를 사용합니다!");
		this.weapon.attack();
		this.weapon.setHp(this.weapon.getHp()-1);
	}
	
	public void showHp() {
		System.out.println("**********************************************************");
		System.out.println(">>"+this.name+"의 현재 hp : "+this.hp+"       무기 hp : "+this.weapon.getHp());
		System.out.println("**********************************************************");
	}
	
	public static void chooseWeapon(Player p) {
		p.power-=p.weapon.getPower();
		int a=(int)(Math.random()*100%3);
		switch(a) {
		case 0:
			System.out.println(">>아무 무기도 찾지 못했습니다.. 주먹으로 싸웁니다!");
			p.weapon=new Fist();
			break;
		case 1:
			System.out.println(">>총을 주웠습니다! 총을 무기로 사용합니다!");
			p.weapon=new Gun();
			break;
		case 2:
			System.out.println(">>칼을 주웠습니다! 칼을 무기로 사용합니다!");
			p.weapon=new Sword();
			break;
		}
		p.power+=p.weapon.getPower();
	}
	public boolean defense() {
		if(this.weapon instanceof Fist==false) {
				System.out.println(">>"+this.name+"가 무기를 사용해서 막아냈습니다!hp가 덜 깎입니다!");
				this.weapon.setHp(this.weapon.getHp()-3);
				return true;
		}
		return false;
	}
	
	public void myTurn() {
		System.out.println("--------------------------------------------------------------------");
		System.out.println(">>"+this.name+"의 공격 차례입니다.");
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
