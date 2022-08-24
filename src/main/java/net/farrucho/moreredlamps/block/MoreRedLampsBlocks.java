package net.farrucho.moreredlamps.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.farrucho.moreredlamps.MoreRedLamps;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreRedLampsBlocks {

    /*public static final Block BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp", new BlueRedstoneLampBlock(FabricBlockSettings.of(Material.WOOL).luminance(state -> state.get(BlueRedstoneLampBlock.LIT) ? 15 : 0)),ItemGroup.MISC);*/
    // if state.get(BlueRedstoneLampBlock.LIT) == True:
    //      return 15
    // else
    //      return 0

    public static final Block RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);

    public static final Block YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);

    public static final Block BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);

    public static final Block BLACK_REDSTONE_LAMP = registerBlock("black_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);

    public static final Block WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);

    public static final Block GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);

    public static final Block ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);

    public static final Block PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);

    public static final Block PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp", new RedstoneLampBlock(FabricBlockSettings.of(Material.REDSTONE_LAMP).luminance(state -> state.get(RedstoneLampBlock.LIT) ? 15 : 0)), ItemGroup.REDSTONE);





    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MoreRedLamps.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MoreRedLamps.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static void registerModBlock() {
        MoreRedLamps.LOGGER.debug("Registando blocos para " + MoreRedLamps.MOD_ID);

    }
}
