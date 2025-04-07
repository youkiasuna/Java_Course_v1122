import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class midterm1
{
   public static void main(String[] args)
   {
      Display.openDefaultWorld();
      Display.setSize(32, 34);
      Display.setSpeed(10);
      
      new Thread(new E(2, 20)).start();
      new Thread(new E(8, 20)).start();
      new Thread(new C(14, 20)).start();
      new Thread(new S(20, 20)).start();
      
      new Thread(new dash(8, 9)).start();
      new Thread(new Three(14, 9)).start();
      new Thread(new Zero(20, 9)).start();
   }
}