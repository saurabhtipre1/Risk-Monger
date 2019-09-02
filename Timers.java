class Timers implements Runnable
{   

    public void run()
    {
        
        for(int ij=10;ij>=1;ij--)
        {
            try{
                Thread.sleep(1000);
            }catch(Exception z){}
            System.out.println(ij+"\n");
            
        }
        System.out.println("Timeout!!!");
        System.out.print("Lost time is gone forever!Not in this case");
    }

}

