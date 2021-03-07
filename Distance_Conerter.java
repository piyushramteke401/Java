
package Special_Programs;
import java.util.Scanner;
class km{
    double C,V;
    void cal(double x){
        C=x/100000;
        V=x;
    }
    void display(){
        System.out.println("\t\t\t\t\tCm TO Km:");
        System.out.println("\t\t\t\t\tCm:"+V);
        System.out.println("\t\t\t\t\tKm:"+C);
    }
}

class m extends km{
    double C,V;
    void cal(double x){
        C=x/100;
        V=x;
    }
    void display(){
        System.out.println("\t\t\t\t\tCm TO m:");
        System.out.println("\t\t\t\t\tCm:"+V);
        System.out.println("\t\t\t\t\tm:"+C);
    }
}

class milim extends km{
    double C,V;
    void cal(double x){
        C=x*10;
        V=x;
    }
    void display(){
        System.out.println("\t\t\t\t\tCm TO mm:");
        System.out.println("\t\t\t\t\tCm:"+V);
        System.out.println("\t\t\t\t\tmm:"+C);
    }
}
class Microm extends km{
    double C,V;
    void cal(double x){
        C=x*10000;
        V=x;
    }
    void display(){
        System.out.println("\t\t\t\t\tCm TO μm:");
        System.out.println("\t\t\t\t\tCm:"+V);
        System.out.println("\t\t\t\t\tμm:"+C);
    }
}
class mile extends km{
    double C,V;
    void cal(double x){
        C=x/160934;
        V=x;
    }
    void display(){
        System.out.println("\t\t\t\t\tCm TO mile:");
        System.out.println("\t\t\t\t\tCm:"+V);
        System.out.println("\t\t\t\t\tMile:"+C);
    }
}

class Yard extends km{
    double C,V;
    void cal(double x){
        C=x/91.44;
        V=x;
    }
    void display(){
        System.out.println("\t\t\t\t\tCm TO Yard:");
        System.out.println("\t\t\t\t\tCm:"+V);
        System.out.println("\t\t\t\t\tYard:"+C);
    }
}

class foot extends km{
    double C,V;
    void cal(double x){
        C=x/30.48;
        V=x;
    }
    void display(){
        System.out.println("\t\t\t\t\tCm TO Foot:");
        System.out.println("\t\t\t\t\tCm:"+V);
        System.out.println("\t\t\t\t\tFoot:"+C);
    }
}
class inch extends km{
    double C,V;
    void cal(double x){
        C=x/2.54;
        V=x;
    }
    void display(){
        System.out.println("\t\t\t\t\tCm TO Inch:");
        System.out.println("\t\t\t\t\tCm:"+V);
        System.out.println("\t\t\t\t\tInch:"+C);
    }
}
public class Distance_Conerter {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a=0;
        while(a==0){
            System.out.println("\t\t\t\t**************Cm To Other Converter Menu***************");
            System.out.println("\t\t\t\t***1.Kilometers                                     ***");
            System.out.println("\t\t\t\t***2.Meters                                         ***");
            System.out.println("\t\t\t\t***3.Milimeters                                     ***");
            System.out.println("\t\t\t\t***4.Micrometers                                    ***");
            System.out.println("\t\t\t\t***5.Miles                                          ***");
            System.out.println("\t\t\t\t***6.Yards                                          ***");
            System.out.println("\t\t\t\t***7.Foots                                          ***");
            System.out.println("\t\t\t\t***8.Inchs                                          ***");
            System.out.println("\t\t\t\t***9.Exit                                           ***");
            System.out.println("\t\t\t\t*******************************************************");
            System.out.println("Choise the option(1-9):");
            int b=sc.nextInt();
            switch(b){
                case 1:{
                    km a1=new km();
                    System.out.println("Enter the Value:");
                    double c=sc.nextDouble();
                    a1.cal(c);
                    a1.display();
                    break;
                }
                case 2:{
                    m a2=new m();
                    System.out.println("Enter the Value:");
                    double c=sc.nextDouble();
                    a2.cal(c);
                    a2.display();
                    break;
                }
                case 3:{
                    milim a3=new milim();
                    System.out.println("Enter the Value:");
                    double c=sc.nextDouble();
                    a3.cal(c);
                    a3.display();
                    break;
                }
                case 4:{
                    Microm a4=new Microm();
                    System.out.println("Enter the Value:");
                    double c=sc.nextDouble();
                    a4.cal(c);
                    a4.display();
                    break;
                }
                case 5:{
                    mile a5=new mile();
                    System.out.println("Enter the Value:");
                    double c=sc.nextDouble();
                    a5.cal(c);
                    a5.display();
                    break;
                }
                case 6:{
                    Yard a6=new Yard();
                    System.out.println("Enter the Value:");
                    double c=sc.nextDouble();
                    a6.cal(c);
                    a6.display();
                    break;
                }
                case 7:{
                    foot a7=new foot();
                    System.out.println("Enter the Value:");
                    double c=sc.nextDouble();
                    a7.cal(c);
                    a7.display();
                    break;
                }
                case 8:{
                    inch a8=new inch();
                    System.out.println("Enter the Value:");
                    double c=sc.nextDouble();
                    a8.cal(c);
                    a8.display();
                    break;
                }
                case 9:{
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
