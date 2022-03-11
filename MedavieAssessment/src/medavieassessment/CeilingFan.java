/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medavieassessment;

/**
 *
 * @author jason
 * @date March 11, 2022
 * @purpose This class represents a ceiling Fan
 */
public class CeilingFan {
    /**
     * The speed of the fan
     */
    private int speed = 0;
    
    /**
     * The direction of the fan
     */
    private boolean reverse = false;

    /**
     * Get the speed of the fan
     * @return integer The speed of the fan
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Getter for if the fan direction is reversed
     * @return Boolean true for reversed and false for normal
     */
    public boolean isReverse() {
        return reverse;
    }
    
    /**
     * Cycles the speed of the fan between (0, 1, 2, 3) or backwards if
     * the reverse property is true
     */
    public void changeSpeed() {
        if (!reverse) {
            if (speed == 3) {
                speed = 0;
            } else {
                speed++;
            }
        } else {
            if (speed == 0) {
                speed = 3;
            } else {
                speed--;
            }
        }
    }
    
    /**
     * Reverse the direction of the fan.
     */
    public void reverseDirection() {
        reverse = !reverse;
    }
}
