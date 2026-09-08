//********************************************************************
//  Comics.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an array of objects.
//********************************************************************

public class Comics
{
    //-----------------------------------------------------------------
    //  Creates a ComicsCollection object and adds some comic books to
	//  it. Prints reports on the status of the collection.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        ComicsCollection comics = new ComicsCollection();

        comics.addComic("Strange Tales", 110, 1963, "Marvel", 3500);
        comics.addComic("Action Comics", 23, 1940, "DC", 8025);
        comics.addComic("Tales of Suspense", 39, 1963, "Marvel", 3837);
        comics.addComic("Secret Wars", 8, 1984, "Marvel", 5000);
		comics.addComic("Batman: The Killing Joke", 1, 1988, "DC", 1680);

        System.out.println(comics);

        comics.addComic("The New Mutants", 98, 1991, "Marvel", 1375);
        comics.addComic("The Incredible Hulk", 181, 1974, "Marvel", 1600);

        System.out.println(comics);
    }
}
