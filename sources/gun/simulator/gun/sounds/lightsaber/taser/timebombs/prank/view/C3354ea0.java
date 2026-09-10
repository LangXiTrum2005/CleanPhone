package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.StructuralMessageInfo$Builder;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ea0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3354ea0 implements InterfaceC3868kP {
    private final int[] checkInitialized;
    private final MessageLite defaultInstance;
    private final com.google.protobuf.S[] fields;
    private final boolean messageSetWireFormat;
    private final ProtoSyntax syntax;

    public C3354ea0(ProtoSyntax protoSyntax, boolean z, int[] iArr, com.google.protobuf.S[] sArr, Object obj) {
        this.syntax = protoSyntax;
        this.messageSetWireFormat = z;
        this.checkInitialized = iArr;
        this.fields = sArr;
        this.defaultInstance = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    public static StructuralMessageInfo$Builder newBuilder() {
        return new StructuralMessageInfo$Builder();
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3868kP
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public com.google.protobuf.S[] getFields() {
        return this.fields;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3868kP
    public ProtoSyntax getSyntax() {
        return this.syntax;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3868kP
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static StructuralMessageInfo$Builder newBuilder(int i) {
        return new StructuralMessageInfo$Builder(i);
    }
}
