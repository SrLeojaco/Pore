package net.amigocraft.pore.implementation.entity.minecart;

import org.apache.commons.lang.NotImplementedException;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.PoweredMinecart;

public class PorePoweredMinecart extends PoreMinecart implements PoweredMinecart {

	//TODO: make constructor as specific as possible
	protected PorePoweredMinecart(org.spongepowered.api.entity.LivingEntity handle){
		super(handle);
	}

	public static PorePoweredMinecart of(org.spongepowered.api.entity.Entity handle){
		throw new NotImplementedException();
	}

	@Override
	public EntityType getType(){
		return EntityType.MINECART_FURNACE;
	}

}
