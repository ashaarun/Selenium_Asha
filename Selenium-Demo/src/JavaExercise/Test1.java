package JavaExercise;

import java.io.IOException;
import java.util.ArrayList;

public class Test1 {

	public static void main(String [] args) {
		try{
			  int i = Integer.parseInt("xy");
			  System.out.println(i);
			 }catch(RuntimeException e){
			  System.out.print("c");
			 }catch(NumberFormatException e){
			  System.out.print("a");
			 }catch(ArithmeticException e){
			  System.out.print("b");
			 }finally{
			  System.out.print("d");
			 }

}
}
