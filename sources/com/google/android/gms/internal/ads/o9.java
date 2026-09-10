package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o9 implements j9 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da f18193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f18194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f18195c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m9 f18196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w9 f18197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n9 f18198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f18200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h3 f18201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18203k;

    public o9(da daVar) {
        this.f18193a = daVar;
        m9 m9Var = new m9();
        m9Var.f17350e = new byte[128];
        this.f18196d = m9Var;
        this.f18203k = C.TIME_UNSET;
        this.f18197e = new w9(178, 0);
        this.f18194b = new np0();
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(boolean z10) {
        n9 n9Var = this.f18198f;
        n9Var.getClass();
        if (z10) {
            n9Var.d(this.f18199g, 0, this.f18202j);
            n9 n9Var2 = this.f18198f;
            n9Var2.f17715a = false;
            n9Var2.f17716b = false;
            n9Var2.f17717c = false;
            n9Var2.f17718d = -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void c(int i10, long j10) {
        this.f18203k = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void e(o2 o2Var, ga gaVar) {
        gaVar.c();
        gaVar.d();
        this.f18200h = gaVar.f14806e;
        gaVar.d();
        h3 h3VarE = o2Var.e(gaVar.f14805d, 2);
        this.f18201i = h3VarE;
        this.f18198f = new n9(h3VarE);
        this.f18193a.a(o2Var, gaVar);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void f(np0 np0Var) {
        w9 w9Var;
        m9 m9Var;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        float f10;
        this.f18198f.getClass();
        this.f18201i.getClass();
        int i14 = np0Var.f17881b;
        int i15 = np0Var.f17882c;
        byte[] bArr = np0Var.f17880a;
        this.f18199g += (long) np0Var.B();
        this.f18201i.b(np0Var.B(), np0Var);
        while (true) {
            int iK = dv.K(bArr, i14, i15, this.f18195c);
            w9Var = this.f18197e;
            m9Var = this.f18196d;
            if (iK == i15) {
                break;
            }
            int i16 = iK + 3;
            byte b10 = np0Var.f17880a[i16];
            int i17 = b10 & 255;
            int i18 = iK - i14;
            if (this.f18202j) {
                i10 = i15;
            } else {
                if (i18 > 0) {
                    m9Var.a(bArr, i14, iK);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                int i20 = m9Var.f17347b;
                if (i20 != 0) {
                    i10 = i15;
                    if (i20 == 1) {
                        i13 = 0;
                        if (i17 != 181) {
                            v71.y("H263Reader", "Unexpected start code value");
                            m9Var.f17346a = false;
                            m9Var.f17348c = 0;
                            m9Var.f17347b = 0;
                        } else {
                            m9Var.f17347b = 2;
                        }
                    } else if (i20 == 2) {
                        i13 = 0;
                        if (i17 > 31) {
                            v71.y("H263Reader", "Unexpected start code value");
                            m9Var.f17346a = false;
                            m9Var.f17348c = 0;
                            m9Var.f17347b = 0;
                        } else {
                            m9Var.f17347b = 3;
                        }
                    } else if (i20 != 3) {
                        if (i17 == 179 || i17 == 181) {
                            m9Var.f17348c -= i19;
                            m9Var.f17346a = false;
                            h3 h3Var = this.f18201i;
                            int i21 = m9Var.f17349d;
                            String str = this.f18200h;
                            str.getClass();
                            byte[] bArrCopyOf = Arrays.copyOf(m9Var.f17350e, m9Var.f17348c);
                            gp0 gp0Var = new gp0(bArrCopyOf, bArrCopyOf.length);
                            gp0Var.l(i21);
                            gp0Var.l(4);
                            gp0Var.e();
                            gp0Var.f(8);
                            if (gp0Var.g()) {
                                gp0Var.f(4);
                                gp0Var.f(3);
                            }
                            int iH = gp0Var.h(4);
                            if (iH == 15) {
                                int iH2 = gp0Var.h(8);
                                int iH3 = gp0Var.h(8);
                                if (iH3 == 0) {
                                    v71.y("H263Reader", "Invalid aspect ratio");
                                    f10 = 1.0f;
                                } else {
                                    f10 = iH2 / iH3;
                                }
                            } else if (iH < 7) {
                                f10 = l[iH];
                            } else {
                                v71.y("H263Reader", "Invalid aspect ratio");
                                f10 = 1.0f;
                            }
                            if (gp0Var.g()) {
                                gp0Var.f(2);
                                gp0Var.f(1);
                                if (gp0Var.g()) {
                                    gp0Var.f(15);
                                    gp0Var.e();
                                    gp0Var.f(15);
                                    gp0Var.e();
                                    gp0Var.f(15);
                                    gp0Var.e();
                                    gp0Var.f(3);
                                    gp0Var.f(11);
                                    gp0Var.e();
                                    gp0Var.f(15);
                                    gp0Var.e();
                                }
                            }
                            if (gp0Var.h(2) != 0) {
                                v71.y("H263Reader", "Unhandled video object layer shape");
                            }
                            gp0Var.e();
                            int iH4 = gp0Var.h(16);
                            gp0Var.e();
                            if (gp0Var.g()) {
                                if (iH4 == 0) {
                                    v71.y("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i22 = iH4 - 1;
                                    int i23 = 0;
                                    while (i22 > 0) {
                                        i22 >>= 1;
                                        i23++;
                                    }
                                    gp0Var.f(i23);
                                }
                            }
                            gp0Var.e();
                            int iH5 = gp0Var.h(13);
                            gp0Var.e();
                            int iH6 = gp0Var.h(13);
                            gp0Var.e();
                            gp0Var.e();
                            i12 i12Var = new i12();
                            i12Var.f15499a = str;
                            i12Var.d("video/mp2t");
                            i12Var.e(MimeTypes.VIDEO_MP4V);
                            i12Var.f15518u = iH5;
                            i12Var.f15519v = iH6;
                            i12Var.A = f10;
                            i12Var.f15514q = Collections.singletonList(bArrCopyOf);
                            h3Var.f(new g22(i12Var));
                            this.f18202j = true;
                        } else {
                            i13 = 0;
                        }
                    } else if ((b10 & 240) != 32) {
                        v71.y("H263Reader", "Unexpected start code value");
                        i13 = 0;
                        m9Var.f17346a = false;
                        m9Var.f17348c = 0;
                        m9Var.f17347b = 0;
                    } else {
                        i13 = 0;
                        m9Var.f17349d = m9Var.f17348c;
                        m9Var.f17347b = 4;
                    }
                } else {
                    i10 = i15;
                    i13 = 0;
                    if (i17 == 176) {
                        m9Var.f17347b = 1;
                        m9Var.f17346a = true;
                    }
                }
                m9Var.a(m9.f17345f, i13, 3);
            }
            this.f18198f.c(bArr, i14, iK);
            if (i18 > 0) {
                w9Var.g(bArr, i14, iK);
                i11 = 0;
            } else {
                i11 = -i18;
            }
            if (w9Var.h(i11)) {
                int iB = dv.b(w9Var.f21461e, w9Var.f21460d);
                String str2 = uu0.f20901a;
                byte[] bArr2 = w9Var.f21460d;
                np0 np0Var2 = this.f18194b;
                np0Var2.z(iB, bArr2);
                this.f18193a.b(this.f18203k, np0Var2);
            }
            if (i17 == 178) {
                z10 = true;
                if (np0Var.f17880a[iK + 2] == 1) {
                    w9Var.f(178);
                }
                i17 = 178;
            } else {
                z10 = true;
            }
            int i24 = i10 - iK;
            this.f18198f.d(this.f18199g - ((long) i24), i24, this.f18202j);
            n9 n9Var = this.f18198f;
            long j10 = this.f18203k;
            n9Var.f17718d = i17;
            n9Var.f17717c = false;
            if (i17 == 182) {
                z11 = z10;
                i12 = i17;
            } else if (i17 == 179) {
                z11 = z10;
                i12 = 179;
            } else {
                i12 = i17;
                z11 = false;
            }
            n9Var.f17715a = z11;
            n9Var.f17716b = i12 == 182 ? z10 : false;
            n9Var.f17719e = 0;
            n9Var.f17721g = j10;
            i14 = i16;
            i15 = i10;
        }
        if (!this.f18202j) {
            m9Var.a(bArr, i14, i15);
        }
        this.f18198f.c(bArr, i14, i15);
        w9Var.g(bArr, i14, i15);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        dv.L(this.f18195c);
        m9 m9Var = this.f18196d;
        m9Var.f17346a = false;
        m9Var.f17348c = 0;
        m9Var.f17347b = 0;
        n9 n9Var = this.f18198f;
        if (n9Var != null) {
            n9Var.f17715a = false;
            n9Var.f17716b = false;
            n9Var.f17717c = false;
            n9Var.f17718d = -1;
        }
        this.f18197e.e();
        this.f18199g = 0L;
        this.f18203k = C.TIME_UNSET;
    }
}
