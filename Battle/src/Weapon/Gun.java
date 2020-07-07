package Weapon;
import Player.*;

public class Gun extends Weapon {
	private int bullet=5;
	
	public Gun() {
		setPower(3);
		setHp(5);
		setName("ÃÑ");
	}
		
	public void attack() {
		System.out.println(">>ÅÁ!ÅÁ!ÅÁ! ÃÑ¾ËÀÌ Àû¿¡°Ô ¹ÚÈü´Ï´Ù!");
		bullet--;
		System.out.println(">>³²Àº ÃÑ¾Ë °³¼ö : "+bullet);
	}
	public  void beBroken(Player p) {
		if(this.getHp()<=0) {
			System.out.println(">>ÃÑÀÌ ¹Ú»ì³µ½À´Ï´Ù! »¡¸® ´Ù¸¥ ¹«±â¸¦ ±¸ÇØ¾ß ÇÕ´Ï´Ù!");
			Player.chooseWeapon(p);
		}
		else if(this.bullet==0) {
			System.out.println(">>ÃÑ¾ËÀ» ´Ù ½è½À´Ï´Ù! »¡¸® ´Ù¸¥ ¹«±â¸¦ ±¸ÇØ¾ß ÇÕ´Ï´Ù!");
			Player.chooseWeapon(p);
		}
	}
}
