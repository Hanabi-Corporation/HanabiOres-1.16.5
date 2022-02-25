package net.hanabi.soetch.hanabiores.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.hanabi.soetch.hanabiores.item.ModItemGroup;
import net.hanabi.soetch.hanabiores.item.ModItems;
import net.hanabi.soetch.hanabiores.util.Reference;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    /* This section registers the Ores */
    public static final RegistryObject<Block> LIRIUM_ORE = registerBlock("lirium_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(5f)));
    public static final RegistryObject<Block> AMATITE_ORE = registerBlock("amatite_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(6f)));
    public static final RegistryObject<Block> MAYITH_ORE = registerBlock("mayith_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7f)));
    public static final RegistryObject<Block> SYPHITE_ORE = registerBlock("syphite_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(3).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(8f)));

    /* This section registers the Blocks */
    public static final RegistryObject<Block> LIRIUM_BLOCK = registerBlock("lirium_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7f)));
    public static final RegistryObject<Block> AMATITE_BLOCK = registerBlock("amatite_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7f)));
    public static final RegistryObject<Block> MAYITH_BLOCK = registerBlock("mayith_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK).harvestLevel(2).setRequiresTool().harvestTool(ToolType.PICKAXE).hardnessAndResistance(7f)));

    // Registers the blocks
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    // Registers the blockItems (the inInventory look of blocks)
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.HANABIORES_GROUP)));
    }

    // Adds the Blocks to the eventBus
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
