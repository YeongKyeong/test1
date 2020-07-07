package Weapon;

public class Sword extends Weapon {
	//칼의 공격력은 2~6까지 랜덤입니다.

	public Sword() {
		setPower(((int)Math.random()*100%5)+2);
		switch(getPower()) {
		case 2:
			setName("제일 구린 칼");
			setHp(3);
			break;
		case 3:
			setName("조금 손상된 칼");
			setHp(3);
			break;
		case 4:
			setName("그저 그런 칼");
			setHp(4);
			break;
		case 5:
			setName("괜찮은 칼");
			setHp(5);
			break;
		case 6:
			setName("숨겨진 명검");
			setHp(6);
			break;
		}
	}
	public void attack() {
		System.out.println(">>씽-상대방을 여기저기 칼집 내놓습니다!");
	}
}
