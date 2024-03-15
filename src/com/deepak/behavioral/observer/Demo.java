package com.deepak.behavioral.observer;

import com.deepak.behavioral.observer.listeners.EmailNotificationListener;
import com.deepak.behavioral.observer.listeners.LogOpenListener;
import com.deepak.behavioral.observer.publisher.Editor;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("com/deepak/behavioral/observer/test.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
