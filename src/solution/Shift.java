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
public interface Shift {
    public void checkShift(StateContext context, int speed);
    public int value();
    public int min();
    public int max();
}
