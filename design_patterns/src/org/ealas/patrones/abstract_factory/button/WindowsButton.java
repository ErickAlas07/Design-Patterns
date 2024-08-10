package org.ealas.patrones.abstract_factory.button;

import org.ealas.patrones.abstract_factory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
