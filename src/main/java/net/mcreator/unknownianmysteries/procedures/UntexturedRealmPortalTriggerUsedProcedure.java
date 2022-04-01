package net.mcreator.unknownianmysteries.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;

import net.mcreator.unknownianmysteries.UnknownianmysteriesMod;

import java.util.Map;

public class UntexturedRealmPortalTriggerUsedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency world for procedure UntexturedRealmPortalTriggerUsed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				UnknownianmysteriesMod.LOGGER.warn("Failed to load dependency itemstack for procedure UntexturedRealmPortalTriggerUsed!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (world.isRemote()) {
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		}
		(itemstack).shrink((int) 1);
	}
}
