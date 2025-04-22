package Lab09;

import edu.fcps.Turtle;

public class twistyTurtle3 extends Turtle
{
   private int startLength;
   private int endLength;
   private int turnAngle = 45;
   private int lengthIncrement = 5;

   public twistyTurtle3()
   {
      super();
      startLength = 25;
      endLength = 150;
   }

   public twistyTurtle3(int start, int end)
   {
      startLength = start;
      endLength = end;
   }

   public twistyTurtle3(double x, double y, double heading, int start, int end)
   {
      super(x, y, heading);
      startLength = start;
      endLength = end;
   }

   public void drawShape()
   {
      for (int length = startLength; length < endLength; length += lengthIncrement)
      {
         for (int i = 0; i < 4; i++)
         {
            forward(length);
            turnRight(90);
         }
         turnRight(turnAngle);
      }
   }
}
