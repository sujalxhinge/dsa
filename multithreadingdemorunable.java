class multithread implements Runnable
{
    public void run()
    {
 try
 {
   System.out.println(
    "Thread "+Thread.currentThread().getId()+" is running"
   );
 }
 catch(Exception e)
 {
    System.out.println("Exception is handled succefully");
 }
    
}
}
public class multithreadingdemorunable 
{
    public static void main(String[] args)
    {
        int n = 8;
        for (int i = 0; i < n; i++) 
        {
            multithread m = new multithread();
            Thread t = new Thread(m);
            t.start();
        }
    }
}
