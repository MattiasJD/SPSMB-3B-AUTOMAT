package cz.spsmb.b3;
import java.util.Scanner;
public class Application {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        int bruh = 0;
        int brudda = 0;
        int [] array = {5000,2000,1000,500,200,100,50,20,10,5,2,1};
        for (int i = 0; i < array.length; i++) {
            bruh = num/array[i];
            System.out.println(num+" se vejde do "+array[i]+" celkem "+bruh);
            num = num%array[i];
        }
    }
}