package com.mime.pacman.entity;

public class Entity {

	public double x, z;
	protected boolean  removed = false;
	
	
	protected  Entity() {

	}
	
	public void remove(){
		 removed = true;
	}
	
	public void tick(){
		
	}
}
