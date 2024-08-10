package org.ealas.patrones.abstract_factory.factories;

import org.ealas.patrones.abstract_factory.button.WindowsButton;
import org.ealas.patrones.abstract_factory.checkbox.WindowsCheckbox;
import org.ealas.patrones.abstract_factory.interfaces.Button;
import org.ealas.patrones.abstract_factory.interfaces.Checkbox;
import org.ealas.patrones.abstract_factory.interfaces.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
