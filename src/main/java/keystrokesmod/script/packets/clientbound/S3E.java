package keystrokesmod.script.packets.clientbound;

import net.minecraft.network.play.server.S3EPacketTeams;

import java.util.Collection;

public class S3E extends SPacket {
    public String name;
    public String displayName;
    public String prefix;
    public String suffix;
    public String nametagVisibility;
    public Collection<String> playerList;
    public int action;
    public int friendlyFlags;
    public int color;

    public S3E(S3EPacketTeams packet) {
        super(packet);
        this.name = packet.func_149312_c();
        this.displayName = packet.func_149306_d();
        this.prefix = packet.func_149311_e();
        this.suffix = packet.func_149309_f();
        this.nametagVisibility = packet.func_179814_i();
        this.playerList = packet.func_149310_g();
        this.action = packet.func_149307_h();
        this.friendlyFlags = packet.func_149308_i();
        this.color = packet.func_179813_h();
    }
}
