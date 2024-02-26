package com.driver;

import java.util.ArrayList;
import java.util.List;

public class FrameService {
    private List<Frame> frameInventory = new ArrayList<>();

    public void addFrame(Frame frame) {
        frameInventory.add(frame);
        System.out.println("Frame added to the inventory: " + frame);
    }

    public Frame getFrame(String brand, String model, String size) {
        for (Frame frame : frameInventory) {
            if (frame.getBrand().equals(brand) && frame.getModel().equals(model) && frame.getSize().equals(size)) {
                return frame;
            }
        }
        return null;
    }

    public void updateFrame(Frame existingFrame, Frame updatedFrame) {
        int index = frameInventory.indexOf(existingFrame);
        if (index != -1) {
            frameInventory.set(index, updatedFrame);
            System.out.println("Frame details updated: " + updatedFrame);
        } else {
            System.out.println("Frame not found in the inventory.");
        }
    }

    public void deleteFrame(Frame frame) {
        if (frameInventory.remove(frame)) {
            System.out.println("Frame deleted from the inventory: " + frame);
        } else {
            System.out.println("Frame not found in the inventory.");
        }
    }

    public List<Frame> getAllFramesByBrand(String brand) {
        List<Frame> framesByBrand = new ArrayList<>();
        for (Frame frame : frameInventory) {
            if (frame.getBrand().equals(brand)) {
                framesByBrand.add(frame);
            }
        }
        return framesByBrand;
    }

    public List<Frame> getFrameInventory() {
        return frameInventory;
    }
}
