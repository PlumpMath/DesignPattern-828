package duck;

public class Duck
{
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	public Duck()
	{
		// TODO Auto-generated constructor stub
	}
	public void setFlyBehavior(FlyBehavior fb)
	{
		flyBehavior=fb;
	}
	public void setQuackBehavior(QuackBehavior qb)
	{
		quackBehavior=qb;
	}
	public void performFly()
	{
		flyBehavior.fly();
	}
	public void performQuack()
	{
		quackBehavior.quack();
	}
}
