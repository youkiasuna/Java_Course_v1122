   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class BoxTopRacer extends Racer
   {
      public BoxTopRacer(int y)
      {
         //super(1, y, Display.EAST, Display.INFINITY);
         super(y);
      }
      public void jumpRight()
      {
         turnLeft();
         while(!rightIsClear()){
            move();
         }
         turnRight();
         move();
         while(!rightIsClear()){
            move();
         }
         turnRight();
         while(!frontIsClear()){
            move();
         }
         turnLeft();
      }
   }
