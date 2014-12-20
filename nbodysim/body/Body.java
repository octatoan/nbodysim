/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbodysim.body;

import nbodysim.math.Vector;

/**
 *
 * @author hamso
 */
public class Body {
    public double mass;
    public double rad;
    
    public Vector vel;
    public Vector pos;
    public Vector acc;
    public Vector _acc;

    public Body(double mass, double rad, Vector pos, Vector vel) {
        this.mass = mass;
        this.rad = rad;
        this.vel = vel;
        this.pos = pos;
        this.acc = new Vector();
        this._acc = new Vector();
    }

}
