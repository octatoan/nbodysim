/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbodysim.math;

/**
 *
 * @author hamso
 */
public class Constants {
    //Physical constants
    public static final double GRAVITATIONAL_CONST = 6.67e-11;
    
    //Planetary data
    public static final double EARTH_MASS = 5.972e24;
    public static final double SUN_MASS = 1.989e30;
    public static final double MOON_MASS = 7.347e22;
    
    public static final double EARTH_RAD = 6371;
    public static final double SUN_RAD = 695800;
    public static final double MOON_RAD = 1737.4;   
    
    public static final double EARTH_VEL = 29780;
    public static final double SUN_VEL = 0;
    public static final double MOON_VEL = 1023;  
    
    //Sim-specific
    public static final double MAX_MASS = 2e30;
}
