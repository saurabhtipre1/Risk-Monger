/*import java.io.BufferedWriter;
import java.io.Writer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
*/

import java.io.*;
class Scorefile extends Gamer
{   
    String dec,play;
    String name;
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader nom=new BufferedReader(read);
    Gamer o2;    
    Randomr magic2;
    public void writing()throws IOException
    {   
        magic2=new Randomr();
        double scoree;
        int k=4;
        int i=0,j;
        System.out.println("Please enter your name");
        name=nom.readLine();
            while(true)
            {
                System.out.println("Press 'save' to save your score");
                dec=nom.readLine();
                if(dec.equals("save")){
                break;}
            }
        
        try{
            scoree=magic2.getRandomInteger(48,35);
            File fl=new File("C:/STUDY MATERIAL/GameJava/scores.txt");
            FileOutputStream fos=new FileOutputStream(fl);
            OutputStreamWriter osr=new OutputStreamWriter(fos);
            Writer w=new BufferedWriter(osr);
            w.write("NAME"+"\t"+name+"\n");
            w.write("SCORE"+"\t"+scoree+"\n");
            w.close();
        }catch(IOException en){System.err.println("Problem writing to the file scores");}
           
    }
      
  public void mainx()throws Exception 
  { 
    writing();
    File file = new File("C:/STUDY MATERIAL/GameJava/scores.txt"); 
  
    BufferedReader br = new BufferedReader(new FileReader(file));
    String num;
    while ((num=br.readLine()) != null) 
    System.out.println(num+"\n");
    o2=new Gamer();
    System.out.println("Type 'play' to play another game with a different player or any other key to exit");
    play=nom.readLine();
          if(play.equals("play"))
          { 
            
            o2.main();
        
          }

        else{
            System.out.println("THANK YOU!!!");
            System.exit(0);
        }
  } 
 
}
  

  