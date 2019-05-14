package JavaExercise;

import java.io.IOException;
import java.util.ArrayList;

public class Test1 {

	public static void main(String [] args) {
	   int price = 500;
	   String range = (price < 500)?"low":(price < 1000)?"medium":"high";
	   System.out.println(range);
}
}
