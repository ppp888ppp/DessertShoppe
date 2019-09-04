public class Candy extends DessertItem
{	
	private double weight = 0;
	private int pricePerPound = 0;
	
	public Candy(String name, double weight, int pricePerPound)
	{
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public int getPricePerPound()
	{
		return pricePerPound;
	}
	
	public void setPricePerPound(int pricePerPound)
	{
		this.pricePerPound = pricePerPound;
	}
	
	public int getCost()
	{
		return (int) Math.round((weight * pricePerPound));
	}
}