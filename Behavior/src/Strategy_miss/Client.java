package Strategy_miss;

public class Client {

	public static void main(String[] args) {
		    Robot t = new TaekwonV("�R����");
		    Robot a = new Atom("����");

		    System.out.println("�� �̸��� : " + t.getName());
		    t.move();
		    t.attack();

		    System.out.println("�� �̸��� : " + a.getName());
		    a.move();
		    a.attack();
	}
}



