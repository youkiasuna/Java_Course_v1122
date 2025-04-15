//package Lab04;
   import javax.swing.*;
   import edu.fcps.Bucket;
public class Driver04b{
   public static void main(String arg[]){
      JFrame frame = new JFrame("Buckets");
      frame.setSize(600, 400);
      frame.setLocation(100, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      
      Bucket.setSpeed(4);
      Bucket.useTotal(true);
      
      Bucket five = new Bucket(5);
      Bucket four = new Bucket(4);
      Bucket three = new Bucket(3);
      
      five.fill();//500  5
      five.pourInto(four);//140
      four.spill();//100  1
      five.pourInto(three);//001
      four.fill();//041
      five.fill();//541  10
      three.spill();//540  9
      four.spill();//500
      five.pourInto(three);//203 
      three.spill();//200  2
      five.pourInto(three);//002
      four.fill();//042  6
      five.fill();//542  11
      three.fill();//543  12
      three.spill();//540
      four.pourInto(three);//513
      four.spill();//503  8
      five.spill();//003  3
      four.fill();//043  7
      three.spill();//040  4
      five.spill();
      four.spill();//000
      
   }
   

}