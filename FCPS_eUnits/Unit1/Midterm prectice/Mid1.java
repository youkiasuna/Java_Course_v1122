import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Mid1
{
   public static void main(String[] args)
   {
      Display.openDefaultWorld();
      Display.setSize(36, 32);
      Display.setSpeed(10);
      
      new Thread(new E(2, 9)).start();
      new Thread(new E(8, 9)).start();
      new Thread(new dash(14, 9)).start();
      new Thread(new Three(21, 9)).start();
      new Thread(new Zero(28, 9)).start();
   }
}