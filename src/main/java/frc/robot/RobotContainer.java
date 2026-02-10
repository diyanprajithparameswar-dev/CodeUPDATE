package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Hood;
import frc.robot.subsystems.states.HoodState;

public class RobotContainer {

    private final Hood hood =
        new Hood();

    private final CommandXboxController controller =
        new CommandXboxController(Constants.kDriverControllerPort);

    public RobotContainer() {
        configureBindings();
    }

    private void configureBindings() {

        controller.a()
            .onTrue(hood.setStateCommand(HoodState.LOW));

        controller.b()
            .onTrue(hood.setStateCommand(HoodState.MID));

        controller.y()
            .onTrue(hood.setStateCommand(HoodState.HIGH));

        controller.x()
            .onTrue(hood.setStateCommand(HoodState.IDLE));
    }
}