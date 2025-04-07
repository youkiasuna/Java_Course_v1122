public class SquareDancer2 extends SquareDancer{

   public SquareDancer2(int x,int y,int dir,int beep){
      super(x, y, dir, beep);
   }
   
   public SquareDancer2(){
   }
   
   @Override
   public void danceStep(){
      for(int i=0;i<4;i++){
         move();
         turnLeft();
      }
   }
}