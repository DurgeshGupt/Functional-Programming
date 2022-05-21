package functionprogramme;
import java.util.Scanner;
import java.lang.Math;

import java.util.Scanner;

public class Distence {




    static double euclidianDistence() {
        System.out.println("calculate euclidian distence");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 value");
        double x1 = sc.nextInt();
        System.out.println("enter y1 value");
        double y1 = sc.nextInt();

        double length =  Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));

        return  length;




    }
    public static void main(String[] args){

        double a =	euclidianDistence();

        System.out.println("the euclidianDistence of lines are " + a);



    }

}
