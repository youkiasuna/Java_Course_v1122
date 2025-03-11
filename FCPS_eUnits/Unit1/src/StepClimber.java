   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;  
   public class StepClimber extends Climber
   {
      public StepClimber()
      {
         //super(1, 1, Display.NORTH, Display.INFINITY);
      }
      public StepClimber(int x)
      {
         //super(x, 1, Display.NORTH, 1);
         super(x);
      }
      public void climbUpRight()
      {
         turnLeft();
         move();
         turnRight();
         move();
      }
      public void climbDownRight()
      {
         move();
         turnRight();
         move();
         turnLeft();        
      }
      public void climbUpLeft()
      {
         turnRight();
         move();
         turnLeft();
         move();       
      }
      public void climbDownLeft()
      {
         move();
         turnLeft();
         move();
         turnRight();
      }
   }