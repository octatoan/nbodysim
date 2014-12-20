package nbodysim.math;

/**
 *
 * @author octatoan
 */
public class Vector {

    double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        this(0, 0);
    }
    
    //Static math functions
    static Vector add(Vector a, Vector b) {
        return new Vector(a.x + b.x, b.y + b.y);
    }

    static Vector sub(Vector a, Vector b) {
        return new Vector(a.x - b.x, b.y - b.y);
    }

    static double dist(Vector a, Vector b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    static double dx(Vector a, Vector b) {
        return a.x - b.x;
    }
    
    static double dy(Vector a, Vector b) {
        return a.y - b.y;
    }
    
    public void incBy(Vector other) {
        this.x += other.x;
        this.x += other.y;
    }
    
    public void decBy(Vector other) {
        this.x -= other.x;
        this.x -= other.y;
    }
    
    void setComps(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + "x=" + x + ", y=" + y + ')';
    }    
}
