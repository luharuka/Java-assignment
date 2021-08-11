public class Day2 {
    public static void main(String[] args) {
        int sum = 0;
        sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("Command Line arg:"+sum);
        
        
    }
}

2.  main method is public static and void because it declare the main method as unprotected static because it interprete any object before it created .
