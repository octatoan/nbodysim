package nbodysim.plotters;

import nbodysim.BSystem;
import nbodysim.body.Earth;
import nbodysim.body.Moon;

/**
 *
 * @author hamso
 */
public class BSystemPlotter {
    void loop() {
        BSystem sys = new BSystem();
        sys.addBody(new Earth());
        sys.addBody(new Moon());
        
        while(true) {
            sys.updateEuler();
            
        }
    }
}
