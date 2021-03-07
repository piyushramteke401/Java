/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Special_Programs;
import java.util.Scanner;

/**
 *
 * @author Predator
 */
public class Car_Game {
    public static void main(String[] arg){
       Scanner sc=new Scanner(System.in);
       int e=1;
       while(e==1)
       {
        System.out.println("*********Game Menu*********");
        System.out.println("\tStart"+" "+" (Press S)");
        System.out.println("\tOption"+" "+"(Press O)");
        System.out.println("\tExit"+" "+"(Press X)");
        System.out.println("***************************");
        System.out.println("Press the Button:");
        String a=sc.next();
        switch(a)
        {
            case "S":
            {  
                boolean f= true;
                while(f==true)
                {
                System.out.println("For Start the Car Engine(Press E) and For stop (Press V:)" );
                String E=sc.next();
                if("E".equals(E))
                {
                    System.out.println("Car is Running.");
                   
                }
                else
                {
                    System.out.println("Car is Stop");
                    f=false;
                }
                }
                break;    
            }
            case "O":
            {  
                boolean d=true;
               while(d==true)
               {
                System.out.println("*******OPTION********");
                System.out.println("1.Sound");
                System.out.println("2.Display");
                System.out.println("3.Exit");
                System.out.println("*********************");
                System.out.println("Select the option:");
                int b=sc.nextInt();
                switch(b){
                    case 1:
                    {
                        System.out.println("Sound Option:");
                        String c=sc.next();
                        if("on".equals(c))
                        {
                           System.out.println("Sound is ON");
                        }
                        else
                        {
                           System.out.println("Sound is OFF");
                        }
                        break;
                    }
                    case 2:
                    {
                        System.out.println("High Resolution");
                        break;
                    }
                    case 3:
                    {
                        d=false;
                        break;    
                    }
                    default:
                    {
                        System.out.println("Invalid option");
                        break;
                    }
                 }
               }
               break;
            }
            case "X":
            {
                e=0;
                break;
               
            }
            default:
            {
                System.out.println("Press the Correct Key.");
                break;
            }
          }
        }
     }
}
    
