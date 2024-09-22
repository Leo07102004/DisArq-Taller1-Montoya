package com.balitechy.spacewar.main;

import java.awt.Graphics;

public interface VisualPlayer {
    int WIDTH = 56;
    int HEIGHT = 28;

    public void render(Graphics g);
    public void tick();
    public void shoot();
    public void setVelX(double velX);
    public void setVelY(double velY);
}
