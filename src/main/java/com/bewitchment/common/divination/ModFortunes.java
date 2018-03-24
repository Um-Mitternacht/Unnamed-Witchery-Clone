package com.bewitchment.common.divination;


import com.bewitchment.common.divination.fortunes.*;
import com.bewitchment.common.lib.LibMod;

public class ModFortunes {

	private static Fortune zombie;
	private static Fortune silverfish;
	private static Fortune dropBow;
	private static Fortune death;
	private static Fortune witch;
	private static Fortune treasure;
	private static Fortune merchant;
	private static Fortune shinies;
	private static Fortune iron;
	private static Fortune direwolf;
	private static Fortune dog;
	private static Fortune partyparrot;
	private static Fortune parrot;
	private static Fortune illusioner;

	public static void init() {
		zombie = new FortuneMeetZombie(10, "meet_zombie", LibMod.MOD_ID);
		silverfish = new FortuneMeetUberSilverfish(8, "meet_silverfish", LibMod.MOD_ID);
		witch = new FortuneMeetWitch(5, "meet_witch", LibMod.MOD_ID);
		dropBow = new FortuneDropBow(7, "drop_bow", LibMod.MOD_ID);
		death = new FortuneDeath(1, "death", LibMod.MOD_ID);
		treasure = new FortuneTreasure(5, "treasure", LibMod.MOD_ID);
		shinies = new FortuneShinies(3, "shinies", LibMod.MOD_ID);
		merchant = new FortuneMeetMerchant(8, "merchant", LibMod.MOD_ID);
		iron = new FortuneIron(7, "iron", LibMod.MOD_ID);
		direwolf = new FortuneMeetDireWolf(5, "direwolf", LibMod.MOD_ID);
		dog = new FortuneMeetDog(5, "dog", LibMod.MOD_ID);
		partyparrot = new FortuneMeetPartyParrot(1, "meet_party_parrot", LibMod.MOD_ID);
		parrot = new FortuneMeetParrot(1, "meet_parrot", LibMod.MOD_ID);
		illusioner = new FortuneMeetIllusioner(1, "illusioner", LibMod.MOD_ID);
		registerAll();
	}

	public static void registerAll() {
		Fortune.REGISTRY.registerAll(
				zombie,
				silverfish,
				dropBow,
				death,
				witch,
				treasure,
				shinies,
				iron,
				direwolf,
				dog,
				partyparrot,
				parrot,
				illusioner,
				merchant
		);
	}
}
