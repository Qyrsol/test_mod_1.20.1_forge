package net.qyrsol.megamod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.qyrsol.megamod.block.ModBlocks;

public class MegaDetectorItem extends Item {
    public MegaDetectorItem(Properties pProperties) {
        super(pProperties);
    }

    // Adds a property to the "Mega detector" item
    // When item used on a block, it replaces it with "Raw steel block" block

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if (!pContext.getLevel().isClientSide) {
            BlockPos blockPosition = pContext.getClickedPos();

            pContext.getLevel().setBlock(blockPosition,
                    ModBlocks.RAW_STEEL_BLOCK.get().defaultBlockState(), 1);
        }
        return InteractionResult.SUCCESS;
    }
}
