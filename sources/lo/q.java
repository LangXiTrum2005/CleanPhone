package lo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient byte[][] f45669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int[] f45670f;

    public q(byte[][] bArr, int[] iArr) {
        super(h.f45638d.f45639a);
        this.f45669e = bArr;
        this.f45670f = iArr;
    }

    private final Object writeReplace() {
        return new h(o());
    }

    @Override // lo.h
    public final h a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f45669e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f45670f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.n.c(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // lo.h
    public final int d() {
        return this.f45670f[this.f45669e.length - 1];
    }

    @Override // lo.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.d() == d() && k(hVar, d());
    }

    @Override // lo.h
    public final String g() {
        return new h(o()).g();
    }

    @Override // lo.h
    public final byte[] h() {
        return o();
    }

    @Override // lo.h
    public final int hashCode() {
        int i10 = this.f45640b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f45669e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f45670f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f45640b = i12;
        return i12;
    }

    @Override // lo.h
    public final byte i(int i10) {
        byte[][] bArr = this.f45669e;
        int length = bArr.length - 1;
        int[] iArr = this.f45670f;
        com.google.android.gms.internal.auth.i.b(iArr[length], i10, 1L);
        int iB = mo.b.b(this, i10);
        return bArr[iB][(i10 - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // lo.h
    public final boolean j(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.n.f(other, "other");
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = mo.b.b(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f45670f;
            int i14 = iB == 0 ? 0 : iArr[iB - 1];
            int i15 = iArr[iB] - i14;
            byte[][] bArr = this.f45669e;
            int i16 = iArr[bArr.length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!com.google.android.gms.internal.auth.i.a(bArr[iB], (i10 - i14) + i16, other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // lo.h
    public final boolean k(h other, int i10) {
        kotlin.jvm.internal.n.f(other, "other");
        if (d() - i10 >= 0) {
            int iB = mo.b.b(this, 0);
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int[] iArr = this.f45670f;
                int i13 = iB == 0 ? 0 : iArr[iB - 1];
                int i14 = iArr[iB] - i13;
                byte[][] bArr = this.f45669e;
                int i15 = iArr[bArr.length + iB];
                int iMin = Math.min(i10, i14 + i13) - i11;
                if (other.j(i12, bArr[iB], (i11 - i13) + i15, iMin)) {
                    i12 += iMin;
                    i11 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // lo.h
    public final h l() {
        return new h(o()).l();
    }

    @Override // lo.h
    public final void n(e eVar, int i10) {
        int iB = mo.b.b(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f45670f;
            int i12 = iB == 0 ? 0 : iArr[iB - 1];
            int i13 = iArr[iB] - i12;
            byte[][] bArr = this.f45669e;
            int i14 = iArr[bArr.length + iB];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            o oVar = new o(bArr[iB], i15, i15 + iMin, true);
            o oVar2 = eVar.f45636a;
            if (oVar2 == null) {
                oVar.f45665g = oVar;
                oVar.f45664f = oVar;
                eVar.f45636a = oVar;
            } else {
                o oVar3 = oVar2.f45665g;
                kotlin.jvm.internal.n.c(oVar3);
                oVar3.b(oVar);
            }
            i11 += iMin;
            iB++;
        }
        eVar.f45637b += (long) i10;
    }

    public final byte[] o() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f45669e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f45670f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            xj.k.g0(bArr2[i10], i12, i13, bArr, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // lo.h
    public final String toString() {
        return new h(o()).toString();
    }
}
