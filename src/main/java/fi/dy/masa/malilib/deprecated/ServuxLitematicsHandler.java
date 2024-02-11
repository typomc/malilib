package fi.dy.masa.malilib.deprecated;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface Handler for Servux Litematics packets (Syncmatica / Litematica ?)
 */
@Deprecated
public class ServuxLitematicsHandler implements IServuxLitematicsManager
{
    private static final ServuxLitematicsHandler INSTANCE = new ServuxLitematicsHandler();
    private final List<IServuxLitematicsListener> handlers = new ArrayList<>();
    public static IServuxLitematicsManager getInstance() { return INSTANCE; }
    @Override
    public void registerServuxLitematicsHandler(IServuxLitematicsListener handler)
    {
        if (!this.handlers.contains(handler))
        {
            this.handlers.add(handler);
        }
    }
    @Override
    public void unregisterServuxLitematicsHandler(IServuxLitematicsListener handler)
    {
        this.handlers.remove(handler);
    }

    /**
     * NOT PUBLIC API - DO NOT CALL
     */
    public void reset()
    {
        if (!this.handlers.isEmpty())
        {
            for (IServuxLitematicsListener handler : this.handlers)
            {
                handler.reset();
            }
        }
    }
    public void receiveServuxLitematics(NbtCompound data, ClientPlayNetworking.Context ctx, Identifier id)
    {
        if (!this.handlers.isEmpty())
        {
            for (IServuxLitematicsListener handler : this.handlers)
            {
                handler.receiveServuxLitematics(data, ctx, id);
            }
        }
    }
    public void decodeServuxLitematics(NbtCompound data, Identifier id)
    {
        if (!this.handlers.isEmpty())
        {
            for (IServuxLitematicsListener handler : this.handlers)
            {
                handler.decodeServuxLitematics(data, id);
            }
        }
    }
    public void sendServuxLitematics(NbtCompound data)
    {
        // Downstream mods should implement this
    }
    public void encodeServuxLitematics(NbtCompound data, Identifier id)
    {
        // Downstream mods should implement this
    }
}