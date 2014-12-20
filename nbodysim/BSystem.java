package nbodysim;

import java.util.ArrayList;
import nbodysim.body.Body;
import nbodysim.math.MathF;
import nbodysim.math.Vector;

/**
 *
 * @author hamso
 */
public class BSystem {

    ArrayList<Body> bodies;
    double time = 0;
    int numBodies = 0;

    static final double TIMESTEP = 1.0;

    public BSystem() {
        this.bodies = new ArrayList<Body>();
    }
    
    public void addBody(Body body) {
        this.bodies.add(body);
        ++(this.numBodies);
    }

    public Body getBody(int index) {
        return bodies.get(index);
    }

    public void updateEuler() {
        Vector gravity = new Vector();
        Body first, second;

        for (int i = 0; i < numBodies; ++i) {
            for (int j = 0; j < numBodies; ++j) {
                if (i != j) {
                    first = this.getBody(i);
                    second = this.getBody(j);

                    first.acc = MathF.shrink(
                            MathF.gravitationalForce(first, second),
                            first.mass);
                    first.pos.incBy(MathF.scale(first.vel, TIMESTEP));
                    first.vel.incBy(MathF.scale(first.acc, TIMESTEP));
                }
            }
        }

        time += TIMESTEP;
    }

    public void updateVerlet() {
        Vector gravity = new Vector();
        Body first, second;

        for (int i = 0; i < numBodies; ++i) {
            for (int j = 0; j < numBodies; ++j) {
                if (i != j) {
                    //Update positions
                    first = this.getBody(i);
                    second = this.getBody(j);

                    first.acc = MathF.shrink(
                            MathF.gravitationalForce(first, second),
                            first.mass);
                    first.pos.incBy(MathF.scale(
                            MathF.add(first.vel, 
                                    MathF.scale(first.acc, TIMESTEP / 2)),
                            TIMESTEP));
                }
            }
            time += TIMESTEP;
        }

        for (int i = 0; i < numBodies; ++i) {
            for (int j = 0; j < numBodies; ++j) {
                if (i != j) {
                    first = this.getBody(i);
                    second = this.getBody(j);
                    first._acc = first.acc;
                    first.acc = MathF.shrink(
                            MathF.gravitationalForce(first, second),
                            first.mass);
                    first.vel.incBy(MathF.scale(
                            MathF.add(first.acc, first._acc), 
                            TIMESTEP / 2));
                }
            }
        }
    }
    
    public void updateRK() {

    }
}
