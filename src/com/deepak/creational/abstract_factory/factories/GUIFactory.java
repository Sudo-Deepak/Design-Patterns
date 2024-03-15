package com.deepak.creational.abstract_factory.factories;

import com.deepak.creational.abstract_factory.buttons.Button;
import com.deepak.creational.abstract_factory.checkboxes.CheckBox;


/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    CheckBox createCheckbox();
}
