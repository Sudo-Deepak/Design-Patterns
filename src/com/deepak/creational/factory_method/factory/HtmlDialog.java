package com.deepak.creational.factory_method.factory;

import com.deepak.creational.factory_method.buttons.Button;
import com.deepak.creational.factory_method.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
