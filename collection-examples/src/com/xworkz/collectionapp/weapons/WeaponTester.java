package com.xworkz.collectionapp.weapons;

import java.util.ArrayList;
import java.util.Collection;

public class WeaponTester {

	public static void main(String[] args) {
		
		
		Collection<WeaponDTO> weapons = new ArrayList<WeaponDTO>();
		weapons.add(new WeaponDTO("Beretta M9 Pistol", "Washington", "9mm Bullets", 28000, Type.Pistol));
		weapons.add(new WeaponDTO("Glock 17", "Georgia", "9mm Bullets", 42900, Type.Pistol));
		weapons.add(new WeaponDTO("Browning Hi-Power", "America", "9mm Bullets", 12000, Type.Pistol));
		weapons.add(new WeaponDTO("Astra A-60", "Spain", "9mm Bullets", 3200, Type.Pistol));
		
		weapons.add(new WeaponDTO("Remington 870", "Remington Arms Company", "9mm Bullets", 44218, Type.Shortgun));
		weapons.add(new WeaponDTO("Winchester Model 42", "Winchester Repeating Arms", "3-inch", 22000, Type.Shortgun));
		weapons.add(new WeaponDTO("Mossberg 500", "Mossberg & Sons", "2.75-inch", 473.07, Type.Shortgun));
		weapons.add(new WeaponDTO("Ithaca 37", "Ithaca Gun Company ", " pump-action", 5000, Type.Shortgun));
		
		weapons.add(new WeaponDTO("Albini-Braendlin rifle", "Augusto Albini Francis Braendlin", "11mm Bullets", 44218, Type.Rifle));
		weapons.add(new WeaponDTO("Arisaka", "Arisaka Nariakira ", "6.5 mm", 122000, Type.Rifle));
		weapons.add(new WeaponDTO("ArmaLite AR-7", "ArmaLite", "22 Long Rifle calibe", 6000, Type.Rifle));
		weapons.add(new WeaponDTO("Berkut rifle", "KBP Instrument Design Bureau", "7.92 mm", 5000, Type.Rifle));
		
		weapons.add(new WeaponDTO("AK-203", "Rosoboronexport", "7.62mm", 80000, Type.AssaultRifle));
		weapons.add(new WeaponDTO("IMI Tavor TAR-21", "Israel Weapon Industries", "5.56 mm", 122000, Type.AssaultRifle));
		weapons.add(new WeaponDTO("M4A1 Carbine", "Colt Firearms", "5.56 mm", 6000, Type.AssaultRifle));
		weapons.add(new WeaponDTO("SIG-716 i", "SIG Sauer", "5.56 mm", 5000, Type.AssaultRifle));
		
		weapons.add(new WeaponDTO("Barrett M95", "Barrett Firearms Company", "12.7mm", 80000, Type.SniperRifle));
		weapons.add(new WeaponDTO("Barrett M82", "Barrett Firearms Company", "12.7mm", 122000, Type.SniperRifle));
		weapons.add(new WeaponDTO("M24", "Remington Arms", "7.62mm", 6000, Type.SniperRifle));
		weapons.add(new WeaponDTO("Steyr SSG 69", "Steyr Mannlicher", "7.62mm", 5000, Type.SniperRifle));
		
		
		
		
		
		
		
	}
}
