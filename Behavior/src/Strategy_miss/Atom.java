package Strategy_miss;

public class Atom extends Robot {
	  public Atom(String name){
	    super(name);
	  }
	
	  public void attack(){
	    System.out.println("펀치");
	  }
	  public void move(){
	    System.out.println("날아 올라라");
	  }
}



