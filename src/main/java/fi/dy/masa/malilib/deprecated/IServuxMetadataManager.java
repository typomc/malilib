package fi.dy.masa.malilib.deprecated;

@Deprecated
public interface IServuxMetadataManager
{
    /**
     * Registers a handler for receiving Carpet Hello NBTCompound packets.
     */
    void registerServuxMetadataHandler(IServuxMetadataListener handler);

    /**
     * Un-Registers a handler for receiving Carpet Hello NBTCompound packets.
     */
    void unregisterServuxMetadataHandler(IServuxMetadataListener handler);
}