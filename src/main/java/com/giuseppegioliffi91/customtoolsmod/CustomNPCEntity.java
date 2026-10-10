package com.giuseppegioliffi91.customtoolsmod;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.world.World;

public
class CustomNPCEntity extends PassiveEntity {
    public CustomNPCEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public PassiveEntity createChild(PassiveEntity entity) {
        return null;
    }
}
