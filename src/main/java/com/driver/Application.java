package com.driver;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FrameService frameService = new FrameService();

        // Add frames to the inventory
        Frame frame1 = new Frame("Ray-Ban", "Aviator", "Medium");
        Frame frame2 = new Frame("Oakley", "Holbrook", "Large");
        frameService.addFrame(frame1);
        frameService.addFrame(frame2);

        // Fetch details of a frame
        Frame fetchedFrame = frameService.getFrame("Ray-Ban", "Aviator", "Medium");
        System.out.println("Fetched Frame: " + fetchedFrame);

        // Update details of a frame
        Frame updatedFrame = new Frame("Ray-Ban", "Aviator", "Large");
        frameService.updateFrame(frame1, updatedFrame);

        // Delete a frame
        frameService.deleteFrame(frame2);

        // Fetch all frames of a particular brand
        List<Frame> framesByBrand = frameService.getAllFramesByBrand("Ray-Ban");
        System.out.println("Frames by Ray-Ban: " + framesByBrand);
    }
}
