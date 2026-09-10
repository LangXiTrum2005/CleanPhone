package h3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import n2.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f42194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f42196e;

    public q(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        byte b10 = 0;
        int i13 = 1;
        go.k.i((i10 == 0) ^ (bArr2 == null));
        this.f42192a = z10;
        this.f42193b = str;
        this.f42195d = i10;
        this.f42196e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals(C.CENC_TYPE_cbc1)) {
                        b10 = -1;
                    }
                    break;
                case 3046671:
                    b10 = !str.equals(C.CENC_TYPE_cbcs) ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b10 = !str.equals(C.CENC_TYPE_cenc) ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b10 = !str.equals(C.CENC_TYPE_cens) ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                    i13 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    l1.a.s("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f42194c = new z(i13, bArr, i11, i12);
    }
}
