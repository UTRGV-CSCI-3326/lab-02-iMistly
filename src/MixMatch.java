public class MixMatch{
    public static void main(String[] args){
        System.out.println("" + 1 + 2); // 12
        String animal = "dog";
        char letter = 'a';
        short small = 4;
        int large = 2147483647;
        long huge = 2147483648L;
        float decimal = 1.23456789f;
        double bigDecimal = 1.234567890123456789;
        boolean choice = false;
        System.out.println(animal + "\t<- A string is just a list of characters.");
        System.out.println(letter + "\t<- A char is a single ASCII character.");
        System.out.println(small + "\t<- A short is a 16-bit signed integer.");
        System.out.println(large + "\t<- An int is a 32-bit signed integer.");
        System.out.println(huge + "\t<- A long is a 64-bit signed integer.");
        System.out.println(decimal + "\t<- A float is a 32-bit floating point.");
        System.out.println(bigDecimal + "\t<- A double is a 64-bit floating point.");
        System.out.println(choice + "\t<- A boolean is a true or false value. It only takes up one bit!");

        System.out.println("All of the data types!!!!" + animal + letter + small + large + huge + decimal + bigDecimal + choice);
    }
}