package Weapon;

public class Sword extends Weapon {
	//Į�� ���ݷ��� 2~6���� �����Դϴ�.

	public Sword() {
		setPower(((int)Math.random()*100%5)+2);
		switch(getPower()) {
		case 2:
			setName("���� ���� Į");
			setHp(3);
			break;
		case 3:
			setName("���� �ջ�� Į");
			setHp(3);
			break;
		case 4:
			setName("���� �׷� Į");
			setHp(4);
			break;
		case 5:
			setName("������ Į");
			setHp(5);
			break;
		case 6:
			setName("������ ���");
			setHp(6);
			break;
		}
	}
	public void attack() {
		System.out.println(">>��-������ �������� Į�� �������ϴ�!");
	}
}
