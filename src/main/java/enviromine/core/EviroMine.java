package enviromine.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = EviroMine.MODID, name = EviroMine.NAME, version = EviroMine.VERSION)
public class EviroMine
{
    public static final String MODID = "emr";
    public static final String NAME = "EviroMine Refourbished";
    public static final String VERSION = "0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("Hi from eviromine!");
    }
}
