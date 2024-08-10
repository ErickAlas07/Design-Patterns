package org.ealas.patrones.abstract_factory.button;

import org.ealas.patrones.abstract_factory.interfaces.Button;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
