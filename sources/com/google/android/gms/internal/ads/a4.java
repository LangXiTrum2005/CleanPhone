package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 implements m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o2 f11831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h3 f11832e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s8 f11834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s2 f11835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z3 f11838k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11839m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11828a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f11829b = new np0(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2 f11830c = new q2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11833f = 0;

    static {
        int i10 = dv.f13747t;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        s8 s8VarK = new x11(2).k(n2Var, s6.f19870o, 0);
        if (s8VarK != null) {
            int length = s8VarK.f19891a.length;
        }
        np0 np0Var = new np0(4);
        ((h2) n2Var).m(np0Var.f17880a, 0, 4, false);
        return np0Var.P() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        if (j10 == 0) {
            this.f11833f = 0;
        } else {
            z3 z3Var = this.f11838k;
            if (z3Var != null) {
                z3Var.d(j11);
            }
        }
        this.f11839m = j11 != 0 ? -1L : 0L;
        this.l = 0;
        this.f11829b.y(0);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        a3 r2Var;
        long j10;
        long j11;
        boolean zK;
        int i10 = this.f11833f;
        s8 s8Var = null;
        boolean z10 = true;
        int i11 = 0;
        if (i10 == 0) {
            n2Var.zzl();
            long jZzm = n2Var.zzm();
            s8 s8VarK = new x11(2).k(n2Var, null, 0);
            if (s8VarK != null && s8VarK.f19891a.length != 0) {
                s8Var = s8VarK;
            }
            n2Var.zzf((int) (n2Var.zzm() - jZzm));
            this.f11834g = s8Var;
            this.f11833f = 1;
            return 0;
        }
        byte[] bArr = this.f11828a;
        if (i10 == 1) {
            n2Var.v(bArr, 0, 42);
            n2Var.zzl();
            this.f11833f = 2;
            return 0;
        }
        int i12 = 3;
        int i13 = 4;
        if (i10 == 2) {
            np0 np0Var = new np0(4);
            n2Var.p(np0Var.f17880a, 0, 4);
            if (np0Var.P() != 1716281667) {
                throw ab.a(null, "Failed to read FLAC stream marker.");
            }
            this.f11833f = 3;
            return 0;
        }
        int i14 = 7;
        if (i10 != 3) {
            long j12 = 0;
            if (i10 == 4) {
                n2Var.zzl();
                np0 np0Var2 = new np0(2);
                n2Var.v(np0Var2.f17880a, 0, 2);
                int iL = np0Var2.L();
                if ((iL >> 2) != 16382) {
                    n2Var.zzl();
                    throw ab.a(null, "First frame does not start with sync code.");
                }
                n2Var.zzl();
                this.f11837j = iL;
                o2 o2Var = this.f11831d;
                String str = uu0.f20901a;
                long jZzn = n2Var.zzn();
                long jZzo = n2Var.zzo();
                s2 s2Var = this.f11835h;
                s2Var.getClass();
                md0 md0Var = (md0) s2Var.f19778k;
                if (md0Var != null && ((long[]) md0Var.f17399b).length > 0) {
                    r2Var = new r2(s2Var, jZzn, 0);
                    i11 = 0;
                } else if (jZzo == -1 || s2Var.f19777j <= 0) {
                    i11 = 0;
                    r2Var = new r2(s2Var.e(), 0L);
                } else {
                    int i15 = this.f11837j;
                    int i16 = s2Var.f19770c;
                    b21 b21Var = new b21(s2Var, 2);
                    y3 y3Var = new y3(s2Var, i15);
                    long jE = s2Var.e();
                    long j13 = s2Var.f19777j;
                    int i17 = s2Var.f19771d;
                    if (i17 > 0) {
                        j10 = ((((long) i17) + ((long) i16)) / 2) + 1;
                    } else {
                        int i18 = s2Var.f19768a;
                        long j14 = 4096;
                        if (i18 == s2Var.f19769b && i18 > 0) {
                            j14 = i18;
                        }
                        j10 = (((j14 * ((long) s2Var.f19774g)) * ((long) s2Var.f19775h)) / 8) + 64;
                    }
                    z3 z3Var = new z3(b21Var, y3Var, jE, j13, jZzn, jZzo, j10, Math.max(6, i16));
                    this.f11838k = z3Var;
                    r2Var = (a2) z3Var.f14172b;
                }
                o2Var.o(r2Var);
                this.f11833f = 5;
                return i11;
            }
            this.f11832e.getClass();
            s2 s2Var2 = this.f11835h;
            s2Var2.getClass();
            z3 z3Var2 = this.f11838k;
            if (z3Var2 != null && ((b2) z3Var2.f14174d) != null) {
                return z3Var2.e(n2Var, q2Var);
            }
            if (this.f11839m == -1) {
                n2Var.zzl();
                n2Var.b(1);
                byte[] bArr2 = new byte[1];
                n2Var.v(bArr2, 0, 1);
                int i19 = bArr2[0] & 1;
                boolean z11 = 1 == i19;
                n2Var.b(2);
                i14 = 1 != i19 ? 6 : 7;
                np0 np0Var3 = new np0(i14);
                byte[] bArr3 = np0Var3.f17880a;
                int i20 = 0;
                while (i20 < i14) {
                    int iY = n2Var.y(bArr3, i20, i14 - i20);
                    if (iY == -1) {
                        break;
                    }
                    i20 += iY;
                }
                np0Var3.C(i20);
                n2Var.zzl();
                try {
                    long jO = np0Var3.o();
                    if (!z11) {
                        jO *= (long) s2Var2.f19769b;
                    }
                    long j15 = s2Var2.f19777j;
                    if (j15 == 0 || jO <= j15) {
                        j12 = jO;
                    } else {
                        z10 = false;
                    }
                } catch (NumberFormatException unused) {
                }
                if (!z10) {
                    throw ab.a(null, null);
                }
                this.f11839m = j12;
            } else {
                np0 np0Var4 = this.f11829b;
                int i21 = np0Var4.f17882c;
                if (i21 < 32768) {
                    int iT = n2Var.t(np0Var4.f17880a, i21, 32768 - i21);
                    z10 = iT == -1;
                    if (!z10) {
                        np0Var4.C(i21 + iT);
                    } else if (np0Var4.B() == 0) {
                        long j16 = this.f11839m * 1000000;
                        s2 s2Var3 = this.f11835h;
                        String str2 = uu0.f20901a;
                        this.f11832e.c(j16 / ((long) s2Var3.f19772e), 1, this.l, 0, null);
                        return -1;
                    }
                } else {
                    z10 = false;
                }
                int i22 = np0Var4.f17881b;
                int i23 = this.l;
                int i24 = this.f11836i;
                if (i23 < i24) {
                    np0Var4.G(Math.min(i24 - i23, np0Var4.B()));
                }
                this.f11835h.getClass();
                int i25 = np0Var4.f17881b;
                while (true) {
                    int i26 = np0Var4.f17882c - 16;
                    q2 q2Var2 = this.f11830c;
                    if (i25 > i26) {
                        if (z10) {
                            while (true) {
                                int i27 = np0Var4.f17882c;
                                if (i25 <= i27 - this.f11836i) {
                                    np0Var4.E(i25);
                                    try {
                                        zK = pi1.k(np0Var4, this.f11835h, this.f11837j, q2Var2);
                                    } catch (IndexOutOfBoundsException unused2) {
                                        zK = false;
                                    }
                                    if (np0Var4.f17881b <= np0Var4.f17882c && zK) {
                                        np0Var4.E(i25);
                                        j11 = q2Var2.f18888a;
                                        break;
                                    }
                                    i25++;
                                } else {
                                    np0Var4.E(i27);
                                }
                            }
                        } else {
                            np0Var4.E(i25);
                        }
                        j11 = -1;
                        break;
                    }
                    np0Var4.E(i25);
                    if (pi1.k(np0Var4, this.f11835h, this.f11837j, q2Var2)) {
                        np0Var4.E(i25);
                        j11 = q2Var2.f18888a;
                        break;
                    }
                    i25++;
                }
                int i28 = np0Var4.f17881b - i22;
                np0Var4.E(i22);
                this.f11832e.b(i28, np0Var4);
                int i29 = this.l + i28;
                this.l = i29;
                if (j11 != -1) {
                    long j17 = this.f11839m * 1000000;
                    s2 s2Var4 = this.f11835h;
                    String str3 = uu0.f20901a;
                    this.f11832e.c(j17 / ((long) s2Var4.f19772e), 1, i29, 0, null);
                    this.l = 0;
                    this.f11839m = j11;
                }
                int length = np0Var4.f17880a.length - np0Var4.f17882c;
                if (np0Var4.B() < 16 && length < 16) {
                    int iB = np0Var4.B();
                    byte[] bArr4 = np0Var4.f17880a;
                    System.arraycopy(bArr4, np0Var4.f17881b, bArr4, 0, iB);
                    np0Var4.E(0);
                    np0Var4.C(iB);
                }
            }
            return 0;
        }
        int i30 = 0;
        s2 s2Var5 = this.f11835h;
        while (true) {
            n2Var.zzl();
            byte[] bArr5 = new byte[i13];
            gp0 gp0Var = new gp0(bArr5, i13);
            int i31 = i30;
            n2Var.v(bArr5, i31, i13);
            boolean zG = gp0Var.g();
            int iH = gp0Var.h(i14);
            int iH2 = gp0Var.h(24) + i13;
            if (iH == 0) {
                byte[] bArr6 = new byte[38];
                n2Var.p(bArr6, i31, 38);
                s2Var5 = new s2(bArr6, i13, i31);
            } else {
                if (s2Var5 == null) {
                    throw new IllegalArgumentException();
                }
                s8 s8Var2 = (s8) s2Var5.l;
                if (iH == i12) {
                    np0 np0Var5 = new np0(iH2);
                    n2Var.p(np0Var5.f17880a, i31, iH2);
                    s2Var5 = new s2(s2Var5.f19768a, s2Var5.f19769b, s2Var5.f19770c, s2Var5.f19771d, s2Var5.f19772e, s2Var5.f19774g, s2Var5.f19775h, s2Var5.f19777j, ps1.I(np0Var5), (s8) s2Var5.l);
                } else if (iH == i13) {
                    np0 np0Var6 = new np0(iH2);
                    n2Var.p(np0Var6.f17880a, 0, iH2);
                    np0Var6.G(i13);
                    s8 s8VarA = j3.a(Arrays.asList((String[]) zw1.h(np0Var6, false, false).f22523a));
                    if (s8Var2 != null) {
                        s8VarA = s8Var2.b(s8VarA);
                    }
                    s2Var5 = new s2(s2Var5.f19768a, s2Var5.f19769b, s2Var5.f19770c, s2Var5.f19771d, s2Var5.f19772e, s2Var5.f19774g, s2Var5.f19775h, s2Var5.f19777j, (md0) s2Var5.f19778k, s8VarA);
                } else if (iH == 6) {
                    np0 np0Var7 = new np0(iH2);
                    n2Var.p(np0Var7.f17880a, 0, iH2);
                    np0Var7.G(4);
                    s8 s8Var3 = new s8(ca1.u(p4.b(np0Var7)));
                    if (s8Var2 != null) {
                        s8Var3 = s8Var2.b(s8Var3);
                    }
                    s2Var5 = new s2(s2Var5.f19768a, s2Var5.f19769b, s2Var5.f19770c, s2Var5.f19771d, s2Var5.f19772e, s2Var5.f19774g, s2Var5.f19775h, s2Var5.f19777j, (md0) s2Var5.f19778k, s8Var3);
                } else {
                    n2Var.zzf(iH2);
                }
            }
            String str4 = uu0.f20901a;
            this.f11835h = s2Var5;
            if (zG) {
                this.f11836i = Math.max(s2Var5.f19770c, 6);
                g22 g22VarF = this.f11835h.f(bArr, this.f11834g);
                h3 h3Var = this.f11832e;
                i12 i12Var = new i12(g22VarF);
                i12Var.d(MimeTypes.AUDIO_FLAC);
                h3Var.f(new g22(i12Var));
                h3 h3Var2 = this.f11832e;
                this.f11835h.e();
                h3Var2.getClass();
                this.f11833f = 4;
                return 0;
            }
            bArr = bArr;
            i12 = 3;
            i13 = 4;
            i14 = 7;
            i30 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f11831d = o2Var;
        this.f11832e = o2Var.e(0, 1);
        o2Var.zzv();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
