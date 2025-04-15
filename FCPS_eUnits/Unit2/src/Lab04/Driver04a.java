//package Lab04;
   import javax.swing.*;
   import edu.fcps.Bucket;
public class Driver04a{
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
      Bucket three = new Bucket(3);
      
      three.fill();//30
      three.pourInto(five);//03
      three.fill();//33
      three.pourInto(five);//15
      five.spill();//10
      five.fill();//15
      three.spill();//05
      five.pourInto(three);//32    
      three.spill();//02
      five.pourInto(three);//20
      five.fill();//25
      five.pourInto(three);//34
      three.spill();//04
      five.fill();//05
      three.fill();//35
      
   }
   

}