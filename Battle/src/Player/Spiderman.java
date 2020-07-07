package Player;
import Weapon.*;

public class Spiderman extends Player {
	 Weapon weapon= new Spiderweb();
	
	public Spiderman() {
		setHp(60);
		setWeapon(weapon);
		 setName("스파이더맨");
		 setPower(8);
	}
}
