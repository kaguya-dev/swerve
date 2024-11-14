package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;

public class SwerveSpeed extends Command{


    private CANSparkMax motorLeft1 = new CANSparkMax(Constants.motorSpeed1, MotorType.kBrushless);
    private CANSparkMax motorLeft2 = new CANSparkMax(Constants.motorSpeed2, MotorType.kBrushless);
    private CANSparkMax motorRight1 = new CANSparkMax(Constants.motorSpeed3, MotorType.kBrushless);
    private CANSparkMax motorRight2 = new CANSparkMax(Constants.motorSpeed4, MotorType.kBrushless);
    
    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        super.initialize();
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
    }

    @Override
    public void end(boolean interrupted) {
        // TODO Auto-generated method stub
        super.end(interrupted);
    }


    @Override
    public boolean isFinished() {
        // TODO Auto-generated method stub
        return super.isFinished();
    }

    public void speedControl(double speed){
        motorLeft1.set(speed);
        motorLeft2.set(speed);
        motorRight1.set(speed);
        motorRight2.set(speed);

    }
    
}
