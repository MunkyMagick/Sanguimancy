package tombenpotter.sanguimancy.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tombenpotter.sanguimancy.Sanguimancy;
import tombenpotter.sanguimancy.blocks.*;

public class BlocksRegistry {

    public static Block altarDiviner;
    public static Block altarEmitter;
    public static Block sacrificeTransfer;

    public static void registerBlocks() {
        altarDiviner = new BlockAltarDiviner(Material.iron);
        GameRegistry.registerBlock(altarDiviner, ItemBlockAltarDiviner.class, "BlockAltarDiviner").setBlockName(Sanguimancy.modid + ".altarDiviner");

        altarEmitter = new BlockAltarEmitter(Material.iron);
        GameRegistry.registerBlock(altarEmitter, ItemBlockAltarEmitter.class, "BlockAltarEmitter").setBlockName(Sanguimancy.modid + ".altarEmitter");

        sacrificeTransfer = new BlockSacrificeTransfer(Material.iron);
        GameRegistry.registerBlock(sacrificeTransfer, "BlockSacrificeTransfer").setBlockName(Sanguimancy.modid + ".sacrificeTransfer");
    }
}
