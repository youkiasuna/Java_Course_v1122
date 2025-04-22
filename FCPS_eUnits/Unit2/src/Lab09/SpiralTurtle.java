package Lab09;
import edu.fcps.Turtle;

public class SpiralTurtle extends Turtle
{
   private int startLength;
   private int endLength;
   private int turnAngle = 125;
   private int lengthIncrement = 8;

   public SpiralTurtle()
   {
      super();
      startLength = 10;
      endLength = 400;
   }

   public SpiralTurtle(int start, int end)
   {
      startLength = start;
      endLength = end;
   }

   public SpiralTurtle(double x, double y, double heading, int start, int end)
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

