// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc2877.ThreeCIM;
    
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANJaguar driveTrainCANJaguar1;
    public static CANJaguar driveTrainCANJaguar2;
    public static CANJaguar driveTrainCANJaguar3;
    public static CANJaguar driveTrainCANJaguar4;
    public static CANJaguar driveTrainCANJaguar5;
    public static CANJaguar driveTrainCANJaguar6;
    public static RobotDrive driveTrainRobotDrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        try { 
            driveTrainCANJaguar1 = new CANJaguar(1);
            driveTrainCANJaguar2 = new CANJaguar(2);
            driveTrainCANJaguar3 = new CANJaguar(3);
            driveTrainCANJaguar4 = new CANJaguar(4);
            driveTrainCANJaguar5 = new CANJaguar(5);
            driveTrainCANJaguar6 = new CANJaguar(6);
            //driveTrainRobotDrive = new RobotDrive();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            driveTrainCANJaguar2 = new CANJaguar(3);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            driveTrainCANJaguar3 = new CANJaguar(4);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            driveTrainCANJaguar4 = new CANJaguar(5);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            driveTrainCANJaguar5 = new CANJaguar(6);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            driveTrainCANJaguar6 = new CANJaguar(7);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
