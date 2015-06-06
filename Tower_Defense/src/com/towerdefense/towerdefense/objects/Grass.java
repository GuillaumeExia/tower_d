package com.towerdefense.towerdefense.objects;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Grass extends Ground {

	public Grass() {
		super();
		try {
			setImage(ImageIO.read(new File("images/terrain/herbe.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
