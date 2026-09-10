package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class CW {
    public boolean c;
    public boolean d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc0 f2925a = new Mc0(0);
    public long f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long g = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public final JT b = new JT();

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(JT jt) {
        int i = jt.b;
        if (jt.a() < 9) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        jt.d(bArr, 0, 9);
        jt.E(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    public final void a(InterfaceC4265ot interfaceC4265ot) {
        byte[] bArr = Ug0.e;
        JT jt = this.b;
        jt.getClass();
        jt.C(bArr, bArr.length);
        this.c = true;
        interfaceC4265ot.resetPeekPosition();
    }
}
