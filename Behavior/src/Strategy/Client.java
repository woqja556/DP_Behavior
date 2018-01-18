package Strategy;

public class Client {

	public static void main(String[] args) {
		 Robot t = new TaekwonV("�R����");
		 Robot a = new Atom("����");

		 t.setMovingStrategy(new WalkingStrategy());
		 t.setAttackStrategy(new MissileStrategy());
		 a.setMovingStrategy(new FlyingStrategy());
		 a.setAttackStrategy(new PunchStrategy());

		 t.move();
		 t.attack();
		 a.move();
	}
}
