package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4081mn implements InterfaceC3989ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f4716a;

    public C4081mn(ByteBuffer byteBuffer) {
        this.f4716a = byteBuffer;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3989ll
    public final Object a() {
        ByteBuffer byteBuffer = this.f4716a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public final short c(int i) {
        ByteBuffer byteBuffer = this.f4716a;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    public C4081mn(byte[] bArr, int i) {
        this.f4716a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3989ll
    public final void b() {
    }
}
