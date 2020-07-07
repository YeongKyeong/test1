package Weapon;
import Player.*;


public class Fist extends Weapon {
	
	public Fist() {
		setName("주먹");
	}
	public void attack() {
		System.out.println(">>주먹으로 마구 떄립니다!");
	}
	public  void beBroken(Player p) {
		if(this.getHp()<=0&&this instanceof Fist) {
			System.out.println(">>더이상 주먹에 힘이 들어가지 않습니다! 빨리 다른 무기를 구해야 합니다!");
			Player.chooseWeapon(p);
		}
	}
}
