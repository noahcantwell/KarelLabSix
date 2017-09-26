
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void buildFence() {
        faceNorth();
        findPile();
        findFence();
        layFence();
    }
    
    public void faceNorth() {
        while(!facingNorth) {
            turnLeft();
        }
    }
}

