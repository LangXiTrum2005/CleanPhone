package f3;

import n2.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f40613d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40614a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40616c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f40613d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final long b(l lVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.f40615b;
        byte[] bArr = this.f40614a;
        if (i12 == 0) {
            if (!lVar.readFully(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((f40613d[i14] & ((long) i13)) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.f40616c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f40615b = 1;
        }
        int i15 = this.f40616c;
        if (i15 > i10) {
            this.f40615b = 0;
            return -2L;
        }
        if (i15 != 1) {
            lVar.readFully(bArr, 1, i15 - 1);
        }
        this.f40615b = 0;
        return a(bArr, this.f40616c, z11);
    }
}
