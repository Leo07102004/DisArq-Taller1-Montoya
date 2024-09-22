package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorialBullet implements VisualBullet{
	
	private double x;
	private double y;
	
	public ColorfulVectorialBullet(Game game, double x, double y){
		this.x = x;
		this.y = y;
	}

	@Override
	public void render(Graphics g){
        g.setColor(Color.red);
        g.fillRect((int) x, (int) y, WIDTH, HEIGHT);    
    }
	
	@Override
	public void tick(){
		y -= 5;
	}
	
	@Override
	public double getY(){
		return y;
	}
}