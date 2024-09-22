package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.io.IOException;

public interface VisualBackgroundRenderer {
    public void render(Graphics g, Canvas c) throws IOException;
}
