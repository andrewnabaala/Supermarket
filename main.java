import java.util.*;

public class Supermarket {
	// 3 arrays for storing name of item, cost and quantity.
	// Output: Items we selected and output
	public static void main(String [] args)
	{
		int i = 0;
		int totalCost = 0;
		String [] items = new String[10];
		int [] cost = new int [10];
		int [] quantity = new int [10];
		while(true)
		{
			int ifAdding;
			System.out.println("Enter 1 for adding an item or 0 for the total bill");
			Scanner input = new Scanner(System.in);
			ifAdding = input.nextInt();
			input.close();
			if (ifAdding == 1)
			{
				String item;
				int theQuantity;
				int theCost;
				System.out.println("Enter the item name: ");
				Scanner inputName = new Scanner(System.in);
				item = inputName.nextLine();
				System.out.println("Enter the cost of the item: ");
				Scanner inputCost = new Scanner(System.in);
				theCost = inputCost.nextInt();
				System.out.println("Enter the quantity of " + item + ": ");
				Scanner inputQuantity = new Scanner(System.in);
				theQuantity = inputQuantity.nextInt();
				inputName.close();
				inputCost.close();
				inputQuantity.close();
				//Inputting the quantity according to index. 
				items[i] = item;
				cost[i] = theCost;
				quantity[i]=theQuantity;
				i++;
			}
			else if (ifAdding == 0)
			{
				System.out.println("The items bought are: ");
				for(int j=0; j<=i ; j++)
				{
					System.out.println(items[j] + " quantity is " + quantity[j]);
				}
				for(int j=0; j<=i ; j++)
				{
					totalCost += cost[j] * quantity[j]; 
				}
				System.out.println("The total cost of your bill is "+ totalCost);
				break;
			}
			else
			{
				break;
			}
		}
	}
 
}
