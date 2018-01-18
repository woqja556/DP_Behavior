package Strategy;

public class Client {

	public static void main(String[] args) {
		 Robot t = new TaekwonV("태꿘브이");
		 Robot a = new Atom("아톰");

		 t.setMovingStrategy(new WalkingStrategy());
		 t.setAttackStrategy(new MissileStrategy());
		 a.setMovingStrategy(new FlyingStrategy());
		 a.setAttackStrategy(new PunchStrategy());

		 t.move();
		 t.attack();
		 a.move();
	}
}
