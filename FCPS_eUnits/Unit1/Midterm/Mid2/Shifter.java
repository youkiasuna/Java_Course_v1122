	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
   	/*********************************
   	 *                               *
   	 * What methods must you define? *
   	 *                               *
   	 *********************************/
      @Override
      public void workCorner()
      {
      
      }
      @Override
      public void moveOneBlock()
      {

      }
      @Override
      public void turnToTheRight()
      {

      }
      @Override
      public void turnToTheNorth()
      {

      }
      @Override
      public void run()
      {
         int[] counterAry = new int[10];
         for(int i=0;i<counterAry.length;i++){
            while(nextToABeeper()){
               pickBeeper();
               counterAry[i]++;
            }
            if(i>0){
               for(int j=0;j<counterAry[i-1];j++){
                  putBeeper();
               }
            }
            move();
         
         }
         turnLeft();
         move();
         turnLeft();
         while(!nextToABeeper()){
               move();
         }

         int[] counterAry2 = new int[10];
         for(int i=0;i<counterAry2.length;i++){
            while(nextToABeeper()){
               pickBeeper();
               counterAry2[i]++;
            }
            if(i>0){
               turnLeft();turnLeft();move();move();
               for(int j=0;j<counterAry2[i-1];j++){
                  putBeeper();
               }
               turnLeft();turnLeft();move();move();
            }
            move();
         
         } 

      }
      

   }