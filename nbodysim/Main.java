package nbodysim;

import nbodysim.body.Earth;
import nbodysim.body.Moon;

/**
 * Well, it's called Main for a reason.
 * @author octatoan
 */
public class Main {
    public static void main(String[] args) {
        BSystem sys = new BSystem();
        
        sys.addBody(new Earth());
        sys.addBody(new Moon());
        
        while(true) {
            sys.updateEuler();
            if (sys.time % 1e5 == 0) {
                System.out.println("[time: " + sys.time
                                + "] earth: " + sys.getBody(0).pos 
                                + "; moon: " + sys.getBody(1).pos);
            }
        }
    }
}
