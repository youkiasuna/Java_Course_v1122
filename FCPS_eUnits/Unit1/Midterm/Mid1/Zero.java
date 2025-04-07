import edu.fcps.Digit;
import edu.fcps.karel2.Robot;

public class Zero extends Digit implements Runnable
{
   public Zero(int x, int y)
   {
      super(x, y);
   }
   
   public void display()
   {
      segment1_On();
      segment2_On();
      segment3_On();
      segment4_On();
      segment5_On();
      segment6_On();
      segment7_Off();
   }
   public void run()
   {
      display();
   }
} 