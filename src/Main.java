import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numbers[];
        System.out.println("please insert array length");
        int arrayLength = scan.nextInt();
        numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("please insert the "+(i+1)+"number");
            numbers[i] = scan.nextInt();
           
        }

        boolean status = true;
        for (int i = 0; i < numbers.length; i++) {
            //status = (numbers[i] %2 !=0)?false:true;
            if(numbers[i] %2 !=0){
                status = false;
                break;
            }
        }

       String output =  (status==true)? "all the elements are even":
               "there are odd numbers in the array ";

        System.out.println(output);


        










    }
}