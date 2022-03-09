package day20;

public interface DefaultActor {
	void act();
	
	void speak();
	
	default void comedy()
	{
		System.out.println("I can make people laugh");
	}
	
	

}
