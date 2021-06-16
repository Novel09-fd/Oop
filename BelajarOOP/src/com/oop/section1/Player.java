package com.oop.section1;

class Player {

	 String name;
	    double health;
	    int level;
	    // object member
	    Weapon weapon;
	    Armor armor;

	    Player(String name, double health){
	        this.name = name;
	        this.health = health;
	    }
	    
	    void attack(Player opponent) {
	    	double attackPower = this.weapon.attackPower;
	    
	    	 System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
	        opponent.defence(attackPower);
	    }
	    
	    void defence(double attackPower){
	        // akan mengambil damage
	        double damage;
	        if (this.armor.defencePower < attackPower){
	            damage = attackPower - this.armor.defencePower;
	        } else {
	            damage=0;
	        }
	        this.health -= damage;
	        System.out.println(this.name + " gots damage " + damage);
	    }

	    void equipWeapon(Weapon weapon){
	        this.weapon = weapon;
	    }

	    void equipArmor(Armor armor){
	        this.armor = armor;
	    }

	    void display(){
	        System.out.println("\nName : " + this.name);
	        System.out.println("Health : " + this.health + " hp");
	        this.weapon.display();
	        this.armor.display();
	    }

}
