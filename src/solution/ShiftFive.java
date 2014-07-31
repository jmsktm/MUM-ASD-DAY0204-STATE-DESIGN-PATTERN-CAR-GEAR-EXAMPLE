package solution;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public class ShiftFive implements Shift { 
    
    public static final int SPEED_MIN = 56;
    public static final int SPEED_MAX = Integer.MAX_VALUE;

    @Override
    public void checkShift(StateContext context, int speed) {
        if(speed<min()) {
            context.setShift(new ShiftFour());
        }
    }

    @Override
    public int value() {
        return 5;
    }

    @Override
    public int min() {
        return SPEED_MIN;
    }

    @Override
    public int max() {
        return SPEED_MAX;
    }
}
