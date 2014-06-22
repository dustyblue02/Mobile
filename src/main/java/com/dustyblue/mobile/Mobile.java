package com.dustyblue.mobile;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="Mobile", name="Mobile" ,version="1.7.2-1.0")
public class Mobile
{
    @Mod.Instance
    public static Mobile instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        //Items and Blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // GUI, TileEntities, Crafting
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        // WrapUp, after other mods
    }
}
