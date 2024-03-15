package com.deepak.creational.abstract_factory.factories;

import com.deepak.creational.abstract_factory.buttons.Button;
import com.deepak.creational.abstract_factory.buttons.MacOSButton;
import com.deepak.creational.abstract_factory.checkboxes.CheckBox;
import com.deepak.creational.abstract_factory.checkboxes.MacOSCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOSCheckBox();
    }
}
