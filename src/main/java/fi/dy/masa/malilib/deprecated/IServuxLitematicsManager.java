package fi.dy.masa.malilib.deprecated;

@Deprecated
public interface IServuxLitematicsManager
{
    /**
     * Registers a handler for receiving Carpet Hello NBTCompound packets.
     */
    void registerServuxLitematicsHandler(IServuxLitematicsListener handler);

    /**
     * Un-Registers a handler for receiving Carpet Hello NBTCompound packets.
     */
    void unregisterServuxLitematicsHandler(IServuxLitematicsListener handler);
}