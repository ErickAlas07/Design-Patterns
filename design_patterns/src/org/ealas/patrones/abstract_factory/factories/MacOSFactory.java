package org.ealas.patrones.abstract_factory.factories;

import org.ealas.patrones.abstract_factory.button.MacOsButton;
import org.ealas.patrones.abstract_factory.checkbox.MacOSCheckbox;
import org.ealas.patrones.abstract_factory.interfaces.*;
import org.ealas.patrones.abstract_factory.interfaces.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
