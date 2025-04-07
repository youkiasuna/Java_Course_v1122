import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Mid3 {

   public static void followRight(Robot arg)
   {
      arg.turnLeft();
      arg.turnLeft();
      while(arg.nextToABeeper())
      {
         if(arg.rightIsClear())
         {
            arg.turnLeft();
            arg.turnLeft();
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
         }
      }
   }
   
   public static void followLeft(Robot arg)
   {
      arg.turnLeft();
      arg.turnLeft();
      while(arg.nextToABeeper())
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
   }
   
   public static void followWallsRight(Robot arg)
   {
      int counter = 0;
      while(arg.nextToABeeper() && counter < 9)
      {
         if(arg.rightIsClear())
         {
            arg.turnLeft();
            arg.turnLeft();
            arg.turnLeft();
            arg.move();
            counter++;
         }
         else if(arg.frontIsClear())
         {
            arg.move();
         }
         else
         {
            arg.turnLeft();
         }
      }
   }


	public static void main(String[] args) {
		Display.openWorld("../mop.map");
      Display.setSpeed(10);
      Robot bot = new Robot(1, 1, Display.EAST,  Display.INFINITY);
      
      for(int i = 0;i < 10; i++)
      {
         //System.out.println(i);
         while(bot.frontIsClear() && !bot.nextToABeeper())
         {
            bot.putBeeper();
            bot.move();
         }
         bot.putBeeper();
         if(bot.facingEast() && i < 9)
         {
            followRight(bot);
            bot.turnLeft();
            bot.turnLeft();
            bot.turnLeft();
            
            while(bot.frontIsClear())
            {
               bot.move();
            }
            bot.turnLeft();
            bot.turnLeft();
         }
         else if(bot.facingWest() && i != 9)
         {
            followLeft(bot);
            bot.turnLeft();
            while(bot.frontIsClear())
            {
               bot.move();
            }
            bot.turnLeft();
            bot.turnLeft();
         }
      }
      followWallsRight(bot);
   }
}
