package frc.robot.subsystems.vision;

import org.littletonrobotics.junction.AutoLog;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Transform3d;

public interface VisionIO {

    @AutoLog
    public static class VisionIOInputs {
        public double timestampSeconds = 0.0;
        public Pose2d estimatedVisionPose = new Pose2d();
        public double rotationToClosestTarget = 0.0;
        public Transform3d CamToTargetTransform = new Transform3d();
    }

    public default void updateInputs (VisionIOInputs inputs) {}

    public default void updatePose (Pose2d simRobotPoseMeters) {}

    public default void set3dFieldSim (boolean enabled) {}
}