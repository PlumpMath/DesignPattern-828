package factorypattern;

public class PizzaTestDriver
{
	public static void main(String[] args) throws Exception
	{
		PizzaStore nyStore=new NYPizzaStore();
		Pizza pizza=nyStore.orderPizza("cheese");
		System.out.println("order a "+pizza.getName()+" pizza");
		
	}
}
