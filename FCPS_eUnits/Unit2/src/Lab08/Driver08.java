package Lab08;
	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
      
      	JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(700, 700);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.WHITE);
         
         FlowerTurtle smidge = new FlowerTurtle(100, 45, Color.RED);
         smidge.setThickness(3);
         smidge.drawShape();
         
         smidge = new FlowerTurtle(250, 45, Color.YELLOW);
         smidge.setThickness(3);
         smidge.drawShape();
         
         smidge = new FlowerTurtle(400, 45, Color.BLUE);
         smidge.setThickness(3);
         smidge.drawShape();
         
         smidge = new FlowerTurtle(550, 45, Color.BLACK);
         smidge.setThickness(3);
         smidge.drawShape();
      
      }
   }