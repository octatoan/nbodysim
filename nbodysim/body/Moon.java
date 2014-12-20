/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbodysim.body;

import nbodysim.math.Constants;
import nbodysim.math.Vector;

/**
 *
 * @author hamso
 */
public class Moon extends Body {

    static final double K = 384400000;

    public Moon() {
        super(Constants.MOON_MASS,
                Constants.MOON_RAD,
                new Vector(0, -1011.805),
                new Vector(2 * K, K));
    }

}
