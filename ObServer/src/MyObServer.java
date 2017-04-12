import java.util.Observable;
import java.util.Observer;


public class MyObServer implements Observer {

	public void update(Observable o, Object arg) {
	    String message = "";
	    if (o instanceof Person) {
	        message = ((Person)o).toString();
	    }
		System.out.println("对象发生变化:"+message);
	}
}
