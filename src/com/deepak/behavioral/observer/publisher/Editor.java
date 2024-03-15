package com.deepak.behavioral.observer.publisher;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (null != this.file) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
