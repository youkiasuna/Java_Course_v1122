package Lab09;
	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver09
   {
      public static void main(String[] args)
      {
      
      	JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(400, 400);
         frame.setLocation(300, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.WHITE);
         
         SpiralTurtle bob1 = new SpiralTurtle(100, 250, 90, 10, 200);
         bob1.drawShape();
         
         twistyTurtle2 bob2 = new twistyTurtle2(500, 350, 180, 0, 90);
         bob2.drawShape();
         
         twistyTurtle3 bob3 = new twistyTurtle3(300, 150, 180, 50, 130);
         bob3.drawShape();
      }
   }