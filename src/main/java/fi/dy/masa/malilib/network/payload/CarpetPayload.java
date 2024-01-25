package fi.dy.masa.malilib.network.payload;

import fi.dy.masa.malilib.network.PayloadTypeRegister;
import fi.dy.masa.malilib.network.PayloadTypes;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public record CarpetPayload(NbtCompound data) implements CustomPayload
{
    public static final Id<CarpetPayload> TYPE = new Id<>(PayloadTypeRegister.getIdentifier(PayloadTypes.PayloadType.CARPET_HELLO));
    public static final PacketCodec<PacketByteBuf, CarpetPayload> CODEC = CustomPayload.codecOf(CarpetPayload::write, CarpetPayload::new);

    public CarpetPayload(PacketByteBuf buf) { this(buf.readNbt()); }
    private void write(PacketByteBuf buf) { buf.writeNbt(data); }
    @Override
    public Id<? extends CustomPayload> getId() { return TYPE; }
}