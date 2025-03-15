package com.skilldistillery.animals.entities;

public class Duck extends Animal {
	
	//TODO method to make noise: quack, moo or roar
	//TODO method to eat food
	
	private String name;
	private static String noise = "Quack Quack";
	private int foodAmount = 5; 
	
	public Duck(String name){
		this.name = name;
		}	
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eatFood(int foodAmount) {
		System.out.println("Munch Munch " + foodAmount + " bird pellets.");
	}
	
}
