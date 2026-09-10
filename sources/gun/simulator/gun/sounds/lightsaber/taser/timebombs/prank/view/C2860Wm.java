package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2860Wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3938a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final C3456fh0 c = new C3456fh0();
    public NN d;
    public int e;
    public int f;
    public long g;

    public final long a(InterfaceC4265ot interfaceC4265ot, int i) {
        byte[] bArr = this.f3938a;
        interfaceC4265ot.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
