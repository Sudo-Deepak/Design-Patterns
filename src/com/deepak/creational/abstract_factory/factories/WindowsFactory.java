package com.deepak.creational.abstract_factory.factories;

import com.deepak.creational.abstract_factory.buttons.Button;
import com.deepak.creational.abstract_factory.buttons.WindowsButton;
import com.deepak.creational.abstract_factory.checkboxes.CheckBox;
import com.deepak.creational.abstract_factory.checkboxes.WindowsCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
