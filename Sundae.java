public class Sundae extends IceCream
{
	private String ToppingName = "";
	private int ToppingCost = 0;
	
	public Sundae(String IcecreamName, int CostOfIcecream, String ToppingName, int ToppingCost)
	{
		super(IcecreamName, CostOfIcecream);
		this.ToppingName = ToppingName;
		this.ToppingCost = ToppingCost; 
	}
	
	public void setToppingName(String ToppingName)
	{
		this.ToppingName = ToppingName;
	}
	
	public String getToppingName()
	{
		return ToppingName;
	}
	
	public void setToppingCost(int ToppingCost)
	{
		this.ToppingCost = ToppingCost;
	}
	
	public int getToppingCost()
	{
		return ToppingCost;
	}
	
	public int getCost()
	{
		return super.getCost() + getToppingCost(); 
	}
}