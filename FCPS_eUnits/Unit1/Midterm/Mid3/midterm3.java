import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class midterm3 {

   public static void followRightUp(Robot arg)
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
   
   public static void followLeftUp(Robot arg)
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
   public static void followRightDown(Robot arg) {
      arg.turnLeft();
      arg.turnLeft();
      while(!arg.nextToABeeper())
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
   
   public static void followLeftDown(Robot arg) {
      arg.turnLeft();
      arg.turnLeft();
      while(!arg.nextToABeeper())
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
   
   
	public static void main(String[] args) {
		Display.openWorld("../../maps/mop.map");
      Display.setSpeed(10);
      Robot bot = new Robot(8, 1, Display.WEST,  Display.INFINITY);
      
      for(int i = 0;i < 10; i++)
      {
         System.out.println(i);
         while(bot.frontIsClear() && !bot.nextToABeeper())
         {
            bot.putBeeper();
            bot.move();
         }
         bot.putBeeper();
         if(bot.facingEast() && i < 9)
         {
            followRightUp(bot);
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
            followLeftUp(bot);
            bot.turnLeft();
            while(bot.frontIsClear())
            {
               bot.move();
            }
            bot.turnLeft();
            bot.turnLeft();
         }
      }
      
      bot.turnLeft();
      bot.turnLeft();
      for(int i = 0;i < 10; i++)
      {
         System.out.println(i);
         while(bot.frontIsClear() && bot.nextToABeeper())
         {
            bot.pickBeeper();
            bot.move();
         }
         bot.pickBeeper();
         if(bot.facingWest() && i < 9)
         {
            followRightDown(bot);
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
         else if(bot.facingEast() && i != 9)
         {
            followLeftDown(bot);
            bot.turnLeft();
            //bot.turnLeft();
            //bot.turnLeft();
            while(bot.frontIsClear())
            {
               bot.move();
            }
            bot.turnLeft();
            bot.turnLeft();
         }
      }
      bot.turnLeft();
      bot.turnLeft();
      //followWallsRight(bot);*/
   }
}
