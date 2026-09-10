package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class A30 implements Internal.EnumVerifier {
    static final Internal.EnumVerifier INSTANCE = new A30();

    private A30() {
    }

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i) {
        return B30.forNumber(i) != null;
    }
}
