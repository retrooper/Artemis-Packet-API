package ac.artemis.packet.spigot.wrappers;

import cc.ghast.packet.nms.ProtocolVersion;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.function.Predicate;

@Getter
@Setter
public abstract class GPacket {
    protected UUID uuid;
    protected ProtocolVersion version;
    protected final static ProtocolVersion gameVersion = ProtocolVersion.getGameVersion();
    protected final Predicate<ProtocolVersion>[] versionPredicate;
    protected final long timestamp;
    protected boolean cancelled;
    protected final String realName;

    public GPacket(String realName, UUID player, ProtocolVersion version, Predicate<ProtocolVersion>... versionPredicate) {
        this.realName = realName;
        this.versionPredicate = versionPredicate;
        this.uuid = player;
        this.version = version;
        this.timestamp = System.currentTimeMillis();
    }

    public GPacket(String realName, UUID player, ProtocolVersion version) {
        this(realName, player, version, new Predicate[0]);
    }


    public GPacket(String realName) {
        this(realName, null, null);
    }

    public Player getPlayer() {
        return Bukkit.getPlayer(uuid);
    }

}
