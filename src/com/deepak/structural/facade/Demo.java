package com.deepak.structural.facade;

import com.deepak.structural.facade.facades.VideoConversionFacade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtube.ogg", "mp4");
    }
}
