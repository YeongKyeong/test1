package Weapon;

public class MagicRing extends Weapon{
	
	public MagicRing() {
		setPower(8);
		setHp(15);
		setName("매직링");
	}
	
	public void attack() {
		System.out.println(">>@#@#$%%^... 주문을 외우자 마법이 발동됩니다!");
	}
}
