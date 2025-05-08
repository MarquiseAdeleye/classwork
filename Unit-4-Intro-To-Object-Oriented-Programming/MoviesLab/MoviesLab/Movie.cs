namespace MoviesLab;

public class Movie
{
    /*********************************************************************
     * Data members (attributes, properties, variables)
     *********************************************************************/
    
    private string title;
    private string category;
    
    
    //Getters and Setters
    public string Title 
    {
        get { return title; } 

        set { title = value; }

    }
    
    public string Category 
    {
        get { return category; } 

        set { category = value; }

    }
    

    /*********************************************************************
     * Method members (functions that operate on the class data)
     *********************************************************************/
    public Movie(string theTitle, string theCategory)
    {
        title = theTitle;
        category = theCategory;
    }
    
    public Movie(Movie sourceMovie)
    {
        title = sourceMovie.title;
        category  = sourceMovie.category;
    }
    
    //Method Overrides
    
    public override string ToString()
    {
        return $"Movie: Title= {title}, Category= {category}";
    }
}