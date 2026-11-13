package Chapter_13.Collections_API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VarExample {
    public static void main(String[] args) {
        // The regular way of initializing variables:
        Map<String, String> dictionary = new HashMap<String, String>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Using var to simplify the initializations:
        var varDictionary = new HashMap<String, String>();
        var varList = new ArrayList<Integer>();

        var nullVar = null;
        var initializerListVar = {1,2,3,4,5};

    }
}
