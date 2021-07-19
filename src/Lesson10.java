import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {

        //Application that counts how many coffees we drink

//        int[] coffeeArray = new int[7];
//
//        coffeeArray[0] = 3;
//        coffeeArray[1] = 4;
//        coffeeArray[2] = 12;
//        coffeeArray[3] = 2;
//        coffeeArray[4] = 1;
//        coffeeArray[5] = 0;
//        coffeeArray[6] = 1;
//
//        int totalCoffees = 0;
//
//        for (int i = 0; i < coffeeArray.length -1; i++){
//            totalCoffees += coffeeArray[i];
//        }
//        System.out.println(totalCoffees);

//        int[][] my2DArray = {{1, 2, 4, 7}, {11, 12, 13, 14}, {22, 23, 24, 5}};
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.println("Indexs : i - " + i + "; j - " + j + " value = " + my2DArray[i][j]);
//
//            }
//        }

//        int[] forLoopArray = {5, 6, 7, 1, 1};
//
//        for (int internalValue : forLoopArray) {
//            System.out.println("For loop element: " + internalValue);
//        }

//        int clockTime = 0;
//        while(clockTime <= 24) {
//            System.out.println("The time is " + clockTime);
//            clockTime += 3;
//
//        boolean runWhileLoop = true;
//
//        while (runWhileLoop) {
//            System.out.println("Variable runWhileLoop is still st to true");
//        }
//            if (clockTime > 10) {
//                runWhileLoop = false;
//            }
//            clockTime++;
//        }
        int menuItem;
        System.out.println("Select an action");
           Scanner scanner = new Scanner (System.in);
           menuItem = scanner.nextInt();


           while (menuItem != 0) {
               if (menuItem == 1) {
                   System.out.println("You are smart");
               } else if (menuItem == 2) {
                   System.out.println("You are pretty");
               } else if (menuItem == 3) {
                   System.out.println("You are best");
               } else {
                   System.out.println("OK");
               }
           }
    }
}