package task;

public class Todo extends Task {
    public Todo(String description) {
        super(description);
    }

    public String getTaskType() {
        return "T";
    }
}