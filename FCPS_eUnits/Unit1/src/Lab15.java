import edu.fcps.karel2.Display;

public class Lab15 {

   public static void main(String[] arg) {

      Display.setSize(15,15);
      Display.setSpeed(10);
      Dancer dancer1 = new BackAndForthDancer(3,6,Display.EAST,0);
      Dancer dancer2 = new SquareDancer(8,10,Display.EAST,0);
      Dancer dancer3 = new BigSquareDancer(9,7,Display.NORTH,0);
      
      new Thread(dancer1).start();
      new Thread(dancer2).start();
      new Thread(dancer3).start();
      
   }
}