/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Special_Programs;

import java.util.Scanner;
class Bank{
    double SI;
    void Rate_of_Interest(double P,double N){
      SI=P*N*8.25/100;
    }    
    void display(){
        System.out.println("Simple Intrest:"+SI);
    }
}
class Sbi extends Bank{
     double SI;
    void Rate_of_Interest(double P,double N){
      SI=P*N*6.20/100;
    }    
    void display(){
        System.out.println("Simple Intrest:"+SI);
    } 
}

class Icic extends Bank{
     double SI;
    void Rate_of_Interest(double P,double N){
      SI=P*N*5.5/100;
    }    
    void display(){
        System.out.println("Simple Intrest:"+SI);
    } 
}
class hdfc extends Bank{
    double SI;
    void Rate_of_Interest(double P,double N){
      SI=P*N*6.2/100;
    }    
    void display(){
        System.out.println("Simple Intrest:"+SI);
    } 
}
public class Interest {
    public static void main(String[] arg){
        int b=0;
        while(b==0){
        Scanner sc=new Scanner(System.in);
        System.out.println("************Menu************");
        System.out.println("**1.Bank rate of interest.**");
        System.out.println("**2.SBI rate of interest. **");
        System.out.println("**3.ICIC rate of interest.**");
        System.out.println("**4.HDFC rate of interest.**");
        System.out.println("**5.Exit.                 **");
        System.out.println("****************************");
        System.out.println("Choise the Option(1-5):");
        int a=sc.nextInt();
        switch(a){
            case 1:{
                Bank a1=new Bank();
                System.out.println("Enter the Principle Amount:");
                double p=sc.nextDouble();
                System.out.println("Enter the year:");
                double n=sc.nextDouble();
                a1.Rate_of_Interest(p, n);
                a1.display();
                break;
            }
            case 2:{
                Sbi a2=new Sbi();
                System.out.println("Enter the Principle Amount:");
                double p=sc.nextDouble();
                System.out.println("Enter the year:");
                double n=sc.nextDouble();
                a2.Rate_of_Interest(p, n);
                a2.display();   
                break;
            }
            case 3:{
                Icic a3=new Icic();
                System.out.println("Enter the Principle Amount:");
                double p=sc.nextDouble();
                System.out.println("Enter the year:");
                double n=sc.nextDouble();
                a3.Rate_of_Interest(p, n);
                a3.display();
                break;
            }
            case 4:{
                hdfc a4=new hdfc();
                System.out.println("Enter the Principle Amount:");
                double p=sc.nextDouble();
                System.out.println("Enter the year:");
                double n=sc.nextDouble();
                a4.Rate_of_Interest(p, n);
                a4.display();
                break;
            }
            case 5:{
                b=1;
                break;
            }
            
            default:
            {
                System.out.println("Invalid option.");
            }
                
        }
        }
    }
}
