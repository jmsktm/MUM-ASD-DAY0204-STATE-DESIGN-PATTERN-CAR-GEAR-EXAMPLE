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
public class ShiftTwo implements Shift { 
    
    public static final int SPEED_MIN = 11;
    public static final int SPEED_MAX = 20;

    @Override
    public void checkShift(StateContext context, int speed) {
        if(speed<min()) {
            context.setShift(new ShiftOne());
        } else if(speed>max()) {
            context.setShift(new ShiftThree());
        }
    }

    @Override
    public int value() {
        return 2;
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
