package Strategy_miss;

public class Client {

	public static void main(String[] args) {
		    Robot t = new TaekwonV("태꿘브이");
		    Robot a = new Atom("아톰");

		    System.out.println("내 이름은 : " + t.getName());
		    t.move();
		    t.attack();

		    System.out.println("내 이름은 : " + a.getName());
		    a.move();
		    a.attack();
	}
}



