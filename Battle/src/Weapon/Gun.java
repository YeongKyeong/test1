package Weapon;
import Player.*;

public class Gun extends Weapon {
	private int bullet=5;
	
	public Gun() {
		setPower(3);
		setHp(5);
		setName("��");
	}
		
	public void attack() {
		System.out.println(">>��!��!��! �Ѿ��� ������ �����ϴ�!");
		bullet--;
		System.out.println(">>���� �Ѿ� ���� : "+bullet);
	}
	public  void beBroken(Player p) {
		if(this.getHp()<=0) {
			System.out.println(">>���� �ڻ쳵���ϴ�! ���� �ٸ� ���⸦ ���ؾ� �մϴ�!");
			Player.chooseWeapon(p);
		}
		else if(this.bullet==0) {
			System.out.println(">>�Ѿ��� �� ����ϴ�! ���� �ٸ� ���⸦ ���ؾ� �մϴ�!");
			Player.chooseWeapon(p);
		}
	}
}
