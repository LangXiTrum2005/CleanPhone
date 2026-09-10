package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements q7, k3.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18559g;

    public p8(List list, int i10) {
        switch (i10) {
            case 1:
                this.f18559g = new l1.q();
                int size = list.size();
                String str = C.SANS_SERIF_NAME;
                if (size == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
                    byte[] bArr = (byte[]) list.get(0);
                    this.f18554b = bArr[24];
                    this.f18555c = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                    this.f18556d = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? C.SERIF_NAME : str;
                    int i11 = bArr[25] * 20;
                    this.f18558f = i11;
                    boolean z10 = (bArr[0] & 32) != 0;
                    this.f18553a = z10;
                    if (!z10) {
                        this.f18557e = 0.85f;
                    } else {
                        this.f18557e = l1.y.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
                    }
                } else {
                    this.f18554b = 0;
                    this.f18555c = -1;
                    this.f18556d = C.SANS_SERIF_NAME;
                    this.f18553a = false;
                    this.f18557e = 0.85f;
                    this.f18558f = -1;
                }
                break;
            default:
                this.f18559g = new np0();
                int size2 = list.size();
                String str2 = C.SANS_SERIF_NAME;
                if (size2 == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
                    byte[] bArr2 = (byte[]) list.get(0);
                    this.f18554b = bArr2[24];
                    this.f18555c = ((bArr2[26] & 255) << 24) | ((bArr2[27] & 255) << 16) | ((bArr2[28] & 255) << 8) | (bArr2[29] & 255);
                    this.f18556d = true == "Serif".equals(new String(bArr2, 43, bArr2.length + (-43), StandardCharsets.UTF_8)) ? C.SERIF_NAME : str2;
                    int i12 = bArr2[25] * 20;
                    this.f18558f = i12;
                    boolean z11 = (bArr2[0] & 32) != 0;
                    this.f18553a = z11;
                    if (!z11) {
                        this.f18557e = 0.85f;
                    } else {
                        this.f18557e = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(((bArr2[11] & 255) | ((bArr2[10] & 255) << 8)) / i12, 0.95f));
                    }
                } else {
                    this.f18554b = 0;
                    this.f18555c = -1;
                    this.f18556d = C.SANS_SERIF_NAME;
                    this.f18553a = false;
                    this.f18557e = 0.85f;
                    this.f18558f = -1;
                }
                break;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    l1.d.m(3, spannableStringBuilder, i12, i13, i15);
                } else {
                    l1.d.m(1, spannableStringBuilder, i12, i13, i15);
                }
            } else if (z11) {
                l1.d.m(2, spannableStringBuilder, i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            l1.d.m(0, spannableStringBuilder, i12, i13, i15);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    l1.d.m(3, spannableStringBuilder, i12, i13, i15);
                } else {
                    l1.d.m(1, spannableStringBuilder, i12, i13, i15);
                    z10 = false;
                }
            } else if (i17 != 0) {
                l1.d.m(2, spannableStringBuilder, i12, i13, i15);
            } else {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else {
                if (i16 != 0 || z10) {
                    return;
                }
                l1.d.m(0, spannableStringBuilder, i12, i13, i15);
            }
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.q7
    public void b(int i10, int i11, b2.d0 d0Var, byte[] bArr) {
        String strK;
        int i12;
        int i13;
        float f10;
        int i14;
        float fMax;
        int i15;
        np0 np0Var = (np0) this.f18559g;
        np0Var.z(i10 + i11, bArr);
        np0Var.E(i10);
        int i16 = 0;
        int i17 = 1;
        int i18 = 2;
        ps1.v(np0Var.B() >= 2);
        int iL = np0Var.L();
        if (iL == 0) {
            strK = "";
        } else {
            int i19 = np0Var.f17881b;
            Charset charsetQ = np0Var.q();
            int i20 = np0Var.f17881b - i19;
            if (charsetQ == null) {
                charsetQ = StandardCharsets.UTF_8;
            }
            strK = np0Var.k(iL - i20, charsetQ);
        }
        if (strK.isEmpty()) {
            aa1 aa1Var = ca1.f13122b;
            d0Var.mo161zza(new m7(ya1.f22208e, C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK);
        int length = spannableStringBuilder.length();
        int i21 = this.f18554b;
        d(spannableStringBuilder, i21, 0, 0, length, 16711680);
        int i22 = i21;
        int length2 = spannableStringBuilder.length();
        int i23 = this.f18555c;
        f(spannableStringBuilder, i23, -1, 0, length2, 16711680);
        int i24 = i23;
        int length3 = spannableStringBuilder.length();
        String str = this.f18556d;
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f11 = this.f18557e;
        while (np0Var.B() >= 8) {
            int i25 = np0Var.f17881b;
            int iB = np0Var.b();
            int iB2 = np0Var.b();
            if (iB2 == 1937013100) {
                ps1.v(np0Var.B() >= i18 ? i17 : i16);
                int iL2 = np0Var.L();
                int i26 = i16;
                while (i26 < iL2) {
                    ps1.v(np0Var.B() >= 12 ? i17 : i16);
                    int iL3 = np0Var.L();
                    int iL4 = np0Var.L();
                    np0Var.G(i18);
                    int i27 = iL2;
                    int iK = np0Var.K();
                    np0Var.G(i17);
                    int iB3 = np0Var.b();
                    if (iL4 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.i(String.valueOf(iL4).length() + 44, 2, String.valueOf(length4)));
                        sb2.append("Truncating styl end (");
                        sb2.append(iL4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length4);
                        sb2.append(").");
                        v71.y("Tx3gParser", sb2.toString());
                        iL4 = spannableStringBuilder.length();
                    }
                    if (iL3 >= iL4) {
                        StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.i(String.valueOf(iL3).length() + 36, 2, String.valueOf(iL4)));
                        sb3.append("Ignoring styl with start (");
                        sb3.append(iL3);
                        sb3.append(") >= end (");
                        sb3.append(iL4);
                        sb3.append(").");
                        v71.y("Tx3gParser", sb3.toString());
                        i15 = i24;
                    } else {
                        d(spannableStringBuilder, iK, i22, iL3, iL4, 0);
                        i15 = i24;
                        f(spannableStringBuilder, iB3, i15, iL3, iL4, 0);
                    }
                    iL2 = i27;
                    i24 = i15;
                    f11 = f11;
                    i22 = i22;
                    i17 = 1;
                    i18 = 2;
                    i26++;
                    i16 = 0;
                }
                i12 = i22;
                i13 = i24;
                f10 = f11;
                i14 = i18;
            } else {
                i12 = i22;
                i13 = i24;
                f10 = f11;
                if (iB2 == 1952608120 && this.f18553a) {
                    i14 = 2;
                    ps1.v(np0Var.B() >= 2);
                    float fL = np0Var.L();
                    String str2 = uu0.f20901a;
                    fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(fL / this.f18558f, 0.95f));
                } else {
                    i14 = 2;
                }
                np0Var.E(i25 + iB);
                i18 = i14;
                i24 = i13;
                i16 = 0;
                i17 = 1;
                f11 = fMax;
                i22 = i12;
            }
            fMax = f10;
            np0Var.E(i25 + iB);
            i18 = i14;
            i24 = i13;
            i16 = 0;
            i17 = 1;
            f11 = fMax;
            i22 = i12;
        }
        d0Var.mo161zza(new m7(ca1.u(new l80(spannableStringBuilder, null, null, null, f11, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0)), C.TIME_UNSET, C.TIME_UNSET));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k3.m
    public void e(byte[] bArr, int i10, int i11, k3.l lVar, l1.g gVar) {
        String strX;
        int i12;
        l1.q qVar = (l1.q) this.f18559g;
        qVar.K(bArr, i10 + i11);
        qVar.M(i10);
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        go.k.i(qVar.a() >= 2);
        int iG = qVar.G();
        if (iG == 0) {
            strX = "";
        } else {
            int i16 = qVar.f44814b;
            Charset charsetI = qVar.I();
            int i17 = iG - (qVar.f44814b - i16);
            if (charsetI == null) {
                charsetI = StandardCharsets.UTF_8;
            }
            strX = qVar.x(i17, charsetI);
        }
        if (strX.isEmpty()) {
            oa.f0 f0Var = oa.j0.f47265b;
            gVar.accept(new k3.a(oa.n1.f47281e, C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strX);
        c(spannableStringBuilder, this.f18554b, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f18555c, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f18556d;
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.f18557e;
        while (qVar.a() >= 8) {
            int i18 = qVar.f44814b;
            int iM = qVar.m();
            int iM2 = qVar.m();
            if (iM2 == 1937013100) {
                go.k.i(qVar.a() >= i15 ? i13 : i14);
                int iG2 = qVar.G();
                int i19 = i14;
                while (i19 < iG2) {
                    go.k.i(qVar.a() >= 12 ? i13 : i14);
                    int iG3 = qVar.G();
                    int iG4 = qVar.G();
                    qVar.N(i15);
                    int i20 = i19;
                    int iZ = qVar.z();
                    qVar.N(i13);
                    int iM3 = qVar.m();
                    if (iG4 > spannableStringBuilder.length()) {
                        StringBuilder sbU = defpackage.e.u(iG4, "Truncating styl end (", ") to cueText.length() (");
                        sbU.append(spannableStringBuilder.length());
                        sbU.append(").");
                        l1.a.s("Tx3gParser", sbU.toString());
                        iG4 = spannableStringBuilder.length();
                    }
                    if (iG3 >= iG4) {
                        l1.a.s("Tx3gParser", l1.d.f("Ignoring styl with start (", iG3, ") >= end (", iG4, ")."));
                    } else {
                        int i21 = iG4;
                        c(spannableStringBuilder, iZ, this.f18554b, iG3, i21, 0);
                        a(spannableStringBuilder, iM3, this.f18555c, iG3, i21, 0);
                    }
                    i19 = i20 + 1;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i12 = i15;
            } else if (iM2 == 1952608120 && this.f18553a) {
                i12 = 2;
                go.k.i(qVar.a() >= 2);
                fI = l1.y.i(qVar.G() / this.f18558f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
            } else {
                i12 = 2;
            }
            qVar.M(i18 + iM);
            i15 = i12;
            i13 = 1;
            i14 = 0;
        }
        gVar.accept(new k3.a(oa.j0.B(new k1.b(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0)), C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // k3.m
    public int i() {
        return 2;
    }
}
