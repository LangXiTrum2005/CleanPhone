package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4031mC implements InterfaceC4257on {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f4687a;

    public C4031mC(ByteBuffer byteBuffer) {
        this.f4687a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4257on
    public final int b() {
        return (e() << 8) | e();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4257on
    public final int c(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f4687a;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4257on
    public final short e() throws C4169nn {
        ByteBuffer byteBuffer = this.f4687a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C4169nn();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4257on
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f4687a;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }
}
