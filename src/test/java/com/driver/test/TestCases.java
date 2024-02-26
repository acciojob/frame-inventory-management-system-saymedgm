package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.driver.Frame;
import com.driver.FrameService;

class TestCases {

    private FrameService frameService;

    @BeforeEach
    void setUp() {
        frameService = new FrameService();
    }

    @Test
    void testAddFrame() {
        Frame frame = new Frame("Brand1", "Model1", "Size1");
        frameService.addFrame(frame);
        assertEquals(1, frameService.getFrameInventory().size());
    }

    @Test
    void testGetFrame() {
        Frame frame = new Frame("Brand2", "Model2", "Size2");
        frameService.addFrame(frame);

        Frame fetchedFrame = frameService.getFrame("Brand2", "Model2", "Size2");
        assertEquals(frame, fetchedFrame);

        Frame nonExistentFrame = frameService.getFrame("Brand3", "Model3", "Size3");
        assertNull(nonExistentFrame);
    }

    @Test
    void testUpdateFrame() {
        Frame originalFrame = new Frame("Brand3", "Model3", "Size3");
        frameService.addFrame(originalFrame);

        Frame updatedFrame = new Frame("Brand3", "Model3", "UpdatedSize");
        frameService.updateFrame(originalFrame, updatedFrame);

        assertEquals("UpdatedSize", frameService.getFrameInventory().get(0).getSize());
    }

    @Test
    void testDeleteFrame() {
        Frame frameToDelete = new Frame("Brand4", "Model4", "Size4");
        frameService.addFrame(frameToDelete);

        frameService.deleteFrame(frameToDelete);
        assertEquals(0, frameService.getFrameInventory().size());
    }

    @Test
    void testGetAllFramesByBrand() {
        Frame frame1 = new Frame("Brand5", "Model5", "Size5");
        Frame frame2 = new Frame("Brand5", "Model6", "Size6");
        frameService.addFrame(frame1);
        frameService.addFrame(frame2);

        List<Frame> framesByBrand = frameService.getAllFramesByBrand("Brand5");
        assertEquals(2, framesByBrand.size());
    }
}
