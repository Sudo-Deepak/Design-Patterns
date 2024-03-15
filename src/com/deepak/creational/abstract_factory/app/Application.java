package com.deepak.creational.abstract_factory.app;

import com.deepak.creational.abstract_factory.buttons.Button;
import com.deepak.creational.abstract_factory.checkboxes.CheckBox;
import com.deepak.creational.abstract_factory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
