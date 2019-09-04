public class Cookie extends DessertItem
{
	private int cookieNumber = 0;
	private int pricePerDozen = 0;
	
	public Cookie(String name, int cookieNumber, int pricePerDozen)
	{
		super(name);
		this.cookieNumber = cookieNumber;
		this.pricePerDozen = pricePerDozen;
	}
	
	public void setCookieNumber(int cookieNumber)
	{
		this.cookieNumber = cookieNumber;
	}
	
	public int getCookieNumber()
	{
		return cookieNumber;
	}
	
	public void setPricePerDozen(int pricePerDozen)
	{
		this.pricePerDozen = pricePerDozen;
	}
	
	public int getPricePerDozen()
	{
		return pricePerDozen;
	}
	
	public int getCost()
	{
		return (int) Math.round(cookieNumber * pricePerDozen/12);
	}
}