package fi.dy.masa.malilib.deprecated;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

@Deprecated
public interface IServuxStructuresListener
{
    /**
     * Used by downstream mods to "reset()" their register status of the listener
     */
    default void reset() { }
    /**
     * Used by downstream mods when they receive a ServuxStructuresPayload to decode
     * @param data (Data contained in the payload)
     * @param ctx (Context packet is received by)
     * @param id (Pass the Payload Channel Id())
     */
    default void receiveServuxStructures(NbtCompound data, ClientPlayNetworking.Context ctx, Identifier id) { }
    /**
     * Used by downstream mods when they decode a ServuxStructuresPayload
     * @param data (Data contained in the payload)
     * @param id (Pass the Payload Channel Id())
     */
    default void decodeServuxStructures(NbtCompound data, Identifier id) { }
    /**
     * Used by the downstream mod to encode the data for sending a ServuxStructuresPayload
     * @param data (Data to be encapsulated in the Payload)
     * @param id (Pass the Payload Channel Id())
     */
    default void encodeServuxStructures(NbtCompound data, Identifier id) { }
    /**
     * Used by the downstream mod to send an encoded ServuxStructuresPayload
     * @param data (Data to be encapsulated in the Payload)
     */
    default void sendServuxStructures(NbtCompound data) { }
}