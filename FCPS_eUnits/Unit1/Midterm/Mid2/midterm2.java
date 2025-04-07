
   import edu.fcps.karel2.Display;
    public class midterm2
   {
       public static void main(String[] args)
      {
         Display.openWorld("../maps/Mid2.map");
         Display.setSize(20, 20);
         Display.setSpeed(8);
      
         Thread t1 = new Thread( new Shifter(1) );

         Dancer dancer = new SquareDancer(8,8,Display.EAST,0);
      
         t1.start();

         new Thread(dancer).start();

      }
   }