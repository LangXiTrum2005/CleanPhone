package i1;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f42547h = new h(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f42551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42554g;

    static {
        d5.u.m(0, 1, 2, 3, 4);
        l1.y.G(5);
    }

    public h(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f42548a = i10;
        this.f42549b = i11;
        this.f42550c = i12;
        this.f42551d = bArr;
        this.f42552e = i13;
        this.f42553f = i14;
    }

    public static String a(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? l1.d.e(i10, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? l1.d.e(i10, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 != 6) {
            return i10 != 7 ? l1.d.e(i10, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean e(h hVar) {
        if (hVar == null) {
            return true;
        }
        int i10 = hVar.f42548a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = hVar.f42549b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = hVar.f42550c;
        if ((i12 != -1 && i12 != 3) || hVar.f42551d != null) {
            return false;
        }
        int i13 = hVar.f42553f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = hVar.f42552e;
        return i14 == -1 || i14 == 8;
    }

    public static int f(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f42548a == -1 || this.f42549b == -1 || this.f42550c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f42548a == hVar.f42548a && this.f42549b == hVar.f42549b && this.f42550c == hVar.f42550c && Arrays.equals(this.f42551d, hVar.f42551d) && this.f42552e == hVar.f42552e && this.f42553f == hVar.f42553f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f42554g == 0) {
            this.f42554g = ((((Arrays.hashCode(this.f42551d) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f42548a) * 31) + this.f42549b) * 31) + this.f42550c) * 31)) * 31) + this.f42552e) * 31) + this.f42553f;
        }
        return this.f42554g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f42548a));
        sb2.append(", ");
        sb2.append(a(this.f42549b));
        sb2.append(", ");
        sb2.append(c(this.f42550c));
        sb2.append(", ");
        sb2.append(this.f42551d != null);
        sb2.append(", ");
        int i10 = this.f42552e;
        sb2.append(i10 != -1 ? d5.u.f(i10, "bit Luma") : "NA");
        sb2.append(", ");
        int i11 = this.f42553f;
        return defpackage.e.q(i11 != -1 ? d5.u.f(i11, "bit Chroma") : "NA", ")", sb2);
    }
}
