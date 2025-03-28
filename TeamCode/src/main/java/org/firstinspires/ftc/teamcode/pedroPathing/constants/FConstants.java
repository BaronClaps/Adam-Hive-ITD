package org.firstinspires.ftc.teamcode.pedroPathing.constants;

import com.pedropathing.localization.Localizers;
import com.pedropathing.follower.FollowerConstants;
import com.pedropathing.util.CustomFilteredPIDFCoefficients;
import com.pedropathing.util.CustomPIDFCoefficients;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class FConstants {
    static {
        FollowerConstants.localizers = Localizers.THREE_WHEEL;

        FollowerConstants.leftFrontMotorName = "frontLeft";
        FollowerConstants.leftRearMotorName = "backLeft";
        FollowerConstants.rightFrontMotorName = "frontRight";
        FollowerConstants.rightRearMotorName = "backRight";

        FollowerConstants.leftFrontMotorDirection = DcMotorSimple.Direction.REVERSE;
        FollowerConstants.leftRearMotorDirection = DcMotorSimple.Direction.REVERSE;
        FollowerConstants.rightFrontMotorDirection = DcMotorSimple.Direction.FORWARD;
        FollowerConstants.rightRearMotorDirection = DcMotorSimple.Direction.FORWARD;

        FollowerConstants.mass = 11.068;

        FollowerConstants.xMovement = 58.9646;
        FollowerConstants.yMovement = 42.1086;

        FollowerConstants.forwardZeroPowerAcceleration = -69.1836;
        FollowerConstants.lateralZeroPowerAcceleration = -112.3626;

        FollowerConstants.translationalPIDFCoefficients.setCoefficients(0.12,
                0,
                0,
                0);
        FollowerConstants.useSecondaryTranslationalPID = true;
        FollowerConstants.secondaryTranslationalPIDFCoefficients.setCoefficients(0.35,
                0,
                0.01,
                0); // Not being used, @see useSecondaryTranslationalPID
        FollowerConstants.secondaryTranslationalPIDFFeedForward = 0.02;

        FollowerConstants.headingPIDFCoefficients.setCoefficients(1,
                0,
                0,
                0);
        FollowerConstants.useSecondaryHeadingPID = true;
        FollowerConstants.secondaryHeadingPIDFCoefficients.setCoefficients(4.5,
                0,
                0.08,
                0); // Not being used, @see useSecondaryHeadingPID
        FollowerConstants.secondaryHeadingPIDFFeedForward = 0.01;

        FollowerConstants.drivePIDFCoefficients.setCoefficients(0.021,
                0,
                0.00001,
                0.6,
                0);
        FollowerConstants.useSecondaryDrivePID = true;
        FollowerConstants.secondaryDrivePIDFCoefficients.setCoefficients(0.025,
                0,
                0.000008,
                0.6,
                0); // Not being used, @see useSecondaryDrivePID
        FollowerConstants.secondaryDrivePIDFFeedForward = 0.01;

        FollowerConstants.zeroPowerAccelerationMultiplier = 4;
        FollowerConstants.centripetalScaling = 0.0002;

        FollowerConstants.pathEndTimeoutConstraint = 200;
        FollowerConstants.pathEndTValueConstraint = 0.995;
        FollowerConstants.pathEndVelocityConstraint = 0;
        FollowerConstants.pathEndTranslationalConstraint = 0.2;
        FollowerConstants.pathEndHeadingConstraint = Math.toRadians(2);
    }
}
