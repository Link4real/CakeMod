package com.link.mod.cakemod.registry.cakes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ApplePieBlock extends CakeBlock {
    public ApplePieBlock(Settings settings) {
        super(FabricBlockSettings.of(Material.CAKE).ticksRandomly().sounds(BlockSoundGroup.WOOL).nonOpaque());
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0.1f, 0f, 0.1f, 0.9f, 0.4f, 0.9f);
    }
}
