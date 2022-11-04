import java.util.Scanner;

import static java.lang.System.in;

public class Test2 {

        public static double Celsius2Fahrenheit(double C)
    {
        return (9/5.0) *C+32;


    }



    public static void main(String[] args) {

            Scanner sc = new Scanner(in);
        System.out.println(Celsius2Fahrenheit(10));

        double [] fahrenheit = new double[30];
        int index = 0;
        double c;

        while((c=sc.nextDouble())!=0){

            fahrenheit[index++]=Celsius2Fahrenheit(c);

        }

    }

}
