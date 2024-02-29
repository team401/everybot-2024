package frc.robot.subsystems.scoring;

import org.littletonrobotics.junction.AutoLog;

public interface ShooterIO {

    @AutoLog
    public static class ShooterIOInputs {
        public double leftShooterAppliedVolts = 0.0;
        public double leftShooterCurrentAmps = 0.0;
        public double leftShooterVelocityRPM = 0.0;

        public double rightShooterAppliedVolts = 0.0;
        public double rightShooterCurrentAmps = 0.0;
        public double rightShooterVelocityRPM = 0.0;

        public double kickerAppliedVolts = 0.0;
        public double kickerCurrentAmps = 0.0;
    }

    public default void updateInputs(ShooterIOInputs inputs) {}

    public default void setShooterVolts(double volts) {}

    public default void setShooterVelocity(double velocity) {}
    ;

    public default void setKickerVolts(double volts) {}
}