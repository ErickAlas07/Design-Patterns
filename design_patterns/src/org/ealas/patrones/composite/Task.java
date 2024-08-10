package org.ealas.patrones.composite;

// Component
public interface Task {
    String getTitle();
    void setTitle(String title);
    void display(); // Default display method
    void display(int level); // Hierarchical display method
}
