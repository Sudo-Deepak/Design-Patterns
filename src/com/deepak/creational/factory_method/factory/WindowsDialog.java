package com.deepak.creational.factory_method.factory;

import com.deepak.creational.factory_method.buttons.Button;
import com.deepak.creational.factory_method.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
