namespace MoviesLab;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("-----------------------Start Program-------------------------");

        List<Movie> movieList = new List<Movie>();
        
        movieList.Add(new Movie("Oppenheimer", "Drama"));
        movieList.Add(new Movie("Spider-Man: No Way Home", "Action"));
        movieList.Add(new Movie("Barbie", "Comedy"));
        movieList.Add(new Movie("Top Gun: Maverick", "Action"));
        movieList.Add(new Movie("Everything Everywhere All At Oncer", "Drama"));
        movieList.Add(new Movie("The Batman", "Mystery"));
        movieList.Add(new Movie("Dune: Part One", "Drama"));
        movieList.Add(new Movie("The Super Mario Bros. Movie", "Comedy"));
        movieList.Add(new Movie("Avatar: The Way of Water", "Sci-Fi"));
        movieList.Add(new Movie("The Whale", "Drama"));
        
        Console.WriteLine($"The number of movies in the list is {movieList.Count}");
        

        string userInput = "y";
        
        do
        {
            Console.WriteLine("\n Please enter a Category:");
            string userCategory = Console.ReadLine().ToUpper();
            
            foreach (var movie in movieList)
            {
                if (movie.Category.ToUpper() == userCategory)
                {
                    Console.WriteLine(movie.Title);
                }
                else
                {
                    continue;
                }
            }
            
            Console.WriteLine("Do you want to lookup another category? y/n :");
            userInput = Console.ReadLine();

        } while (userInput == "y");

        Console.WriteLine("-------------------------End Program-------------------------");
    
    }
}