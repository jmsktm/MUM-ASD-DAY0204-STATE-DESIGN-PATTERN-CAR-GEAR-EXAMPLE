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
public class StateContext {

    private Shift shift;

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Shift checkShift(int speed) {
        shift.checkShift(this, speed);
        return shift;
    }

    public StateContext() {
        setShift(new ShiftZero());
    }
}
