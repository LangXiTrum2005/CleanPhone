package z2;

import com.google.android.gms.internal.ads.o6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d5.u;
import i1.b0;
import i1.d0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import l1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f54630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f54632h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f54625a = i10;
        this.f54626b = str;
        this.f54627c = str2;
        this.f54628d = i11;
        this.f54629e = i12;
        this.f54630f = i13;
        this.f54631g = i14;
        this.f54632h = bArr;
    }

    public static a d(q qVar) {
        int iM = qVar.m();
        String strN = d0.n(qVar.x(qVar.m(), StandardCharsets.US_ASCII));
        String strX = qVar.x(qVar.m(), StandardCharsets.UTF_8);
        int iM2 = qVar.m();
        int iM3 = qVar.m();
        int iM4 = qVar.m();
        int iM5 = qVar.m();
        int iM6 = qVar.m();
        byte[] bArr = new byte[iM6];
        qVar.k(bArr, 0, iM6);
        return new a(iM, strN, strX, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // i1.b0
    public final void b(o6 o6Var) {
        o6Var.a(this.f54625a, this.f54632h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f54625a == aVar.f54625a && this.f54626b.equals(aVar.f54626b) && this.f54627c.equals(aVar.f54627c) && this.f54628d == aVar.f54628d && this.f54629e == aVar.f54629e && this.f54630f == aVar.f54630f && this.f54631g == aVar.f54631g && Arrays.equals(this.f54632h, aVar.f54632h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54632h) + ((((((((u.e(u.e((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f54625a) * 31, 31, this.f54626b), 31, this.f54627c) + this.f54628d) * 31) + this.f54629e) * 31) + this.f54630f) * 31) + this.f54631g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f54626b + ", description=" + this.f54627c;
    }
}
