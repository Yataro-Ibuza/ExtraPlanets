package com.mjr.extraplanets.planets.Mercury.worldgen;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.Constants;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenMercury extends MercuryBiomes {

	public BiomeGenMercury(BiomeProperties properties) {
		super(properties);
		Biome.registerBiome(Config.MERCURY_BIOME_ID, Constants.TEXTURE_PREFIX + this.getBiomeName(), this);
		if (Config.REGISTER_BIOME_TYPES)
			BiomeDictionary.addTypes(this, BiomeDictionary.Type.COLD, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DEAD);
	}
}
