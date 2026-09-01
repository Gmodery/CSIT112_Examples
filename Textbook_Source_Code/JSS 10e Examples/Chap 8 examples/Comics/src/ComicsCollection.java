//********************************************************************
//  ComicsCollection.java       Author: Lewis/Loftus
//
//  Represents a collection of comic books.
//********************************************************************

import java.text.NumberFormat;

public class ComicsCollection
{
    private ComicBook[] collection;
    private int count;
    private int totalValue;

    //-----------------------------------------------------------------
    //  Constructor: Creates an initially empty collection.
    //-----------------------------------------------------------------
    public ComicsCollection()
    {
        collection = new ComicBook[100];
        count = 0;
        totalValue = 0;
    }

    //-----------------------------------------------------------------
    //  Adds a ComicBook to the collection, increasing the size of the
    //  collection array if necessary.
    //-----------------------------------------------------------------
    public void addComic(String title, int number, int year,
                         String publisher, int estValue)
    {
        if (count == collection.length)
            increaseSize();

        collection[count] = new ComicBook(title, number, year, publisher,
			estValue);
        totalValue += estValue;
        count++;
    }

    //-----------------------------------------------------------------
    //  Returns a report describing the comic book collection.
    //-----------------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report += "My Comics Collection\n\n";

        report += "Number of comics: " + count + "\n";
        report += "Total value: " + fmt.format(totalValue) + "\n";
        report += "Average value: " + fmt.format(totalValue / count);

        report += "\n\nComics List:\n\n";

        for (int book = 0; book < count; book++)
            report += collection[book].toString() + "\n";

        return report;
    }

    //-----------------------------------------------------------------
    //  Increases the capacity of the collection by creating a
    //  larger array and copying the existing collection into it.
    //-----------------------------------------------------------------
    private void increaseSize()
    {
        ComicBook[] temp = new ComicBook[collection.length * 2];

        for (int book = 0; book < collection.length; book++)
            temp[book] = collection[book];

        collection = temp;
    }
}
