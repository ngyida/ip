package command;

import exception.DukeException;
import task.Task;

public class UnmarkCommand extends Command {
    public UnmarkCommand(String[] commands) {
        super(commands);
    }

    @Override
    public void doCommand(int taskCount, Task[] tasks)  {
        try {
            int taskNum = Integer.parseInt(getCommands()[1]);
            tasks[taskNum - 1].unmarkDone();
            System.out.println("____________________________________________________________" + "\nOK, I've marked this task as not done yet:\n[" + tasks[taskNum - 1].getTaskType() + "][" + tasks[taskNum - 1].getStatusIcon() + "] " + tasks[taskNum - 1].getDescription() + "\n" + "____________________________________________________________");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("____________________________________________________________"
                    + '\n' + "Invalid task number!" + '\n'
                    + "____________________________________________________________");
        }
    }
}
