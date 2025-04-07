import edu.fcps.Digit;
import edu.fcps.karel2.Robot;

public class E extends Digit implements Runnable
{
   public E(int x, int y)
   {
      super(x, y);
   }
   
   public void display()
   {
      segment1_On();
      segment2_Off();
      segment3_Off();
      segment4_On();
      segment5_On();
      segment6_On();
      segment7_On();
   }
   public void run()
   {
      display();
   }
} 
