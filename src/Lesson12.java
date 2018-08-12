import java.util.Scanner;

public class Lesson12 {
    public static void main(String args[]){ //main Method
        //What's a method?
        //A method is like a function in mathematics where it takes a value, performs a defined set of calculations on it, and then gives you back another value

        /*
        //Get sum of numbers
        int a = 5, b= 10;
        int total = addNumbers(a,b); // The order we put variables in as arguments decides what they will be in the method
        System.out.println("The total is: " + total);
        */

        /*
        //String checker
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string with no digits or special characters: ");
        String str = scan.nextLine();
        if(isAllChars(str)){
            System.out.println("The string is all characters");
        }
        else{
            System.out.println("The string is not all characters");
        }
        */

        int number1 = 10, number2 = 5;
        System.out.println(product(number1, number2) );

        thanks();
    }


    //Access modifier or none
    //Static or not
    //Return type (or void for none)
    //Method name
    //Arguments list or just () for none
    public static void thanks(){ //void means return nothing
        System.out.println("Thanks for watching my video, SMASH THAT LIKE BUTTON BROOOOO");
    }

    public static int product(int a, int b){
        //what happens when we multiply a*b
        return a*b;
    }
    /*
    public static int addNumbers(int b, int a){
        int sum = 0;
        sum = b + a;
        return sum;
    }
    */
    //Java has 3 different access modifiers
    //Public -- anyone can execute
    //Private can only be executed by the file it's contained in.
    //"Default" - "Package private" -- can be executed by anything sharing a package with it.

    public static boolean isAllChars(String s){
        for(int i=0; i<s.length(); i++){
            if(!Character.isAlphabetic(s.charAt(i) )){
                return false;
            }
        }
        return true;
    }



}
