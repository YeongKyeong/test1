package Weapon;
import Player.*;


public class Fist extends Weapon {
	
	public Fist() {
		setName("�ָ�");
	}
	public void attack() {
		System.out.println(">>�ָ����� ���� �����ϴ�!");
	}
	public  void beBroken(Player p) {
		if(this.getHp()<=0&&this instanceof Fist) {
			System.out.println(">>���̻� �ָԿ� ���� ���� �ʽ��ϴ�! ���� �ٸ� ���⸦ ���ؾ� �մϴ�!");
			Player.chooseWeapon(p);
		}
	}
}
