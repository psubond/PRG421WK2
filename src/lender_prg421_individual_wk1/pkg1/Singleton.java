package lender_prg421_individual_wk1.pkg1;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author psubond
 */
public class Singleton {

    private static Singleton firstInstance = null;

    private Singleton() {
    }

    //protects the singleton from being instatiated by any other process,
    //only allows one instance to exist 
    public static Singleton getInstance() {

//opens scanner so console input can be read
        Scanner reader = new Scanner(System.in);

        //gets input for runner 
        System.out.println("Please enter Lane for Runner 1");
        int runner1lane = reader.nextInt();

//validates input for runner 
        while (runner1lane < 1 || runner1lane > 8) {
            System.out.println("Invalid Selection, please select lane 1-8");
            if (runner1lane < 1 || runner1lane > 8) {
                runner1lane = reader.nextInt();
            }
        }

//start of logic for runner 2
        //gets input for runner 
        System.out.println("Please enter Lane for Runner 2");

        int runner2lane = reader.nextInt();

        //validates input for runner 
        while (runner2lane < 1 || runner2lane > 8) {
            System.out.println("Invalid Selection, please select lane 1-8");
            if (runner2lane < 1 || runner2lane > 8) {
                runner2lane = reader.nextInt();
            }
        }

        while (runner2lane == runner1lane) {
            System.out.println("That lane is occupied , please select another lane ");
            runner2lane = reader.nextInt();

        }

        //start of logic for runner 3
        //gets input for runner 
        System.out.println("Please enter Lane for Runner 3");
        int runner3lane = reader.nextInt();
//validates input for runner 
        while (runner3lane < 1 || runner3lane > 8) {
            System.out.println("Invalid Selection, please select lane 1-8");
            if (runner3lane < 1 || runner3lane > 8) {
                runner3lane = reader.nextInt();
            }
        }

        while (runner3lane == runner1lane || runner3lane == runner2lane) {
            System.out.println("That lane is occupied, please select another lane.");
            runner3lane = reader.nextInt();

        }

        //start of lane 4 logic
        //gets input for runner 
        System.out.println("Please enter Lane for Runner 4");
        int runner4lane = reader.nextInt();
//validates input for runner 
        while (runner4lane < 1 || runner4lane > 8) {
            System.out.println("Invalid Selection, please select lane 1-8");
            if (runner4lane < 1 || runner4lane > 8) {
                runner4lane = reader.nextInt();
            }
        }

        while (runner4lane == runner1lane || runner4lane == runner2lane || runner4lane == runner3lane) {
            System.out.println("That lane is occupied, please select another lane.");
            runner4lane = reader.nextInt();

        }

//start of runner 5 logic
//gets input for runner 
        System.out.println("Please enter Lane for Runner 5");
        int runner5lane = reader.nextInt();
//validates input for runner 
        while (runner5lane < 1 || runner5lane > 8) {
            System.out.println("Invalid Selection, please select lane 1-8");
            if (runner5lane < 1 || runner5lane > 8) {
                runner5lane = reader.nextInt();
            }
        }

        while (runner5lane == runner1lane || runner5lane == runner2lane || runner5lane == runner3lane || runner5lane == runner4lane) {
            System.out.println("That lane is occupied, please select another lane.");
            runner5lane = reader.nextInt();

        }

//start of runner 6 logic
//gets input for runner 
        System.out.println("Please enter Lane for Runner 6");
        int runner6lane = reader.nextInt();
//validates input for runner 
        while (runner6lane < 1 || runner6lane > 8) {
            System.out.println("Invalid Selection, please select lane 1-8");
            if (runner6lane < 1 || runner6lane > 8) {
                runner6lane = reader.nextInt();
            }
        }
        while (runner6lane == runner1lane || runner6lane == runner2lane || runner6lane == runner3lane || runner6lane == runner4lane
                || runner6lane == runner5lane) {
            System.out.println("That lane is occupied, please select another lane.");
            runner6lane = reader.nextInt();

        }

//start of runner 7 logic
//gets input for runner 
        System.out.println("Please enter Lane for Runner 7");
        int runner7lane = reader.nextInt();

        //validates input for runner 
        while (runner7lane < 1 || runner7lane > 8) {
            System.out.println("Invalid Selection, please select lane 1-8");
            if (runner7lane < 1 || runner7lane > 8) {
                runner7lane = reader.nextInt();
            }
        }

        while (runner7lane == runner1lane || runner7lane == runner2lane || runner7lane == runner3lane || runner7lane == runner4lane
                || runner7lane == runner5lane || runner7lane == runner6lane) {
            System.out.println("That lane is occupied, please select another lane.");
            runner7lane = reader.nextInt();

        }

//start of runner 8 logic
//gets input for runner 
        System.out.println("Please enter Lane for Runner 8");
        int runner8lane = reader.nextInt();
//validates input for runner 
        while (runner8lane < 1 || runner8lane > 8) {
            System.out.println("Invalid Selection, please select lane 1-8");
            if (runner8lane < 1 || runner8lane > 8) {
                runner8lane = reader.nextInt();
            }
        }
        while (runner8lane == runner1lane || runner8lane == runner2lane || runner8lane == runner3lane || runner8lane == runner4lane
                || runner8lane == runner5lane || runner8lane == runner6lane || runner8lane == runner7lane) {
            System.out.println("That lane is occupied, please select another lane.");
            runner8lane = reader.nextInt();

        }

//outputs lane selection for each swimmer
        System.out.println("Runner 1 will occupy lane " + runner1lane);
        System.out.println("Runner 2 will occupy lane " + runner2lane);
        System.out.println("Runner 3 will occupy lane " + runner3lane);
        System.out.println("Runner 4 will occupy lane " + runner4lane);
        System.out.println("Runner 5 will occupy lane " + runner5lane);
        System.out.println("Runner 6 will occupy lane " + runner6lane);
        System.out.println("Runner 7 will occupy lane " + runner7lane);
        System.out.println("Runner 8 will occupy lane " + runner8lane);
        return firstInstance;

    }

}
