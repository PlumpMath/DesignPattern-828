package strategypattern;

public class MallardDuck extends Duck
{
	public MallardDuck()
	{
		// TODO Auto-generated constructor stub
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}
}
