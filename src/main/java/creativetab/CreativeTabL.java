package creativetab;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import reference.Reference;

public class CreativeTabL 
{
	public static final CreativeTabs L_TAB = new CreativeTabs(Reference.MOD_ID)
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItems.item1;
		}
		
		@Override
		public String getTranslatedTabLabel()
		{
			return "learning";
		}
	};
}
