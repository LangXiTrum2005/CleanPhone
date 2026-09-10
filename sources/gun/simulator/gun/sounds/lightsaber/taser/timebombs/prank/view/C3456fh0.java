package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3456fh0 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4380a = new byte[8];
    public int b;
    public int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int b(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((d[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public final long c(InterfaceC4265ot interfaceC4265ot, boolean z, boolean z2, int i) {
        int i2 = this.b;
        byte[] bArr = this.f4380a;
        if (i2 == 0) {
            if (!interfaceC4265ot.readFully(bArr, 0, 1, z)) {
                return -1L;
            }
            int iB = b(bArr[0] & 255);
            this.c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i3 = this.c;
        if (i3 > i) {
            this.b = 0;
            return -2L;
        }
        if (i3 != 1) {
            interfaceC4265ot.readFully(bArr, 1, i3 - 1);
        }
        this.b = 0;
        return a(bArr, this.c, z2);
    }
}
