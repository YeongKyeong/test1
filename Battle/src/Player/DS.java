package Player;
import Weapon.*;

public class DS extends Player{
	//DS�� Doctor Strange�Դϴ�.
	Weapon weapon= new MagicRing();

	
	public DS() {
		setHp(50);
		setWeapon(weapon);
		setName("���� ��Ʈ������");
		setPower(10);
		
	}

}
