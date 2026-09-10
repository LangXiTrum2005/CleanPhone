package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final st0 f22198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f22199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f22205h;

    public y9(int i10) {
        switch (i10) {
            case 1:
                this.f22198a = new st0();
                this.f22203f = C.TIME_UNSET;
                this.f22204g = C.TIME_UNSET;
                this.f22205h = C.TIME_UNSET;
                this.f22199b = new np0();
                break;
            default:
                this.f22198a = new st0();
                this.f22203f = C.TIME_UNSET;
                this.f22204g = C.TIME_UNSET;
                this.f22205h = C.TIME_UNSET;
                this.f22199b = new np0();
                break;
        }
    }

    public static long a(np0 np0Var) {
        int i10 = np0Var.f17881b;
        if (np0Var.B() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        np0Var.H(bArr, 0, 9);
        np0Var.E(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return C.TIME_UNSET;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return C.TIME_UNSET;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return C.TIME_UNSET;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
    }

    public static final int c(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public void b(n2 n2Var) {
        byte[] bArr = uu0.f20902b;
        int length = bArr.length;
        this.f22199b.z(0, bArr);
        this.f22200c = true;
        n2Var.zzl();
    }
}
