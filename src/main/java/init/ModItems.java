package init;

import reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import item.*;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems 
{
	public static final ItemL item1 = new Item1();
	
	public static void init()
	{
		GameRegistry.registerItem(item1, "Test");
	}
}
