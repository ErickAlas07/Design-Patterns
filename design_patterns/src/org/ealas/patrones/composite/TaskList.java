package org.ealas.patrones.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class TaskList implements Task {
    private String title;
    private List<Task> tasks;

    public TaskList(String title) {
        this.title = title;
        this.tasks = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        display(0); // Default level for task lists
    }

    @Override
    public void display(int level) {
        String indent = " ".repeat(level * 2); // Indentation for hierarchy
        System.out.println(indent + "Task List: " + title);
        for (Task task : tasks) {
            task.display(level + 1); // Increase indentation level for child tasks
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}
