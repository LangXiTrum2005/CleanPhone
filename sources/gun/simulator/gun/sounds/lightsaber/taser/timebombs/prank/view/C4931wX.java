package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4931wX implements InterfaceC3868kP {
    private final MessageLite defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    public C4931wX(MessageLite messageLite, String str, Object[] objArr) {
        this.defaultInstance = messageLite;
        this.info = str;
        this.objects = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.flags = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3868kP
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public Object[] getObjects() {
        return this.objects;
    }

    public String getStringInfo() {
        return this.info;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3868kP
    public ProtoSyntax getSyntax() {
        return (this.flags & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3868kP
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
