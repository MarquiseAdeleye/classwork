namespace ShoppingListLab;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("-----------------Start Program----------------");
        Dictionary<string, double> menuItems = new Dictionary<string, double>(StringComparer.OrdinalIgnoreCase);
        menuItems.Add("Beef", 3);
        menuItems.Add("Milk", 5);
        menuItems.Add("Pasta", 7);
        menuItems.Add("Eggs", 20);
        menuItems.Add("Chicken", 3);
        menuItems.Add("Tomato", 7);
        menuItems.Add("Fish", 3);
        menuItems.Add("Cheese", 12);
        List<string> shoppingList = new List<string>();

        foreach (KeyValuePair<string, double> menuItem in menuItems)
        {
            Console.WriteLine("Item Name: " + menuItem.Key + " - Price: $" + menuItem.Value);
        }

        string input = "";
        do
        {
            Console.WriteLine("Enter an item you want to add to the shopping list: ");
            string item = Console.ReadLine();

            if (menuItems.ContainsKey(item))
            {
                Console.WriteLine(item + " : $" + menuItems[item]);
                shoppingList.Add(item);
                Console.WriteLine("Do your want to add another item to your shopping list? y/n ");
                input = (Console.ReadLine()).ToLower();
                
            }
            else
            {
                Console.WriteLine(item + " is not in the shopping list");
                input = "y";

            }

        }while(input == "y");

        double sum = 0;
        for (int i = 0; i < shoppingList.Count; i++)
        {
            Console.WriteLine("Item: " + shoppingList[i] + "Price: $" + menuItems[shoppingList[i]]);
            sum += menuItems[shoppingList[i]];
        }
        
        Console.WriteLine("The sum of the shopping list is: " + sum);
        
        
        
        Console.WriteLine("-----------------End Program------------------");

    }
}