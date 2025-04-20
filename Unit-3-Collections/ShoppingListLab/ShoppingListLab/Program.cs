namespace ShoppingListLab;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("-----------------Start Program----------------");
        Dictionary<string, double> menuItems = new Dictionary<string, double>();
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
        
        Console.WriteLine("Do your want to add an item to your shopping list? y/n ");
        string input = Console.ReadLine();
        
        
        
        
        Console.WriteLine("-----------------End Program------------------");

    }
}