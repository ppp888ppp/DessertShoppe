public class IceCream extends DessertItem
{
	private int cost = 0;
	
	public IceCream(String name, int cost)
	{
		super(name);
		this.cost = cost;
	}
	
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	
	public int getCost()
	{
		return cost;
	}	
}