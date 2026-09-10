package com.efs.sdk.memleaksdk.monitor.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class t extends o {
    final transient byte[][] f;
    final transient int[] g;

    public t(l lVar, int i) {
        super(null);
        x.a(lVar.b, 0L, i);
        r rVar = lVar.f688a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = rVar.c;
            int i6 = rVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            rVar = rVar.f;
        }
        this.f = new byte[i4][];
        this.g = new int[i4 * 2];
        r rVar2 = lVar.f688a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f;
            bArr[i7] = rVar2.f693a;
            int i8 = rVar2.c;
            int i9 = rVar2.b;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            rVar2.d = true;
            i7++;
            rVar2 = rVar2.f;
        }
    }

    private o e() {
        return new o(d());
    }

    private Object writeReplace() {
        return e();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public String a() {
        return e().a();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public String b() {
        return e().b();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public int c() {
        return this.g[this.f.length - 1];
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public byte[] d() {
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.c() == c() && a(0, oVar, 0, c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.d = i4;
        return i4;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public String toString() {
        return e().toString();
    }

    private int b(int i) {
        int iBinarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public o a(int i, int i2) {
        return e().a(i, i2);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public byte a(int i) {
        x.a(this.g[this.f.length - 1], i, 1L);
        int iB = b(i);
        int i2 = iB == 0 ? 0 : this.g[iB - 1];
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[iB][(i - i2) + iArr[bArr.length + iB]];
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public boolean a(int i, o oVar, int i2, int i3) {
        if (i < 0 || i > c() - i3) {
            return false;
        }
        int iB = b(i);
        while (i3 > 0) {
            int i4 = iB == 0 ? 0 : this.g[iB - 1];
            int iMin = Math.min(i3, ((this.g[iB] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!oVar.a(i2, bArr[iB], (i - i4) + iArr[bArr.length + iB], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iB++;
        }
        return true;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.o
    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iB = b(i);
        while (i3 > 0) {
            int i4 = iB == 0 ? 0 : this.g[iB - 1];
            int iMin = Math.min(i3, ((this.g[iB] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!x.a(bArr2[iB], (i - i4) + iArr[bArr2.length + iB], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iB++;
        }
        return true;
    }
}
