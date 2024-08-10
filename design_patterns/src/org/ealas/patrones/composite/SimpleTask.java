package org.ealas.patrones.composite;

// Leaf
public class SimpleTask implements Task {
    private String title;

    public SimpleTask(String title) {
        this.title = title;
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
        display(0); // Default level for simple tasks
    }

    @Override
    public void display(int level) {
        String indent = " ".repeat(level * 2); // Indentation for hierarchy
        System.out.println(indent + "Simple Task: " + title);
    }
}
