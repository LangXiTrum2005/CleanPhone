package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3798jd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4561a;
    public final String b;
    public final C4238od0 c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    public C3798jd0(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        FW.h((i == 0) ^ (bArr2 == null));
        this.f4561a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbc1)) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    if (!str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbcs)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3049879:
                    if (!str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3049895:
                    if (!str.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cens)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    AbstractC4038mJ.f();
                    break;
            }
        }
        this.c = new C4238od0(i4, bArr, i2, i3);
    }
}
