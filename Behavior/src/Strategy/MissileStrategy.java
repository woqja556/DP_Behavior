package Strategy;

public class MissileStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("미사일 발사");
	}
}
