package strategypattern;

public class DuckSimulation
{
	public static void main(String[] args)throws Exception
	{
		Duck mallard=new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.setQuackBehavior(new Squeak());
		mallard.performFly();
		mallard.performQuack();
	}
	
}
