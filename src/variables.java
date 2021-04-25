/* Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false */

/* toUpperCase() makes the String all Uppercase 
toLowercase makes the String all Lowercase */

// () Are methods and they make the computer do things for you
// only void when you dont want a function to be returned
public class variables {
    public static void main(String[] args) {
       String exclaim = addExclamationPoint("hot dogs");
       System.out.println(exclaim);
        

    }
    public static String addExclamationPoint(String s) {
        return s + "!";
    }
}

