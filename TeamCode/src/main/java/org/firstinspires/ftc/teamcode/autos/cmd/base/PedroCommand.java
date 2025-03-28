package org.firstinspires.ftc.teamcode.autos.cmd.base;

import com.arcrobotics.ftclib.command.CommandBase;

import com.pedropathing.follower.Follower;
import com.pedropathing.pathgen.PathChain;

public class PedroCommand extends CommandBase {

    private boolean f = true;

    private PathChain pathChain;

    private Follower follower;

    public PedroCommand(Follower follower, PathChain pathChain) {
        this.follower = follower;
        this.pathChain = pathChain;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        if (f) {
            follower.followPath(pathChain);
            f = false;
        }
    }

    @Override
    public boolean isFinished() {
        return !follower.isBusy();
    }
}
