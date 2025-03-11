import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class Lab09{
   
   public static void main(String[] args){
      String filename = JOptionPane.showInputDialog("What robot world?");
      Display.openWorld("../maps/"+filename+".map");
      Display.setSize(10,10);
      Athlete Lisa = new Athlete(1,1,Display.EAST,0);
      int[] counterAry = new int[10];
      for(int i=0;i<counterAry.length;i++){
         //Lisa.move();
         while(Lisa.nextToABeeper()){
            Lisa.pickBeeper();
            counterAry[i]++;
         }
         if(i>0){
            for(int j=0;j<counterAry[i-1];j++){
               Lisa.putBeeper();
            }
         }
         Lisa.move();
         
      } 
   }
}