package com.oop.section1;

public class Weapon {

	 double attackPower;
	    String name;

	    Weapon(String name, double attackPower){
	        this.name = name;
	        this.attackPower = attackPower;
	    }

	    void display(){
	        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
	    }
	
}
