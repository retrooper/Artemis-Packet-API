package cc.ghast.packet.wrapper.packet.play.server;

import ac.artemis.packet.protocol.ProtocolVersion;
import ac.artemis.packet.spigot.protocol.PacketLink;
import ac.artemis.packet.wrapper.server.PacketPlayServerBlockAction;
import cc.ghast.packet.buffer.ProtocolByteBuf;
import ac.artemis.packet.spigot.wrappers.GPacket;
import cc.ghast.packet.wrapper.packet.ReadableBuffer;

import java.util.UUID;

@PacketLink(PacketPlayServerBlockAction.class)
public class GPacketPlayServerBlockAction extends GPacket implements PacketPlayServerBlockAction, ReadableBuffer  {
    public GPacketPlayServerBlockAction(UUID player, ProtocolVersion version) {
        super("PacketPlayOutBlockAction", player, version);
    }

    @Override
    public void read(ProtocolByteBuf byteBuf) {
    }
}
