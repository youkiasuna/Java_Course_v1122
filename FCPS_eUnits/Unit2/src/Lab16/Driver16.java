import javax.swing.JFrame;
    public class Driver16
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit,Lab16");
         frame.setSize(400, 400);
         frame.setLocation(100, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new PrizePanel());
         frame.setVisible(true);
      }
   }