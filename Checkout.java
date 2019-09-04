
public class Checkout
{
	  DessertItem[] dessertItem = new DessertItem[100];
	  int numberOfItems = 0;
	  
	  public Checkout()
	  {
		  DessertItem[] dessertItem = new DessertItem[100];
	  }
	  
	  public void clear()
	  {
		   dessertItem = new DessertItem[100];
		   numberOfItems = 0;
	  }
	  
	  public void enterItem(DessertItem item)
	  {
		  dessertItem[numberOfItems++] = item;
	  }
	  
	  public int numberOfItems()
	  {
		  return numberOfItems;
	  }
	  
	  public int totalCost()
	  {
		  int totalCost = 0;
		  
		  for(int i = 0; i < numberOfItems; i++)
		  {
			  totalCost += dessertItem[i].getCost();
		  }
		  return totalCost;
	  }
	  
	  public int totalTax()
	  {
		  int totalTax = 0;
		  totalTax += (int)Math.round(totalCost() *  DessertShoppe.TAX_RATE/100);  
		  return totalTax;
	  }
	
	  public String toString()
	  {
		  String receipt = "";
		  
		  String leftLimit = "%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s";
		  String rightLimit = "%" + DessertShoppe.COST_WIDTH + "s";
		  
		  System.out.printf("\t%s", DessertShoppe.STORE_NAME);
		  System.out.println();
		  System.out.print("\t");
		  
		  for(int i = 0 ; i < DessertShoppe.STORE_NAME.length() ; i++)
		  {
			  System.out.print("-");
		  }
		  
		  System.out.println();

		  for(int i = 0 ; i < numberOfItems; i++)
		  {
				String itemName = dessertItem[i].getName();
				String itemCost = DessertShoppe.cents2dollarsAndCents(dessertItem[i].getCost());
				
				if(dessertItem[i] instanceof Candy) 
				{
					double candyWeight = ((Candy)dessertItem[i]).getWeight(); 
					String priceperPound = DessertShoppe.cents2dollarsAndCents(((Candy)dessertItem[i]).getPricePerPound()); 
					receipt = receipt + String.format("%,.2f 1bs. @ %s /1b. \n", candyWeight, priceperPound);
				}
				else if(dessertItem[i] instanceof Cookie)
				{
					int cookieNumber = ((Cookie)dessertItem[i]).getCookieNumber();
					String priceperDozen = DessertShoppe.cents2dollarsAndCents(((Cookie)dessertItem[i]).getPricePerDozen());
					receipt = receipt + String.format("%d @ %s /dz.\n", cookieNumber, priceperDozen);
				}
				else if(dessertItem[i] instanceof Sundae)
				{
					String nameTopping = ((Sundae)dessertItem[i]).getToppingName(); 
					receipt = receipt + String.format("%s Sundae with\n", nameTopping);
				}
				receipt = receipt + String.format(leftLimit + rightLimit + "\n", itemName, itemCost);
			}
			
			String totalTax = DessertShoppe.cents2dollarsAndCents(totalTax()); 
			receipt = receipt + String.format("\n" + leftLimit + rightLimit + "\n", "Tax", totalTax);
						
			
			String totalCost = DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax());
			receipt = receipt + String.format(leftLimit + rightLimit, "Total Cost", totalCost); 
				
			return receipt; 	
		}  
	}