package Weapon;
import Player.*;
import MyInterface.*;

public class Weapon implements Attackable{
	private String name;
	private int hp;
	private int power;
	
	public void attack() {
		//오버라이딩해서 사용하기
	}
	
	public  void beBroken(Player p) {
		if(this.hp<=0) {
			System.out.println(">>"+this.name+"이 박살났습니다! 빨리 다른 무기를 구해야 합니다!");
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
