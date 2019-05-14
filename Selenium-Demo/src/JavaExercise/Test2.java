package JavaExercise;

public class Test2 {
	
	   int t1;
	      public Test2(){
	         t1 = 100;
	      }
	      public Test2(int t1){
	          this.t1 = t1;
	       }
	       public static void main(String [] args) {
	           int t1 = 50;
	           Test2 obj = new Test2();
	           System.out.println(obj.t1);
	      }
}
