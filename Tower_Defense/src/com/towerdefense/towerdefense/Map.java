package com.towerdefense.towerdefense;

import com.towerdefense.towerdefense.database.DBLink;
import com.towerdefense.towerdefense.entities.mobs.Mob;
import com.towerdefense.towerdefense.entities.towers.Tower;
import com.towerdefense.towerdefense.objects.Ground;

import java.awt.*;
import java.util.ArrayList;

public class Map {
	private int width;
	private int height;
	private String name;
    private int id;
	//private Ground[][] terrain;
    private ArrayList<Ground> grounds;
	private ArrayList<Tower> towers;
	private ArrayList<Mob> mobs;

	public Map(){

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map(String name, int width, int height, int id) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.id = id;

	}

	private void initialization(int width, int height, int id) {
		this.width = width;
		this.height = height;
	}

    public void fetchTerrain(){
        if(this.grounds == null){
            DBLink dbLink = new DBLink();
            this.grounds = dbLink.mapSelection(this.id);
        }
    }

    public void drawTerrain(Graphics g){
        fetchTerrain();
        for(Ground ground : grounds){
            g.drawImage(ground.getImage(), ground.getX()*32, ground.getY()*32, null);
        }
    }
}
