package org.ealas.patrones.abstract_factory.app;

import org.ealas.patrones.abstract_factory.interfaces.Button;
import org.ealas.patrones.abstract_factory.interfaces.Checkbox;
import org.ealas.patrones.abstract_factory.interfaces.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
