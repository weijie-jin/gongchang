import che.Che;
import factory.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Che c1 = new AoFa().create();
        Che c2 = new Byfa().create();
        
        c1.run();
        c2.run();
        
	}

}
