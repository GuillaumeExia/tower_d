package com.towerdefense.towerdefense;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GlobalVariables {
    public static Map selectedMap;
    public static String nickname;
    private static BufferedImage sprite = null;

    public static BufferedImage getSprite(){
        if(sprite == null){
        try {
        	//sprite = ImageIO.read(GlobalVariables.class.getResource("/res/images/sprite.png"));
            sprite = ImageIO.read(new File("res/images/sprite.png"));
            } catch (IOException e) {
            }
        }
        return sprite;
    }

}