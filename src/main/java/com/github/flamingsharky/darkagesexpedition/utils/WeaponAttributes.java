package com.github.flamingsharky.darkagesexpedition.utils;

public enum WeaponAttributes {
	
	//4.0f reach is the default vanilla-survival reach
	DAGGER(2, -1.8f, 4.0f, false),
	SWORD(3, -2.4f, 4.0f, true),
	LONGSWORD(3, -2.8f, 4.0f, true),
	WARAXE(4, -3.3f, 4.0f, false);
	
	
	private final int damage;
	private final float attackSpeed;
	private final float reach;
	private final boolean shouldSwipe;
	
	private WeaponAttributes(int d, float a, float r, boolean s) {
		this.damage = d;
		this.attackSpeed = a;
		this.reach = r;
		this.shouldSwipe = s;
	}

	public int getDamage() {
		return damage;
	}

	public float getAttackSpeed() {
		return attackSpeed;
	}

	public float getReach() {
		return reach;
	}

	public boolean shouldSwipe() {
		return shouldSwipe;
	}
}
