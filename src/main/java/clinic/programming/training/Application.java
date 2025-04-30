package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
public class Application {
	
	public int countWords(String words){
		String[] sepwords= StringUtils.split(words,' ');
		return (sepwords==null) ?0: sepwords.length;
	}
    public void greet(){
		List<String> greeting = new ArrayList<>();
		greeting.add("Hello");
		
		for (String g: greeting){
			System.out.println("Greeting: " + g);
		
		}
		
	}
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int c = app.countWords("I have four words");
		System.out.println("Word count:"+c);
		
    }
}