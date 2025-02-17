package org.ealas.patrones.abstract_factory;

import org.ealas.patrones.abstract_factory.app.Application;
import org.ealas.patrones.abstract_factory.factories.MacOSFactory;
import org.ealas.patrones.abstract_factory.factories.WindowsFactory;
import org.ealas.patrones.abstract_factory.interfaces.GUIFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}