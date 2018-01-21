package frc.team6434.robot;

import edu.wpi.first.wpilibj.VictorSP;

/**
 * Created by jwill on 1/17/2018.
 */
public class Assistive_Climb {

    VictorSP assistiveClimbMotorLeft, getAssistiveClimbMotorRight;

    public void init()
    {
        assistiveClimbMotorLeft = new VictorSP(9);
        assistiveClimbMotorRight = new VictorSP(10);
    }

    public void leftRelease()
    {
        assistiveClimbMotorLeft.set(0.5);
    }

    public void rightRelease()
    {
        assistiveClimbMotorRight.set(0.5);
    }

    public void bothRelease()
    {
       assistiveClimbMotorLeft.set(0.5);
       assistiveClimbMotorRight.set(0.5); 
    }

}
