package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class BulletController {
    private LinkedList<VisualBullet> bl = new LinkedList<>();

    public void tick() {
        for (int i = 0; i < bl.size(); i++) {
            if (bl.get(i).getY() < 0) {
                removeBullet(bl.get(i));
            } else {
                bl.get(i).tick();
            }
        }
    }

    public void render(Graphics g) {
        for (int i = 0; i < bl.size(); i++) {
            bl.get(i).render(g);
        }
    }

    public void addBullet(VisualBullet visualBullet) {
        bl.add(visualBullet);
    }

    public void removeBullet(VisualBullet bullet) {
        bl.remove(bullet);
    }
}
