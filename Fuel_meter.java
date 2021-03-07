package Special_Programs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
class car{
    double D,FC,AF;
    car(double FC,double AF){
        this.AF=AF;
        this.FC=FC;
    }
    
}
class distance extends car{
    double D;
    distance(double FC,double AF){
        super(FC,AF);
        D=FC*AF;
    }
    void dispaly(){
        System.out.println("\t\t\t\t\tDistance:"+D+"Km");
    }
}




class cars1{
    double D,FC;
      cars1(double D,double FC){
        this.D=D;
        this.FC=FC;
    }    
}
class fuel extends cars1{
    double AF;
    fuel(double D,double FC){
        super(D,FC);
        AF=D/FC;
    }
    void dispaly(){
        System.out.println("\t\t\t\t\tAmount of fuel:"+AF+"Liters");
    }
}




class Cars{
    double D,AF;
     Cars(double D,double AF){
         this.D=D;
         this.AF=AF;
     }
    
 }
class liters extends Cars{
     double FC;
     liters(double D,double AF){
         super(D,AF);
         FC=D/AF;
     }
     void dispaly(){
         System.out.println("\t\t\t\t\tFuel Consumption:"+FC+"Km/Liters");
     }
 }



public class Fuel_meter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        while(a==0){
        System.out.println("*************CARS MENU*************");
        System.out.println("1.Distance.");
        System.out.println("2.Amount of fuel.");
        System.out.println("3.Fuel Consumption.");
        System.out.println("4.Exit.");
        System.out.println("***********************************");
        System.out.println("Choise the option(1-4):");
        int b=sc.nextInt();
        switch(b){
            case 1:
            {
                System.out.println("Enter the fuel consumption in Liters:");
                double a1=sc.nextDouble();
                System.out.println("Enter the Amount of fuel in Liters:");
                double a2=sc.nextDouble();
                distance d=new distance(a1,a2);
                d.dispaly();
                break;
            }
            case 2:
            {
                System.out.println("Enter the Distance in Km:");
                double a3=sc.nextDouble();
                System.out.println("Enter the Fuel Consumption in Liters:");
                double a4=sc.nextDouble();
                fuel f=new fuel(a3,a4);
                
                f.dispaly();
               
                break;
            }
            case 3:
            {
                System.out.println("Enter the Distance in Km:");
                double a5=sc.nextDouble();
                System.out.println("Enter the Amount of fuel in Liters:");
                double a6=sc.nextDouble();
                liters l=new liters(a5,a6);
                l.dispaly();
               
                break;
            }
            case 4:
            {
                a=1;
                break;
            }
            default:
            {
                System.out.println("Invalid Option.");
            }
        }
        }
    }
}
