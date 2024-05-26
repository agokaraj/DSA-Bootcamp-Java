package com.ajit;
import java.util.Scanner;
public class EnhancedSwitchStatement_Example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dayNumber=input.nextInt();
        switch(dayNumber){
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thrusday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");
        }
        switch(dayNumber){
            case 1,2,3,4,5->System.out.println("Weekday");
            case 6,7->System.out.println("Weekend");
        }
        input.close();
    }
}