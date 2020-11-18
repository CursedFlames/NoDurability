package cursedflames.nodurability.mixin;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Item.class)
public abstract class MixinItem {
	/**
	 * @author CursedFlames
	 * @reason memes
	 */
	@Overwrite
	public final int getMaxDamage() {
		return 0;
	}

	/**
	 * @author CursedFlames
	 * @reason memes
	 */
	@Overwrite
	public boolean isDamageable() {
		return false;
	}
}
