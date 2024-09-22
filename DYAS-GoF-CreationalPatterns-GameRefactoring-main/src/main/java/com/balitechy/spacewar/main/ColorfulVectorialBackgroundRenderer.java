package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorialBackgroundRenderer implements VisualBackgroundRenderer {

	@Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        g.setColor(Color.YELLOW);
        for (int i = 0; i < 100; i++) {
            int x = (int) (Math.random() * c.getWidth());
            int y = (int) (Math.random() * c.getHeight());
            g.fillRect(x, y, 2, 2);
        }
	}
}
