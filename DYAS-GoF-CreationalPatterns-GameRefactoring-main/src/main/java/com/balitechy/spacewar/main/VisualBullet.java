package com.balitechy.spacewar.main;

import java.awt.Graphics;

public interface VisualBullet {
    int WIDTH = 11;
    int HEIGHT = 21;

    public void render(Graphics g);
    public void tick();
    public double getY();
}
