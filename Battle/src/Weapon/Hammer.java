package Weapon;

public class Hammer extends Weapon {
	
	public Hammer() {
		setPower(12);
		setHp(30);
		setName("토르망치");
	}
	public void attack() {
		System.out.println(">>콰르릉! 상대방에게 벼락을 내리꽂았습니다!");
	}
}
