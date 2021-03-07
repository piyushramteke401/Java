/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Special_Programs;
import java.util.Scanner;

interface bot{
     public void bot_talk(String a);
     public void name(String f);

    public void bot_talk(StringBuffer v);
}

class chat implements bot{
 Scanner sc=new Scanner(System.in);
 String c,b;
    public void name(String f){
        c=f;
        System.out.println("Thanks For Registration"+" "+c+".");
        System.out.println("Now talk with our chat bot.");
    }
    
    public void bot_talk(String a){
        int d=0;
        
        if(a.equals("hello")||a.equals("Hello")||a.equals("HELLO")||a.equals("Hi")||a.equals("HI")||a.equals("hi")) {
            System.out.println("\t\t\t\t\tHello,I am ChatBot nice to meet you.");
            while(d==0){
            b=sc.next();
            if(b.equals("How_are_you?")||b.equals("how_are_you?")){
                System.out.println("\t\t\t\t\tI am Fine ☺.");
                System.out.println("\t\t\t\t\tHow are You"+" "+c+"?");       
            }
            else if(b.equals("Whats_your_name?")||b.equals("whats_your_name?")){
                System.out.println("\t\t\t\t\tMy name is ChatBot nice to meet you.");
                System.out.println("\t\t\t\t\tWhats your name?.");
                b=sc.next();
                c=b;
                System.out.println("\t\t\t\t\tNice name"+" "+c+".");
            }
            else if(b.equals("bye")||b.equals("Bye")){
                System.out.println("\t\t\t\t\tNice to talk with you"+" "+c+".");
                System.out.println("\t\t\t\t\tBye.");
                System.out.println("\t\t\t\t\tHave a nice day.");
                d=1;
            }
            else if(b.equals("Fine")||b.equals("fine")){
                System.out.println("\t\t\t\t\tThat's Good.");
            }
            else if(b.equals("Who_developed_you?")){
                System.out.println("\t\t\t\t\tDeveloped by Piyush Ramteke");
                System.out.println("\t\t\t\t\tHis age is 21 now.");
            }
            else if(b.equals("what_is_the_weather_today?")||b.equals("What_is_the_weather_today?")){
                System.out.println("\t\t\t\t\tTodays whether is Great.");
            }
            else if(b.equals("What_are_you_doing?")||b.equals("what_are_you_doing?")){
                System.out.println("\t\t\t\t\tNothing to much only chat with you.");
                System.out.println("\t\t\t\t\tWhat are you doing?");
            }
            else if(b.equals("Nothing")||b.equals("nothing")){
                System.out.println("\t\t\t\t\tThen let Play a game.");
                b=sc.next();
                if(b.equals("Yes")||b.equals("yes"))
                {
                    int e=1;
                    while(e==1)
                    {
                        System.out.println("\t\t\t\t\t*********Game Menu*********");
                        System.out.println("\t\t\t\t\t\tStart"+" "+" (Press S)");
                        System.out.println("\t\t\t\t\t\tOption"+" "+"(Press O)");
                        System.out.println("\t\t\t\t\t\tExit"+" "+"(Press X)");
                        System.out.println("\t\t\t\t\t***************************");
                        System.out.println("\t\t\t\t\tPress the Button:");
                        String n=sc.next();
                        switch(n)
                        {
                           case "S":
                           {  
                              boolean f= true;
                              while(f==true)
                              {
                                  System.out.println("\t\t\t\t\tFor Start the Car Engine(Press E) and For stop (Press V:)" );
                                  String E=sc.next();
                                  if("E".equals(E))
                                  {
                                     System.out.println("\t\t\t\t\tCar is Running.");
                   
                                  }
                                  else
                                  { 
                                     System.out.println("\t\t\t\t\tCar is Stop");
                                     f=false;
                                  }
                              }
                              break;    
                           }
                           case "O":
                           {  
                              boolean m=true;
                              while(m==true)
                              {
                                 System.out.println("\t\t\t\t\t*******OPTION********");
                                 System.out.println("\t\t\t\t\t1.Sound");
                                 System.out.println("\t\t\t\t\t2.Display");
                                 System.out.println("\t\t\t\t\t3.Exit");
                                 System.out.println("\t\t\t\t\t*********************");
                                 System.out.println("\t\t\t\t\tSelect the option:");
                                 int l=sc.nextInt();
                                 switch(l){
                                 case 1:
                                 {
                                     System.out.println("\t\t\t\t\tSound Option:");
                                     String c2=sc.next();
                                     if("on".equals(c2))
                                     {
                                         System.out.println("\t\t\t\t\tSound is ON");
                                     }
                                     else
                                     {
                                         System.out.println("\t\t\t\t\tSound is OFF");
                                     }
                                     break;
                                 }
                                 case 2:
                                 {
                                     System.out.println("\t\t\t\t\tHigh Resolution");
                                     break;
                                 }
                                 case 3:
                                 {
                                     m=false;
                                     break;    
                                 }
                                 default:
                                 {
                                     System.out.println("\t\t\t\t\tInvalid option");
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
                             System.out.println("\t\t\t\t\tPress the Correct Key.");
                             break;
                           }
                        }
                    }
                    System.out.println("\t\t\t\t\tYou have fun.");
                    String k=sc.next();
                    if(k.equals("Yes")||k.equals("yes")){
                        System.out.println("\t\t\t\t\tGood to hear ❤.");
                    }
                    else{
                        System.out.println("\t\t\t\t\tOk");
                        System.out.println("\t\t\t\t\tWhat you want to do?");
                    }
                }
                else{
                    System.out.println("\t\t\t\t\tIts ok then.");
                    System.out.println("\t\t\t\t\tWhat you want to do?");
                }
            }
            else if(b.equals("You_tell_me")||b.equals("you_tell_me")||b.equals("Give_me_some_advice")||b.equals("give_me_some_advice")||b.equals("give_me_advice")||b.equals("Give_me_advice")){
                 System.out.println("\t\t\t\t\tAsk me Questions from given questions.");
                 System.out.println("\t\t\t\t\t1.What is the weight on other planets?");
                 System.out.println("\t\t\t\t\t2.What is the converstion of celcious to other?");
                 System.out.println("\t\t\t\t\t3.What is the Interest of Banks?");
                 System.out.println("\t\t\t\t\t4.What is the consumption of petrol?");
                 System.out.println("\t\t\t\t\t5.What is the conversion of cm into other?");
            }
            else if(b.equals("What_is_the_weight_on_other_planets?")||b.equals("what_is_the_weight_on_other_planets?")||b.equals("1")){
                 Planet p;
                 int v=0;
                 while(v==0){
                 System.out.println("\t\t\t\t\t\t\t\t▼▼▼▼▼▼▼▼▼▼▼╣Planets Calculator╠▼▼▼▼▼▼▼▼▼▼▼");
                 System.out.println("\t\t\t\t\t\t\t\t►►1.Mecury                                           ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►2.Venus                                            ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►3.Earth                                            ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►4.Mars                                             ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►5.Jupiter                                          ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►6.Saturn                                           ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►7.Uranus                                           ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►8.Neptune                                          ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►9.Moon                                             ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►10.Sun                                             ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►11.Special Planet                                  ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t►►12.Exit                                            ◄◄");
                 System.out.println("\t\t\t\t\t\t\t\t▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲▲");
                 System.out.println("\t\t\t\t\tChoise the Option(1-11):");
                 int y=sc.nextInt();
                 switch(y){
                 case 1:{
                     p=new Mercury();
                     System.out.println("\t\t\t\t\tEnter the Weight:");
                     double w=sc.nextDouble();
                     p.weight(w);
                     p.display();
                     p.gravity();
                     System.out.println();
                     break;
                 }
                 case 2:{
                     p=new Venus();
                     System.out.println("\t\t\t\t\tEnter the Weight:");
                     double w=sc.nextDouble();
                     p.weight(w);
                     p.display();
                     p.gravity();
                     System.out.println();
                     break;
                 }
                 case 3:{
                     p=new Earth();
                     System.out.println("\t\t\t\t\tEnter the Weight:");
                     double w=sc.nextDouble();
                     p.weight(w);
                     p.display();
                     p.gravity();
                     System.out.println();
                     break;
                 }
                 case 4:{
                      p=new Mars();
                      System.out.println("\t\t\t\t\tEnter the Weight:");
                      double w=sc.nextDouble();
                      p.weight(w);
                      p.display();
                      p.gravity();
                      System.out.println();
                      break;
                 }
                 case 5:{
                      p=new Jupiter();
                      System.out.println("\t\t\t\t\tEnter the Weight:");
                      double w=sc.nextDouble();
                      p.weight(w);
                      p.display();
                      p.gravity();
                      System.out.println();
                      break;
                 }
                 case 6:{
                      p=new Saturn();
                      System.out.println("\t\t\t\t\tEnter the Weight:");
                      double w=sc.nextDouble();
                      p.weight(w);
                      p.display();
                      p.gravity();
                      System.out.println();
                      break;
                 }
                 case 7:{
                      p=new Uranus();
                      System.out.println("\t\t\t\t\tEnter the Weight:");
                      double w=sc.nextDouble();
                      p.weight(w);
                      p.display();
                      p.gravity();
                      System.out.println();
                      break;
                 }
                case 8:{
                     p=new Neptune();
                     System.out.println("\t\t\t\t\tEnter the Weight:");
                     double w=sc.nextDouble();
                     p.weight(w);
                     p.display();
                     p.gravity();
                     System.out.println();
                     break;
                 }
                case 9:{
                     p=new Moon();
                     System.out.println("\t\t\t\t\tEnter the Weight:");
                     double w=sc.nextDouble();
                     p.weight(w);
                     p.display();
                     p.gravity();
                     System.out.println();
                     break;
                 }
               case 10:{
                     p=new Sun();
                     System.out.println("\t\t\t\t\tEnter the Weight:");
                     double w=sc.nextDouble();
                     p.weight(w);
                     p.display();
                     p.gravity();
                     System.out.println();
                     break;
                 }
               case 11:{
                     p=new Special();
                     System.out.println("\t\t\t\t\tEnter the Weight:");
                     double w=sc.nextDouble();
                     System.out.println("\t\t\t\t\tEnter the Gravity Of Your Special Planet:");
                     double g=sc.nextDouble();
                     p.weight(w);
                     p.special(g);
                     p.display();
                     p.gravity();
                     System.out.println();
                     break;
                 }
               case 12:{
                     v=1;
                     break;
                 }
               default:{
                     System.out.println("\t\t\t\t\tInvalid Option.");
                 }
                 }
                 }
                 System.out.println("\t\t\t\t\tYou Like it.");
                 String q=sc.next();
                 if(q.equals("Yes")||q.equals("yes")||q.equals("YES")){
                     System.out.println("\t\t\t\t\tI love to know you like my advices about \n\t\t\t\t\tplants,I am happy to know 😊.");
                 }
                 else{
                     System.out.println("\t\t\t\t\tSorry to hear.");
                 }
            }
            else if(b.equals("What_is_the_converstion_of_celcious_to_other?")||b.equals("what_is_the_converstion_of_celcious_to_other?")||b.equals("2")){
                 temp t1=new temp();
                 System.out.println("\t\t\t\t\tEnter the Seasons:");
                 String x=sc.next();
                 t1.se(x);
                 System.out.println("\t\t\t\t\tEnter the Temperature:");
                 double z=sc.nextDouble();
                 t1.temp(z);
                 System.out.println("\t\t\t\t\tSeasons:"+t1.name);
                 t1.display();
                 System.out.println("\t\t\t\t\tYou want to Know other things?,Choise form the option.");
                 
            }
            else if(b.equals("What_is_the_Interest_of_Banks?")||b.equals("what_is_the_interest_of_banks?")||b.equals("3")){
                  int x=0;
                  while(x==0){ 
                  System.out.println("\t\t\t\t\t************Menu************");
                  System.out.println("\t\t\t\t\t**1.Bank rate of interest.**");
                  System.out.println("\t\t\t\t\t**2.SBI rate of interest. **");
                  System.out.println("\t\t\t\t\t**3.ICIC rate of interest.**");
                  System.out.println("\t\t\t\t\t**4.HDFC rate of interest.**");
                  System.out.println("\t\t\t\t\t**5.Exit.                 **");
                  System.out.println("\t\t\t\t\t****************************");
                  System.out.println("\t\t\t\t\tChoise the Option(1-5):");
                  int i=sc.nextInt();
                  switch(i){
                  case 1:{
                     Bank a1=new Bank();
                     System.out.println("\t\t\t\t\tEnter the Principle Amount:");
                     double p=sc.nextDouble();
                     System.out.println("\t\t\t\t\tEnter the year:");
                     double n=sc.nextDouble();
                     a1.Rate_of_Interest(p, n);
                     a1.display();
                     break;
                  }
                  case 2:{
                      Sbi a2=new Sbi();
                      System.out.println("\t\t\t\t\tEnter the Principle Amount:");
                      double p=sc.nextDouble();
                      System.out.println("\t\t\t\t\tEnter the year:");
                      double n=sc.nextDouble();
                      a2.Rate_of_Interest(p, n);
                      a2.display();   
                      break;
                  }
                  case 3:{
                     Icic a3=new Icic();
                     System.out.println("\t\t\t\t\tEnter the Principle Amount:");
                     double p=sc.nextDouble();
                     System.out.println("\t\t\t\t\tEnter the year:");
                     double n=sc.nextDouble();
                     a3.Rate_of_Interest(p, n);
                     a3.display();
                     break;
                  }
                  case 4:{
                     hdfc a4=new hdfc();
                     System.out.println("\t\t\t\t\tEnter the Principle Amount:");
                     double p=sc.nextDouble();
                     System.out.println("\t\t\t\t\tEnter the year:");
                     double n=sc.nextDouble();
                     a4.Rate_of_Interest(p, n);
                     a4.display();
                     break;
                  }
                  case 5:{
                     x=1;
                     break;
                  }
            
                  default:
                  {
                     System.out.println("Invalid option.");
                  }
                
                  }
                 }
                System.out.println("\t\t\t\t\tYou want to Know other things?,Choise form the option.");
            }
            else if(b.equals("What_is_the_consumption_of_petrol?")||b.equals("what_is_the_consumption_of_petrol?")||b.equals("4")){
                  int p=0;
                  while(p==0){
                  System.out.println("\t\t\t\t\t*************CARS MENU*************");
                  System.out.println("\t\t\t\t\t1.Distance.");
                  System.out.println("\t\t\t\t\t2.Amount of fuel.");
                  System.out.println("\t\t\t\t\t3.Fuel Consumption.");
                  System.out.println("\t\t\t\t\t4.Exit.");
                  System.out.println("\t\t\t\t\t***********************************");
                  System.out.println("\t\t\t\t\tChoise the option(1-4):");
                  int r=sc.nextInt();
                  switch(r){
                  case 1:
                  {
                     System.out.println("\t\t\t\t\tEnter the fuel consumption in Liters:");
                     double a1=sc.nextDouble();
                     System.out.println("\t\t\t\t\tEnter the Amount of fuel in Liters:");
                     double a2=sc.nextDouble();
                     distance d1=new distance(a1,a2);
                     d1.dispaly();
                     break;
                  }
                  case 2:
                  {
                     System.out.println("\t\t\t\t\tEnter the Distance in Km:");
                     double a3=sc.nextDouble();
                     System.out.println("\t\t\t\t\tEnter the Fuel Consumption in Liters:");
                     double a4=sc.nextDouble();
                     fuel f=new fuel(a3,a4);
                     f.dispaly();
                     break;
                  }
                  case 3:
                  {
                     System.out.println("\t\t\t\t\tEnter the Distance in Km:");
                     double a5=sc.nextDouble();
                     System.out.println("\t\t\t\t\tEnter the Amount of fuel in Liters:");
                     double a6=sc.nextDouble();
                     liters l=new liters(a5,a6);
                     l.dispaly();  
                     break;
                   }
                  case 4:
                  {
                     p=1;
                     break;
                  }
                  default:
                  {
                    System.out.println("\t\t\t\t\tInvalid Option.");
                  }
                 }  
                } 
                System.out.println("\t\t\t\t\tYou want to ask more other things from given option.");  
            }
            else if(b.equals("What_is_the_conversion_of_cm_into_other?")||b.equals("what_is_the_conversion_of_cm_into_other?")||b.equals("5")){
                   int o=0;
                   while(o==0){
                   System.out.println("\t\t\t\t\t\t\t\t**************Cm To Other Converter Menu***************");
                   System.out.println("\t\t\t\t\t\t\t\t***1.Kilometers                                     ***");
                   System.out.println("\t\t\t\t\t\t\t\t***2.Meters                                         ***");
                   System.out.println("\t\t\t\t\t\t\t\t***3.Milimeters                                     ***");
                   System.out.println("\t\t\t\t\t\t\t\t***4.Micrometers                                    ***");
                   System.out.println("\t\t\t\t\t\t\t\t***5.Miles                                          ***");
                   System.out.println("\t\t\t\t\t\t\t\t***6.Yards                                          ***");
                   System.out.println("\t\t\t\t\t\t\t\t***7.Foots                                          ***");
                   System.out.println("\t\t\t\t\t\t\t\t***8.Inchs                                          ***");
                   System.out.println("\t\t\t\t\t\t\t\t***9.Exit                                           ***");
                   System.out.println("\t\t\t\t\t\t\t\t*******************************************************");
                   System.out.println("\t\t\t\t\tChoise the option(1-9):");
                   int u=sc.nextInt();
                   switch(u){
                       case 1:{
                          km a1=new km();
                          System.out.println("\t\t\t\t\tEnter the Value:");
                          double c1=sc.nextDouble();
                          a1.cal(c1);
                          a1.display();
                          break;
                       }
                      case 2:{
                          m a2=new m();
                          System.out.println("\t\t\t\t\tEnter the Value:");
                          double c1=sc.nextDouble();
                          a2.cal(c1);
                          a2.display();
                          break;
                       }
                     case 3:{
                          milim a3=new milim();
                          System.out.println("\t\t\t\t\tEnter the Value:");
                          double c1=sc.nextDouble();
                          a3.cal(c1);
                          a3.display();
                          break;
                       }
                     case 4:{
                       Microm a4=new Microm();
                       System.out.println("\t\t\t\t\tEnter the Value:");
                       double c1=sc.nextDouble();
                       a4.cal(c1);
                       a4.display();
                       break;
                      }
                     case 5:{
                       mile a5=new mile();
                       System.out.println("\t\t\t\t\tEnter the Value:");
                       double c1=sc.nextDouble();
                       a5.cal(c1);
                       a5.display();
                       break;
                     }
                    case 6:{
                       Yard a6=new Yard();
                       System.out.println("\t\t\t\t\tEnter the Value:");
                       double c1=sc.nextDouble();
                       a6.cal(c1);
                       a6.display();
                       break;
                     }
                    case 7:{
                       foot a7=new foot();
                       System.out.println("\t\t\t\t\tEnter the Value:");
                       double c1=sc.nextDouble();
                       a7.cal(c1);
                       a7.display();
                       break;
                     }
                    case 8:{
                       inch a8=new inch();
                       System.out.println("\t\t\t\t\tEnter the Value:");
                       double c1=sc.nextDouble();
                       a8.cal(c1);
                       a8.display();
                       break;
                     }
                    case 9:{
                        o=1;
                        break;
                     }
                    default:
                     {
                       System.out.println("\t\t\t\t\tInvalid Option.");
                     }
                    
                    }    
                   }  
                    System.out.println("\t\t\t\t\tYou want to Know other things?,Choise form the option.");
            }
            else if(b.equals("Good_Morning")||b.equals("good_morning")||b.equals("Good_morning")||b.equals("GOOD_MORNING")||b.equals("Gm")||b.equals("gm")||b.equals("GM")){
                System.out.println("\t\t\t\t\tGood Morning"+" "+c);
            }
            else if(b.equals("Good_Night")||b.equals("good_night")||b.equals("Good_night")||b.equals("GOOD_NIGHT")||b.equals("Gn")||b.equals("gn")||b.equals("GN")){
                System.out.println("\t\t\t\t\tGood Night"+" "+c);
            }
            else if(b.equals("Good_Evening")||b.equals("good_evening")||b.equals("Good_evening")||b.equals("GOOD_EVENING")||b.equals("Ge")||b.equals("ge")||b.equals("GE")){
                System.out.println("\t\t\t\t\tGood Evening"+" "+c);
            }
            else if(b.equals("Good_Afternoon")||b.equals("good_afternoon")||b.equals("Good_afternoon")||b.equals("GOOD_AFTERNOON")||b.equals("Ga")||b.equals("ga")||b.equals("GA")){
                System.out.println("\t\t\t\t\tGood Afternoon"+" "+c);
            }
            else if(b.equals("Play_the_music")||b.equals("play_the_music")||b.equals("playm")){
                System.out.println("♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫ Music Player ♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫");
                System.out.println("");
                mymusic m=new mymusic();
                m.songs();
                System.out.println("");
                System.out.println("♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫");
                System.out.println("\t\t\t\t\tYou Like the Music");
                String c=sc.next();
                if(c.equals("Yes")||c.equals("yes")){
                    System.out.print("\t\t\t\t\tNice to hear it.");
                }
                else
                {
                    System.out.print("\t\t\t\t\tSo what you want to hear?");
                }
            }
            else if(b.equals("Book_Train_tiket")){
                System.out.println("*****************************************************Railway Resarvation*******************************************************");
                System.out.println("");
                train t=new train();
                t.book();
                System.out.println("");
                System.out.println("*******************************************************************************************************************************");
                System.out.println("\t\t\t\t\tYour tiket is Booked?");
                String c=sc.next();
                if(c.equals("Yes")||c.equals("yes")){
                    System.out.println("\t\t\t\t\tThat's Good have a nice trip.");
                }
                else{
                    System.out.println("\t\t\t\t\tOk,so whats now!!");
                }
            }
            else if(b.equals("Hello World")){
                System.out.println("Hello World");
            }
            else{
                System.out.println("\t\t\t\t\tWhat You Say I don't understand.Please\n\t\t\t\t\tsomething ask other questions,Thank You.");
            }
            }
        }
        else{
            System.out.println("\t\t\t\t\tWhat You Say I don't understand.Please\n\t\t\t\t\tsomething ask other questions,Thank You.");
        }   
    }

    @Override
    public void bot_talk(StringBuffer v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class Chat_Bot {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Registered your name for chatting the bot:");
        System.out.println("Please Enter your first name:");
        String s=sc.next();
        bot x=new chat();
        x.name(s);
        System.out.println("****************************************************************************");
        System.out.println("\t\t\t\tCHAT BOT");
        System.out.println("****************************************************************************");
        System.out.println("Say Hello to Chat Bot:");
        String z=sc.next();
        x.bot_talk(z);
        System.out.println("****************************************************************************");
    }
}
