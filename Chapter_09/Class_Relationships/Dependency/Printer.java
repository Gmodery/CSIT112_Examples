package Class_Relationships.Dependency;

// Dependencies represent a temporary "using" relationship where one class temporarily makes use of another
// This can involve invoking methods of another class/object or simply making use of them without storing them as permanent structural fields
// In the below example, there is a using relationship between Printer and Paper
// In other words, the Printer 'uses' the Paper object through invoking its methods and taking it as a parameter for the printDocument function


class Paper {
    private int sheetCount;

    public Paper(int sheetCount) {
        this.sheetCount = sheetCount;
    }

    public void decreaseCount() {
        this.sheetCount--;
    }

    public boolean isEmpty() {
        return this.sheetCount <= 0;
    }
}

public class Printer {
    private String modelName;

    public Printer(String modelName) {
        this.modelName = modelName;
    }

    // This method establishes a dependent UML Dependency on Paper.
    // Paper is used strictly as a local method parameter, not stored as a class field.
    public void printDocument(String text, Paper paperTray) {
        if (paperTray.isEmpty()) {
            System.out.println("Error: Out of paper.");
            return;
        }

        System.out.println("Printing to " + modelName + ": " + text);
        paperTray.decreaseCount();
    }
}




















/*
 ┌──────────────────────────────────────────┐
 │                  Paper                   │
 ├──────────────────────────────────────────┤
 │ - sheetCount : int                       │
 ├──────────────────────────────────────────┤
 │ + Paper(sheetCount: int)                 │
 │ + decreaseCount() : void                 │
 │ + isEmpty() : boolean                    │
 └──────────────────────────────────────────┘
                      ▲
                      :
                      :  <<use>> (Method Parameter)
                      :
 ┌──────────────────────────────────────────┐
 │                 Printer                  │
 ├──────────────────────────────────────────┤
 │ - modelName : String                     │
 ├──────────────────────────────────────────┤
 │ + Printer(modelName: String)             │
 │ + printDocument(text: String,            │
 │                 paperTray: Paper) : void │
 └──────────────────────────────────────────┘

*/