package com.skilldistillery.animals.entities;

public class Whale extends Animal {
	
	//TODO method to make noise: quack, moo or roar
	//TODO method to eat food
	
	private String name;
	private static String noise = "singing song";
	private int foodAmount = 5; 
	
	public Whale(String name){
		this.name = name;
		}	
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int foodAmount) {
		System.out.println("Gulp gulp " + foodAmount + " tons of krill.");
	}

}