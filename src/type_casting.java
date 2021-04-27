public class type_casting {
    // Widening casting is done automatically when passing a smaller size type to a larger size type
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }

{ 
    // Narrowing Casting (manually) - converting a larger type to a smaller size type 

    double my_Double = 9.78;
    int my_Int = (int) my_Double; // Manual casting: double to int

    System.out.println(my_Double);   // Outputs 9.78
    System.out.println(my_Int);      // Outputs 9
}
}
