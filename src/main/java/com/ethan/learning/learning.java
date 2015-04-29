package com.ethan.learning;

import init.ModBlocks;
import init.ModItems;
import init.Recipes;
import proxy.IProxy;
import reference.Reference;
import utility.LogHelper;
import configuration.ConfigurationHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import proxy.*;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = "1.7.10-10.13.2.1291")
public class learning {
	
	@Mod.Instance("learning") 
	learning instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		LogHelper.info("PreInitialization Complete!");
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		Recipes.init();
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initialization Complete!");
	}
	
}
