public class Questions {



    public  static void  main(String args[]){

         int[]numbers = new int[]{12, 8,6,4,3,2,1, -3, -16, -5, 343, 78, -18};
        int smallestNumber =  numbers[0];
        int secondSmallestNumber = numbers[0];
        for (int i = 0; i < numbers.length ; i++) {

            if(smallestNumber > numbers[i]) {
                secondSmallestNumber = smallestNumber;
                smallestNumber = numbers[i];

            } else if (secondSmallestNumber > numbers[i] && smallestNumber < numbers[i]) {
                secondSmallestNumber = numbers[i];
            }

        }
        System.out.println(secondSmallestNumber);
    }





    }


