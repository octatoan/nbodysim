/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbodysim.body;

import nbodysim.math.Constants;
import nbodysim.body.Body;
import nbodysim.math.Vector;

/**
 *
 * @author hamso
 */
public class Earth extends Body {
    static final double K = 384400000;
    public Earth() {
        
        super(Constants.EARTH_MASS, 
              Constants.EARTH_RAD, 
              new Vector(0, 13.5),
              new Vector(K, K));
    }
    
}
