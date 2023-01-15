package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    //"private" is an access specifier. It tells you that the member
    // is only visible inside the class - other classes can't access the private members of a class
    //"static" means that the variable is a class-level variable


    // HashMap class implements the Map interface which allows us to
    // store key and value pair, where keys should be unique HashMap<K,V>
    // K: It is the type of keys maintained by this map.
    // V: It is the type of mapped values.

    private static Map<Character, Integer> map;

    //since we want to covert roman Strings numerals to integers
    //we are representing roman numeral Strings as Characters(char)
    //we are going to map the standard Roman Numerals

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {

        //starting point integer 0
        int convertedNumber = 0;
        //
        //Line 46: for-loop; starting at 0, for every 'int i' that is less than 'string s'
        //length continue to run the loop
        //
        //Line 47: The get() method of Map interface in Java is used to
        //retrieve or fetch the value mapped by a particular key mentioned in the parameter
        //
        for(int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            //
            // Line 55: Conditional Operator (? :)
            // This operator consists of three operands and is used to evaluate Boolean expressions.
            // The goal of the operator is to decide, which value should be assigned to the variable.
            // The operator is written as:
            // variable x = (expression) ? value if true : value if false
            //
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;

            if(currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }

        return convertedNumber;

    }
}
