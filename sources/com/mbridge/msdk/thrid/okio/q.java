package com.mbridge.msdk.thrid.okio;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class q extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient byte[][] f36820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final transient int[] f36821g;

    public q(c cVar, int i10) {
        super(null);
        u.a(cVar.f36779b, 0L, i10);
        o oVar = cVar.f36778a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = oVar.f36813c;
            int i15 = oVar.f36812b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            oVar = oVar.f36816f;
        }
        this.f36820f = new byte[i13][];
        this.f36821g = new int[i13 * 2];
        o oVar2 = cVar.f36778a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f36820f;
            bArr[i16] = oVar2.f36811a;
            int i17 = oVar2.f36813c;
            int i18 = oVar2.f36812b;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.f36821g;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            oVar2.f36814d = true;
            i16++;
            oVar2 = oVar2.f36816f;
        }
    }

    private int b(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.f36821g, 0, this.f36820f.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private f n() {
        return new f(l());
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f a(int i10, int i11) {
        return n().a(i10, i11);
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String d() {
        return n().d();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.j() == j() && a(0, fVar, 0, j())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String g() {
        return n().g();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f h() {
        return n().h();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public int hashCode() {
        int i10 = this.f36784b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f36820f.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f36820f[i11];
            int[] iArr = this.f36821g;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f36784b = i12;
        return i12;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f i() {
        return n().i();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public int j() {
        return this.f36821g[this.f36820f.length - 1];
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public f k() {
        return n().k();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public byte[] l() {
        int[] iArr = this.f36821g;
        byte[][] bArr = this.f36820f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f36821g;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f36820f[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String m() {
        return n().m();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public String toString() {
        return n().toString();
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public byte a(int i10) {
        u.a(this.f36821g[this.f36820f.length - 1], i10, 1L);
        int iB = b(i10);
        int i11 = iB == 0 ? 0 : this.f36821g[iB - 1];
        int[] iArr = this.f36821g;
        byte[][] bArr = this.f36820f;
        return bArr[iB][(i10 - i11) + iArr[bArr.length + iB]];
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public void a(c cVar) {
        int length = this.f36820f.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f36821g;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            o oVar = new o(this.f36820f[i10], i12, (i12 + i13) - i11, true, false);
            o oVar2 = cVar.f36778a;
            if (oVar2 == null) {
                oVar.f36817g = oVar;
                oVar.f36816f = oVar;
                cVar.f36778a = oVar;
            } else {
                oVar2.f36817g.a(oVar);
            }
            i10++;
            i11 = i13;
        }
        cVar.f36779b += (long) i11;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean a(int i10, f fVar, int i11, int i12) {
        if (i10 < 0 || i10 > j() - i12) {
            return false;
        }
        int iB = b(i10);
        while (i12 > 0) {
            int i13 = iB == 0 ? 0 : this.f36821g[iB - 1];
            int iMin = Math.min(i12, ((this.f36821g[iB] - i13) + i13) - i10);
            int[] iArr = this.f36821g;
            byte[][] bArr = this.f36820f;
            if (!fVar.a(i11, bArr[iB], (i10 - i13) + iArr[bArr.length + iB], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iB++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.f
    public boolean a(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > j() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iB = b(i10);
        while (i12 > 0) {
            int i13 = iB == 0 ? 0 : this.f36821g[iB - 1];
            int iMin = Math.min(i12, ((this.f36821g[iB] - i13) + i13) - i10);
            int[] iArr = this.f36821g;
            byte[][] bArr2 = this.f36820f;
            if (!u.a(bArr2[iB], (i10 - i13) + iArr[bArr2.length + iB], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iB++;
        }
        return true;
    }
}
