package fi.dy.masa.malilib.network.client;

import net.minecraft.network.packet.CustomPayload;

public interface IClientPlayHandler
{
    <P extends CustomPayload> void registerClientPlayHandler(IPluginClientPlayHandler<P> handler);
    <P extends CustomPayload> void unregisterClientPlayHandler(IPluginClientPlayHandler<P> handler);
}
