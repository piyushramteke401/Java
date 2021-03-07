/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Special_Programs;

import static Special_Programs.My_music.playMusic;
import java.io.File;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class mymusic
{
    void songs(){
        Scanner sc=new Scanner(System.in);
        int b=0;
        while(b==0)
        {
            System.out.println("\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪Languags of Songs♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
            System.out.println("\t\t\t\t♪♪1.English Songs.                          ♪♪");
            System.out.println("\t\t\t\t♪♪2.Hindi Songs.                            ♪♪");
            System.out.println("\t\t\t\t♪♪3.Marathi Songs.                          ♪♪");
            System.out.println("\t\t\t\t♪♪4.Exit.                                   ♪♪");
            System.out.println("\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪");
            System.out.println("Select the Song Language:");
            int a=sc.nextInt();
            switch(a){
                case 1:{
                   int b1=0;
                   while(b1==0){
                   System.out.println("\t\t\t\t\t♫♫♫♫♫♫♫♫♫English Songs♫♫♫♫♫♫♫♫♫");
                   System.out.println("\t\t\t\t\t1.Marshmello songs(MS)");
                   System.out.println("\t\t\t\t\t2.Alan Walker songs(AW)");
                   System.out.println("\t\t\t\t\t3.Kety Perry(KP)");
                   System.out.println("\t\t\t\t\t4.Chainsmokers songs(CS)");
                   System.out.println("\t\t\t\t\t5.Ed Sheeran songs(ES)");
                   System.out.println("\t\t\t\t\t6.Bebe Rexha songs(BR)");
                   System.out.println("\t\t\t\t\t7.Taylor Swift songs(TS)");
                   System.out.println("\t\t\t\t\t8.Anne marie songs(AM)");
                   System.out.println("\t\t\t\t\t9.Exit");
                   System.out.println("\t\t\t\t\t♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫");
                   System.out.println("Select the Song:");
                   String c=sc.next();
                   if(c.equals("1")||c.equals("MS"))
                   {   
                      int b2=0;
                      while(b2==0){
                      System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Marshmello songs♪♪♪♪♪♪♪♪♪♪♪"); 
                      System.out.println("\t\t\t\t\t1.Kane Brown");
                      System.out.println("\t\t\t\t\t2.Alone");
                      System.out.println("\t\t\t\t\t3.Blocks");
                      System.out.println("\t\t\t\t\t4.Moving On");
                      System.out.println("\t\t\t\t\t5.Paralyezed");
                      System.out.println("\t\t\t\t\t6.Power");
                      System.out.println("\t\t\t\t\t7.Rescue Me ft.A day to Remeber");
                      System.out.println("\t\t\t\t\t8.Star");
                      System.out.println("\t\t\t\t\t9.Summer");
                      System.out.println("\t\t\t\t\t10.Take it back");
                      System.out.println("\t\t\t\t\t11.Together");
                      System.out.println("\t\t\t\t\t12.Check this out");
                      System.out.println("\t\t\t\t\t13.Exit");
                      System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                      System.out.println("Select the song you want to play:");
                      int c1=sc.nextInt();
                      if(c1==1){
                        System.out.println("Marshmello Kane Brown Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_&_Kane_Brown_-_One_Thing_Right_(Official_Music_Video)(128k).wav");    
                        }
                      else if(c1==2){
                        System.out.println("Marshmello Alone Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Alone_(Official_Music_Video)(128k).wav");
                        
                        }
                      else if(c1==3){
                        System.out.println("Marshmello Blocks Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Blocks_(Official_Music_Video)(128k).wav");
                         
                        }
                       else if(c1==4){
                        System.out.println("Marshmello Moving on Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Moving_On_(Official_Music_Video)(128k).wav");
                         
                        }
                       else if(c1==5){
                        System.out.println("Marshmello Paralyazed Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Paralyzed_(Official_Music_Video)(128k).wav");
                         
                        }
                       else if(c1==6){
                        System.out.println("Marshmello Power Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Power_(Official_Music_Video)(128k).wav");
                         
                        }
                       else if(c1==7){
                        System.out.println("Marshmello Rescue Me ft.A day to Remeber Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Rescue_Me_ft._A_Day_To_Remember_(Official_Music_Video)(128k).wav");
                         
                        }
                       else if(c1==8){
                        System.out.println("Marshmello Star Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Stars_(Official_Music_Video)(128k).wav");
                          
                        }
                       else if(c1==9){
                        System.out.println("Marshmello Summer Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Summer_(Official_Music_Video)_with_Lele_Pons(128k).wav");
                          
                        }
                       else if(c1==10){
                        System.out.println("Marshmello Take it Back Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Take_It_Back_(Official_Music_Video)(128k).wav");
                         
                        }
                       else if(c1==11){
                        System.out.println("Marshmello Together Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Together_(Official_Music_Video)(128k).wav");
                          
                        }
                       else if(c1==12){
                        System.out.println("Marshmello Check this out Song:");
                        System.out.println("Song are playing.");
                        playMusic("Music\\\\Marshmello\\\\Marshmello_-_Check_This_Out_(Official_Music_Video)(128k).wav");
                         
                        }
                        else if(c1==13){
                           b2=1;
                       }
                      }
                    }
                   else if(c.equals("2")||c.equals("AW")){
                       int b2=0;
                       while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Alan Walker songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Darkside"); 
                           System.out.println("\t\t\t\t\t2.Hymn For The weekend Remix"); 
                           System.out.println("\t\t\t\t\t3.Alone Pt 1"); 
                           System.out.println("\t\t\t\t\t4.Alone Pt 2"); 
                           System.out.println("\t\t\t\t\t5.On my own "); 
                           System.out.println("\t\t\t\t\t6.Faded"); 
                           System.out.println("\t\t\t\t\t7.The Spectre"); 
                           System.out.println("\t\t\t\t\t8.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                           System.out.println("Alan Walker Darkside Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alan Walker\\\\Alan Walker - Darkside (Lyrics) ft. Au_Ra and Tomine Harket(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                           System.out.println("Alan Walker Hymn For The weekend Remix Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alan Walker\\\\Alan Walker vs Coldplay - Hymn For The Weekend Remix.wav");    
                           }
                          else if(c1==3){
                           System.out.println("Alan Walker Alone pt 1 Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alan Walker\\\\Alan_Walker_-_Alone.wav");
                          }
                          else if(c1==4){
                           System.out.println("Alan Walker Alone Pt 2 Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alan Walker\\\\Alan Walker_ Ava Max - Alone_ Pt. II (Lyrics)(MP3_160K)_1.wav");
                          }
                          else if(c1==5){
                           System.out.println("Alan Walker On my own Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alan Walker\\\\Alan_Walker,_Sabrina_Carpenter_&_Farruko__-_On_My_Way(256k).wav");
                          }
                          else if(c1==6){
                           System.out.println("Alan Walker Faded Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alan Walker\\\\Alan_Walker_-_Faded[www.MP3Fiber.com].wav"); 
                        }
                          else if(c1==7){
                           System.out.println("Alan Walker The Spectre Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alan Walker\\\\Alan_Walker_-_The_Spectre.wav"); 
                        }
                        else if(c1==8){
                           b2=1;
                        }
                      }   
                   }
                   else if(c.equals("3")||c.equals("KP")){
                       int b2=0;
                       while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Katy Perry songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Bon app"); 
                           System.out.println("\t\t\t\t\t2.California Gurls"); 
                           System.out.println("\t\t\t\t\t3.Chained to the rhythm"); 
                           System.out.println("\t\t\t\t\t4.Dark Horse"); 
                           System.out.println("\t\t\t\t\t5.Firework "); 
                           System.out.println("\t\t\t\t\t6.Hey hey hey"); 
                           System.out.println("\t\t\t\t\t7.Rise"); 
                           System.out.println("\t\t\t\t\t8.Swish Swish");
                           System.out.println("\t\t\t\t\t9.Unconditionally");
                           System.out.println("\t\t\t\t\t10.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                            System.out.println("Katy Perry Bon app  Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_Bon_App_C3_A9tit__28Official_29_ft._Migos.wav");    
                           }
                           else if(c1==2){
                            System.out.println("Katy Perry California Gurls Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_California_Gurls__28Official_29_ft._Snoop_Dogg.wav");    
                           }
                           else if(c1==3){
                            System.out.println("Katy Perry Chained to the rhythm Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_Chained_To_The_Rhythm__28Official_29_ft._Skip_Marley.wav");
                           }
                           else if(c1==4){
                            System.out.println("Katy Perry Dark Horse Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_Dark_Horse__28Official_29_ft._Juicy_J.wav");
                          }
                          else if(c1==5){
                           System.out.println("Katy Perry Firework  Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_Firework__28Official_29.wav");
                          }
                          else if(c1==6){
                           System.out.println("Katy Perry Hey hey hey Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_Hey_Hey_Hey__28Official_29.wav");
                          }
                          else if(c1==7){
                           System.out.println("Katy Perry Rise Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_Rise__28Official_29.wav");
                          }
                           else if(c1==8){
                           System.out.println("Katy Perry Swish Swish Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_Swish_Swish__28Audio_29_ft._Nicki_Minaj.wav");
                          }
                          else if(c1==9){
                           System.out.println("Katy Perry Unconditionally Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Katy Perry\\\\Katy_Perry_-_Unconditionally__28Official_29.wav");
                          }     
                          else if(c1==10){
                           b2=1;
                        }
                      }   
                   }
                   else if(c.equals("4")||c.equals("CS")){
                        int b2=0;
                       while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of ChainSmoker songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Closer"); 
                           System.out.println("\t\t\t\t\t2.Illenium"); 
                           System.out.println("\t\t\t\t\t3.Something Just like this"); 
                           System.out.println("\t\t\t\t\t4.Call you mine"); 
                           System.out.println("\t\t\t\t\t5.Don't Let Me Down"); 
                           System.out.println("\t\t\t\t\t6.Ley you go"); 
                           System.out.println("\t\t\t\t\t7.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                             System.out.println("Chainsmoker Closer Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Chainsmoker\\\\Closer - The Chainsmokers, Halsey (320kbps).wav");    
                           }
                           else if(c1==2){
                             System.out.println("Chainsmoker illenium Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Chainsmoker\\\\The_Chainsmokers,_ILLENIUM_-_Takeaway_(Official_Video)_ft._Lennon_Stella.wav");  
                           }
                           else if(c1==3){
                             System.out.println("Chainsmoker Something Just Like This Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Chainsmoker\\\\The_Chainsmokers_&_Coldplay_-_Something_Just_Like_This_(Lyric).wav");
                           }
                           else if(c1==4){
                             System.out.println("Chainsmoker Call You mine Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Chainsmoker\\\\The_Chainsmokers_-_Call_You_Mine_(Official_Video)_ft._Bebe_Rexha.wav");
                           }
                           else if(c1==5){
                             System.out.println("Chainsmoker Don't Let me Down Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Chainsmoker\\\\The_Chainsmokers_-_Don't_Let_Me_Down_(Official_Video)_ft._Daya.wav");
                           }
                           else if(c1==6){
                             System.out.println("Chainsmoker Let you go Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Chainsmoker\\\\The_Chainsmokers_-_Let_You_Go_ft._Great_Good_Fine_Ok.wav");
                           }
                           else if(c1==7){
                             b2=1;
                           }
                      }   
                   }
                   else if(c.equals("5")||c.equals("ES")){
                       int b2=0;
                       while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Ed Sheeran songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Afterglow"); 
                           System.out.println("\t\t\t\t\t2.Perfect"); 
                           System.out.println("\t\t\t\t\t3.South of the border"); 
                           System.out.println("\t\t\t\t\t4.I Don't care"); 
                           System.out.println("\t\t\t\t\t5.Galway Girl"); 
                           System.out.println("\t\t\t\t\t6.Shape of You"); 
                           System.out.println("\t\t\t\t\t7.Photograph"); 
                           System.out.println("\t\t\t\t\t8.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                            System.out.println("Ed Sheeran Afterglow Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Ed Sheeran\\\\Ed Sheeran - Afterglow (LYRICS)(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                            System.out.println("Ed Sheeran Perfect Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Ed Sheeran\\\\Ed Sheeran - Perfect (Lyrics)(MP3_160K)_1.wav"); 
                           }
                           else if(c1==3){
                            System.out.println("Ed Sheeran South of the border Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Ed Sheeran\\\\Ed Sheeran - South of the Border (feat. Camila Cabello _ Cardi B) [Official Lyric Video](MP3_160K)_1.wav"); 
                           }
                           else if(c1==4){
                            System.out.println("Ed Sheeran I don't care Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Ed Sheeran\\\\Ed Sheeran _ Justin Bieber - I Don_t Care [Official Lyric Video](MP3_160K)_1.wav"); 
                           }
                           else if(c1==5){
                            System.out.println("Ed Sheeran Galway Girl Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Ed Sheeran\\\\Ed_Sheeran_-_Galway_Girl_[Official_Lyric_Video].wav"); 
                           }
                           else if(c1==6){
                            System.out.println("Ed Sheeran Shape of you Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Ed Sheeran\\\\Ed_Sheeran_-_Shape_of_You_[Official_Video].wav"); 
                           }
                           else if(c1==7){
                            System.out.println("Ed Sheeran Photograph Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Ed Sheeran\\\\Photograph - Ed Sheeran (Lyrics)(MP3_160K)_1.wav"); 
                           }
                           else if(c1==8){
                            b2=1;
                        }
                      }   
                   }
                   else if(c.equals("6")||c.equals("BR")){
                       int b2=0;
                       while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Bebe Rexha songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.I am jealous"); 
                           System.out.println("\t\t\t\t\t2.I am a mess"); 
                           System.out.println("\t\t\t\t\t3.The Way I are"); 
                           System.out.println("\t\t\t\t\t4.Hey Mama"); 
                           System.out.println("\t\t\t\t\t5.Say My name"); 
                           System.out.println("\t\t\t\t\t6.Me myself i"); 
                           System.out.println("\t\t\t\t\t7.Back To you"); 
                           System.out.println("\t\t\t\t\t8.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                            System.out.println("Bebe Rexha I am jealous Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Bebe Rexha\\\\Bebe Rexha - Baby_ I_m Jealous ft. Doja Cat (Lyrics)(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                            System.out.println("Bebe Rexha I am a mess Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Bebe Rexha\\\\Bebe Rexha - I_m A Mess (Lyrics)(MP3_160K)_1.wav");   
                           }
                          else if(c1==3){
                            System.out.println("Bebe Rexha The Way I are Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Bebe Rexha\\\\Bebe Rexha - The Way I Are (Dance With Somebody) feat. Lil Wayne [Official Music Video](MP3_160K)_1.wav");
                          }
                          else if(c1==4){
                            System.out.println("Bebe Rexha Hey Mama Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Bebe Rexha\\\\David Guetta - Hey Mama (Official Video) ft Nicki Minaj_ Bebe Rexha _ Afrojack(MP3_160K)_1.wav"); 
                          }
                          else if(c1==5){
                            System.out.println("Bebe Rexha Say My name Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Bebe Rexha\\\\David Guetta_ Bebe Rexha _ J Balvin - Say My Name (Official Video)(MP3_160K)_1.wav");
                          }
                          else if(c1==6){
                            System.out.println("Bebe Rexha Me myself I Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Bebe Rexha\\\\G-Eazy x Bebe Rexha - Me_ Myself _ I (Lyrics Video)(MP3_160K)_1.wav");
                          }
                          else if(c1==7){
                            System.out.println("Bebe Rexha Back to you Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Bebe Rexha\\\\Louis Tomlinson - Back to You (Official Video) ft. Bebe Rexha_ Digital Farm Animals(MP3_160K)_1.wav");
                          }
                          else if(c1==8){
                           b2=1;
                        }
                      }   
                   }
                   else if(c.equals("7")||c.equals("TS")){
                       int b2=0;
                       while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Taylor Swift songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Ready for it"); 
                           System.out.println("\t\t\t\t\t2.Bad blood"); 
                           System.out.println("\t\t\t\t\t3.Blank Space"); 
                           System.out.println("\t\t\t\t\t4.End Game"); 
                           System.out.println("\t\t\t\t\t5.Look What you made me do"); 
                           System.out.println("\t\t\t\t\t6.Shake it off"); 
                           System.out.println("\t\t\t\t\t7.Wildest Dream"); 
                           System.out.println("\t\t\t\t\t8.You Belong With Me"); 
                           System.out.println("\t\t\t\t\t9.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                             System.out.println("Taylor Swift Ready For it Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Taylor Swift\\\\Taylor_Swift_-__E2_80_A6Ready_For_It_3F.wav");    
                           }
                           else if(c1==2){
                             System.out.println("Taylor Swift Bad Blood Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Taylor Swift\\\\Taylor_Swift_-_Bad_Blood_ft._Kendrick_Lamar.wav");  
                           }
                          else if(c1==3){
                             System.out.println("Taylor Swift Blank space Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Taylor Swift\\\\Taylor_Swift_-_Blank_Space.wav");
                           }
                          else if(c1==4){
                             System.out.println("Taylor Swift End Game Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Taylor Swift\\\\Taylor_Swift_-_End_Game_ft._Ed_Sheeran_2C_Future.wav");
                          }
                          else if(c1==5){
                             System.out.println("Taylor Swift Look What you made me do Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Taylor Swift\\\\Taylor_Swift_-_Look_What_You_Made_Me_Do.wav");
                          }
                          else if(c1==6){
                             System.out.println("Taylor Swift Shake it Off Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Taylor Swift\\\\Taylor_Swift_-_Shake_It_Off.wav");
                          }
                          else if(c1==7){
                             System.out.println("Taylor Swift Wildest Dream Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Taylor Swift\\\\Taylor_Swift_-_Wildest_Dreams.wav");
                          }
                          else if(c1==8){
                             System.out.println("Taylor Swift You belong With me Song:");
                             System.out.println("Song are playing.");
                             playMusic("Music\\\\Taylor Swift\\\\Taylor_Swift_-_You_Belong_With_Me.wav");
                         }
                         else if(c1==9){
                           b2=1;
                        }
                      }   
                   }
                   else if(c.equals("8")||c.equals("MS")){
                       int b2=0;
                       while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Anne Marie songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.To be Young"); 
                           System.out.println("\t\t\t\t\t2.2002"); 
                           System.out.println("\t\t\t\t\t3.Birthday"); 
                           System.out.println("\t\t\t\t\t4.Problems"); 
                           System.out.println("\t\t\t\t\t5.Friends"); 
                           System.out.println("\t\t\t\t\t6.Clean Bandit");
                           System.out.println("\t\t\t\t\t7.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                           System.out.println("Anne Marie To be Young Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Anne Marie\\\\Anne Marie - To Be Young(Lyrics) ft . Doja Cat(MP3_128K).wav");    
                           }
                           else if(c1==2){
                           System.out.println("Anne Marie 2002 Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Anne Marie\\\\Anne-Marie - 2002 [Official Video](MP3_128K).wav");   
                           }
                          else if(c1==3){
                           System.out.println("Anne Marie Birthday Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Anne Marie\\\\Anne-Marie - BIRTHDAY [Official Video](MP3_128K).wav");
                          }
                          else if(c1==4){
                           System.out.println("Anne Marie Problems Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Anne Marie\\\\Anne-Marie - Problems [Official Lyric Video](MP3_128K).wav");
                          }
                          else if(c1==5){
                           System.out.println("Anne Marie Friends Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Anne Marie\\\\Marshmello _ Anne-Marie - FRIENDS (Lyrics)(MP3_128K).wav");
                          }
                          else if(c1==6){
                           System.out.println("Anne Marie Clean Bandit Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Anne Marie\\\\Rockabye - Clean Bandit ft. Sean Paul _ Anne-Marie (Lyrics)(MP3_128K).wav");
                        }
                        else if(c1==7){
                           b2=1;
                        }
                      }   
                   }
                   else if(c.equals("9")||c.equals("Exit")){
                       b1=1;
                   }
                   }
                   break;
                }
                case 2:{
                    int b1=0;
                    while(b1==0){
                    System.out.println("\t\t\t\t\t♫♫♫♫♫♫♫♫♫Hindi Songs♫♫♫♫♫♫♫♫♫");
                    System.out.println("\t\t\t\t\t1.Arijit Singh songs(AS)");
                    System.out.println("\t\t\t\t\t2.Kumar Sanu songs(KS)");
                    System.out.println("\t\t\t\t\t3.Alka Yagnik songs(AY)");
                    System.out.println("\t\t\t\t\t4.Neha Kakkar songs(NK)");
                    System.out.println("\t\t\t\t\t5.Sonu Nigam songs(SN)");
                    System.out.println("\t\t\t\t\t6.Exit");
                    System.out.println("\t\t\t\t\t♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫");
                    System.out.println("Select the Song:");
                    String c=sc.next();
                      if(c.equals("1")||c.equals("AS"))
                      {  
                           int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Arijit Singh songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Tum hei ho"); 
                           System.out.println("\t\t\t\t\t2.Pal Pal"); 
                           System.out.println("\t\t\t\t\t3.Tujhe Kitna Chahne Lage hu"); 
                           System.out.println("\t\t\t\t\t4.Khairiyat"); 
                           System.out.println("\t\t\t\t\t5.Love Aaj kal"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                           System.out.println("Arijit Singh Tumhei hei ho Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Arijit Singh\\\\_Tum Hi Ho_ Aashiqui 2 Full Song With Lyrics _ Aditya Roy Kapur_ Shraddha Kapoor(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                           System.out.println("Arijit Singh Pal Pal Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Arijit Singh\\\\Arijit Singh - Pal _ Official Video _ Nawazuddin Siddiqui _ Monsoon Shootout _ Rochak Kohli(MP3_160K)_1.wav");   
                           }
                          else if(c1==3){
                           System.out.println("Arijit Singh Tujhe Kitna Chahne Lage hu Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Arijit Singh\\\\Full Song_ Tujhe Kitna Chahne Lage _ Kabir Singh _ Mithoon Feat. Arijit Singh _ Shahid K_ Kiara A(MP3_160K)_1.wav"); 
                          }
                          else if(c1==4){
                           System.out.println("Arijit Singh Khairiyat Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Arijit Singh\\\\Lyrical_ Khairiyat _ Chhichhore _ Nitesh Tiwari _ Arijit Singh _ Sushant_ Shraddha _ Pritam(MP3_160K)_1.wav"); 
                          }
                          else if(c1==5){
                           System.out.println("Arijit Singh Love Aaj kal Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Arijit Singh\\\\Shayad Lyrics - Love Aaj Kal Ft. Arijit Singh _ Kartik _ Sara _ Arushi _ Pritam(MP3_160K)_1.wav"); 
                          }
                        else if(c1==6){
                           b2=1;
                        }
                      }   
                      }
                      else if(c.equals("2")||c.equals("KS"))
                      {  
                          int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Kumar Sanu songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Aankh hai bhari bhari"); 
                           System.out.println("\t\t\t\t\t2.Ae kash ke hum"); 
                           System.out.println("\t\t\t\t\t3.Meri Mehbooba"); 
                           System.out.println("\t\t\t\t\t4.Sochenge Tumhe Pyar"); 
                           System.out.println("\t\t\t\t\t5.Chata to bohot"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                           System.out.println("Kumar Sanu Aankh hai bhari bhari Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Kumar Sanu\\\\Aankh Hai Bhari Bhari (Male) - 4K Video _ Best Bollywood Sad Songs _ Tum Se Achcha Kaun Hai(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                           System.out.println("Kumar Sanu Ae Kash ke Hum Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Kumar Sanu\\\\Ae Kash Ke Hum Full Video - Kabhi Haan Kabhi Naa_Shah Rukh Khan_Suchitra_Kumar Sanu(MP3_160K)_1.wav");
                           }
                          else if(c1==3){
                           System.out.println("Kumar Sanu Meri mehbooba Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Kumar Sanu\\\\Meri Mehbooba - Pardes _ Kumar Sanu_ Alka Yagnik _ Shahrukh Khan_ Amrish Puri _ Mahima Chaudhry(MP3_160K)_1.wav"); 
                          }
                          else if(c1==4){
                           System.out.println("Kumar Sanu Sochenge tumhe pyar Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Kumar Sanu\\\\Sochenge Tumhe Pyar- Lyrical Video _ Deewana _ Rishi Kapoor_ Divya Bharti _ 90_s Best Romantic Song(MP3_160K)_1.wav"); 
                          }
                          else if(c1==5){
                           System.out.println("Kumar Sanu Chata to bohot Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Kumar Sanu\\\\चाहा तो बहुत Full Video Song - Saif Ali Khan _ Raveena Tandon _ Imtihaan(MP3_160K)_12.wav");
                          }
                        else if(c1==6){
                           b2=1;
                        }
                      }   
                      }
                      else if(c.equals("3")||c.equals("AY"))
                      {   
                          int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Alka Yagnik songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Dil laga Liya Dil hai Tumhaara"); 
                           System.out.println("\t\t\t\t\t2.Dil Mein dard Sa Jaga Hai"); 
                           System.out.println("\t\t\t\t\t3.Pehle Kabhi Na mera Haal"); 
                           System.out.println("\t\t\t\t\t4.Hum yaar Tumhare"); 
                           System.out.println("\t\t\t\t\t5.Tumse Milna"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                           System.out.println("Alka Yagnik Dil laga Liya Dil hai Tumhaara Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alka Yagnik\\\\Dil Laga Liya (Lyrics) Dil Hai Tumhaara _ Alka Yagnik _ Udit Narayan(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                           System.out.println("Alka Yagnik Dil Mein dard Sa Jaga Hai Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alka Yagnik\\\\Dil Mein Dard Sa Jaga Hai _ Alka Yagnik_ Udit Narayan _ Kranti 2002 Songs _ Bobby Deol_ Ameesha(MP3_160K)_1.wav");       
                           }
                          else if(c1==3){
                           System.out.println("Alka Yagnik Pehle Kabhi Na mera Haal Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alka Yagnik\\\\Full Video _ Pehle Kabhi Na Mera Haal _ Baghban _ Salman Khan_ Mahima Chaudhary(MP3_160K)_1.wav");    
                          }
                          else if(c1==4){
                           System.out.println("Alka Yagnik Hum yaar Tumhare Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alka Yagnik\\\\Hum Yaar Hain Tumhare Lyrical - Haan Maine Bhi Pyaar Kiya _ Akshay_ Karisma_ Abhishek _ Alka_ Udit(MP3_160K)_1.wav");     
                          }
                          else if(c1==5){
                           System.out.println("Alka Yagnik Tumse Milna Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Alka Yagnik\\\\Tumse Milna - Alka Yagnik _ Udit Narayan - Tere Naam (2003)(MP3_160K)_1.wav");    
                          }
                        else if(c1==6){
                           b2=1;
                        }
                      }   
                      }
                      else if(c.equals("4")||c.equals("NK"))
                      {   
                          int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Neha Kakkar songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Akhiyan"); 
                           System.out.println("\t\t\t\t\t2.Khyaal Rakhua Kar"); 
                           System.out.println("\t\t\t\t\t3.Nehu da vyah"); 
                           System.out.println("\t\t\t\t\t4.Maahi ve wajah tum ho"); 
                           System.out.println("\t\t\t\t\t5.Mile Ho Tum"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                           System.out.println("Neha Kakkar Akhiyan Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Neha Kakkar\\\\Akhiyan - Tony Kakkar ft. Neha Kakkar _ Bohemia _ Full Video(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                           System.out.println("Neha Kakkar Khyaal Rakhua Kar Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Neha Kakkar\\\\KHYAAL RAKHYA KAR LYRICS – Neha Kakkar _ Rohanpreet Singh(MP3_160K)_1.wav");   
                           }
                          else if(c1==3){
                           System.out.println("Neha Kakkar Nehu da vyah Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Neha Kakkar\\\\LYRICS_- NEHU DA VYAH _BY- NEHA KAKKAR _ ROHAN PREETSINGH _ NEW PUNJABI SONG(MP3_160K)_1.wav");  
                          }
                          else if(c1==4){
                           System.out.println("Neha Kakkar Maahi ve wajah tum ho Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Neha Kakkar\\\\Maahi Ve Full Video Song Wajah Tum Ho _ Neha Kakkar_ Sana_ Sharman_ Gurmeet _ Vishal Pandya(MP3_160K)_1.wav"); 
                          }
                          else if(c1==5){
                           System.out.println("Neha Kakkar Mile Ho Tum Song:");
                           System.out.println("Song are playing.");
                           playMusic("Music\\\\Neha Kakkar\\\\Mile Ho Tum - Reprise Version _ Neha Kakkar _ Tony Kakkar _ Fever(MP3_160K)_1.wav"); 
                          }
                        else if(c1==6){
                           b2=1;
                        }
                      }   
                      }
                      else if(c.equals("5")||c.equals("SN"))
                      {   
                          int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Sonu Nigam songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Aisa Pehli Baar Hua hai"); 
                           System.out.println("\t\t\t\t\t2.Chhoti Chhoti Raatein"); 
                           System.out.println("\t\t\t\t\t3.Deewana Tera"); 
                           System.out.println("\t\t\t\t\t4.Tera Bin Dil Toh Baccha Hai ji"); 
                           System.out.println("\t\t\t\t\t5.Ye Dil Deewana"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                            System.out.println("Sonu Nigam Aisa Pehli Baar Hua hai Song:");
                            System.out.println("Song are playing.");
                           playMusic("Music\\\\Sonu Nigam\\\\_Aisa Pehli Baar Hua Hai [Full Song]_ _ Har Dil Jo Pyar Karega _ Salman Khan(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                            System.out.println("Sonu Nigam Deewana Tera Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sonu Nigam\\\\Chhoti Chhoti Raatein (Full Song) Film - Tum Bin... Love Will Find A Way(MP3_160K)_1.wav");   
                           }
                          else if(c1==3){
                            System.out.println("Sonu Nigam Deewana Tera ji Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sonu Nigam\\\\Deewana Tera - Sonu Nigam Full Video Song Super Hindi Album _Deewana_(MP3_160K)_1.wav"); 
                          }
                          else if(c1==4){
                            System.out.println("Sonu Nigam Tera Bin Dil Toh Baccha Hai ji Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sonu Nigam\\\\Lyrical _ Tere Bin _ DIL TOH BACCHA HAI JI _ Ajay Devgan_Emraan Hashmi_Shruti Hassan_Omi Vaidya(MP3_160K)_1.wav"); 
                          }
                          else if(c1==5){
                            System.out.println("Sonu Nigam Ye Dil Deewana Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sonu Nigam\\\\Yeh Dil Deewana - Pardes _ Shahrukh Khan _ Sonu Nigam _ Nadeem Shravan(MP3_160K)_1.wav"); 
                          }
                        else if(c1==6){
                           b2=1;
                        }
                      }   
                      }
                      else if(c.equals("6")||c.equals("Exit"))
                      {   
                          b1=1;
                          
                      }
                   }
                 break;
                }
                case 3:{
                    int b1=0;
                    while(b1==0){
                    System.out.println("\t\t\t\t\t♫♫♫♫♫♫♫♫♫Marathi Songs♫♫♫♫♫♫♫♫♫");
                    System.out.println("\t\t\t\t\t1.Suresh Wadkar songs(SW)");
                    System.out.println("\t\t\t\t\t2.Sudhir Phadke songs(SP)");
                    System.out.println("\t\t\t\t\t3.Shreya Ghoshal songs(SG)");
                    System.out.println("\t\t\t\t\t4.Aarya Ambekar songs(AA)");
                    System.out.println("\t\t\t\t\t5.Exit");
                    System.out.println("\t\t\t\t\t♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫");
                    System.out.println("Select the Song:");
                    String c=sc.next();
                      if(c.equals("1")||c.equals("SW"))
                      {   
                           int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Suresh Wadkar songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Hridayi Vasant Fultana"); 
                           System.out.println("\t\t\t\t\t2.Jai Ambe Mauli"); 
                           System.out.println("\t\t\t\t\t3.Mi Prem Nagarcha Raja"); 
                           System.out.println("\t\t\t\t\t4.Na Sangtach Aaj He Kale Mala Saglikade BombaBomb"); 
                           System.out.println("\t\t\t\t\t5.Paygun Tujha Asa Rani"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                            System.out.println("Suresh Wadkar Hridayi Vasant Fultana Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Suresh Wadkar\\\\Hridayi Vasant Fultana HD(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                            System.out.println("Suresh Wadkar Jai Ambe Mauli Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Suresh Wadkar\\\\Jai Ambe Mauli(MP3_160K)_1.wav");   
                           }
                          else if(c1==3){
                            System.out.println("Suresh Wadkar Mi Prem Nagarcha Raja Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Suresh Wadkar\\\\Mi Prem Nagarcha Raja-Aamhi Dogh Rajarani _ Suresh Wadkar _  Laxmikant Berde _ Superhit Marathi Song(MP3_160K)_1.wav");
                          }
                          else if(c1==4){
                            System.out.println("Suresh WadkarNa Sangtach Aaj He Kale Mala Saglikade BombaBomb Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Suresh Wadkar\\\\Na Sangtach Aaj He Kale Mala _ Saglikade BombaBomb Songs_ Ashok Saraf _ Varsha Usgaonkar(MP3_160K)_1.wav"); 
                          }
                          else if(c1==5){
                            System.out.println("Suresh Wadkar Paygun Tujha Asa Rani Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Suresh Wadkar\\\\Paygun Tujha Asa Rani(MP3_160K)_1.wav");
                            }
                           else if(c1==6){
                           b2=1;
                        }
                          }
                      }
                      else if(c.equals("2")||c.equals("SP"))
                      {   
                          int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Sudhir Phadke songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Chandra Aahe Sakshiila"); 
                           System.out.println("\t\t\t\t\t2.Dehachi Tijori"); 
                           System.out.println("\t\t\t\t\t3.Dhundi Kalyana"); 
                           System.out.println("\t\t\t\t\t4.Sang tu Majhach na"); 
                           System.out.println("\t\t\t\t\t5.Tjhya Patangachi"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                            System.out.println("Sudhir Phadke Chandra Aahe Sakshiila Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sudhir Phadke\\\\Chandra Aahe Sakshiila with lyrics _  Asha Bhosle _ Sudhir Phadke _ Chandra Hota Sakshila(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                            System.out.println("Sudhir Phadke Dehachi Tijori Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sudhir Phadke\\\\Dehachi Tijori with lyrics _ Sudhir Phadke _ Amhi Jato Amuchya Gava(MP3_160K)_1.wav");   
                           }
                          else if(c1==3){
                            System.out.println("Sudhir Phadke Dhundi Kalyana Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sudhir Phadke\\\\Dhundi Kalyana with Lyrics _ धुंदी कळ्यांना _ Sudhir Phadke _ Asha Bhosle _ Dhakat Bahin(MP3_160K)_1.wav"); 
                          }
                          else if(c1==4){
                           System.out.println("Sudhir Phadke Sang tu Majhach na Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sudhir Phadke\\\\Sang Tu Majhach Na(MP3_160K)_1.wav");  
                          }
                          else if(c1==5){
                            System.out.println("Sudhir Phadke Tjhya Patangachi Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Sudhir Phadke\\\\Tujhya Patangachi Dori(MP3_160K)_1.wav"); 
                            }
                           else if(c1==6){
                           b2=1;
                        }
                          }
                      }
                      else if(c.equals("3")||c.equals("SG"))
                      {   
                          int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Shreya Ghoshal songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Jiv Rangala"); 
                           System.out.println("\t\t\t\t\t2.Makhmali"); 
                           System.out.println("\t\t\t\t\t3.Man Maze"); 
                           System.out.println("\t\t\t\t\t4.Paus Ha Tujha Ni Majha"); 
                           System.out.println("\t\t\t\t\t5.Sajana Re"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                            System.out.println("Shreya Ghoshal Jiv Rangala Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Shreya Ghoshal\\\\Jiv Rangala _ Jogwa _ Ajay Atul(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                            System.out.println("Shreya Ghoshal Makhmali Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Shreya Ghoshal\\\\Makhmali मख़मली Song - Movie Zindagi Virat _ Marathi Songs _ Sonu Nigam _ Shreya Ghoshal(MP3_160K)_1.wav");
                           }
                          else if(c1==3){
                            System.out.println("Shreya Ghoshal Man Maze Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Shreya Ghoshal\\\\Man Maze - Official Music Video _ Pooja Ramteke _ Rahul Karale _ Seema Mohod _ Sachin Nimbokar(MP3_160K)_1.wav");
                          }
                          else if(c1==4){
                           System.out.println("Shreya Ghoshal Paus Ha Tujha Ni Majha Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Shreya Ghoshal\\\\Paus Ha Tujha Ni Majha _ Poetic Video _ Sonalee Kulkarni _ Sagar Patil_Prajakta Shenai_Gauri Sarnaik(MP3_160K)_1.wav"); 
                          }
                          else if(c1==5){
                            System.out.println("Shreya Ghoshal Sajana Re Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Shreya Ghoshal\\\\Sajana Re _ Karaar _ Subodh Bhave _ Urmila Kothare _ Shreya Ghoshal _ Jasraj Joshi(MP3_160K)_1.wav");
                            }
                           else if(c1==6){
                           b2=1;
                        }
                          }
                      }
                      else if(c.equals("4")||c.equals("AA"))
                      {   
                          int b2=0;
                           while(b2==0){
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪list of Aarya Ambekar songs♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("\t\t\t\t\t1.Sarivar Sar"); 
                           System.out.println("\t\t\t\t\t2.Jara Jara"); 
                           System.out.println("\t\t\t\t\t3.Ka Mann He"); 
                           System.out.println("\t\t\t\t\t4.Kitida Navyane"); 
                           System.out.println("\t\t\t\t\t5.O Sajna"); 
                           System.out.println("\t\t\t\t\t6.Exit");
                           System.out.println("\t\t\t\t\t♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪♪"); 
                           System.out.println("Select the song you want to play:");
                           int c1=sc.nextInt();
                           if(c1==1){
                            System.out.println("Aarya Ambekar Sarivar Sar Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Aarya Ambekar\\\\4.Sarivar Sar – Sandeep Khare(MP3_160K)_1.wav");    
                           }
                           else if(c1==2){
                            System.out.println("Aarya Ambekar Jara Jara Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Aarya Ambekar\\\\Jara Jara _ Ti Saddhya Kay Karte _ Abhinay Berde_ Arya Ambekar _ Isha Phadke _ Nilesh Moharir(MP3_160K)_1.wav");    
                           }
                          else if(c1==3){
                            System.out.println("Aarya Ambekar Ka Mann He Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Aarya Ambekar\\\\Ka Mann He - Full Video _ Readymix _ Vaibhav Tatwawaadi _ Prarthana Behere _ Arya Ambekar _ Farhad B(MP3_160K)_1.wav");    
                          }
                          else if(c1==4){
                           System.out.println("Aarya Ambekar Kitida Navyane Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Aarya Ambekar\\\\Kitida Navyane Music Video _ Ti Sadhya Kay Karte _ Ankush Chaudhari _Aarya Ambekar_Tejashree Pradhan(MP3_160K)_1.wav");    
                          }
                          else if(c1==5){
                            System.out.println("Aarya Ambekar O Sajna Song:");
                            System.out.println("Song are playing.");
                            playMusic("Music\\\\Aarya Ambekar\\\\O Sajna _ Atumgiri _ Hansraj Jagtap _ Rajeshwari Kharat _ Arya Ambekar _ P. Shankaram(MP3_160K)_1.wav");    
                            }
                          else if(c1==6){
                           b2=1;
                        }
                           
                          }
                      }
                      else if(c.equals("5")||c.equals("Exit"))
                      {   
                          b1=1;
                         
                      }
                   }
                    break;
                }
                case 4:{
                  b=1;
                  break;
                }
               default:{
                   System.out.println("Invalid Option.");
                }
            }
        }
    }
}

public class My_music {
    private static Object clip;
    public static void main(String[] args){
       System.out.println("♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫ Music Player ♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫");
       System.out.println("");
       mymusic m=new mymusic();
       m.songs();
       System.out.println("");
       System.out.println("♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫");
       
    }
        
public static void playMusic(String filepath){
      Scanner sc=new Scanner(System.in);
    try{
        long clipTimePostion = 0;
        int n=0;
        File music = new File(filepath);
        AudioInputStream audio = AudioSystem.getAudioInputStream(music);
        Clip clip=AudioSystem.getClip();
        clip.open(audio);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        while(n==0){
        System.out.println("\t\t\t\t\t♫♫♫♫♫♫♫♫♫♫Media Player♫♫♫♫♫♫♫♫♫♫");
        System.out.println(" \t\t\t\t\t\t1.Pause(P)");
        System.out.println(" \t\t\t\t\t\t2.Resume(R)");
        System.out.println(" \t\t\t\t\t\t3.Stop(S)");
        System.out.println("\t\t\t\t\t♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫♫");
        System.out.print("Select the Option:");
        String b=sc.next();
        if(b.equals("P")||b.equals("p")||b.equals("1")){
        clipTimePostion=clip.getMicrosecondPosition();
        clip.stop();
        }
        else if(b.equals("R")||b.equals("r")||b.equals("2")){ 
        clip.setMicrosecondPosition(clipTimePostion);
        clip.start();
        }
        else if(b.equals("S")||b.equals("s")||b.equals("3"))
        {
        n=1;
        clip.stop();
        }
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error");
    }
  }
}