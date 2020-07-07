package Weapon;

public class Spiderweb extends Weapon {
	
	public Spiderweb() {
		setPower(10);
		setHp(10);
		setName("거미줄");
	}
	public void attack() {
		System.out.println(">>촤-- 거미줄이 상대방을 포박합니다!상대방은 목이 졸리고 있습니다..");
	}
}
