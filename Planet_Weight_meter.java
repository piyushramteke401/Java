
package Special_Programs;
import java.util.Scanner;
abstract class Planet{
    double Planet;
    abstract void weight(double WOE);
    abstract void display();
    abstract void gravity();
    void special(double g){
        System.out.println("");
    };
}
class Mercury extends Planet{
    double WOM,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOM=(WOE/9.81)*3.7;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOM){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Mercury.");
        }
        else if(WOE<WOM){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Mercury.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Mercury.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Mecury:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Mercury:"+WOM+"Kg");
    }
}


class Venus extends Planet{
    double WOV,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOV=(WOE/9.81)*8.87;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOV){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Venus.");
        }
        else if(WOE<WOV){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Venus.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Venus.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Venus:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Venus:"+WOV+"Kg");
    }
}


class Earth extends Planet{
    double WOEH,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOEH=(WOE/9.81)*9.81;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOEH){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Earth.");
        }
        else if(WOE<WOEH){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Earth.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Earth.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Earth:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOEH+"Kg");
    }
}


class Mars extends Planet{
    double WOMs,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOMs=(WOE/9.81)*3.711;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOMs){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Mars.");
        }
        else if(WOE<WOMs){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Mars.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Mars.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Mars:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Mars:"+WOMs+"Kg");
    }
}


class Jupiter extends Planet{
    double WOJ,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOJ=(WOE/9.81)*24.79;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOJ){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Jupiter.");
        }
        else if(WOE<WOJ){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Jupiter.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Jupiter.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Jupiter:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Jupiter:"+WOJ+"Kg");
    }
}


class Saturn extends Planet{
    double WOS,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOS=(WOE/9.81)*10.44;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOS){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Saturn.");
        }
        else if(WOE<WOS){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Saturn.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Saturn.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Saturn:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Satrun:"+WOS+"Kg");
    }
}

class Uranus extends Planet{
    double WOU,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOU=(WOE/9.81)*8.69;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOU){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Uranus.");
        }
        else if(WOE<WOU){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Uranus.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Uranus.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Uranus:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Uranus:"+WOU+"Kg");
    }
}


class Neptune extends Planet{
    double WON,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WON=(WOE/9.81)*11.15;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WON){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Neptune.");
        }
        else if(WOE<WON){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Neptune.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Neptune.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Neptune:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Mars:"+WON+"Kg");
    }
}


class Moon extends Planet{
    double WOMo,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOMo=(WOE/9.81)*1.622;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOMo){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Moon.");
        }
        else if(WOE<WOMo){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Moon.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Moon.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Moon:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Moon:"+WOMo+"Kg");
    }
}


class Sun extends Planet{
    double WOSu,WOE;
    void weight(double WOE){
        this.WOE=WOE;
        WOSu=(WOE/9.81)*274;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOSu){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Sun.");
        }
        else if(WOE<WOSu){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Sun.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Sun.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Mars:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Mars:"+WOSu+"Kg");
    }
}

class Special extends Planet{
    double WOSp,WOE,g,s;
    void weight(double WOE){
        this.WOE=WOE;
        s=(WOE/9.81);
    }
    void special(double g){
        this.g=g;
        WOSp=s*g;
    }
    void gravity(){
        System.out.println("Gravity:");
        if(WOE>WOSp){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is high from Special Planet.");
        }
        else if(WOE<WOSp){
            System.out.println("\t\t\t\t\tThe Gravity of Earth is Low from Special Planet.");
        }
        else{
            System.out.println("\t\t\t\t\tThe Gravity of Earth is equal from Special Planet.");
        }
    }
    void display(){
        System.out.println("\t\t\t\t\tWeight of Earth to Mars:");
        System.out.println("\t\t\t\t\tWeight of Earth:"+WOE+"Kg");
        System.out.println("\t\t\t\t\tWeight of Special Planet:"+WOSp+"Kg");
        System.out.println("\t\t\t\t\tGravity:"+g+"m/s²");
    }
}
public class Planet_Weight_meter {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        Planet p;
        int a=0;
        while(a==0){
        System.out.println("\t\t\t▼▼▼▼▼▼▼▼▼▼▼╣Planets Calculator╠▼▼▼▼▼▼▼▼▼▼▼");
        System.out.println("\t\t\t►►1.Mecury                                           ◄◄");
        System.out.println("\t\t\t►►2.Venus                                            ◄◄");
        System.out.println("\t\t\t►►3.Earth                                            ◄◄");
        System.out.println("\t\t\t►►4.Mars                                             ◄◄");
        System.out.println("\t\t\t►►5.Jupiter                                          ◄◄");
        System.out.println("\t\t\t►►6.Saturn                                           ◄◄");
        System.out.println("\t\t\t►►7.Uranus                                           ◄◄");
        System.out.println("\t\t\t►►8.Neptune                                          ◄◄");
        System.out.println("\t\t\t►►9.Moon                                             ◄◄");
        System.out.println("\t\t\t►►10.Sun                                             ◄◄");
        System.out.println("\t\t\t►►11.Special Planet                                  ◄◄");
        System.out.println("\t\t\t►►12.Exit                                            ◄◄");
        System.out.println("\t\t\t▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
        System.out.println("Choise the Option(1-11):");
        int b=sc.nextInt();
        switch(b){
            case 1:{
                p=new Mercury();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 2:{
                p=new Venus();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 3:{
                p=new Earth();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 4:{
                p=new Mars();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 5:{
                p=new Jupiter();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 6:{
                p=new Saturn();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 7:{
                p=new Uranus();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 8:{
                p=new Neptune();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 9:{
                p=new Moon();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 10:{
                p=new Sun();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                p.weight(w);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 11:{
                p=new Special();
                System.out.println("Enter the Weight:");
                double w=sc.nextDouble();
                System.out.println("Enter the Gravity Of Your Special Planet:");
                double g=sc.nextDouble();
                p.weight(w);
                p.special(g);
                p.display();
                p.gravity();
                System.out.println();
                break;
            }
            case 12:{
                a=1;
                break;
            }
            default:{
                System.out.println("Invalid Option.");
            }
        }
        }
    }
}
