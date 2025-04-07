import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Mid2 {
   public static void followWallsLeft(Robot arg)
   {
      if(arg.leftIsClear())
      {
         arg.turnLeft();
         arg.move();
      }
      else if(arg.frontIsClear())
      {
         arg.move();
      }
      else
      {
         arg.turnLeft();
         arg.turnLeft();
         arg.turnLeft();
      }
   } 

	public static void main(String[] args) {
		Display.openWorld("../maps/school.map");
      Display.setSpeed(10);
      Robot bot1 = new Robot(1, 1, Display.EAST, 0);
      Robot bot2 = new Robot(4, 5, Display.EAST, 0);
		while(!bot1.nextToARobot())
      {
         followWallsLeft(bot1);
         if(bot1.nextToABeeper())
         {
            bot1.pickBeeper();
         }
      }
      bot1.putBeeper();
      bot2.pickBeeper();
      while(!bot2.nextToABeeper())
      {
         followWallsLeft(bot2);
      }
      bot2.putBeeper();
      while(bot2.nextToABeeper())
      {
         followWallsLeft(bot2);
      }
   }
}