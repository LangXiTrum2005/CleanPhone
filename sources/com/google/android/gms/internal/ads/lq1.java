package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lq1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final lq1 f17101h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f17105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17108g;

    static {
        int i10 = -1;
        f17101h = new lq1(1, 2, 3, i10, i10, null);
        String str = uu0.f20901a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ lq1(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f17102a = i10;
        this.f17103b = i11;
        this.f17104c = i12;
        this.f17105d = bArr;
        this.f17106e = i13;
        this.f17107f = i14;
    }

    public static boolean a(lq1 lq1Var) {
        if (lq1Var == null) {
            return true;
        }
        int i10 = lq1Var.f17102a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = lq1Var.f17103b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = lq1Var.f17104c;
        if ((i12 != -1 && i12 != 3) || lq1Var.f17105d != null) {
            return false;
        }
        int i13 = lq1Var.f17107f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = lq1Var.f17106e;
        return i14 == -1 || i14 == 8;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i10) {
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

    public static String e(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? l1.d.k(new StringBuilder(String.valueOf(i10).length() + 22), "Undefined color space ", i10) : "BT601";
        }
        return "BT709";
    }

    public static String f(int i10) {
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
            return i10 != 7 ? l1.d.k(new StringBuilder(String.valueOf(i10).length() + 25), "Undefined color transfer ", i10) : "HLG";
        }
        return "ST2084 PQ";
    }

    public static String g(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? l1.d.k(new StringBuilder(String.valueOf(i10).length() + 22), "Undefined color range ", i10) : "Limited range";
        }
        return "Full range";
    }

    public final boolean d() {
        return (this.f17102a == -1 || this.f17103b == -1 || this.f17104c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lq1.class == obj.getClass()) {
            lq1 lq1Var = (lq1) obj;
            if (this.f17102a == lq1Var.f17102a && this.f17103b == lq1Var.f17103b && this.f17104c == lq1Var.f17104c && Arrays.equals(this.f17105d, lq1Var.f17105d) && this.f17106e == lq1Var.f17106e && this.f17107f == lq1Var.f17107f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f17108g;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((Arrays.hashCode(this.f17105d) + ((((((this.f17102a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f17103b) * 31) + this.f17104c) * 31)) * 31) + this.f17106e) * 31) + this.f17107f;
        this.f17108g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String strE = e(this.f17102a);
        String strG = g(this.f17103b);
        String strF = f(this.f17104c);
        int i10 = this.f17106e;
        String strI = i10 != -1 ? l1.d.i(new StringBuilder(String.valueOf(i10).length() + 8), i10, "bit Luma") : "NA";
        int i11 = this.f17107f;
        String strI2 = i11 != -1 ? l1.d.i(new StringBuilder(String.valueOf(i11).length() + 10), i11, "bit Chroma") : "NA";
        boolean z10 = this.f17105d != null;
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.i(com.applovin.impl.ca.i(com.applovin.impl.ca.i(com.applovin.impl.ca.i(strE.length() + 12, 2, strG) + strF.length() + 2, 2, String.valueOf(z10)), 2, strI), 1, strI2));
        sb2.append("ColorInfo(");
        sb2.append(strE);
        sb2.append(", ");
        sb2.append(strG);
        sb2.append(", ");
        sb2.append(strF);
        sb2.append(", ");
        sb2.append(z10);
        d5.u.r(sb2, ", ", strI, ", ", strI2);
        sb2.append(")");
        return sb2.toString();
    }
}
