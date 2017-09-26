
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void sortBeepers() {
        reposition();
        for (int i=0; i<10; i++) {
            orderRow();
        }
    }
    
    public void reposition() {
        move();
        turnRight();
        move();
        move();
        turnRight();
    }
    
    public void orderRow() {
       for (int i=0; i<8; i++) {
            if(nextToABeeper()) {
                pickBeeper();
            }
            move();
        } 
       returnToWall();
    }
    
    public void returnToWall() {
       turnLeft();
       turnLeft();
       move();
       for (int i=0; i<8; i++) {
            if(anyBeepersInBeeperBag()) {
                putBeeper();
            }
            if(frontIsClear()) {
                move();
            }
       }
       turnLeft();
       if(!frontIsClear()) {
           turnOff();
       }
       move();
       turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

