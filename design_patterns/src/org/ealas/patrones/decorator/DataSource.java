package org.ealas.patrones.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
