package com.skilldistillery.animals.entities;

public class Lion extends Animal {
	//TODO method to make noise: quack, moo or roar
	//TODO method to eat food
	
	private static String noise = "Roaaaar";
	
	public Lion(String name){
		super(name);
		}	
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int foodAmount) {
		System.out.println("Chomp chomp " + foodAmount + " lbs of meat.");
	}
}
