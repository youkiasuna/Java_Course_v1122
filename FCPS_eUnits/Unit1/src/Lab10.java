import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab10 {

   public static void main(String[] arg) {
      //Display.openWorld("../maps/maze1.map");
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("../maps/"+filename+".map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      Athlete eason = new Athlete();
      
      while(!eason.nextToABeeper()){
         if(eason.rightIsClear()){
            eason.turnRight();
         }
         if(eason.frontIsClear()){
            eason.move();
         }
         if(!eason.frontIsClear() && !eason.rightIsClear()){
            eason.turnLeft();
         }
      }
   }
}
            