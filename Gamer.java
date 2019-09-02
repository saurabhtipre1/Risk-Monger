import java.util.*;
import java.util.Scanner;
public class Gamer
{
    Scanner sc=new Scanner(System.in);
    int diceno,counter,i;
    boolean flag=true;
    ArrayList nos;
    int decision;
    String droll;
    String qn="You have encountered a question....Do you want to take the risk to answer the question..Type yes or no?";
    String choice="Enter the correct answer among the choices";
    String yes="yes";
    String correct="You are correct!!!Good for you",wrong="Oops!!!You entered the wrong choice";
    String promote="Now you have been promoted to the position:";
    String demote="Now you have been demoted to the position:";
    String retreat="Lost courage bro??Be risky to enjoy whiskey.You have been retreated to the position";
    public Gamer()
    {
        nos=new ArrayList(36);
        
    }
    
    public  void main()
    {
         
         Instructions duet;
         duet=new Instructions();
         duet.gameInfo();
         Randomr magic;
         Randomr magic1;
         
         magic=new Randomr();
         magic1=new Randomr();
         
         magic.main1();
         droll=sc.nextLine();
         
         if(droll.equals("roll"))
         {
             counter=magic1.getRandomInteger(5,1);
       
        
             System.out.println("You got number: "+counter+" on the dice"+"\n"+"Now you are at position: "+counter);
        
             i=counter;
         }

        
         while(flag)
         {   
             
             Randomr magik;
             Randomr magik1;
             magik=new Randomr();
             magik1=new Randomr();
                    if(i%4!=0)
                {   
                 if(i>36)
                  {break;}
        
                 magik.main1();
                 droll=sc.nextLine();
                 if(droll.equals("roll"))
                 {
                     diceno=magik1.getRandomInteger(5,1);
                     i+=diceno;
                     System.out.println("You got number: "+diceno+" on the dice ");
        
                     System.out.println("Now you are at position :"+i);
                  }
                  else{
                      try{
                      throw new GameException("");
                    }catch(GameException e){System.out.println("Please enter 'roll' as asked to");}
                    }
                  }

       if(i==4)
       {
           Timers objj=new Timers();// \b ain't working in BlueJ
           Thread t=new Thread(objj);
         
           nos.add(i);
       
           System.out.println(qn);
           String yon=sc.nextLine();
           if(yon.equals(yes))
           {
               System.out.println("Who invented Java ?"+"\n"+"A:Saurabh Tipre"+"\n"+"B:Sahil Jagnade"+"\n"+"C:Yugandhar Mankar"+"\n"+"D:James Gosling");
               
               t.start();
            
               System.out.println(choice);
               String b=sc.nextLine();
               
               t.stop();
             
                if(b.equals("D") || b.equals("d"))
                {
                    
                    System.out.println(correct);
                    i+=3;
                    System.out.println(promote+" "+i);
                }
                else if(b.equals("A") || b.equals("a") || b.equals("B") || b.equals("b") || b.equals("C") || b.equals("c")){
                    System.out.println(wrong);
                    i-=3;
                    System.out.println(demote+" "+i);
                }
                else{
                    decision=1;
                }
                        
}

            else{
                    i-=2;
                    System.out.println(retreat+" "+i);
            }
                
    
       
        }
         
        if(i==8)
         
          
       {
           Timers objj=new Timers();
           Thread t=new Thread(objj);
           nos.add(i);
           System.out.println(qn);
           String yon=sc.nextLine();
           if(yon.equals(yes))
           {
               
               System.out.println("After which tree was JAVA initially named ?"+"\n"+"A:Sal"+"\n"+"B:Teak"+"\n"+"C:Oak"+"\n"+"D:Pine");
               
               t.start();
               System.out.println(choice);
           
               String b=sc.nextLine();
               t.stop();
                if(b.equals("C") || b.equals("c"))
                {
                    
                    System.out.println(correct);
                    i+=2;
                    System.out.println(promote+" "+i);
                }
            else if(b.equals("D") || b.equals("d") || b.equals("A") || b.equals("a") || b.equals("B") || b.equals("b")){
                    System.out.println(wrong);
                    i-=1;
                    System.out.println(demote+" "+i);
                }
                else{decision=1;}
}

            else{
                    i-=2;
                    System.out.println(retreat+" "+i);
            }
}

if(i==12){
         
           Timers objj=new Timers();
           Thread t=new Thread(objj);
           nos.add(i);
       
           System.out.println(qn);
           String yon=sc.nextLine();
           if(yon.equals(yes))
           {
               
               System.out.println("Which one of these lists contains only Java programming language keywords?"+"\n"+"A:class, if, void, long, Int, continue"+"\n"+"B:goto, instanceof, native, finally, default, throws"+"\n"+"C:try, virtual, throw, final, volatile, transient"+"\n"+"D:strictfp, constant, super, implements, do");
               
               t.start();
               System.out.println(choice);
               
               String b=sc.nextLine();
               t.stop();
                if(b.equals("B") || b.equals("b"))
                {
                   
                    System.out.println(correct);
                    i+=4;
                    System.out.println(promote+" "+i);
                }
            else if(b.equals("D") || b.equals("d") || b.equals("A") || b.equals("a") || b.equals("C") || b.equals("c")){
                    System.out.println(wrong);
                    i-=1;
                    System.out.println(demote+" "+i);
                }
                    else{decision=1;}
    

}
            else{
                    i-=2;
                    System.out.println(retreat+" "+i);
            }
}
if(i==16){
            Timers objj=new Timers();
            Thread t=new Thread(objj);
            nos.add(i);
         
          
       
            System.out.println(qn);
            String yon=sc.nextLine();
           if(yon.equals(yes))
           {
               
               System.out.println("Which is a reserved word in the Java programming language?"+"\n"+"A:method"+"\n"+"B:subclass"+"\n"+"C:native"+"\n"+"D:reference");
               
               t.start();
               System.out.println(choice);
           
               String b=sc.nextLine();
               t.stop();
                if(b.equals("C") || b.equals("c"))
                {
                
                System.out.println(correct);
                i+=1;
                System.out.println(promote+" "+i);
            }
            else if(b.equals("D") || b.equals("d") || b.equals("A") || b.equals("a") || b.equals("B") || b.equals("b")){
                System.out.println(wrong);
                i-=1;
                System.out.println(demote+" "+i);
            }
                else{decision=1;}
    
}

            else{
                i-=2;
                System.out.println(retreat+" "+i);
            }
}
if(i==20){
            Timers objj=new Timers();
            Thread t=new Thread(objj);
            nos.add(i);
         
          
       
           System.out.println(qn);
           String yon=sc.nextLine();
           if(yon.equals(yes))
           {
               
           System.out.println("What is static block? "+"\n"+"A:It is used to create synchronized code"+"\n"+"B:There is no such block"+"\n"+"C:It is used to initialize the static data member.It is executed before main method at the time of class loading."+"\n"+"D:None of the above");
           
           t.start();
           System.out.println(choice);
           
           String b=sc.nextLine();
           t.stop();
                if(b.equals("C") || b.equals("c"))
                {
                
                System.out.println(correct);
                i+=2;
                System.out.println(promote+" "+i);
            }
            else if(b.equals("D") || b.equals("d") || b.equals("A") || b.equals("a") || b.equals("B") || b.equals("b")){
                System.out.println(wrong);
                i-=1;
                System.out.println(demote+" "+i);
            }
                else{decision=1;}
    
}

            else{
                i-=2;
                System.out.println(retreat+" "+i);
            }
}
if(i==24){
            Timers objj=new Timers();
            Thread t=new Thread(objj);
            nos.add(i);
         
          
       
            System.out.println(qn);
            String yon=sc.nextLine();
           if(yon.equals(yes))
           {
           
           System.out.println(" Multiple inheritance means:"+"\n"+"A:one class inheriting from more super classes"+"\n"+"B:more classes inheriting from one super class"+"\n"+"C:more classes inheriting from more super classes"+"\n"+"D:Both A and B");
           
           t.start();
           System.out.println(choice);
           
           String b=sc.nextLine();
           t.stop();
                if(b.equals("A") || b.equals("a"))
                {
                    
                System.out.println(correct);
                i+=4;
                System.out.println(promote+" "+i);
            }
            else if(b.equals("D") || b.equals("d") || b.equals("C") || b.equals("c") || b.equals("B") || b.equals("b")){
                System.out.println(wrong);
                i-=1;
                System.out.println(demote+" "+i);
            }
                else{decision=1;}
    
}

            else{
                i-=2;
                System.out.println(retreat+" "+i);
            }
}
if(i==28){
            Timers objj=new Timers();
            Thread t=new Thread(objj);
            nos.add(i);
         
          
       
           System.out.println(qn);
           String yon=sc.nextLine();
           if(yon.equals(yes))
           {
           System.out.println("Which of the following is true? "+"\n"+"A:A finally block is executed before the catch block but after the try block."+"\n"+"B:A finally block is executed, only after the catch block is executed."+"\n"+"C:A finally block is executed, only if an exception occurs."+"\n"+"D: A finally block is executed whether an exception is thrown or not.");
           
           
           t.start();
           System.out.println(choice);
           
           String b=sc.nextLine();
           t.stop();
                if(b.equals("D") || b.equals("d"))
                {
                
                System.out.println(correct);
                i+=3;
                System.out.println(promote+" "+i);
            }
            else if(b.equals("C") || b.equals("c") || b.equals("A") || b.equals("a") || b.equals("B") || b.equals("b")){
                System.out.println(wrong);
                i-=1;
                System.out.println(demote+" "+i);
            }
                else{decision=1;}
    
}

            else{
                i-=2;
                System.out.println(retreat+" "+i);
            }
}
if(i==32)
         
          
       {
           Timers objj=new Timers();
           Thread t=new Thread(objj);
           nos.add(i);
           System.out.println(qn);
           String yon=sc.nextLine();
           if(yon.equals(yes))
           {
           System.out.println("The correct order of the declarations in a Java program is,"+"\n"+"A:Package declaration, import statement, class declaration"+"\n"+"B:Import statement, package declaration, class declaration"+"\n"+"C:Import statement, class declaration, package declaration"+"\n"+"D:Class declaration, package declaration, import statement.");
           
           t.start();
           System.out.println(choice);
           
           String b=sc.nextLine();
           t.stop();
                if(b.equals("A") || b.equals("a"))
                {
                    
                System.out.println(correct);
                i+=4;
                System.out.println(promote+" "+i);
            }
            else if(b.equals("D") || b.equals("d") || b.equals("C") || b.equals("c") || b.equals("B") || b.equals("b")){
                System.out.println(wrong);
                i-=1;
                System.out.println(demote+" "+i);
    
}
}

            else{
                i-=2;
                System.out.println(retreat+" "+i);
            }
}
if(i==36)
         
          
       {
           Timers objj=new Timers();
           Thread t=new Thread(objj);
           nos.add(i);
           System.out.println(qn);
           String yon=sc.nextLine();
           if(yon.equals(yes))
           {
           System.out.println("Which methods are provided by the PrintStream class?"+"\n"+"A:Read data to another stream"+"\n"+"B:Write data to another stream"+"\n"+"C:Read data to same stream"+"\n"+"D:Write data to same stream.");
             
           t.start();
           System.out.println(choice);
           
           String b=sc.nextLine();
           t.stop();
                if(b.equals("A") || b.equals("a"))
                {
                    
                    System.out.println(correct);
                i+=4;
                System.out.println(promote+" "+i);
                
                break;
            }
            else if(b.equals("D") || b.equals("d") || b.equals("C") || b.equals("c") || b.equals("B") || b.equals("b")){
            
                System.out.println(wrong);
                i-=1;
                System.out.println(demote+" "+i);
            }
}

            else{
                i-=2;
                System.out.println(retreat+" "+i);
            }
}
    if(decision == 1){
        decision=0;
         try{
         throw new GameException("");
        }catch(GameException e1){System.out.println("Please enter valid opton a,b,c,d");}
    }
}
        
         Scorefile fl;
         fl=new Scorefile();
         try{
             fl.mainx();
            }catch(Exception etr){}
         
    
}
}





    
        
            
    
    