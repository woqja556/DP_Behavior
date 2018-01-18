package Strategy;

public class FlyingStrategy implements MovingStrategy {

	@Override
	public void move() {
		System.out.println("날아올라라");
	}
}
