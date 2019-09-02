
public class Randomr
{   
    public int rollno;
    public  void main1(){
        rollno=getRandomInteger(5,1);
        System.out.println("Type 'roll' to roll the dice");   
    }
    public  int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum; 
    }
}



