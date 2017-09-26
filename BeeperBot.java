
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    //instance variable to store beeper count
    int[] beeperList = new int[14];
    int tempCount = 0;
    int columnNumber = 0;
    
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAndCountBeepers() {
            while(frontIsClear()) {
            collectBeepers();
        }
    }
    
    public void collectBeepers() {
        faceEast();
        findABeeperColumn();
        collectColumn();
        returnToFloor();
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
            }
    }
    
    public void findABeeperColumn() {
        move();
        columnNumber++;
        turnLeft();
    }
    
    public void collectColumn() {
        while(nextToABeeper()) {
            pickBeeper();
            tempCount++;
            move();
        }
        turnLeft();
        turnLeft();
        beeperList[columnNumber] = tempCount;
        tempCount = 0;
    }
    
    public void returnToFloor() {
        while(frontIsClear()) {
            move();
        }
        turnLeft();
    }
    
    public int[] getBeeperList() {
            //This will be used to print the beepers found.  No need to modify.
            return beeperList;
    }
   
}

