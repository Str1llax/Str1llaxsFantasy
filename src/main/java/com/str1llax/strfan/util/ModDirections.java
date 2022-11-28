package com.str1llax.strfan.util;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

import java.util.Collection;

public class ModDirections extends DirectionProperty{
    protected ModDirections(String s, Collection<Direction> c) {
        super(s, c);
    }
}
