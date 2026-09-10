package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 implements m2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o2 f20170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h3 f20171f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s8 f20174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s8 f20175j;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f20177m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x5 f20180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20181q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np0 f20166a = new np0(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f20167b = new y2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2 f20168c = new v2();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20176k = C.TIME_UNSET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x11 f20169d = new x11(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h3 f20172g = new k2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f20178n = -1;

    static {
        int i10 = pi1.R;
    }

    public final boolean a(n2 n2Var, boolean z10) throws EOFException {
        int iZzm;
        int i10;
        int iA;
        n2Var.zzl();
        if (n2Var.zzn() == 0) {
            s8 s8VarK = this.f20169d.k(n2Var, null, 131072);
            this.f20174i = s8VarK;
            if (s8VarK != null) {
                this.f20168c.a(s8VarK);
            }
            iZzm = (int) n2Var.zzm();
            if (!z10) {
                n2Var.zzf(iZzm);
            }
            i10 = 0;
        } else {
            iZzm = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (b(n2Var)) {
                if (i11 > 0) {
                    break;
                }
                c();
                throw new EOFException();
            }
            np0 np0Var = this.f20166a;
            np0Var.E(0);
            int iB = np0Var.b();
            if ((i10 == 0 || ((-128000) & iB) == (((long) i10) & (-128000))) && (iA = pi1.a(iB)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    this.f20167b.b(iB);
                    i10 = iB;
                }
                n2Var.b(iA - 4);
            } else {
                int i13 = i12 + 1;
                if (i12 == 131072) {
                    if (z10) {
                        return false;
                    }
                    c();
                    throw new EOFException();
                }
                if (z10) {
                    n2Var.zzl();
                    n2Var.b(iZzm + i13);
                } else {
                    n2Var.zzf(1);
                }
                i11 = 0;
                i12 = i13;
                i10 = 0;
            }
        }
        if (z10) {
            n2Var.zzf(iZzm + i12);
        } else {
            n2Var.zzl();
        }
        this.f20173h = i10;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final boolean b(n2 n2Var) {
        x5 x5Var = this.f20180p;
        if (x5Var != null) {
            long jZzg = x5Var.zzg();
            if (jZzg == -1 || n2Var.zzm() <= jZzg - 4) {
                try {
                    if (!n2Var.m(this.f20166a.f17880a, 0, 4, true)) {
                        return false;
                    }
                } catch (EOFException unused) {
                }
            }
        } else if (!n2Var.m(this.f20166a.f17880a, 0, 4, true)) {
            return false;
        }
        return true;
    }

    public final void c() {
        x5 x5Var = this.f20180p;
        if ((x5Var instanceof r5) && ((r5) x5Var).zzb()) {
            long j10 = this.f20178n;
            if (j10 == -1 || j10 == this.f20180p.zzg()) {
                return;
            }
            r5 r5Var = (r5) this.f20180p;
            this.f20180p = new r5(this.f20178n, r5Var.f19386h, r5Var.f19387i, r5Var.f19388j, false);
            o2 o2Var = this.f20170e;
            o2Var.getClass();
            o2Var.o(this.f20180p);
            this.f20171f.getClass();
            this.f20180p.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        return a(n2Var, true);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        this.f20173h = 0;
        this.f20176k = C.TIME_UNSET;
        this.l = 0L;
        this.f20179o = 0;
        this.f20178n = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x025a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0265  */
    /* JADX WARN: Code duplicated, block: B:109:0x0278  */
    /* JADX WARN: Code duplicated, block: B:113:0x0284  */
    /* JADX WARN: Code duplicated, block: B:119:0x029c  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:133:0x0306  */
    /* JADX WARN: Code duplicated, block: B:137:0x030e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0312  */
    /* JADX WARN: Code duplicated, block: B:141:0x031b  */
    /* JADX WARN: Code duplicated, block: B:143:0x031f  */
    /* JADX WARN: Code duplicated, block: B:147:0x034f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0376  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[PHI: r22
  0x0087: PHI (r22v2 int) = (r22v0 int), (r22v0 int), (r22v0 int), (r22v4 int) binds: [B:135:0x030a, B:142:0x031d, B:117:0x0298, B:34:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x01be  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2 A[LOOP:4: B:77:0x01d0->B:78:0x01d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:95:0x0236  */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        int iB;
        int i10;
        int iB2;
        int iH;
        long jMin;
        long[] jArr;
        int i11;
        int i12;
        int i13;
        v5 v5Var;
        long j10;
        int i14;
        int i15;
        int i16;
        int i17;
        v5 v5Var2;
        s8 s8Var;
        long jZzn;
        long jZzo;
        long jU;
        x5 r5Var;
        long jZzo2;
        long jU2;
        float fIntBitsToFloat;
        u5 u5VarA;
        u5 u5VarA2;
        long[] jArr2;
        int i18;
        v7 v7Var;
        v7 v7Var2;
        int i19;
        long jT;
        s5 s5Var;
        x5 x5Var;
        x5 r5Var2;
        long j11;
        int iK;
        this.f20171f.getClass();
        String str = uu0.f20901a;
        if (this.f20173h == 0) {
            try {
                a(n2Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        x5 x5Var2 = this.f20180p;
        np0 np0Var = this.f20166a;
        y2 y2Var = this.f20167b;
        if (x5Var2 == null) {
            np0 np0Var2 = new np0(y2Var.f22084c);
            n2Var.v(np0Var2.f17880a, 0, y2Var.f22084c);
            int i20 = 21;
            if ((y2Var.f22082a & 1) != 0) {
                if (y2Var.f22086e != 1) {
                    i20 = 36;
                }
            } else if (y2Var.f22086e == 1) {
                i20 = 13;
            }
            if (np0Var2.f17882c >= i20 + 4) {
                np0Var2.E(i20);
                iB = np0Var2.b();
                if (iB != 1483304551) {
                    if (iB == 1231971951) {
                        iB = 1231971951;
                    } else if (np0Var2.f17882c >= 40) {
                        np0Var2.E(36);
                        if (np0Var2.b() == 1447187017) {
                            iB = 1447187017;
                        } else {
                            iB = 0;
                        }
                    } else {
                        iB = 0;
                    }
                }
            } else if (np0Var2.f17882c >= 40) {
                np0Var2.E(36);
                if (np0Var2.b() == 1447187017) {
                    iB = 1447187017;
                } else {
                    iB = 0;
                }
            } else {
                iB = 0;
            }
            v2 v2Var = this.f20168c;
            if (iB == 1231971951) {
                i10 = 0;
                iB2 = np0Var2.b();
                if ((iB2 & 1) != 0) {
                    iH = np0Var2.h();
                } else {
                    iH = -1;
                }
                if ((iB2 & 2) != 0) {
                    jMin = np0Var2.P();
                } else {
                    jMin = -1;
                }
                if ((iB2 & 4) == 4) {
                    jArr2 = new long[100];
                    i18 = 0;
                    while (i18 < 100) {
                        jArr2[i18] = np0Var2.K();
                        i18++;
                        iB = iB;
                    }
                    jArr = jArr2;
                } else {
                    jArr = null;
                }
                i11 = iB;
                if ((iB2 & 8) != 0) {
                    np0Var2.G(4);
                }
                if (np0Var2.B() >= 24) {
                    np0Var2.G(11);
                    fIntBitsToFloat = Float.intBitsToFloat(np0Var2.b());
                    int iL = np0Var2.L();
                    int iL2 = np0Var2.L();
                    u5VarA = u5.a(iL);
                    u5VarA2 = u5.a(iL2);
                    if (fIntBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && u5VarA == null && u5VarA2 == null) {
                        v5Var = null;
                    } else {
                        v5Var = new v5(fIntBitsToFloat, u5VarA, u5VarA2);
                    }
                    np0Var2.G(2);
                    int iO = np0Var2.O();
                    i13 = iO >> 12;
                    i12 = iO & 4095;
                } else {
                    i12 = -1;
                    i13 = -1;
                    v5Var = null;
                }
                j10 = iH;
                i14 = y2Var.f22084c;
                i15 = y2Var.f22085d;
                i16 = y2Var.f22087f;
                i17 = y2Var.f22088g;
                v5Var2 = v5Var;
                if ((v2Var.f21004a != -1 || v2Var.f21005b == -1) && i13 != -1 && i12 != -1) {
                    v2Var.f21004a = i13;
                    v2Var.f21005b = i12;
                }
                if (v5Var2 != null) {
                    s8Var = new s8(v5Var2);
                } else {
                    s8Var = null;
                }
                this.f20175j = s8Var;
                jZzn = n2Var.zzn();
                n2Var.zzf(y2Var.f22084c);
                if (i11 == 1483304551) {
                    jZzo2 = n2Var.zzo();
                    jU2 = (j10 != -1 || j10 == 0) ? -9223372036854775807L : uu0.u(i15, (j10 * ((long) i17)) - 1);
                    if (jU2 != C.TIME_UNSET) {
                        r5Var = null;
                    } else {
                        if (jMin != -1 && jZzo2 != -1 && jZzn + jMin != jZzo2) {
                            long j12 = jZzo2 - jZzn;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jMin).length() + String.valueOf(j12).length() + 53 + 23);
                            q4.a.r(sb2, "Data size mismatch between stream (", j12, ") and Xing frame (");
                            sb2.append(jMin);
                            sb2.append("), using smaller value.");
                            v71.r("XingSeeker", sb2.toString());
                            jMin = Math.min(jMin, j12);
                        }
                        r5Var = new a6(jZzn, i14, jU2, i16, jMin, jArr);
                    }
                } else {
                    jZzo = n2Var.zzo();
                    if (j10 != -1 || j10 == 0) {
                        jU = -9223372036854775807L;
                    } else {
                        jU = uu0.u(i15, (((long) i17) * j10) - 1);
                    }
                    if (jU != C.TIME_UNSET) {
                        if (jMin != -1) {
                            jZzo = jZzn + jMin;
                        } else if (jZzo != -1) {
                            jMin = jZzo - jZzn;
                        } else {
                            r5Var = null;
                        }
                        long j13 = jMin - ((long) i14);
                        long j14 = jZzo;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        r5Var = new r5(j14, jZzn + ((long) i14), gc1.a(uu0.v(j13, 8000000L, jU, roundingMode)), gc1.a(pi1.b(j13, j10, roundingMode)), true);
                    } else {
                        r5Var = null;
                    }
                }
            } else if (iB != 1447187017) {
                if (iB != 1483304551) {
                    n2Var.zzl();
                    i10 = 0;
                } else {
                    i10 = 0;
                    iB2 = np0Var2.b();
                    if ((iB2 & 1) != 0) {
                        iH = np0Var2.h();
                    } else {
                        iH = -1;
                    }
                    if ((iB2 & 2) != 0) {
                        jMin = np0Var2.P();
                    } else {
                        jMin = -1;
                    }
                    if ((iB2 & 4) == 4) {
                        jArr2 = new long[100];
                        i18 = 0;
                        while (i18 < 100) {
                            jArr2[i18] = np0Var2.K();
                            i18++;
                            iB = iB;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    i11 = iB;
                    if ((iB2 & 8) != 0) {
                        np0Var2.G(4);
                    }
                    if (np0Var2.B() >= 24) {
                        np0Var2.G(11);
                        fIntBitsToFloat = Float.intBitsToFloat(np0Var2.b());
                        int iL3 = np0Var2.L();
                        int iL4 = np0Var2.L();
                        u5VarA = u5.a(iL3);
                        u5VarA2 = u5.a(iL4);
                        if (fIntBitsToFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            v5Var = new v5(fIntBitsToFloat, u5VarA, u5VarA2);
                        } else {
                            v5Var = new v5(fIntBitsToFloat, u5VarA, u5VarA2);
                        }
                        np0Var2.G(2);
                        int iO2 = np0Var2.O();
                        i13 = iO2 >> 12;
                        i12 = iO2 & 4095;
                    } else {
                        i12 = -1;
                        i13 = -1;
                        v5Var = null;
                    }
                    j10 = iH;
                    i14 = y2Var.f22084c;
                    i15 = y2Var.f22085d;
                    i16 = y2Var.f22087f;
                    i17 = y2Var.f22088g;
                    v5Var2 = v5Var;
                    if (v2Var.f21004a != -1) {
                        v2Var.f21004a = i13;
                        v2Var.f21005b = i12;
                    } else {
                        v2Var.f21004a = i13;
                        v2Var.f21005b = i12;
                    }
                    if (v5Var2 != null) {
                        s8Var = new s8(v5Var2);
                    } else {
                        s8Var = null;
                    }
                    this.f20175j = s8Var;
                    jZzn = n2Var.zzn();
                    n2Var.zzf(y2Var.f22084c);
                    if (i11 == 1483304551) {
                        jZzo2 = n2Var.zzo();
                        if (j10 != -1) {
                        }
                        if (jU2 != C.TIME_UNSET) {
                            if (jMin != -1) {
                                long j15 = jZzo2 - jZzn;
                                StringBuilder sb3 = new StringBuilder(String.valueOf(jMin).length() + String.valueOf(j15).length() + 53 + 23);
                                q4.a.r(sb3, "Data size mismatch between stream (", j15, ") and Xing frame (");
                                sb3.append(jMin);
                                sb3.append("), using smaller value.");
                                v71.r("XingSeeker", sb3.toString());
                                jMin = Math.min(jMin, j15);
                            }
                            r5Var = new a6(jZzn, i14, jU2, i16, jMin, jArr);
                        }
                    } else {
                        jZzo = n2Var.zzo();
                        if (j10 != -1) {
                            jU = -9223372036854775807L;
                        } else {
                            jU = -9223372036854775807L;
                        }
                        if (jU != C.TIME_UNSET) {
                            if (jMin != -1) {
                                jZzo = jZzn + jMin;
                            } else if (jZzo != -1) {
                                jMin = jZzo - jZzn;
                            }
                            long j16 = jMin - ((long) i14);
                            long j17 = jZzo;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            r5Var = new r5(j17, jZzn + ((long) i14), gc1.a(uu0.v(j16, 8000000L, jU, roundingMode2)), gc1.a(pi1.b(j16, j10, roundingMode2)), true);
                        }
                    }
                }
                r5Var = null;
            } else {
                long jZzo3 = n2Var.zzo();
                long jZzn2 = n2Var.zzn();
                np0Var2.G(6);
                int iB3 = np0Var2.b();
                i10 = 0;
                long j18 = y2Var.f22084c;
                long j19 = iB3;
                int iB4 = np0Var2.b();
                if (iB4 > 0) {
                    long jU3 = uu0.u(y2Var.f22085d, (((long) iB4) * ((long) y2Var.f22088g)) - 1);
                    int iL5 = np0Var2.L();
                    int iL6 = np0Var2.L();
                    int iL7 = np0Var2.L();
                    np0Var2.G(2);
                    long j20 = jZzn2 + ((long) y2Var.f22084c);
                    long[] jArr3 = new long[iL5];
                    long[] jArr4 = new long[iL5];
                    int i21 = 0;
                    while (true) {
                        if (i21 >= iL5) {
                            j11 = j20;
                            long jMax = jZzn2 + j18 + j19;
                            if (jZzo3 != -1 && jZzo3 != jMax) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(jZzo3).length() + 27 + String.valueOf(jMax).length());
                                q4.a.r(sb4, "VBRI data size mismatch: ", jZzo3, ", ");
                                sb4.append(jMax);
                                v71.y("VbriSeeker", sb4.toString());
                            }
                            if (jMax != j11) {
                                StringBuilder sb5 = new StringBuilder(String.valueOf(j11).length() + String.valueOf(jMax).length() + 43 + 28);
                                q4.a.r(sb5, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
                                sb5.append(j11);
                                sb5.append("\nSeeking will be inaccurate.");
                                v71.y("VbriSeeker", sb5.toString());
                                jMax = Math.max(jMax, j11);
                            }
                            r5Var = new y5(jArr3, jArr4, jU3, jMax, y2Var.f22087f);
                            break;
                        }
                        long j21 = j19;
                        int i22 = i21;
                        jArr3[i22] = (((long) i21) * jU3) / ((long) iL5);
                        jArr4[i22] = j11;
                        if (iL7 == 1) {
                            j11 = j20;
                            iK = np0Var2.K();
                        } else if (iL7 == 2) {
                            j11 = j20;
                            iK = np0Var2.L();
                        } else if (iL7 == 3) {
                            j11 = j20;
                            iK = np0Var2.O();
                        } else {
                            if (iL7 != 4) {
                                j11 = j20;
                                r5Var = null;
                                break;
                            }
                            j11 = j20;
                            iK = np0Var2.h();
                        }
                        j11 += ((long) iK) * ((long) iL6);
                        i21 = i22 + 1;
                        j19 = j21;
                        iL5 = iL5;
                        iL6 = iL6;
                    }
                } else {
                    r5Var = null;
                    break;
                }
                n2Var.zzf(y2Var.f22084c);
            }
            s8 s8Var2 = this.f20174i;
            long jZzn3 = n2Var.zzn();
            if (s8Var2 == null) {
                s5Var = null;
            } else {
                v7[] v7VarArr = s8Var2.f19891a;
                int length = v7VarArr.length;
                int i23 = i10;
                while (true) {
                    if (i23 >= length) {
                        v7Var = null;
                        break;
                    }
                    v7 v7Var3 = v7VarArr[i23];
                    if (a5.class.isAssignableFrom(v7Var3.getClass())) {
                        v7Var = (v7) a5.class.cast(v7Var3);
                        if (!j81.f16021a.zza(v7Var)) {
                            v7Var = null;
                        }
                    } else {
                        v7Var = null;
                    }
                    if (v7Var != null) {
                        break;
                    }
                    i23++;
                }
                a5 a5Var = (a5) v7Var;
                if (a5Var == null) {
                    s5Var = null;
                } else {
                    v7[] v7VarArr2 = s8Var2.f19891a;
                    int length2 = v7VarArr2.length;
                    int i24 = i10;
                    while (true) {
                        if (i24 >= length2) {
                            v7Var2 = null;
                            break;
                        }
                        v7 v7Var4 = v7VarArr2[i24];
                        if (c5.class.isAssignableFrom(v7Var4.getClass())) {
                            v7Var2 = (v7) c5.class.cast(v7Var4);
                            if (!((c5) v7Var2).f21738a.equals("TLEN")) {
                                v7Var2 = null;
                            }
                        } else {
                            v7Var2 = null;
                        }
                        if (v7Var2 != null) {
                            break;
                        }
                        i24++;
                    }
                    c5 c5Var = (c5) v7Var2;
                    if (c5Var == null) {
                        jT = -9223372036854775807L;
                        i19 = i10;
                    } else {
                        i19 = i10;
                        jT = uu0.t(Long.parseLong((String) c5Var.f13041c.get(i19)));
                    }
                    int[] iArr = a5Var.f11850e;
                    int length3 = iArr.length;
                    int i25 = length3 + 1;
                    long[] jArr5 = new long[i25];
                    long[] jArr6 = new long[i25];
                    jArr5[i19] = jZzn3;
                    jArr6[i19] = 0;
                    long j22 = 0;
                    int i26 = 1;
                    while (i26 <= length3) {
                        int i27 = i26 - 1;
                        long j23 = jZzn3 + ((long) (a5Var.f11848c + iArr[i27]));
                        j22 += (long) (a5Var.f11849d + a5Var.f11851f[i27]);
                        jArr5[i26] = j23;
                        jArr6[i26] = j22;
                        i26++;
                        iArr = iArr;
                        jZzn3 = j23;
                    }
                    s5Var = new s5(jArr5, jArr6, jT);
                }
            }
            if (this.f20181q) {
                r5Var2 = new w5(C.TIME_UNSET, 0L);
            } else {
                if (s5Var != null) {
                    x5Var = s5Var;
                } else {
                    x5Var = r5Var == null ? null : r5Var;
                }
                if (x5Var == null) {
                    n2Var.v(np0Var.f17880a, 0, 4);
                    np0Var.E(0);
                    y2Var.b(np0Var.b());
                    r5Var2 = new r5(n2Var.zzo(), n2Var.zzn(), y2Var.f22087f, y2Var.f22084c, true);
                } else {
                    r5Var2 = x5Var;
                }
                h3 h3Var = this.f20171f;
                r5Var2.zza();
                h3Var.getClass();
            }
            this.f20180p = r5Var2;
            this.f20170e.o(r5Var2);
            s8 s8VarB = this.f20174i;
            if (s8VarB != null) {
                s8 s8Var3 = this.f20175j;
                if (s8Var3 != null) {
                    s8VarB = s8VarB.b(s8Var3);
                }
            } else {
                s8VarB = this.f20175j;
            }
            i12 i12Var = new i12();
            i12Var.d(MimeTypes.AUDIO_MPEG);
            i12Var.e(y2Var.f22083b);
            i12Var.f15512o = 4096;
            i12Var.F = y2Var.f22086e;
            i12Var.H = y2Var.f22085d;
            i12Var.J = v2Var.f21004a;
            i12Var.K = v2Var.f21005b;
            i12Var.f15509k = s8VarB;
            if (this.f20180p.zzh() != -2147483647) {
                i12Var.f15506h = this.f20180p.zzh();
            }
            this.f20172g.f(new g22(i12Var));
            this.f20177m = n2Var.zzn();
        } else {
            long j24 = this.f20177m;
            if (j24 != 0) {
                long jZzn4 = n2Var.zzn();
                if (jZzn4 < j24) {
                    n2Var.zzf((int) (j24 - jZzn4));
                }
            }
        }
        int i28 = this.f20179o;
        if (i28 == 0) {
            n2Var.zzl();
            if (b(n2Var)) {
                return -1;
            }
            np0Var.E(0);
            int iB5 = np0Var.b();
            if (((-128000) & iB5) != (((long) this.f20173h) & (-128000)) || pi1.a(iB5) == -1) {
                n2Var.zzf(1);
                this.f20173h = 0;
                return 0;
            }
            y2Var.b(iB5);
            if (this.f20176k == C.TIME_UNSET) {
                this.f20176k = this.f20180p.a(n2Var.zzn());
            }
            i28 = y2Var.f22084c;
            this.f20179o = i28;
            this.f20178n = n2Var.zzn() + ((long) i28);
        }
        int iE = this.f20172g.e(n2Var, i28, true);
        if (iE == -1) {
            return -1;
        }
        int i29 = this.f20179o - iE;
        this.f20179o = i29;
        if (i29 > 0) {
            return 0;
        }
        this.f20172g.c(((this.l * 1000000) / ((long) y2Var.f22085d)) + this.f20176k, 1, y2Var.f22084c, 0, null);
        this.l += (long) y2Var.f22088g;
        this.f20179o = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f20170e = o2Var;
        h3 h3VarE = o2Var.e(0, 1);
        this.f20171f = h3VarE;
        this.f20172g = h3VarE;
        this.f20170e.zzv();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
