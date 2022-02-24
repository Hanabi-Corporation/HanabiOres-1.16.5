package net.hanabi.soetch.hanabiores.world.gen;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
import net.hanabi.soetch.hanabiores.block.ModBlocks;

public enum OreType {
    LIRIUM(Lazy.of(ModBlocks.LIRIUM_ORE), 5, 20, 40),
    AMATITE(Lazy.of(ModBlocks.AMATITE_ORE), 4, 15, 35),
    MAYITH(Lazy.of(ModBlocks.MAYITH_ORE), 3, 10, 30),
    SYPHITE(Lazy.of(ModBlocks.SYPHITE_ORE), 3, 5, 20);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for(OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
