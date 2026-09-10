package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 implements j9, u3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f21117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f21118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21125k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f21128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f21130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f21131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f21132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f21133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f21134u;

    public v9(int i10) {
        switch (i10) {
            case 1:
                this.f21115a = 0;
                this.f21130q = new l1.q(new byte[15], 2);
                this.f21131r = new xd1();
                this.f21132s = new l1.q();
                this.f21134u = new b6(3);
                this.l = -2147483647;
                this.f21126m = -1;
                this.f21128o = -1L;
                this.f21120f = true;
                this.f21123i = true;
                this.f21117c = -9.223372036854776E18d;
                this.f21118d = -9.223372036854776E18d;
                break;
            default:
                this.f21115a = 0;
                this.f21130q = new np0(new byte[15], 2);
                this.f21132s = new gp0();
                this.f21131r = new np0();
                this.f21134u = new b6(1);
                this.l = -2147483647;
                this.f21126m = -1;
                this.f21128o = -1L;
                this.f21120f = true;
                this.f21123i = true;
                this.f21117c = -9.223372036854776E18d;
                this.f21118d = -9.223372036854776E18d;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:157:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:193:0x03da  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x02d9, please report this as an issue */
    @Override // u3.f
    public void b(l1.q qVar) throws i1.e0 {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c4;
        byte[] bArr;
        long j10;
        long j11;
        oa.n1 n1VarC;
        char c5;
        int i15;
        int i16;
        long j12;
        boolean z10;
        int i17;
        l1.q qVar2 = (l1.q) this.f21132s;
        b6 b6Var = (b6) this.f21134u;
        l1.q qVar3 = (l1.q) this.f21130q;
        ((n2.a0) this.f21133t).getClass();
        while (qVar.a() > 0) {
            int i18 = this.f21115a;
            if (i18 == 0) {
                int i19 = this.f21121g;
                if ((i19 & 2) != 0) {
                    if ((i19 & 4) == 0) {
                        while (qVar.a() > 0) {
                            int i20 = this.f21122h << 8;
                            this.f21122h = i20;
                            int iZ = i20 | qVar.z();
                            this.f21122h = iZ;
                            if ((iZ & 16777215) == 12583333) {
                                qVar.M(qVar.f44814b - 3);
                                this.f21122h = 0;
                            }
                        }
                    }
                    this.f21115a = 1;
                    break;
                }
                qVar.M(qVar.f44815c);
            } else if (i18 == 1) {
                int iMin = Math.min(qVar.a(), qVar3.a());
                qVar.k(qVar3.f44813a, qVar3.f44814b, iMin);
                qVar3.N(iMin);
                if (qVar3.a() == 0) {
                    int i21 = qVar3.f44815c;
                    xd1 xd1Var = (xd1) this.f21131r;
                    xd1Var.p(qVar3.f44813a, i21);
                    xd1Var.f();
                    int iO = t9.e.o(xd1Var, 3, 8, 8);
                    b6Var.f12652b = iO;
                    if (iO != -1) {
                        go.k.i(Math.max(Math.max(2, 8), 32) <= 63);
                        com.bumptech.glide.c.b(com.bumptech.glide.c.b(3L, 255L), 4294967296L);
                        if (xd1Var.b() < 2) {
                            j12 = -1;
                        } else {
                            long jK = xd1Var.k(2);
                            if (jK == 3) {
                                if (xd1Var.b() >= 8) {
                                    long jK2 = xd1Var.k(8);
                                    jK += jK2;
                                    if (jK2 == 255) {
                                        if (xd1Var.b() >= 32) {
                                            jK = xd1Var.k(32) + jK;
                                        }
                                    }
                                }
                                j12 = -1;
                            }
                            j12 = jK;
                        }
                        b6Var.f12653c = j12;
                        if (j12 == -1) {
                            z10 = false;
                        } else {
                            if (j12 > 16) {
                                throw i1.e0.c("Contains sub-stream with an invalid packet label " + b6Var.f12653c);
                            }
                            if (j12 == 0) {
                                int i22 = b6Var.f12652b;
                                if (i22 == 1) {
                                    throw i1.e0.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                }
                                if (i22 == 2) {
                                    throw i1.e0.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                }
                                if (i22 == 17) {
                                    throw i1.e0.a(null, "AudioTruncation packet with invalid packet label 0");
                                }
                            }
                            int iO2 = t9.e.o(xd1Var, 11, 24, 24);
                            b6Var.f12654d = iO2;
                            if (iO2 != -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i17 = 0;
                        this.f21124j = 0;
                        this.f21125k = b6Var.f12654d + i21 + this.f21125k;
                    } else {
                        i17 = 0;
                    }
                    if (z10) {
                        qVar3.M(i17);
                        ((n2.a0) this.f21133t).g(qVar3.f44815c, qVar3);
                        qVar3.J(2);
                        qVar2.J(b6Var.f12654d);
                        this.f21123i = true;
                        this.f21115a = 2;
                    } else {
                        int i23 = qVar3.f44815c;
                        if (i23 < 15) {
                            qVar3.L(i23 + 1);
                            this.f21123i = false;
                        }
                    }
                } else {
                    this.f21123i = false;
                }
            } else {
                if (i18 != 2) {
                    throw new IllegalStateException();
                }
                int i24 = b6Var.f12652b;
                if (i24 == 1 || i24 == 17) {
                    int i25 = qVar.f44814b;
                    int iMin2 = Math.min(qVar.a(), qVar2.a());
                    qVar.k(qVar2.f44813a, qVar2.f44814b, iMin2);
                    qVar2.N(iMin2);
                    qVar.M(i25);
                }
                int iMin3 = Math.min(qVar.a(), b6Var.f12654d - this.f21124j);
                ((n2.a0) this.f21133t).g(iMin3, qVar);
                int i26 = this.f21124j + iMin3;
                this.f21124j = i26;
                if (i26 != b6Var.f12654d) {
                    continue;
                } else {
                    int i27 = b6Var.f12652b;
                    if (i27 == 1) {
                        byte[] bArr2 = qVar2.f44813a;
                        xd1 xd1Var2 = new xd1(bArr2, bArr2.length);
                        int i28 = xd1Var2.i(8);
                        int i29 = xd1Var2.i(5);
                        if (i29 != 31) {
                            switch (i29) {
                                case 0:
                                    i13 = 96000;
                                    break;
                                case 1:
                                    i13 = 88200;
                                    break;
                                case 2:
                                    i13 = 64000;
                                    break;
                                case 3:
                                    i13 = 48000;
                                    break;
                                case 4:
                                    i13 = 44100;
                                    break;
                                case 5:
                                    i13 = 32000;
                                    break;
                                case 6:
                                    i13 = 24000;
                                    break;
                                case 7:
                                    i13 = 22050;
                                    break;
                                case 8:
                                    i13 = 16000;
                                    break;
                                case 9:
                                    i13 = 12000;
                                    break;
                                case 10:
                                    i13 = 11025;
                                    break;
                                case 11:
                                    i13 = 8000;
                                    break;
                                case 12:
                                    i13 = 7350;
                                    break;
                                case 13:
                                case 14:
                                default:
                                    throw i1.e0.c("Unsupported sampling rate index " + i29);
                                case 15:
                                    i13 = 57600;
                                    break;
                                case 16:
                                    i13 = 51200;
                                    break;
                                case 17:
                                    i13 = 40000;
                                    break;
                                case 18:
                                    i13 = 38400;
                                    break;
                                case 19:
                                    i13 = 34150;
                                    break;
                                case 20:
                                    i13 = 28800;
                                    break;
                                case 21:
                                    i13 = 25600;
                                    break;
                                case 22:
                                    i13 = 20000;
                                    break;
                                case 23:
                                    i13 = 19200;
                                    break;
                                case 24:
                                    i13 = 17075;
                                    break;
                                case 25:
                                    i13 = 14400;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                    i13 = 12800;
                                    break;
                                case 27:
                                    i13 = 9600;
                                    break;
                            }
                        } else {
                            i13 = xd1Var2.i(24);
                        }
                        int i30 = xd1Var2.i(3);
                        if (i30 == 0) {
                            i14 = 768;
                        } else if (i30 == 1) {
                            i14 = 1024;
                        } else if (i30 == 2 || i30 == 3) {
                            i14 = com.ironsource.mediationsdk.metadata.a.f29616n;
                        } else {
                            if (i30 != 4) {
                                throw i1.e0.c("Unsupported coreSbrFrameLengthIndex " + i30);
                            }
                            i14 = 4096;
                        }
                        int i31 = i14;
                        if (i30 == 0 || i30 == 1) {
                            c4 = 0;
                        } else if (i30 == 2) {
                            c4 = 2;
                        } else if (i30 == 3) {
                            c4 = 3;
                        } else {
                            if (i30 != 4) {
                                throw i1.e0.c("Unsupported coreSbrFrameLengthIndex " + i30);
                            }
                            c4 = 1;
                        }
                        xd1Var2.t(2);
                        t9.e.x(xd1Var2);
                        int i32 = xd1Var2.i(5);
                        int i33 = 1;
                        int i34 = 0;
                        int iO3 = 0;
                        while (true) {
                            int i35 = 16;
                            if (i34 < i32 + 1) {
                                int i36 = xd1Var2.i(3);
                                iO3 = t9.e.o(xd1Var2, 5, 8, 16) + 1 + iO3;
                                if ((i36 == 0 || i36 == 2) && xd1Var2.h()) {
                                    t9.e.x(xd1Var2);
                                }
                                i34++;
                            } else {
                                int i37 = 4;
                                int iO4 = t9.e.o(xd1Var2, 4, 8, 16) + 1;
                                xd1Var2.s();
                                int i38 = 0;
                                while (true) {
                                    double d10 = 2.0d;
                                    if (i38 < iO4) {
                                        int i39 = xd1Var2.i(2);
                                        if (i39 == 0) {
                                            c5 = 5;
                                            xd1Var2.t(3);
                                            if (xd1Var2.h()) {
                                                xd1Var2.t(13);
                                            }
                                            if (c4 > 0) {
                                                t9.e.w(xd1Var2);
                                            }
                                        } else if (i39 != i33) {
                                            if (i39 == 3) {
                                                t9.e.o(xd1Var2, i37, 8, i35);
                                                int iO5 = t9.e.o(xd1Var2, i37, 8, i35);
                                                if (xd1Var2.h()) {
                                                    t9.e.o(xd1Var2, 8, i35, 0);
                                                }
                                                xd1Var2.s();
                                                if (iO5 > 0) {
                                                    xd1Var2.t(iO5 * 8);
                                                }
                                            }
                                            c5 = 5;
                                        } else {
                                            xd1Var2.t(3);
                                            boolean zH = xd1Var2.h();
                                            if (zH) {
                                                xd1Var2.t(13);
                                            }
                                            if (zH) {
                                                xd1Var2.s();
                                            }
                                            if (c4 > 0) {
                                                t9.e.w(xd1Var2);
                                                i15 = 2;
                                                i16 = xd1Var2.i(2);
                                            } else {
                                                i15 = 2;
                                                i16 = 0;
                                            }
                                            if (i16 > 0) {
                                                xd1Var2.t(6);
                                                int i40 = xd1Var2.i(i15);
                                                xd1Var2.t(4);
                                                if (xd1Var2.h()) {
                                                    c5 = 5;
                                                    xd1Var2.t(5);
                                                } else {
                                                    c5 = 5;
                                                }
                                                if (i16 == i15 || i16 == 3) {
                                                    xd1Var2.t(6);
                                                }
                                                if (i40 == i15) {
                                                    xd1Var2.s();
                                                }
                                            } else {
                                                c5 = 5;
                                            }
                                            int iFloor = ((int) Math.floor(Math.log(iO3 - 1) / Math.log(2.0d))) + 1;
                                            int i41 = xd1Var2.i(2);
                                            if (i41 > 0 && xd1Var2.h()) {
                                                xd1Var2.t(iFloor);
                                            }
                                            if (xd1Var2.h()) {
                                                xd1Var2.t(iFloor);
                                            }
                                            if (c4 == 0 && i41 == 0) {
                                                xd1Var2.s();
                                            }
                                        }
                                        i38++;
                                        i37 = 4;
                                        i35 = 16;
                                        i33 = 1;
                                    } else {
                                        if (xd1Var2.h()) {
                                            int i42 = 8;
                                            int iO6 = t9.e.o(xd1Var2, 2, 4, 8) + 1;
                                            int i43 = 0;
                                            bArr = null;
                                            while (i43 < iO6) {
                                                int iO7 = t9.e.o(xd1Var2, 4, i42, 16);
                                                int iO8 = t9.e.o(xd1Var2, 4, i42, 16);
                                                if (iO7 == 7) {
                                                    int i44 = xd1Var2.i(4) + 1;
                                                    xd1Var2.t(4);
                                                    byte[] bArr3 = new byte[i44];
                                                    for (int i45 = 0; i45 < i44; i45++) {
                                                        bArr3[i45] = (byte) xd1Var2.i(i42);
                                                    }
                                                    bArr = bArr3;
                                                } else {
                                                    xd1Var2.t(iO8 * i42);
                                                }
                                                i43++;
                                                i42 = 8;
                                            }
                                        } else {
                                            bArr = null;
                                        }
                                        switch (i13) {
                                            case 14700:
                                            case 16000:
                                                d10 = 3.0d;
                                                this.l = (int) (((double) i13) * d10);
                                                this.f21126m = (int) (((double) i31) * d10);
                                                j10 = this.f21128o;
                                                j11 = b6Var.f12653c;
                                                if (j10 != j11) {
                                                    this.f21128o = j11;
                                                    String strConcat = i28 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i28))) : "mhm1";
                                                    if (bArr != null || bArr.length <= 0) {
                                                        n1VarC = null;
                                                    } else {
                                                        n1VarC = oa.j0.C(l1.y.f44831b, bArr);
                                                    }
                                                    i1.o oVar = new i1.o();
                                                    oVar.f42589a = this.f21116b;
                                                    oVar.l = i1.d0.n("video/mp2t");
                                                    oVar.f42600m = i1.d0.n("audio/mhm1");
                                                    oVar.F = this.l;
                                                    oVar.f42598j = strConcat;
                                                    oVar.f42603p = n1VarC;
                                                    ((n2.a0) this.f21133t).b(new i1.p(oVar));
                                                }
                                                i11 = 1;
                                                this.f21129p = true;
                                                break;
                                            case 22050:
                                            case 24000:
                                                this.l = (int) (((double) i13) * d10);
                                                this.f21126m = (int) (((double) i31) * d10);
                                                j10 = this.f21128o;
                                                j11 = b6Var.f12653c;
                                                if (j10 != j11) {
                                                    this.f21128o = j11;
                                                    if (i28 != -1) {
                                                    }
                                                    if (bArr != null) {
                                                        n1VarC = null;
                                                    } else {
                                                        n1VarC = null;
                                                    }
                                                    i1.o oVar2 = new i1.o();
                                                    oVar2.f42589a = this.f21116b;
                                                    oVar2.l = i1.d0.n("video/mp2t");
                                                    oVar2.f42600m = i1.d0.n("audio/mhm1");
                                                    oVar2.F = this.l;
                                                    oVar2.f42598j = strConcat;
                                                    oVar2.f42603p = n1VarC;
                                                    ((n2.a0) this.f21133t).b(new i1.p(oVar2));
                                                }
                                                i11 = 1;
                                                this.f21129p = true;
                                                break;
                                            case 29400:
                                            case 32000:
                                            case 58800:
                                            case 64000:
                                                d10 = 1.5d;
                                                this.l = (int) (((double) i13) * d10);
                                                this.f21126m = (int) (((double) i31) * d10);
                                                j10 = this.f21128o;
                                                j11 = b6Var.f12653c;
                                                if (j10 != j11) {
                                                    this.f21128o = j11;
                                                    if (i28 != -1) {
                                                    }
                                                    if (bArr != null) {
                                                        n1VarC = null;
                                                    } else {
                                                        n1VarC = null;
                                                    }
                                                    i1.o oVar3 = new i1.o();
                                                    oVar3.f42589a = this.f21116b;
                                                    oVar3.l = i1.d0.n("video/mp2t");
                                                    oVar3.f42600m = i1.d0.n("audio/mhm1");
                                                    oVar3.F = this.l;
                                                    oVar3.f42598j = strConcat;
                                                    oVar3.f42603p = n1VarC;
                                                    ((n2.a0) this.f21133t).b(new i1.p(oVar3));
                                                }
                                                i11 = 1;
                                                this.f21129p = true;
                                                break;
                                            case 44100:
                                            case 48000:
                                            case 88200:
                                            case 96000:
                                                d10 = 1.0d;
                                                this.l = (int) (((double) i13) * d10);
                                                this.f21126m = (int) (((double) i31) * d10);
                                                j10 = this.f21128o;
                                                j11 = b6Var.f12653c;
                                                if (j10 != j11) {
                                                    this.f21128o = j11;
                                                    if (i28 != -1) {
                                                    }
                                                    if (bArr != null) {
                                                        n1VarC = null;
                                                    } else {
                                                        n1VarC = null;
                                                    }
                                                    i1.o oVar4 = new i1.o();
                                                    oVar4.f42589a = this.f21116b;
                                                    oVar4.l = i1.d0.n("video/mp2t");
                                                    oVar4.f42600m = i1.d0.n("audio/mhm1");
                                                    oVar4.F = this.l;
                                                    oVar4.f42598j = strConcat;
                                                    oVar4.f42603p = n1VarC;
                                                    ((n2.a0) this.f21133t).b(new i1.p(oVar4));
                                                }
                                                i11 = 1;
                                                this.f21129p = true;
                                                break;
                                            default:
                                                throw i1.e0.c("Unsupported sampling rate " + i13);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (i27 == 17) {
                            byte[] bArr4 = qVar2.f44813a;
                            xd1 xd1Var3 = new xd1(bArr4, bArr4.length);
                            if (xd1Var3.h()) {
                                xd1Var3.t(2);
                                i12 = xd1Var3.i(13);
                            } else {
                                i12 = 0;
                            }
                            this.f21127n = i12;
                        } else if (i27 == 2) {
                            if (this.f21129p) {
                                this.f21120f = false;
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            double d11 = (((double) (this.f21126m - this.f21127n)) * 1000000.0d) / ((double) this.l);
                            long jRound = Math.round(this.f21117c);
                            if (this.f21119e) {
                                this.f21119e = false;
                                this.f21117c = this.f21118d;
                            } else {
                                this.f21117c += d11;
                            }
                            ((n2.a0) this.f21133t).a(jRound, i10, this.f21125k, 0, null);
                            this.f21129p = false;
                            this.f21127n = 0;
                            this.f21125k = 0;
                        }
                        i11 = 1;
                    }
                    this.f21115a = i11;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void c(int i10, long j10) {
        this.f21121g = i10;
        if (!this.f21120f && (this.f21125k != 0 || !this.f21123i)) {
            this.f21119e = true;
        }
        if (j10 != C.TIME_UNSET) {
            double d10 = j10;
            if (this.f21119e) {
                this.f21118d = d10;
            } else {
                this.f21117c = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void e(o2 o2Var, ga gaVar) {
        gaVar.c();
        gaVar.d();
        this.f21116b = gaVar.f14806e;
        gaVar.d();
        this.f21133t = o2Var.e(gaVar.f14805d, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:157:0x0302  */
    /* JADX WARN: Code duplicated, block: B:159:0x0309  */
    /* JADX WARN: Code duplicated, block: B:161:0x031d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0327  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x0302, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.j9
    public void f(np0 np0Var) throws ab {
        int i10;
        int i11;
        int iH;
        int iH2;
        int i12;
        char c4;
        byte[] bArr;
        long j10;
        long j11;
        ya1 ya1VarV;
        char c5;
        int i13;
        int iH3;
        char c10;
        long j12;
        b6 b6Var = (b6) this.f21134u;
        np0 np0Var2 = (np0) this.f21131r;
        ((h3) this.f21133t).getClass();
        while (np0Var.B() > 0) {
            int i14 = this.f21115a;
            int i15 = 8;
            if (i14 == 0) {
                int i16 = this.f21121g;
                if ((i16 & 2) != 0) {
                    if ((i16 & 4) == 0) {
                        while (np0Var.B() > 0) {
                            int i17 = this.f21122h << 8;
                            this.f21122h = i17;
                            int iK = i17 | np0Var.K();
                            this.f21122h = iK;
                            if ((iK & 16777215) == 12583333) {
                                np0Var.E(np0Var.f17881b - 3);
                                this.f21122h = 0;
                            }
                        }
                    }
                    this.f21115a = 1;
                    break;
                }
                np0Var.E(np0Var.f17882c);
            } else {
                int i18 = 2;
                if (i14 != 1) {
                    int i19 = b6Var.f12652b;
                    if (i19 == 1 || i19 == 17) {
                        int i20 = np0Var.f17881b;
                        int iMin = Math.min(np0Var.B(), np0Var2.B());
                        np0Var.H(np0Var2.f17880a, np0Var2.f17881b, iMin);
                        np0Var2.G(iMin);
                        np0Var.E(i20);
                    }
                    int iMin2 = Math.min(np0Var.B(), b6Var.f12654d - this.f21124j);
                    ((h3) this.f21133t).b(iMin2, np0Var);
                    int i21 = this.f21124j + iMin2;
                    this.f21124j = i21;
                    if (i21 != b6Var.f12654d) {
                        continue;
                    } else {
                        int i22 = b6Var.f12652b;
                        if (i22 == 1) {
                            byte[] bArr2 = np0Var2.f17880a;
                            gp0 gp0Var = new gp0(bArr2, bArr2.length);
                            int iH4 = gp0Var.h(8);
                            int iH5 = gp0Var.h(5);
                            if (iH5 != 31) {
                                switch (iH5) {
                                    case 0:
                                        iH2 = 96000;
                                        break;
                                    case 1:
                                        iH2 = 88200;
                                        break;
                                    case 2:
                                        iH2 = 64000;
                                        break;
                                    case 3:
                                        iH2 = 48000;
                                        break;
                                    case 4:
                                        iH2 = 44100;
                                        break;
                                    case 5:
                                        iH2 = 32000;
                                        break;
                                    case 6:
                                        iH2 = 24000;
                                        break;
                                    case 7:
                                        iH2 = 22050;
                                        break;
                                    case 8:
                                        iH2 = 16000;
                                        break;
                                    case 9:
                                        iH2 = 12000;
                                        break;
                                    case 10:
                                        iH2 = 11025;
                                        break;
                                    case 11:
                                        iH2 = 8000;
                                        break;
                                    case 12:
                                        iH2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iH5).length() + 32);
                                        sb2.append("Unsupported sampling rate index ");
                                        sb2.append(iH5);
                                        throw ab.b(sb2.toString());
                                    case 15:
                                        iH2 = 57600;
                                        break;
                                    case 16:
                                        iH2 = 51200;
                                        break;
                                    case 17:
                                        iH2 = 40000;
                                        break;
                                    case 18:
                                        iH2 = 38400;
                                        break;
                                    case 19:
                                        iH2 = 34150;
                                        break;
                                    case 20:
                                        iH2 = 28800;
                                        break;
                                    case 21:
                                        iH2 = 25600;
                                        break;
                                    case 22:
                                        iH2 = 20000;
                                        break;
                                    case 23:
                                        iH2 = 19200;
                                        break;
                                    case 24:
                                        iH2 = 17075;
                                        break;
                                    case 25:
                                        iH2 = 14400;
                                        break;
                                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                        iH2 = 12800;
                                        break;
                                    case 27:
                                        iH2 = 9600;
                                        break;
                                }
                            } else {
                                iH2 = gp0Var.h(24);
                            }
                            int iH6 = gp0Var.h(3);
                            if (iH6 == 0) {
                                i12 = 768;
                            } else if (iH6 == 1) {
                                i12 = 1024;
                            } else if (iH6 == 2 || iH6 == 3) {
                                i12 = com.ironsource.mediationsdk.metadata.a.f29616n;
                            } else {
                                if (iH6 != 4) {
                                    StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.e(iH6, 36));
                                    sb3.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb3.append(iH6);
                                    throw ab.b(sb3.toString());
                                }
                                i12 = 4096;
                            }
                            int i23 = i12;
                            if (iH6 == 0 || iH6 == 1) {
                                c4 = 0;
                            } else if (iH6 == 2) {
                                c4 = 2;
                            } else if (iH6 == 3) {
                                c4 = 3;
                            } else {
                                if (iH6 != 4) {
                                    StringBuilder sb4 = new StringBuilder(com.applovin.impl.ca.e(iH6, 36));
                                    sb4.append("Unsupported coreSbrFrameLengthIndex ");
                                    sb4.append(iH6);
                                    throw ab.b(sb4.toString());
                                }
                                c4 = 1;
                            }
                            gp0Var.f(2);
                            v71.x(gp0Var);
                            int iH7 = gp0Var.h(5);
                            int i24 = 1;
                            int i25 = 0;
                            int iH8 = 0;
                            while (true) {
                                int i26 = 16;
                                if (i25 < iH7 + 1) {
                                    int iH9 = gp0Var.h(3);
                                    iH8 = v71.H(gp0Var, 5, 8, 16) + 1 + iH8;
                                    if ((iH9 == 0 || iH9 == 2) && gp0Var.g()) {
                                        v71.x(gp0Var);
                                    }
                                    i25++;
                                } else {
                                    int i27 = 4;
                                    int iH10 = v71.H(gp0Var, 4, 8, 16) + 1;
                                    gp0Var.e();
                                    int i28 = 0;
                                    while (true) {
                                        double d10 = 2.0d;
                                        if (i28 < iH10) {
                                            int iH11 = gp0Var.h(i18);
                                            if (iH11 == 0) {
                                                c5 = 5;
                                                gp0Var.f(3);
                                                if (gp0Var.g()) {
                                                    gp0Var.f(13);
                                                }
                                                if (c4 > 0) {
                                                    v71.E(gp0Var);
                                                }
                                            } else if (iH11 != i24) {
                                                if (iH11 == 3) {
                                                    v71.H(gp0Var, i27, i15, i26);
                                                    int iH12 = v71.H(gp0Var, i27, i15, i26);
                                                    if (gp0Var.g()) {
                                                        v71.H(gp0Var, i15, i26, 0);
                                                    }
                                                    gp0Var.e();
                                                    if (iH12 > 0) {
                                                        gp0Var.f(iH12 * 8);
                                                    }
                                                }
                                                c5 = 5;
                                            } else {
                                                gp0Var.f(3);
                                                boolean zG = gp0Var.g();
                                                if (zG) {
                                                    gp0Var.f(13);
                                                }
                                                if (zG) {
                                                    gp0Var.e();
                                                }
                                                if (c4 > 0) {
                                                    v71.E(gp0Var);
                                                    i13 = 2;
                                                    iH3 = gp0Var.h(2);
                                                    c10 = c4;
                                                } else {
                                                    i13 = 2;
                                                    iH3 = 0;
                                                    c10 = 0;
                                                }
                                                if (iH3 > 0) {
                                                    gp0Var.f(6);
                                                    int iH13 = gp0Var.h(i13);
                                                    gp0Var.f(4);
                                                    if (gp0Var.g()) {
                                                        c5 = 5;
                                                        gp0Var.f(5);
                                                    } else {
                                                        c5 = 5;
                                                    }
                                                    if (iH3 == i13 || iH3 == 3) {
                                                        gp0Var.f(6);
                                                    }
                                                    if (iH13 == i13) {
                                                        gp0Var.e();
                                                    }
                                                } else {
                                                    c5 = 5;
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iH8 - 1) / Math.log(2.0d))) + 1;
                                                int iH14 = gp0Var.h(2);
                                                if (iH14 > 0 && gp0Var.g()) {
                                                    gp0Var.f(iFloor);
                                                }
                                                if (gp0Var.g()) {
                                                    gp0Var.f(iFloor);
                                                }
                                                if (c10 == 0 && iH14 == 0) {
                                                    gp0Var.e();
                                                }
                                            }
                                            i28++;
                                            i15 = 8;
                                            i27 = 4;
                                            i18 = 2;
                                            i26 = 16;
                                            i24 = 1;
                                        } else {
                                            if (gp0Var.g()) {
                                                int i29 = 8;
                                                int iH15 = v71.H(gp0Var, 2, 4, 8) + 1;
                                                int i30 = 0;
                                                bArr = null;
                                                while (i30 < iH15) {
                                                    int iH16 = v71.H(gp0Var, 4, i29, 16);
                                                    int iH17 = v71.H(gp0Var, 4, i29, 16);
                                                    if (iH16 == 7) {
                                                        int iH18 = gp0Var.h(4) + 1;
                                                        gp0Var.f(4);
                                                        byte[] bArr3 = new byte[iH18];
                                                        for (int i31 = 0; i31 < iH18; i31++) {
                                                            bArr3[i31] = (byte) gp0Var.h(i29);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        gp0Var.f(iH17 * i29);
                                                    }
                                                    i30++;
                                                    i29 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iH2) {
                                                case 14700:
                                                case 16000:
                                                    d10 = 3.0d;
                                                    this.l = (int) (((double) iH2) * d10);
                                                    this.f21126m = (int) (((double) i23) * d10);
                                                    j10 = this.f21128o;
                                                    j11 = b6Var.f12653c;
                                                    if (j10 != j11) {
                                                        this.f21128o = j11;
                                                        String strConcat = iH4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iH4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            ya1VarV = null;
                                                        } else {
                                                            ya1VarV = ca1.v(uu0.f20902b, bArr);
                                                        }
                                                        i12 i12Var = new i12();
                                                        i12Var.f15499a = this.f21116b;
                                                        i12Var.d("video/mp2t");
                                                        i12Var.e("audio/mhm1");
                                                        i12Var.H = this.l;
                                                        i12Var.f15508j = strConcat;
                                                        i12Var.f15514q = ya1VarV;
                                                        ((h3) this.f21133t).f(new g22(i12Var));
                                                    }
                                                    i11 = 1;
                                                    this.f21129p = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.l = (int) (((double) iH2) * d10);
                                                    this.f21126m = (int) (((double) i23) * d10);
                                                    j10 = this.f21128o;
                                                    j11 = b6Var.f12653c;
                                                    if (j10 != j11) {
                                                        this.f21128o = j11;
                                                        if (iH4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            ya1VarV = null;
                                                        } else {
                                                            ya1VarV = null;
                                                        }
                                                        i12 i12Var2 = new i12();
                                                        i12Var2.f15499a = this.f21116b;
                                                        i12Var2.d("video/mp2t");
                                                        i12Var2.e("audio/mhm1");
                                                        i12Var2.H = this.l;
                                                        i12Var2.f15508j = strConcat;
                                                        i12Var2.f15514q = ya1VarV;
                                                        ((h3) this.f21133t).f(new g22(i12Var2));
                                                    }
                                                    i11 = 1;
                                                    this.f21129p = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d10 = 1.5d;
                                                    this.l = (int) (((double) iH2) * d10);
                                                    this.f21126m = (int) (((double) i23) * d10);
                                                    j10 = this.f21128o;
                                                    j11 = b6Var.f12653c;
                                                    if (j10 != j11) {
                                                        this.f21128o = j11;
                                                        if (iH4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            ya1VarV = null;
                                                        } else {
                                                            ya1VarV = null;
                                                        }
                                                        i12 i12Var3 = new i12();
                                                        i12Var3.f15499a = this.f21116b;
                                                        i12Var3.d("video/mp2t");
                                                        i12Var3.e("audio/mhm1");
                                                        i12Var3.H = this.l;
                                                        i12Var3.f15508j = strConcat;
                                                        i12Var3.f15514q = ya1VarV;
                                                        ((h3) this.f21133t).f(new g22(i12Var3));
                                                    }
                                                    i11 = 1;
                                                    this.f21129p = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d10 = 1.0d;
                                                    this.l = (int) (((double) iH2) * d10);
                                                    this.f21126m = (int) (((double) i23) * d10);
                                                    j10 = this.f21128o;
                                                    j11 = b6Var.f12653c;
                                                    if (j10 != j11) {
                                                        this.f21128o = j11;
                                                        if (iH4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            ya1VarV = null;
                                                        } else {
                                                            ya1VarV = null;
                                                        }
                                                        i12 i12Var4 = new i12();
                                                        i12Var4.f15499a = this.f21116b;
                                                        i12Var4.d("video/mp2t");
                                                        i12Var4.e("audio/mhm1");
                                                        i12Var4.H = this.l;
                                                        i12Var4.f15508j = strConcat;
                                                        i12Var4.f15514q = ya1VarV;
                                                        ((h3) this.f21133t).f(new g22(i12Var4));
                                                    }
                                                    i11 = 1;
                                                    this.f21129p = true;
                                                    break;
                                                default:
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(iH2).length() + 26);
                                                    sb5.append("Unsupported sampling rate ");
                                                    sb5.append(iH2);
                                                    throw ab.b(sb5.toString());
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i22 == 17) {
                                byte[] bArr4 = np0Var2.f17880a;
                                gp0 gp0Var2 = new gp0(bArr4, bArr4.length);
                                if (gp0Var2.g()) {
                                    gp0Var2.f(2);
                                    iH = gp0Var2.h(13);
                                } else {
                                    iH = 0;
                                }
                                this.f21127n = iH;
                            } else if (i22 == 2) {
                                if (this.f21129p) {
                                    this.f21120f = false;
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                                int i32 = this.f21126m - this.f21127n;
                                double d11 = this.l;
                                long jRound = Math.round(this.f21117c);
                                if (this.f21119e) {
                                    this.f21119e = false;
                                    this.f21117c = this.f21118d;
                                } else {
                                    this.f21117c += (((double) i32) * 1000000.0d) / d11;
                                }
                                ((h3) this.f21133t).c(jRound, i10, this.f21125k, 0, null);
                                this.f21129p = false;
                                this.f21127n = 0;
                                this.f21125k = 0;
                            }
                            i11 = 1;
                        }
                        this.f21115a = i11;
                    }
                } else {
                    np0 np0Var3 = (np0) this.f21130q;
                    int iMin3 = Math.min(np0Var.B(), np0Var3.B());
                    np0Var.H(np0Var3.f17880a, np0Var3.f17881b, iMin3);
                    np0Var3.G(iMin3);
                    if (np0Var3.B() == 0) {
                        gp0 gp0Var3 = (gp0) this.f21132s;
                        int i33 = np0Var3.f17882c;
                        gp0Var3.f14921a = np0Var3.f17880a;
                        gp0Var3.f14922b = 0;
                        gp0Var3.f14923c = 0;
                        gp0Var3.f14924d = i33;
                        gp0Var3.c();
                        int iH19 = v71.H(gp0Var3, 3, 8, 8);
                        b6Var.f12652b = iH19;
                        if (iH19 != -1) {
                            ps1.v(Math.max(Math.max(2, 8), 32) <= 63);
                            Math.addExact(Math.addExact(3L, 255L), 4294967296L);
                            if (gp0Var3.b() < 2) {
                                j12 = -1;
                            } else {
                                long jI = gp0Var3.i(2);
                                if (jI == 3) {
                                    if (gp0Var3.b() >= 8) {
                                        long jI2 = gp0Var3.i(8);
                                        jI = jI2 + 3;
                                        if (jI2 == 255) {
                                            if (gp0Var3.b() >= 32) {
                                                jI = gp0Var3.i(32) + jI;
                                            }
                                        }
                                    }
                                    j12 = -1;
                                }
                                j12 = jI;
                            }
                            b6Var.f12653c = j12;
                            if (j12 != -1) {
                                if (j12 > 16) {
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(j12).length() + 49);
                                    sb6.append("Contains sub-stream with an invalid packet label ");
                                    sb6.append(j12);
                                    throw ab.b(sb6.toString());
                                }
                                if (j12 == 0) {
                                    int i34 = b6Var.f12652b;
                                    if (i34 == 1) {
                                        throw ab.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i34 == 2) {
                                        throw ab.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i34 == 17) {
                                        throw ab.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iH20 = v71.H(gp0Var3, 11, 24, 24);
                                b6Var.f12654d = iH20;
                                if (iH20 != -1) {
                                    this.f21124j = 0;
                                    this.f21125k = iH20 + i33 + this.f21125k;
                                    np0Var3.E(0);
                                    ((h3) this.f21133t).b(np0Var3.f17882c, np0Var3);
                                    np0Var3.y(2);
                                    np0Var2.y(b6Var.f12654d);
                                    this.f21123i = true;
                                    this.f21115a = 2;
                                }
                            }
                        }
                        int i35 = np0Var3.f17882c;
                        if (i35 < 15) {
                            np0Var3.C(i35 + 1);
                        }
                    }
                    this.f21123i = false;
                }
            }
        }
    }

    @Override // u3.f
    public void g(n2.m mVar, ga gaVar) {
        gaVar.a();
        gaVar.b();
        this.f21116b = gaVar.f14806e;
        gaVar.b();
        this.f21133t = mVar.track(gaVar.f14805d, 1);
    }

    @Override // u3.f
    public void h(int i10, long j10) {
        this.f21121g = i10;
        if (!this.f21120f && (this.f21125k != 0 || !this.f21123i)) {
            this.f21119e = true;
        }
        if (j10 != C.TIME_UNSET) {
            if (this.f21119e) {
                this.f21118d = j10;
            } else {
                this.f21117c = j10;
            }
        }
    }

    @Override // u3.f
    public void seek() {
        this.f21115a = 0;
        this.f21122h = 0;
        ((l1.q) this.f21130q).J(2);
        this.f21124j = 0;
        this.f21125k = 0;
        this.l = -2147483647;
        this.f21126m = -1;
        this.f21127n = 0;
        this.f21128o = -1L;
        this.f21129p = false;
        this.f21119e = false;
        this.f21123i = true;
        this.f21120f = true;
        this.f21117c = -9.223372036854776E18d;
        this.f21118d = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void zza() {
        this.f21115a = 0;
        this.f21122h = 0;
        ((np0) this.f21130q).y(2);
        this.f21124j = 0;
        this.f21125k = 0;
        this.l = -2147483647;
        this.f21126m = -1;
        this.f21127n = 0;
        this.f21128o = -1L;
        this.f21129p = false;
        this.f21119e = false;
        this.f21123i = true;
        this.f21120f = true;
        this.f21117c = -9.223372036854776E18d;
        this.f21118d = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public void a(boolean z10) {
    }

    @Override // u3.f
    public void d(boolean z10) {
    }
}
