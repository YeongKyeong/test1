package Weapon;
import Player.*;
import MyInterface.*;

public class Weapon implements Attackable{
	private String name;
	private int hp;
	private int power;
	
	public void attack() {
		//�������̵��ؼ� ����ϱ�
	}
	
	public  void beBroken(Player p) {
		if(this.hp<=0) {
			System.out.println(">>"+this.name+"�� �ڻ쳵���ϴ�! ���� �ٸ� ���⸦ ���ؾ� �մϴ�!");
			Player.chooseWeapon(p);
		}
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
	

}
