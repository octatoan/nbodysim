package nbodysim.math;

import nbodysim.body.Body;

/**
 * Math libs.
 *
 * @author octatoan
 */
public class MathF {

    public static Vector add(Vector a, Vector b) {
        return new Vector(a.x + b.x, b.y + b.y);
    }

    public static Vector sub(Vector a, Vector b) {
        return new Vector(a.x - b.x, b.y - b.y);
    }

    public static Vector scale(Vector a, double d) {
        return new Vector(a.x * d, a.y * d);
    }

    public static Vector shrink(Vector a, double d) {
        return new Vector(a.x / d, a.y / d);
    }
    
    public static double dist(Vector a, Vector b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double xdiff(Vector a, Vector b) {
        return a.x - b.x;
    }

    public static double ydiff(Vector a, Vector b) {
        return a.y - b.y;
    }
    
    public static Vector gravitationalForce(Body first, Body second) {
        
        double dx = xdiff(second.pos, first.pos);
        double dy = ydiff(second.pos, first.pos);
        
        double r = Math.sqrt(dx * dx + dy * dy);
        
        //GMm/r^2
        double force = Constants.GRAVITATIONAL_CONST
                  * (first.mass * second.mass) / (r * r);
        
        //x-component = F cos theta
        double fx = force * dx / r;
        //y-component = F sin theta
        double fy = force * dy / r;
        
        //We *could* divide only once by r . . .
        
        Vector gravity = new Vector(fx, fy);
        
        return gravity;
    }

}
