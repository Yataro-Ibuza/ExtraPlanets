package com.mjr.extraplanets.moons.Iapetus.worldgen;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.core.world.gen.WorldGenMinableMeta;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecoratorIapetus extends BiomeDecoratorSpace {

	private WorldGenerator copperGen;
	private WorldGenerator tinGen;
	private WorldGenerator ironGen;
	private WorldGenerator gravelGen;
	private WorldGenerator fossilsGen;
	private WorldGenerator iceGen;

	private World currentWorld;

	public BiomeDecoratorIapetus() {
		if (Config.GENERATE_ORES_IAPETUS) {
			this.copperGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.IAPETUS_BLOCKS, 4, 5, true, ExtraPlanets_Blocks.IAPETUS_BLOCKS, 2);
			this.tinGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.IAPETUS_BLOCKS, 4, 4, true, ExtraPlanets_Blocks.IAPETUS_BLOCKS, 2);
			this.ironGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.IAPETUS_BLOCKS, 8, 3, true, ExtraPlanets_Blocks.IAPETUS_BLOCKS, 2);
		}
		this.gravelGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.IAPETUS_GRAVEL, 12, 0, true, ExtraPlanets_Blocks.IAPETUS_BLOCKS, 2);
		this.fossilsGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.FOSSIL, 3, 0, true, ExtraPlanets_Blocks.IAPETUS_BLOCKS, 1);
		this.iceGen = new WorldGenMinableMeta(ExtraPlanets_Blocks.IAPETUS_BLOCKS, 20, 6, true, ExtraPlanets_Blocks.IAPETUS_BLOCKS, 0);

		// WorldGenMinableMeta(Block OreBlock, int numberOfBlocks, int OreMeta,
		// boolean usingMetaData, Block StoneBlock, int StoneMeta);
	}

	@Override
	protected void setCurrentWorld(World world) {
		this.currentWorld = world;
	}

	@Override
	protected World getCurrentWorld() {
		return this.currentWorld;
	}

	@Override
	protected void decorate() {
		if (Config.GENERATE_ORES_IAPETUS) {
			this.generateOre(26, this.copperGen, 0, 60);
			this.generateOre(23, this.tinGen, 0, 60);
			this.generateOre(20, this.ironGen, 0, 64);
		}
		this.generateOre(15, this.gravelGen, 0, 80);
		this.generateOre(10, this.fossilsGen, 0, 256);
		this.generateOre(90, this.iceGen, 0, 256);

		// generateOre(int amountPerChunk, WorldGenerator worldGenerator, int
		// minY, int maxY);
	}
}
