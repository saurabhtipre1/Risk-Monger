public class Maingamer
{    
    public static void main(String args[])
    {
        Gamer e1;
        GameException e2;
        Timers e3;
        Randomr e4;
        Instructions e5;
        Scorefile e6;
        e1=new Gamer();
        e2=new GameException("");
        e3=new Timers();
        e4=new Randomr();
        e5=new Instructions();
        e6=new Scorefile();
        e1.main();
        e3.run();
        e4.main1();
        e5.gameInfo();
        try{
        e6.mainx();
         }catch(Exception e){System.out.println("EXCEPTION OCCURED!!!");}
    }
}