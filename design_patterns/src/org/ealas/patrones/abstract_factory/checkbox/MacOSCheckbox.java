package org.ealas.patrones.abstract_factory.checkbox;

import org.ealas.patrones.abstract_factory.interfaces.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}