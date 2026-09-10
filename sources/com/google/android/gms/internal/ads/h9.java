package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h9 implements j9, u3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f15208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15218k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15220n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f15221o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f15222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f15223q;

    public h9(String str, int i10, int i11, int i12) {
        switch (i12) {
            case 1:
                this.f15221o = new l1.q(new byte[i11]);
                this.f15213f = 0;
                this.f15220n = C.TIME_UNSET;
                this.f15208a = new AtomicInteger();
                this.l = -1;
                this.f15219m = -1;
                this.f15209b = str;
                this.f15210c = i10;
                this.f15211d = "video/mp2t";
                break;
            default:
                this.f15221o = new np0(new byte[i11]);
                this.f15213f = 0;
                this.f15220n = C.TIME_UNSET;
                this.f15208a = new AtomicInteger();
                this.l = -1;
                this.f15219m = -1;
                this.f15209b = str;
                this.f15210c = i10;
                this.f15211d = "video/mp2t";
                break;
        }
    }

    @Override // u3.f
    public void b(l1.q qVar) throws i1.e0 {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long jU;
        int i18;
        long jU2;
        int i19;
        int i20;
        int i21;
        int i22;
        l1.q qVar2 = (l1.q) this.f15221o;
        ((n2.a0) this.f15222p).getClass();
        while (qVar.a() > 0) {
            switch (this.f15213f) {
                case 0:
                    while (qVar.a() > 0) {
                        int i23 = this.f15215h << 8;
                        this.f15215h = i23;
                        int iZ = i23 | qVar.z();
                        this.f15215h = iZ;
                        int iL = n2.b.l(iZ);
                        this.f15218k = iL;
                        if (iL != 0) {
                            byte[] bArr = qVar2.f44813a;
                            int i24 = this.f15215h;
                            bArr[0] = (byte) ((i24 >> 24) & 255);
                            bArr[1] = (byte) ((i24 >> 16) & 255);
                            bArr[2] = (byte) ((i24 >> 8) & 255);
                            bArr[3] = (byte) (i24 & 255);
                            this.f15214g = 4;
                            this.f15215h = 0;
                            if (iL != 3 && iL != 4) {
                                if (iL == 1) {
                                    this.f15213f = 1;
                                } else {
                                    this.f15213f = 2;
                                }
                            }
                            this.f15213f = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (i(qVar, qVar2.f44813a, 18)) {
                        byte[] bArr2 = qVar2.f44813a;
                        if (((i1.p) this.f15223q) == null) {
                            String str = this.f15212e;
                            xd1 xd1VarN = n2.b.n(bArr2);
                            xd1VarN.t(60);
                            int i25 = n2.b.f46432j[xd1VarN.i(6)];
                            int i26 = n2.b.f46433k[xd1VarN.i(4)];
                            int i27 = xd1VarN.i(5);
                            int i28 = i27 >= 29 ? -1 : (n2.b.l[i27] * 1000) / 2;
                            xd1VarN.t(10);
                            int i29 = i25 + (xd1VarN.i(2) > 0 ? 1 : 0);
                            i1.o oVar = new i1.o();
                            oVar.f42589a = str;
                            oVar.l = i1.d0.n(this.f15211d);
                            oVar.f42600m = i1.d0.n(MimeTypes.AUDIO_DTS);
                            oVar.f42596h = i28;
                            oVar.E = i29;
                            oVar.F = i26;
                            oVar.f42604q = null;
                            oVar.f42592d = this.f15209b;
                            oVar.f42594f = this.f15210c;
                            i1.p pVar = new i1.p(oVar);
                            this.f15223q = pVar;
                            ((n2.a0) this.f15222p).b(pVar);
                        }
                        this.f15217j = n2.b.j(bArr2);
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i10 = (bArr2[4] & 7) << 4;
                                b11 = bArr2[7];
                            } else if (b12 != 31) {
                                i10 = (bArr2[4] & 1) << 6;
                                b10 = bArr2[5];
                            } else {
                                i10 = (bArr2[5] & 7) << 4;
                                b11 = bArr2[6];
                            }
                            i11 = b11 & 60;
                            this.f15216i = com.bumptech.glide.c.c(l1.y.S(((i1.p) this.f15223q).G, (((i11 >> 2) | i10) + 1) * 32));
                            qVar2.M(0);
                            ((n2.a0) this.f15222p).g(18, qVar2);
                            this.f15213f = 6;
                        } else {
                            i10 = (bArr2[5] & 1) << 6;
                            b10 = bArr2[4];
                        }
                        i11 = b10 & 252;
                        this.f15216i = com.bumptech.glide.c.c(l1.y.S(((i1.p) this.f15223q).G, (((i11 >> 2) | i10) + 1) * 32));
                        qVar2.M(0);
                        ((n2.a0) this.f15222p).g(18, qVar2);
                        this.f15213f = 6;
                        break;
                    }
                    break;
                case 2:
                    if (i(qVar, qVar2.f44813a, 7)) {
                        xd1 xd1VarN2 = n2.b.n(qVar2.f44813a);
                        xd1VarN2.t(42);
                        this.l = xd1VarN2.i(xd1VarN2.h() ? 12 : 8) + 1;
                        this.f15213f = 3;
                    }
                    break;
                case 3:
                    int i30 = 8;
                    if (i(qVar, qVar2.f44813a, this.l)) {
                        xd1 xd1VarN3 = n2.b.n(qVar2.f44813a);
                        xd1VarN3.t(40);
                        int i31 = xd1VarN3.i(2);
                        if (xd1VarN3.h()) {
                            i12 = 20;
                            i13 = 12;
                        } else {
                            i12 = 16;
                            i13 = 8;
                        }
                        xd1VarN3.t(i13);
                        int i32 = xd1VarN3.i(i12) + 1;
                        boolean zH = xd1VarN3.h();
                        if (zH) {
                            i14 = xd1VarN3.i(2);
                            i15 = (xd1VarN3.i(3) + 1) * 512;
                            if (xd1VarN3.h()) {
                                xd1VarN3.t(36);
                            }
                            int i33 = xd1VarN3.i(3) + 1;
                            int i34 = xd1VarN3.i(3) + 1;
                            if (i33 != 1 || i34 != 1) {
                                throw i1.e0.c("Multiple audio presentations or assets not supported");
                            }
                            int i35 = i31 + 1;
                            int i36 = xd1VarN3.i(i35);
                            int i37 = 0;
                            while (i37 < i35) {
                                if (((i36 >> i37) & 1) == 1) {
                                    xd1VarN3.t(i30);
                                }
                                i37++;
                                i30 = 8;
                            }
                            if (xd1VarN3.h()) {
                                xd1VarN3.t(2);
                                int i38 = (xd1VarN3.i(2) + 1) << 2;
                                int i39 = xd1VarN3.i(2) + 1;
                                for (int i40 = 0; i40 < i39; i40++) {
                                    xd1VarN3.t(i38);
                                }
                            }
                        } else {
                            i14 = -1;
                            i15 = 0;
                        }
                        xd1VarN3.t(i12);
                        xd1VarN3.t(12);
                        if (zH) {
                            if (xd1VarN3.h()) {
                                xd1VarN3.t(4);
                            }
                            if (xd1VarN3.h()) {
                                xd1VarN3.t(24);
                            }
                            if (xd1VarN3.h()) {
                                xd1VarN3.u(xd1VarN3.i(10) + 1);
                            }
                            xd1VarN3.t(5);
                            int i41 = n2.b.f46434m[xd1VarN3.i(4)];
                            i16 = xd1VarN3.i(8) + 1;
                            i17 = i41;
                        } else {
                            i16 = -1;
                            i17 = -2147483647;
                        }
                        if (zH) {
                            if (i14 == 0) {
                                i18 = 32000;
                            } else if (i14 == 1) {
                                i18 = 44100;
                            } else {
                                if (i14 != 2) {
                                    throw i1.e0.a(null, "Unsupported reference clock code in DTS HD header: " + i14);
                                }
                                i18 = 48000;
                            }
                            String str2 = l1.y.f44830a;
                            jU = l1.y.U(i15, 1000000L, i18, RoundingMode.DOWN);
                        } else {
                            jU = -9223372036854775807L;
                        }
                        j(new n2.a(MimeTypes.AUDIO_DTS_EXPRESS, i16, i17, i32, jU));
                        this.f15217j = i32;
                        this.f15216i = jU == C.TIME_UNSET ? 0L : jU;
                        qVar2.M(0);
                        ((n2.a0) this.f15222p).g(this.l, qVar2);
                        this.f15213f = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (i(qVar, qVar2.f44813a, 6)) {
                        xd1 xd1VarN4 = n2.b.n(qVar2.f44813a);
                        xd1VarN4.t(32);
                        int iV = n2.b.v(xd1VarN4, n2.b.f46439r) + 1;
                        this.f15219m = iV;
                        int i42 = this.f15214g;
                        if (i42 > iV) {
                            int i43 = i42 - iV;
                            this.f15214g = i42 - i43;
                            qVar.M(qVar.f44814b - i43);
                        }
                        this.f15213f = 5;
                    }
                    break;
                case 5:
                    if (i(qVar, qVar2.f44813a, this.f15219m)) {
                        byte[] bArr3 = qVar2.f44813a;
                        xd1 xd1VarN5 = n2.b.n(bArr3);
                        int i44 = xd1VarN5.i(32) == 1078008818 ? 1 : 0;
                        int iV2 = n2.b.v(xd1VarN5, n2.b.f46435n);
                        int i45 = iV2 + 1;
                        if (i44 == 0) {
                            jU2 = -9223372036854775807L;
                            i19 = -2147483647;
                        } else {
                            if (!xd1VarN5.h()) {
                                throw i1.e0.c("Only supports full channel mask-based audio presentation");
                            }
                            int i46 = iV2 - 1;
                            int i47 = ((bArr3[i46] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (bArr3[iV2] & 255);
                            String str3 = l1.y.f44830a;
                            int i48 = 65535;
                            for (int i49 = 0; i49 < i46; i49++) {
                                byte b13 = bArr3[i49];
                                int i50 = (((i48 >> 12) & 255) ^ ((b13 & 255) >> 4)) & 255;
                                int i51 = (i48 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                int[] iArr = l1.y.f44840k;
                                int i52 = (iArr[i50] ^ i51) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                i48 = (iArr[((b13 & 15) ^ ((i52 >> 12) & 255)) & 255] ^ ((i52 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                            }
                            if (i47 != i48) {
                                throw i1.e0.a(null, "CRC check failed");
                            }
                            int i53 = xd1VarN5.i(2);
                            if (i53 != 0) {
                                if (i53 == 1) {
                                    i21 = 480;
                                } else {
                                    if (i53 != 2) {
                                        throw i1.e0.a(null, "Unsupported base duration index in DTS UHD header: " + i53);
                                    }
                                    i21 = 384;
                                }
                                i20 = 3;
                            } else {
                                i20 = 3;
                                i21 = 512;
                            }
                            int i54 = (xd1VarN5.i(i20) + 1) * i21;
                            int i55 = xd1VarN5.i(2);
                            if (i55 == 0) {
                                i22 = 32000;
                            } else if (i55 == 1) {
                                i22 = 44100;
                            } else {
                                if (i55 != 2) {
                                    throw i1.e0.a(null, "Unsupported clock rate index in DTS UHD header: " + i55);
                                }
                                i22 = 48000;
                            }
                            if (xd1VarN5.h()) {
                                xd1VarN5.t(36);
                            }
                            int i56 = i22 * (1 << xd1VarN5.i(2));
                            jU2 = l1.y.U(i54, 1000000L, i22, RoundingMode.DOWN);
                            i19 = i56;
                        }
                        int iV3 = 0;
                        for (int i57 = 0; i57 < i44; i57++) {
                            iV3 += n2.b.v(xd1VarN5, n2.b.f46436o);
                        }
                        AtomicInteger atomicInteger = this.f15208a;
                        if (i44 != 0) {
                            atomicInteger.set(n2.b.v(xd1VarN5, n2.b.f46437p));
                        }
                        int iV4 = iV3 + (atomicInteger.get() != 0 ? n2.b.v(xd1VarN5, n2.b.f46438q) : 0) + i45;
                        n2.a aVar = new n2.a("audio/vnd.dts.uhd;profile=p2", 2, i19, iV4, jU2);
                        if (this.f15218k == 3) {
                            j(aVar);
                        }
                        this.f15217j = iV4;
                        this.f15216i = jU2 == C.TIME_UNSET ? 0L : jU2;
                        qVar2.M(0);
                        ((n2.a0) this.f15222p).g(this.f15219m, qVar2);
                        this.f15213f = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(qVar.a(), this.f15217j - this.f15214g);
                    ((n2.a0) this.f15222p).g(iMin, qVar);
                    int i58 = this.f15214g + iMin;
                    this.f15214g = i58;
                    if (i58 == this.f15217j) {
                        go.k.t(this.f15220n != C.TIME_UNSET);
                        ((n2.a0) this.f15222p).a(this.f15220n, this.f15218k == 4 ? 0 : 1, this.f15217j, 0, null);
                        this.f15220n += this.f15216i;
                        this.f15213f = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void c(int i10, long j10) {
        this.f15220n = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void e(o2 o2Var, ga gaVar) {
        gaVar.c();
        gaVar.d();
        this.f15212e = gaVar.f14806e;
        gaVar.d();
        this.f15222p = o2Var.e(gaVar.f14805d, 1);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void f(np0 np0Var) throws ab {
        long jV;
        int i10;
        int i11;
        int i12;
        int iH;
        int iH2;
        long jV2;
        int i13;
        int i14;
        byte b10;
        int i15;
        byte b11;
        np0 np0Var2 = (np0) this.f15221o;
        ((h3) this.f15222p).getClass();
        while (np0Var.B() > 0) {
            int i16 = this.f15213f;
            if (i16 == 0) {
                while (np0Var.B() > 0) {
                    int i17 = this.f15215h << 8;
                    this.f15215h = i17;
                    int iK = i17 | np0Var.K();
                    this.f15215h = iK;
                    int iA = v71.a(iK);
                    this.f15218k = iA;
                    if (iA != 0) {
                        byte[] bArr = np0Var2.f17880a;
                        int i18 = this.f15215h;
                        bArr[0] = (byte) ((i18 >> 24) & 255);
                        bArr[1] = (byte) ((i18 >> 16) & 255);
                        bArr[2] = (byte) ((i18 >> 8) & 255);
                        bArr[3] = (byte) (i18 & 255);
                        this.f15214g = 4;
                        this.f15215h = 0;
                        if (iA != 3 && iA != 4) {
                            if (iA == 1) {
                                this.f15213f = 1;
                                break;
                            } else {
                                this.f15213f = 2;
                                break;
                            }
                        }
                        this.f15213f = 4;
                        break;
                    }
                }
            } else if (i16 != 1) {
                if (i16 != 2) {
                    int iH3 = -2147483647;
                    if (i16 != 3) {
                        if (i16 != 4) {
                            if (i16 != 5) {
                                int iMin = Math.min(np0Var.B(), this.f15217j - this.f15214g);
                                ((h3) this.f15222p).b(iMin, np0Var);
                                int i19 = this.f15214g + iMin;
                                this.f15214g = i19;
                                if (i19 == this.f15217j) {
                                    ps1.c0(this.f15220n != C.TIME_UNSET);
                                    ((h3) this.f15222p).c(this.f15220n, this.f15218k == 4 ? 0 : 1, this.f15217j, 0, null);
                                    this.f15220n += this.f15216i;
                                    this.f15213f = 0;
                                }
                            } else if (k(np0Var, np0Var2.f17880a, this.f15219m)) {
                                byte[] bArr2 = np0Var2.f17880a;
                                gp0 gp0VarR = v71.R(bArr2);
                                int iH4 = gp0VarR.h(32);
                                int iN = v71.N(gp0VarR, v71.f21082e);
                                int i20 = iN + 1;
                                char c4 = iH4 == 1078008818 ? (char) 1 : (char) 0;
                                if (c4 == 0) {
                                    jV = -9223372036854775807L;
                                } else {
                                    if (!gp0VarR.g()) {
                                        throw ab.b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i21 = iN - 1;
                                    int i22 = bArr2[i21] << 8;
                                    int i23 = bArr2[iN] & 255;
                                    String str = uu0.f20901a;
                                    char c5 = 65535;
                                    for (int i24 = 0; i24 < i21; i24++) {
                                        int unsignedInt = Byte.toUnsignedInt(bArr2[i24]);
                                        int[] iArr = uu0.f20908h;
                                        char c10 = (char) (iArr[((c5 >> '\f') ^ (unsignedInt >> 4)) & 255] ^ ((char) (c5 << 4)));
                                        c5 = (char) (((char) (c10 << 4)) ^ iArr[((c10 >> '\f') ^ (unsignedInt & 15)) & 255]);
                                    }
                                    if ((((char) i22) | i23) != c5) {
                                        throw ab.a(null, "CRC check failed");
                                    }
                                    int iH5 = gp0VarR.h(2);
                                    if (iH5 == 0) {
                                        i10 = 512;
                                    } else if (iH5 == 1) {
                                        i10 = 480;
                                    } else {
                                        if (iH5 != 2) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(iH5).length() + 51);
                                            sb2.append("Unsupported base duration index in DTS UHD header: ");
                                            sb2.append(iH5);
                                            throw ab.a(null, sb2.toString());
                                        }
                                        i10 = 384;
                                    }
                                    int iH6 = gp0VarR.h(3) + 1;
                                    int iH7 = gp0VarR.h(2);
                                    if (iH7 == 0) {
                                        i11 = 32000;
                                    } else if (iH7 == 1) {
                                        i11 = 44100;
                                    } else {
                                        if (iH7 != 2) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(iH7).length() + 48);
                                            sb3.append("Unsupported clock rate index in DTS UHD header: ");
                                            sb3.append(iH7);
                                            throw ab.a(null, sb3.toString());
                                        }
                                        i11 = 48000;
                                    }
                                    if (gp0VarR.g()) {
                                        gp0VarR.f(36);
                                    }
                                    iH3 = i11 * (1 << gp0VarR.h(2));
                                    jV = uu0.v(i10 * iH6, 1000000L, i11, RoundingMode.DOWN);
                                }
                                int iN2 = 0;
                                for (char c11 = 0; c11 < c4; c11 = 1) {
                                    iN2 += v71.N(gp0VarR, v71.f21083f);
                                }
                                for (int i25 = 0; i25 <= 0; i25++) {
                                    AtomicInteger atomicInteger = this.f15208a;
                                    if (c4 != 0) {
                                        atomicInteger.set(v71.N(gp0VarR, v71.f21084g));
                                    }
                                    iN2 += atomicInteger.get() != 0 ? v71.N(gp0VarR, v71.f21085h) : 0;
                                }
                                int i26 = i20 + iN2;
                                long j10 = jV;
                                v1 v1Var = new v1("audio/vnd.dts.uhd;profile=p2", 2, iH3, i26, j10);
                                if (this.f15218k == 3) {
                                    l(v1Var);
                                }
                                this.f15217j = i26;
                                if (j10 == C.TIME_UNSET) {
                                    j10 = 0;
                                }
                                this.f15216i = j10;
                                np0Var2.E(0);
                                ((h3) this.f15222p).b(this.f15219m, np0Var2);
                                this.f15213f = 6;
                            } else {
                                continue;
                            }
                        } else if (k(np0Var, np0Var2.f17880a, 6)) {
                            gp0 gp0VarR2 = v71.R(np0Var2.f17880a);
                            gp0VarR2.f(32);
                            int iN3 = v71.N(gp0VarR2, v71.f21086i) + 1;
                            this.f15219m = iN3;
                            int i27 = this.f15214g;
                            if (i27 > iN3) {
                                int i28 = i27 - iN3;
                                this.f15214g = i27 - i28;
                                np0Var.E(np0Var.f17881b - i28);
                            }
                            this.f15213f = 5;
                        }
                    } else if (k(np0Var, np0Var2.f17880a, this.l)) {
                        gp0 gp0VarR3 = v71.R(np0Var2.f17880a);
                        gp0VarR3.f(40);
                        int iH8 = gp0VarR3.h(2);
                        boolean zG = gp0VarR3.g();
                        int i29 = true != zG ? 16 : 20;
                        gp0VarR3.f(true != zG ? 8 : 12);
                        int iH9 = gp0VarR3.h(i29) + 1;
                        boolean zG2 = gp0VarR3.g();
                        if (zG2) {
                            iH = gp0VarR3.h(2);
                            int iH10 = gp0VarR3.h(3) + 1;
                            if (gp0VarR3.g()) {
                                gp0VarR3.f(36);
                            }
                            int iH11 = gp0VarR3.h(3) + 1;
                            int iH12 = gp0VarR3.h(3) + 1;
                            if (iH11 != 1 || iH12 != 1) {
                                throw ab.b("Multiple audio presentations or assets not supported");
                            }
                            int i30 = iH8 + 1;
                            int iH13 = gp0VarR3.h(i30);
                            for (int i31 = 0; i31 < i30; i31++) {
                                if (((iH13 >> i31) & 1) == 1) {
                                    gp0VarR3.f(8);
                                }
                            }
                            i12 = iH10 * 512;
                            if (gp0VarR3.g()) {
                                gp0VarR3.f(2);
                                int iH14 = (gp0VarR3.h(2) + 1) << 2;
                                int iH15 = gp0VarR3.h(2) + 1;
                                for (int i32 = 0; i32 < iH15; i32++) {
                                    gp0VarR3.f(iH14);
                                }
                            }
                        } else {
                            i12 = 0;
                            iH = -1;
                        }
                        gp0VarR3.f(i29);
                        gp0VarR3.f(12);
                        if (zG2) {
                            if (gp0VarR3.g()) {
                                gp0VarR3.f(4);
                            }
                            if (gp0VarR3.g()) {
                                gp0VarR3.f(24);
                            }
                            if (gp0VarR3.g()) {
                                gp0VarR3.l(gp0VarR3.h(10) + 1);
                            }
                            gp0VarR3.f(5);
                            iH3 = v71.f21081d[gp0VarR3.h(4)];
                            iH2 = gp0VarR3.h(8) + 1;
                        } else {
                            iH2 = -1;
                        }
                        int i33 = iH3;
                        if (zG2) {
                            if (iH == 0) {
                                i13 = 32000;
                            } else if (iH == 1) {
                                i13 = 44100;
                            } else {
                                if (iH != 2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iH).length() + 51);
                                    sb4.append("Unsupported reference clock code in DTS HD header: ");
                                    sb4.append(iH);
                                    throw ab.a(null, sb4.toString());
                                }
                                i13 = 48000;
                            }
                            jV2 = uu0.v(i12, 1000000L, i13, RoundingMode.DOWN);
                        } else {
                            jV2 = -9223372036854775807L;
                        }
                        l(new v1(MimeTypes.AUDIO_DTS_EXPRESS, iH2, i33, iH9, jV2));
                        this.f15217j = iH9;
                        this.f15216i = jV2 == C.TIME_UNSET ? 0L : jV2;
                        np0Var2.E(0);
                        ((h3) this.f15222p).b(this.l, np0Var2);
                        this.f15213f = 6;
                    } else {
                        continue;
                    }
                } else if (k(np0Var, np0Var2.f17880a, 7)) {
                    gp0 gp0VarR4 = v71.R(np0Var2.f17880a);
                    gp0VarR4.f(42);
                    this.l = gp0VarR4.h(true == gp0VarR4.g() ? 12 : 8) + 1;
                    this.f15213f = 3;
                }
            } else if (k(np0Var, np0Var2.f17880a, 18)) {
                byte[] bArr3 = np0Var2.f17880a;
                if (((g22) this.f15223q) == null) {
                    String str2 = this.f15212e;
                    gp0 gp0VarR5 = v71.R(bArr3);
                    gp0VarR5.f(60);
                    int i34 = v71.f21078a[gp0VarR5.h(6)];
                    int i35 = v71.f21079b[gp0VarR5.h(4)];
                    int iH16 = gp0VarR5.h(5);
                    int i36 = iH16 >= 29 ? -1 : (v71.f21080c[iH16] * 1000) / 2;
                    gp0VarR5.f(10);
                    int i37 = i34 + (gp0VarR5.h(2) > 0 ? 1 : 0);
                    i12 i12Var = new i12();
                    i12Var.f15499a = str2;
                    i12Var.d("video/mp2t");
                    i12Var.e(MimeTypes.AUDIO_DTS);
                    i12Var.f15506h = i36;
                    i12Var.F = i37;
                    i12Var.H = i35;
                    i12Var.f15515r = null;
                    i12Var.f15502d = this.f15209b;
                    i12Var.f15504f = this.f15210c;
                    g22 g22Var = new g22(i12Var);
                    this.f15223q = g22Var;
                    ((h3) this.f15222p).f(g22Var);
                }
                this.f15217j = v71.u(bArr3);
                byte b12 = bArr3[0];
                if (b12 != -2) {
                    if (b12 == -1) {
                        i14 = (bArr3[4] & 7) << 4;
                        b11 = bArr3[7];
                    } else if (b12 != 31) {
                        i14 = (bArr3[4] & 1) << 6;
                        b10 = bArr3[5];
                    } else {
                        i14 = (bArr3[5] & 7) << 4;
                        b11 = bArr3[6];
                    }
                    i15 = b11 & 60;
                    this.f15216i = gc1.a(uu0.u(((g22) this.f15223q).I, (((i15 >> 2) | i14) + 1) * 32));
                    np0Var2.E(0);
                    ((h3) this.f15222p).b(18, np0Var2);
                    this.f15213f = 6;
                } else {
                    i14 = (bArr3[5] & 1) << 6;
                    b10 = bArr3[4];
                }
                i15 = b10 & 252;
                this.f15216i = gc1.a(uu0.u(((g22) this.f15223q).I, (((i15 >> 2) | i14) + 1) * 32));
                np0Var2.E(0);
                ((h3) this.f15222p).b(18, np0Var2);
                this.f15213f = 6;
            }
        }
    }

    @Override // u3.f
    public void g(n2.m mVar, ga gaVar) {
        gaVar.a();
        gaVar.b();
        this.f15212e = gaVar.f14806e;
        gaVar.b();
        this.f15222p = mVar.track(gaVar.f14805d, 1);
    }

    @Override // u3.f
    public void h(int i10, long j10) {
        this.f15220n = j10;
    }

    public boolean i(l1.q qVar, byte[] bArr, int i10) {
        int iMin = Math.min(qVar.a(), i10 - this.f15214g);
        qVar.k(bArr, this.f15214g, iMin);
        int i11 = this.f15214g + iMin;
        this.f15214g = i11;
        return i11 == i10;
    }

    public void j(n2.a aVar) {
        int i10 = aVar.f46421b;
        String str = aVar.f46420a;
        int i11 = aVar.f46422c;
        if (i10 == -2147483647 || i11 == -1) {
            return;
        }
        i1.p pVar = (i1.p) this.f15223q;
        if (pVar != null && i11 == pVar.F && i10 == pVar.G && str.equals(pVar.f42643n)) {
            return;
        }
        i1.p pVar2 = (i1.p) this.f15223q;
        i1.o oVar = pVar2 == null ? new i1.o() : pVar2.a();
        oVar.f42589a = this.f15212e;
        oVar.l = i1.d0.n(this.f15211d);
        oVar.f42600m = i1.d0.n(str);
        oVar.E = i11;
        oVar.F = i10;
        oVar.f42592d = this.f15209b;
        oVar.f42594f = this.f15210c;
        i1.p pVar3 = new i1.p(oVar);
        this.f15223q = pVar3;
        ((n2.a0) this.f15222p).b(pVar3);
    }

    public boolean k(np0 np0Var, byte[] bArr, int i10) {
        int iMin = Math.min(np0Var.B(), i10 - this.f15214g);
        np0Var.H(bArr, this.f15214g, iMin);
        int i11 = this.f15214g + iMin;
        this.f15214g = i11;
        return i11 == i10;
    }

    public void l(v1 v1Var) {
        int i10;
        int i11 = v1Var.f20994b;
        String str = v1Var.f20993a;
        if (i11 == -2147483647 || (i10 = v1Var.f20995c) == -1) {
            return;
        }
        g22 g22Var = (g22) this.f15223q;
        if (g22Var != null && i10 == g22Var.G && i11 == g22Var.I && str.equals(g22Var.f14678o)) {
            return;
        }
        g22 g22Var2 = (g22) this.f15223q;
        i12 i12Var = g22Var2 == null ? new i12() : new i12(g22Var2);
        i12Var.f15499a = this.f15212e;
        i12Var.d(this.f15211d);
        i12Var.e(str);
        i12Var.F = i10;
        i12Var.H = i11;
        i12Var.f15502d = this.f15209b;
        i12Var.f15504f = this.f15210c;
        g22 g22Var3 = new g22(i12Var);
        this.f15223q = g22Var3;
        ((h3) this.f15222p).f(g22Var3);
    }

    @Override // u3.f
    public void seek() {
        this.f15213f = 0;
        this.f15214g = 0;
        this.f15215h = 0;
        this.f15220n = C.TIME_UNSET;
        this.f15208a.set(0);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void zza() {
        this.f15213f = 0;
        this.f15214g = 0;
        this.f15215h = 0;
        this.f15220n = C.TIME_UNSET;
        this.f15208a.set(0);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void a(boolean z10) {
    }

    @Override // u3.f
    public void d(boolean z10) {
    }
}
