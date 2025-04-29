   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
   
   public class ProjectPanel extends JPanel {
       private static final Color BACKGROUND = new Color(204, 204, 204);
       private static final ImageIcon THOMAS = new ImageIcon("tj.jpg");
       private BufferedImage myImage;
       private Graphics2D myBuffer;
       private int xPos = 250;
       private int yPos = 180;
       private Timer t1;
       private Timer t2;
   
       public ProjectPanel() {
           xPos = 50;
           myImage = new BufferedImage(700, 500, BufferedImage.TYPE_INT_RGB);
           myBuffer = (Graphics2D) myImage.getGraphics();
           t1 = new Timer(120, new Listener1());
           t2 = new Timer(3000, new Listener2());
           t1.start();
   
           myBuffer.setColor(BACKGROUND);
           myBuffer.setFont(new Font("serif", Font.PLAIN, 20));
           myBuffer.setStroke(new BasicStroke(10.0f));
           myBuffer.fillRect(0, 0, 700, 500);
       }
   
       public void paintComponent(Graphics g) {
           g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
       }
   
       private class Listener1 implements ActionListener {
           @Override
           public void actionPerformed(ActionEvent e) {
               int xPoints[] = { xPos, xPos, xPos + 50, xPos , xPos - 50, xPos,
                                 xPos, xPos - 50, xPos, xPos + 50};
               int yPoints[] = { yPos, yPos + 50, yPos, yPos + 50, yPos,
                                 yPos + 50, yPos + 100, yPos + 150, yPos + 100, yPos + 150 };
   
               myBuffer.setColor(Color.gray);
               myBuffer.fillRect(0, 0, 700, 350);
   
               myBuffer.setColor(Color.darkGray);
               myBuffer.fillRect(0, 335, 700, 500);
   
               myBuffer.drawImage(THOMAS.getImage(), xPos - 40, 50, 75, 125, null);
   
               myBuffer.setStroke(new BasicStroke(10.0f));
               myBuffer.drawPolyline(xPoints, yPoints, 10);
   
               repaint();
               xPos = xPos + 5;
   
               if (xPos > 200) {
                   myBuffer.setFont(new Font("Monospaced", Font.BOLD, 15));
                   myBuffer.drawString("What dog can jump higher than a building?", 270, 130);
                   myBuffer.drawOval(250, 80, 400, 100);
                   repaint();
                   t1.stop();
                   t2.start();
               }
           }
       }
   
       private class Listener2 implements ActionListener {
           @Override
           public void actionPerformed(ActionEvent e) {
               t2.stop();
               myBuffer.setFont(new Font("Monospaced", Font.BOLD, 15));
               myBuffer.drawString("Anydog, buildings can't jump!", 320, 250);
               myBuffer.drawOval(280, 190, 400, 130);
               repaint();
           }
       }
   }
