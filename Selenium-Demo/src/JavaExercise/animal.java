package JavaExercise;

public class animal {
	
	String name="animal";
	String noise()
	{
		return "general";
	}

}

 class dog extends animal{
	String name="dog";
	String noise()
	{
		return "bark";
	}
}
class Test123{
	public static void main(String[] args)
	{
		animal an=new dog();
		System.out.println(an.name+" "+an.noise());
	}
	
}
