package Player;
import Weapon.*;

public class DS extends Player{
	//DS는 Doctor Strange입니다.
	Weapon weapon= new MagicRing();

	
	public DS() {
		setHp(50);
		setWeapon(weapon);
		setName("닥터 스트레인지");
		setPower(10);
		
	}

}
