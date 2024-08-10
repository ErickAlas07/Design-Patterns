package org.ealas.patrones.observer;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}