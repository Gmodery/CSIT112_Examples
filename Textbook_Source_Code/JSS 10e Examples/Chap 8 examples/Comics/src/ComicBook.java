//********************************************************************
//  ComicBook.java       Author: Lewis/Loftus
//
//  Represents a comic book.
//********************************************************************

import java.text.NumberFormat;

public class ComicBook
{
    private String title;
	private int number;
    private int year;
	private String publisher;
    private int estValue;

    //-----------------------------------------------------------------
    //  Creates a new ComicBook with the specified information.
    //-----------------------------------------------------------------
    public ComicBook(String title, int number, int year, String publisher,
            int estValue)
    {
        this.title = title;
		this.number = number;
        this.year = year;
        this.publisher = publisher;
        this.estValue = estValue;
    }

    //-----------------------------------------------------------------
    //  Returns a string description of this ComicBook.
    //-----------------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String description;
		
		description = fmt.format(estValue) + "\t";
		description += year + "\t" + publisher + "\t";
		description += title + " #" + number;

        return description;
    }
}
