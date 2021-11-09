package com.link.mod.cakemod.registry;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class CroptopiaCakeItem extends BlockItem {
    public CroptopiaCakeItem(Block block, Settings settings) {
        super(block, settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.cakemod.croptopia.tooltip").formatted(Formatting.WHITE));
    }
}
