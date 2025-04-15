//package Lab04;
   import javax.swing.*;
   import edu.fcps.Bucket;
public class Driver04{
   public static void main(String args[])
   {
      JFrame frame = new JFrame("Buckets");
      frame.setSize(600, 400);
      frame.setLocation(100, 100);   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(10);
      Bucket.useTotal(false);
      Bucket five = new Bucket(5);
      Bucket three = new Bucket(3);
      
      five.fill();//50
      five.pourInto(three);//23
      three.spill();//20
      five.pourInto(three);//02
      five.fill();//52
      five.pourInto(three);//43    
      
   }
   

}