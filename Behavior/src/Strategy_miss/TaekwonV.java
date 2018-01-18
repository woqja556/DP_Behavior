package Strategy_miss;

public class TaekwonV extends Robot {
	  public TaekwonV(String name){
	    super(name);
	  }
	  public void attack(){
	    System.out.println("미사일 발사");
	  }
	  public void move(){
	    System.out.println("전진");
	  }
}


