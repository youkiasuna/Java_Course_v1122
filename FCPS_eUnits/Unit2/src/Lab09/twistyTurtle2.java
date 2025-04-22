package Lab09;

import edu.fcps.Turtle;

public class twistyTurtle2 extends Turtle
{
   private int startLength;
   private int endLength;
   private int turnAngle = 30;
   private int lengthIncrement = 2;

   public twistyTurtle2()
   {
      super();
      startLength = 0;
      endLength = 150;
   }

   public twistyTurtle2(int start, int end)
   {
      startLength = start;
      endLength = end;
   }

   public twistyTurtle2(double x, double y, double heading, int start, int end)
   {
      super(x, y, heading);
      startLength = start;
      endLength = end;
   }

   public void drawShape()
   {
      for (int length = startLength; length < endLength; length += lengthIncrement)
      {
         forward(length);
         turnRight(turnAngle);
      }
   }
}
