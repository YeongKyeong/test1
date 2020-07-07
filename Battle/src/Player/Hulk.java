package Player;
import Weapon.*;

public class Hulk extends Player {
	Weapon weapon= new Fist();
	
	public Hulk() {
		setHp(70);
		setWeapon(weapon);
		this.weapon.setHp(30);
		setName("«Ê≈©");
		setPower(20);
	}

}
