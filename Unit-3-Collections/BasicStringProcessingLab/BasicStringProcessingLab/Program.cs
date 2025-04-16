namespace BasicStringProcessingLab;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("-----------------Start Program-----------------");
        
        Console.WriteLine("Enter a sentence:");
        string input = Console.ReadLine();
        string[] split = input.Split(" ");

        for (int i = 0; i < split.Length; i++)
        {
            Console.WriteLine(split[i]);
        }

        Console.WriteLine("-----------------End Program-----------------");
    }

}