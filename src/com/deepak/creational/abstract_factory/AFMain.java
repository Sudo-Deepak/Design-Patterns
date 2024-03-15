package com.deepak.creational.abstract_factory;

import com.deepak.creational.abstract_factory.app.Application;
import com.deepak.creational.abstract_factory.factories.GUIFactory;
import com.deepak.creational.abstract_factory.factories.MacOSFactory;
import com.deepak.creational.abstract_factory.factories.WindowsFactory;

/**
 * Abstract Factory is a creational design pattern, which solves the problem of creating entire product families without specifying their concrete classes.
 * In this example, buttons and checkboxes will act as products. They have two variants: macOS and Windows.
 */
public class AFMain {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
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
