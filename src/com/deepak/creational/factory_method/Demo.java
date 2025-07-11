package com.deepak.creational.factory_method;

import com.deepak.creational.factory_method.factory.Dialog;
import com.deepak.creational.factory_method.factory.HtmlDialog;
import com.deepak.creational.factory_method.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 * Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
 * but allows subclasses to alter the type of objects that will be created.
 * In this example, Buttons play a product role and dialogs act as creators.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
