/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Special_Programs;

import Project_train.February;
import Project_train.April;
import Project_train.august;
import Project_train.december;
import Project_train.january;
import Project_train.july;
import Project_train.june;
import Project_train.march;
import Project_train.may;
import Project_train.november;
import Project_train.october;
import Project_train.september;
import java.util.Scanner;

interface traindata{
    public void book();
}

class train implements traindata{
    public void book(){
        Scanner sc=new Scanner(System.in);
        System.out.println("By Station:");
        System.out.println("Enter the Departure Station:");
        String a=sc.next();
        System.out.println("Enter the Arrival Station:");
        String a1=sc.next();
        if(a.equals("Nagpur")&&a1.equals("Ahmedabad_JN")){
            System.out.println("Select the month:");
            String b=sc.next();
            if(b.equals("Jan")||b.equals("1")){
                january ja=new january();
                ja.jan(); 
            }
            else if(b.equals("Feb")||b.equals("2")){
                February fe=new February();
                fe.feb();
            }
            else if(b.equals("Mar")||b.equals("3")){
                march ma=new march();
                ma.mar();
            }
            else if(b.equals("April")||b.equals("4")){
                April ap=new April();
                ap.apr();
            }
            else if(b.equals("May")||b.equals("5")){
                may may=new may();
                may.may1();
            }
            else if(b.equals("June")||b.equals("6")){
                june jun=new june();
                jun.jun();
            }
            else if(b.equals("July")||b.equals("7")){
                july ju=new july();
                ju.jul();
            }
            else if(b.equals("Aug")||b.equals("8")){
                august au=new august();
                au.aug();
            }
            else if(b.equals("Sep")||b.equals("9")){
                september se=new september();
                se.sep();
            }
            else if(b.equals("Oct")||b.equals("10")){
                october oc=new october();
                oc.oct();
            }
            else if(b.equals("Nov")||b.equals("11")){
                november  no=new november();
                no.nov();
            
            }
            else if(b.equals("Dec")||b.equals("12")){
               december d=new december();
               d.dec();
            }
            else{
               System.out.println("Invalid Option.");
            }
        }      
    }
}

public interface Railway_Reservation_System {
    public static void main(String[] args){
        train t=new train();
        t.book();
    }
    
}
