package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c9 implements j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gp0 f13096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f13097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h3 f13102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13105k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g22 f13106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13108o;

    public c9(int i10, int i11, String str, String str2) {
        this.f13095a = i11;
        switch (i11) {
            case 1:
                gp0 gp0Var = new gp0(new byte[16], 16);
                this.f13096b = gp0Var;
                this.f13097c = new np0(gp0Var.f14921a);
                this.f13103i = 0;
                this.f13104j = 0;
                this.f13105k = false;
                this.f13108o = C.TIME_UNSET;
                this.f13098d = str;
                this.f13099e = i10;
                this.f13100f = str2;
                break;
            default:
                gp0 gp0Var2 = new gp0(new byte[128], 128);
                this.f13096b = gp0Var2;
                this.f13097c = new np0(gp0Var2.f14921a);
                this.f13103i = 0;
                this.f13108o = C.TIME_UNSET;
                this.f13098d = str;
                this.f13099e = i10;
                this.f13100f = str2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(boolean z10) {
        int i10 = this.f13095a;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void c(int i10, long j10) {
        switch (this.f13095a) {
            case 0:
                this.f13108o = j10;
                break;
            default:
                this.f13108o = j10;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void e(o2 o2Var, ga gaVar) {
        switch (this.f13095a) {
            case 0:
                gaVar.c();
                gaVar.d();
                this.f13101g = gaVar.f14806e;
                gaVar.d();
                this.f13102h = o2Var.e(gaVar.f14805d, 1);
                break;
            default:
                gaVar.c();
                gaVar.d();
                this.f13101g = gaVar.f14806e;
                gaVar.d();
                this.f13102h = o2Var.e(gaVar.f14805d, 1);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x032e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0372  */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.j9
    public final void f(np0 np0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        int i15;
        byte b10;
        int iH;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        switch (this.f13095a) {
            case 0:
                this.f13102h.getClass();
                while (np0Var.B() > 0) {
                    int i25 = this.f13103i;
                    np0 np0Var2 = this.f13097c;
                    if (i25 == 0) {
                        while (np0Var.B() > 0) {
                            if (this.f13105k) {
                                int iK = np0Var.K();
                                if (iK == 119) {
                                    this.f13105k = false;
                                    this.f13103i = 1;
                                    byte[] bArr = np0Var2.f17880a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f13104j = 2;
                                }
                                this.f13105k = iK == 11;
                            } else {
                                this.f13105k = np0Var.K() == 11;
                            }
                            break;
                        }
                    } else if (i25 != 1) {
                        int iMin = Math.min(np0Var.B(), this.f13107n - this.f13104j);
                        this.f13102h.b(iMin, np0Var);
                        int i26 = this.f13104j + iMin;
                        this.f13104j = i26;
                        if (i26 == this.f13107n) {
                            ps1.c0(this.f13108o != C.TIME_UNSET);
                            this.f13102h.c(this.f13108o, 1, this.f13107n, 0, null);
                            this.f13108o += this.l;
                            this.f13103i = 0;
                        }
                    } else {
                        byte[] bArr2 = np0Var2.f17880a;
                        int iMin2 = Math.min(np0Var.B(), 128 - this.f13104j);
                        np0Var.H(bArr2, this.f13104j, iMin2);
                        int i27 = this.f13104j + iMin2;
                        this.f13104j = i27;
                        if (i27 == 128) {
                            gp0 gp0Var = this.f13096b;
                            gp0Var.d(0);
                            int[] iArr = x10.f21679e;
                            int[] iArr2 = x10.f21677c;
                            int i28 = (gp0Var.f14922b * 8) + gp0Var.f14923c;
                            gp0Var.f(40);
                            int iH2 = gp0Var.h(5);
                            gp0Var.d(i28);
                            if (iH2 > 10) {
                                gp0Var.f(16);
                                int iH3 = gp0Var.h(2);
                                if (iH3 == 0) {
                                    b10 = 0;
                                } else if (iH3 != 1) {
                                    b10 = iH3 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b10 = 1;
                                }
                                gp0Var.f(3);
                                int iH4 = gp0Var.h(11) + 1;
                                int iH5 = gp0Var.h(2);
                                if (iH5 == 3) {
                                    i15 = x10.f21678d[gp0Var.h(2)];
                                    iH = 3;
                                    i16 = 6;
                                } else {
                                    iH = gp0Var.h(2);
                                    int i29 = x10.f21676b[iH];
                                    i15 = iArr2[iH5];
                                    i16 = i29;
                                }
                                i14 = iH4 + iH4;
                                int i30 = (i14 * i15) / (i16 * 32);
                                int iH6 = gp0Var.h(3);
                                boolean zG = gp0Var.g();
                                i12 = iArr[iH6] + (zG ? 1 : 0);
                                gp0Var.f(10);
                                if (gp0Var.g()) {
                                    gp0Var.f(8);
                                }
                                if (iH6 == 0) {
                                    gp0Var.f(5);
                                    if (gp0Var.g()) {
                                        gp0Var.f(8);
                                    }
                                    i17 = 0;
                                    iH6 = 0;
                                } else {
                                    i17 = iH6;
                                }
                                if (b10 == 1) {
                                    if (gp0Var.g()) {
                                        gp0Var.f(16);
                                    }
                                    b10 = 1;
                                }
                                if (gp0Var.g()) {
                                    if (i17 > 2) {
                                        gp0Var.f(2);
                                    }
                                    if ((i17 & 1) == 0 || i17 <= 2) {
                                        i21 = 6;
                                    } else {
                                        i21 = 6;
                                        gp0Var.f(6);
                                    }
                                    if ((i17 & 4) != 0) {
                                        gp0Var.f(i21);
                                    }
                                    if (zG && gp0Var.g()) {
                                        gp0Var.f(5);
                                    }
                                    if (b10 == 0) {
                                        if (gp0Var.g()) {
                                            i22 = 6;
                                            gp0Var.f(6);
                                        } else {
                                            i22 = 6;
                                        }
                                        if (i17 == 0 && gp0Var.g()) {
                                            gp0Var.f(i22);
                                        }
                                        if (gp0Var.g()) {
                                            gp0Var.f(i22);
                                        }
                                        int iH7 = gp0Var.h(2);
                                        if (iH7 == 1) {
                                            gp0Var.f(5);
                                            i23 = 2;
                                        } else {
                                            if (iH7 == 2) {
                                                gp0Var.f(12);
                                            } else if (iH7 == 3) {
                                                int iH8 = gp0Var.h(5);
                                                if (gp0Var.g()) {
                                                    gp0Var.f(5);
                                                    if (gp0Var.g()) {
                                                        i24 = 4;
                                                        gp0Var.f(4);
                                                    } else {
                                                        i24 = 4;
                                                    }
                                                    if (gp0Var.g()) {
                                                        gp0Var.f(i24);
                                                    }
                                                    if (gp0Var.g()) {
                                                        gp0Var.f(i24);
                                                    }
                                                    if (gp0Var.g()) {
                                                        gp0Var.f(i24);
                                                    }
                                                    if (gp0Var.g()) {
                                                        gp0Var.f(i24);
                                                    }
                                                    if (gp0Var.g()) {
                                                        gp0Var.f(i24);
                                                    }
                                                    if (gp0Var.g()) {
                                                        gp0Var.f(i24);
                                                    }
                                                    if (gp0Var.g()) {
                                                        if (gp0Var.g()) {
                                                            gp0Var.f(i24);
                                                        }
                                                        if (gp0Var.g()) {
                                                            gp0Var.f(i24);
                                                        }
                                                    }
                                                }
                                                if (gp0Var.g()) {
                                                    gp0Var.f(5);
                                                    if (gp0Var.g()) {
                                                        gp0Var.f(7);
                                                        if (gp0Var.g()) {
                                                            gp0Var.f(8);
                                                            i23 = 2;
                                                        } else {
                                                            i23 = 2;
                                                        }
                                                    } else {
                                                        i23 = 2;
                                                    }
                                                } else {
                                                    i23 = 2;
                                                }
                                                gp0Var.f((iH8 + i23) * 8);
                                                gp0Var.k();
                                            }
                                            i23 = 2;
                                        }
                                        if (i17 < i23) {
                                            if (gp0Var.g()) {
                                                gp0Var.f(14);
                                            }
                                            if (iH6 == 0 && gp0Var.g()) {
                                                gp0Var.f(14);
                                            }
                                        }
                                        if (!gp0Var.g()) {
                                            i18 = iH;
                                        } else if (iH == 0) {
                                            gp0Var.f(5);
                                            i18 = 0;
                                        } else {
                                            for (int i31 = 0; i31 < i16; i31++) {
                                                if (gp0Var.g()) {
                                                    gp0Var.f(5);
                                                }
                                            }
                                            i18 = iH;
                                        }
                                        b10 = 0;
                                    } else {
                                        i18 = iH;
                                    }
                                } else {
                                    i18 = iH;
                                }
                                if (gp0Var.g()) {
                                    gp0Var.f(5);
                                    if (i17 == 2) {
                                        gp0Var.f(4);
                                        i17 = 2;
                                    }
                                    if (i17 >= 6) {
                                        gp0Var.f(2);
                                    }
                                    if (gp0Var.g()) {
                                        i20 = 8;
                                        gp0Var.f(8);
                                    } else {
                                        i20 = 8;
                                    }
                                    if (i17 == 0 && gp0Var.g()) {
                                        gp0Var.f(i20);
                                    }
                                    if (iH5 < 3) {
                                        gp0Var.e();
                                    }
                                }
                                if (b10 == 0 && i18 != 3) {
                                    gp0Var.e();
                                }
                                if (b10 == 2 && (i18 == 3 || gp0Var.g())) {
                                    i19 = 6;
                                    gp0Var.f(6);
                                } else {
                                    i19 = 6;
                                }
                                str = (gp0Var.g() && gp0Var.h(i19) == 1 && gp0Var.h(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
                                i13 = i16 * NotificationCompat.FLAG_LOCAL_ONLY;
                                i10 = i30;
                            } else {
                                gp0Var.f(32);
                                int iH9 = gp0Var.h(2);
                                String str2 = iH9 == 3 ? null : MimeTypes.AUDIO_AC3;
                                int iH10 = gp0Var.h(6);
                                i10 = x10.f21680f[iH10 / 2] * 1000;
                                int iA = x10.A(iH9, iH10);
                                gp0Var.f(8);
                                int iH11 = gp0Var.h(3);
                                if ((iH11 & 1) == 0 || iH11 == 1) {
                                    i11 = 2;
                                } else {
                                    i11 = 2;
                                    gp0Var.f(2);
                                }
                                if ((iH11 & 4) != 0) {
                                    gp0Var.f(i11);
                                }
                                if (iH11 == i11) {
                                    gp0Var.f(i11);
                                }
                                int i32 = iH9 < 3 ? iArr2[iH9] : -1;
                                i12 = iArr[iH11] + (gp0Var.g() ? 1 : 0);
                                i13 = 1536;
                                str = str2;
                                i14 = iA;
                                i15 = i32;
                            }
                            g22 g22Var = this.f13106m;
                            if (g22Var == null || i12 != g22Var.G || i15 != g22Var.I || !Objects.equals(str, g22Var.f14678o)) {
                                i12 i12Var = new i12();
                                i12Var.f15499a = this.f13101g;
                                i12Var.d(this.f13100f);
                                i12Var.e(str);
                                i12Var.F = i12;
                                i12Var.H = i15;
                                i12Var.f15502d = this.f13098d;
                                i12Var.f15504f = this.f13099e;
                                i12Var.f15507i = i10;
                                if (MimeTypes.AUDIO_AC3.equals(str)) {
                                    i12Var.f15506h = i10;
                                }
                                g22 g22Var2 = new g22(i12Var);
                                this.f13106m = g22Var2;
                                this.f13102h.f(g22Var2);
                            }
                            this.f13107n = i14;
                            this.l = (((long) i13) * 1000000) / ((long) this.f13106m.I);
                            np0Var2.E(0);
                            this.f13102h.b(128, np0Var2);
                            this.f13103i = 2;
                        }
                    }
                }
                break;
            default:
                this.f13102h.getClass();
                while (np0Var.B() > 0) {
                    int i33 = this.f13103i;
                    np0 np0Var3 = this.f13097c;
                    if (i33 == 0) {
                        while (true) {
                            if (np0Var.B() > 0) {
                                if (this.f13105k) {
                                    int iK2 = np0Var.K();
                                    this.f13105k = iK2 == 172;
                                    if (iK2 == 64) {
                                        byte b11 = iK2 == 65;
                                        this.f13103i = 1;
                                        byte[] bArr3 = np0Var3.f17880a;
                                        bArr3[0] = -84;
                                        bArr3[1] = true == b11 ? (byte) 65 : (byte) 64;
                                        this.f13104j = 2;
                                    } else if (iK2 == 65) {
                                    }
                                    this.f13103i = 1;
                                    byte[] bArr4 = np0Var3.f17880a;
                                    bArr4[0] = -84;
                                    bArr4[1] = true == b11 ? (byte) 65 : (byte) 64;
                                    this.f13104j = 2;
                                } else {
                                    this.f13105k = np0Var.K() == 172;
                                }
                            }
                        }
                    } else if (i33 != 1) {
                        int iMin3 = Math.min(np0Var.B(), this.f13107n - this.f13104j);
                        this.f13102h.b(iMin3, np0Var);
                        int i34 = this.f13104j + iMin3;
                        this.f13104j = i34;
                        if (i34 == this.f13107n) {
                            ps1.c0(this.f13108o != C.TIME_UNSET);
                            this.f13102h.c(this.f13108o, 1, this.f13107n, 0, null);
                            this.f13108o += this.l;
                            this.f13103i = 0;
                        }
                    } else {
                        byte[] bArr5 = np0Var3.f17880a;
                        int iMin4 = Math.min(np0Var.B(), 16 - this.f13104j);
                        np0Var.H(bArr5, this.f13104j, iMin4);
                        int i35 = this.f13104j + iMin4;
                        this.f13104j = i35;
                        if (i35 == 16) {
                            gp0 gp0Var2 = this.f13096b;
                            gp0Var2.d(0);
                            t0 t0VarN = rb0.n(gp0Var2);
                            int i36 = t0VarN.f20103a;
                            g22 g22Var3 = this.f13106m;
                            if (g22Var3 == null || g22Var3.G != 2 || i36 != g22Var3.I || !"audio/ac4".equals(g22Var3.f14678o)) {
                                i12 i12Var2 = new i12();
                                i12Var2.f15499a = this.f13101g;
                                i12Var2.d(this.f13100f);
                                i12Var2.e("audio/ac4");
                                i12Var2.F = 2;
                                i12Var2.H = i36;
                                i12Var2.f15502d = this.f13098d;
                                i12Var2.f15504f = this.f13099e;
                                g22 g22Var4 = new g22(i12Var2);
                                this.f13106m = g22Var4;
                                this.f13102h.f(g22Var4);
                            }
                            this.f13107n = t0VarN.f20104b;
                            this.l = (((long) t0VarN.f20105c) * 1000000) / ((long) this.f13106m.I);
                            np0Var3.E(0);
                            this.f13102h.b(16, np0Var3);
                            this.f13103i = 2;
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        switch (this.f13095a) {
            case 0:
                this.f13103i = 0;
                this.f13104j = 0;
                this.f13105k = false;
                this.f13108o = C.TIME_UNSET;
                break;
            default:
                this.f13103i = 0;
                this.f13104j = 0;
                this.f13105k = false;
                this.f13108o = C.TIME_UNSET;
                break;
        }
    }

    private final void b(boolean z10) {
    }

    private final void d(boolean z10) {
    }
}
