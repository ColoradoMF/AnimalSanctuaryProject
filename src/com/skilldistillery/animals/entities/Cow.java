package com.skilldistillery.animals.entities;

public class Cow extends Animal {
	//TODO method to make noise: quack, moo or roar
	//TODO method to eat food
	
	private static String noise = "Mooowhooo";
	
	public Cow(String name){
		super(name);
		}
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int foodAmount) {
		System.out.println("Munch Munch " + foodAmount + " hay bails");
	}
}
