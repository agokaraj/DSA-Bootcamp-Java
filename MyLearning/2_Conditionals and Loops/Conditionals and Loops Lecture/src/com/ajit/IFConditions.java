package com.ajit;

import java.util.Scanner;

public class IFConditions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Salary=0;
        int number= input.nextInt();
        /*IF Statement-1 */
        if(number>10000){
            Salary=Salary+1000;
        }
         /*IF-ELSE Statement-2 */
         if(number>1000 && number<2000){
            Salary=Salary+300;
         }
         else{
            Salary=Salary+200;
         }
         /*IF-ELSE Statement-3 */
         if(number>1000 && number<2000){
            Salary=Salary+300;
         }
         else if(number>=2000 || number<=5000){
            Salary=Salary+20;
         }
         else{
            Salary=Salary+200;
         }
         System.out.println("Salary is: "+Salary);
         input.close();
    }
}