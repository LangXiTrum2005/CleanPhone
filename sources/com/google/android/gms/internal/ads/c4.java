package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final np0 f13016a = new np0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np0 f13017b = new np0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f13018c = new np0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final np0 f13019d = new np0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d4 f13020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o2 f13021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13026k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b4 f13029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f4 f13030p;

    static {
        int i10 = x10.f21697x;
    }

    public c4() {
        d4 d4Var = new d4(new k2());
        d4Var.f13380c = C.TIME_UNSET;
        d4Var.f13381d = new long[0];
        d4Var.f13382e = new long[0];
        this.f13020e = d4Var;
        this.f13022g = 1;
    }

    public final np0 a(n2 n2Var) {
        int i10 = this.l;
        np0 np0Var = this.f13019d;
        byte[] bArr = np0Var.f17880a;
        if (i10 > bArr.length) {
            int length = bArr.length;
            np0Var.z(0, new byte[Math.max(length + length, i10)]);
        } else {
            np0Var.E(0);
        }
        np0Var.C(this.l);
        n2Var.p(np0Var.f17880a, 0, this.l);
        return np0Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) throws EOFException, InterruptedIOException {
        np0 np0Var = this.f13016a;
        h2 h2Var = (h2) n2Var;
        h2Var.m(np0Var.f17880a, 0, 3, false);
        np0Var.E(0);
        if (np0Var.O() == 4607062) {
            h2Var.m(np0Var.f17880a, 0, 2, false);
            np0Var.E(0);
            if ((np0Var.L() & 250) == 0) {
                h2Var.m(np0Var.f17880a, 0, 4, false);
                np0Var.E(0);
                int iB = np0Var.b();
                h2Var.f15065f = 0;
                h2Var.a(iB, false);
                h2Var.m(np0Var.f17880a, 0, 4, false);
                np0Var.E(0);
                if (np0Var.b() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        if (j10 == 0) {
            this.f13022g = 1;
            this.f13023h = false;
        } else {
            this.f13022g = 3;
        }
        this.f13025j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x029d  */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        int i10;
        long j10;
        boolean z10;
        boolean z11;
        int i11;
        long j11;
        boolean z12;
        this.f13021f.getClass();
        while (true) {
            int i12 = this.f13022g;
            int i13 = 8;
            if (i12 == 1) {
                np0 np0Var = this.f13017b;
                if (!n2Var.x(np0Var.f17880a, 0, 9, true)) {
                    return -1;
                }
                np0Var.E(0);
                np0Var.G(4);
                int iK = np0Var.K();
                int i14 = iK & 4;
                int i15 = iK & 1;
                if (i14 != 0 && this.f13029o == null) {
                    this.f13029o = new b4(this.f13021f.e(8, 1));
                }
                if (i15 != 0 && this.f13030p == null) {
                    this.f13030p = new f4(this.f13021f.e(9, 2));
                }
                this.f13021f.zzv();
                this.f13025j = np0Var.b() - 5;
                this.f13022g = 2;
            } else if (i12 == 2) {
                n2Var.zzf(this.f13025j);
                this.f13025j = 0;
                this.f13022g = 3;
            } else if (i12 == 3) {
                np0 np0Var2 = this.f13018c;
                if (!n2Var.x(np0Var2.f17880a, 0, 11, true)) {
                    return -1;
                }
                np0Var2.E(0);
                this.f13026k = np0Var2.K();
                this.l = np0Var2.O();
                this.f13027m = np0Var2.O();
                this.f13027m = (((long) (np0Var2.K() << 24)) | this.f13027m) * 1000;
                np0Var2.G(3);
                this.f13022g = 4;
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                boolean z13 = this.f13023h;
                long j12 = C.TIME_UNSET;
                d4 d4Var = this.f13020e;
                long j13 = z13 ? this.f13024i + this.f13027m : d4Var.f13380c == C.TIME_UNSET ? 0L : this.f13027m;
                int i16 = this.f13026k;
                if (i16 == 8) {
                    if (this.f13029o != null) {
                        if (!this.f13028n) {
                            this.f13021f.o(new r2(C.TIME_UNSET, 0L));
                            this.f13028n = true;
                        }
                        b4 b4Var = this.f13029o;
                        np0 np0VarA = a(n2Var);
                        h3 h3Var = (h3) b4Var.f17550a;
                        if (b4Var.f12624c) {
                            i10 = 0;
                            np0VarA.G(1);
                        } else {
                            int iK2 = np0VarA.K();
                            int i17 = iK2 >> 4;
                            b4Var.f12626e = i17;
                            i10 = 0;
                            if (i17 == 2) {
                                int i18 = b4.f12623f[(iK2 >> 2) & 3];
                                i12 i12Var = new i12();
                                i12Var.d("video/x-flv");
                                i12Var.e(MimeTypes.AUDIO_MPEG);
                                i12Var.F = 1;
                                i12Var.H = i18;
                                h3Var.f(new g22(i12Var));
                                b4Var.f12625d = true;
                            } else if (i17 == 7 || i17 == 8) {
                                i12 i12Var2 = new i12();
                                i12Var2.d("video/x-flv");
                                i12Var2.e(i17 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW);
                                i12Var2.F = 1;
                                i12Var2.H = 8000;
                                h3Var.f(new g22(i12Var2));
                                b4Var.f12625d = true;
                            } else if (i17 != 10) {
                                throw new e4(l1.d.k(new StringBuilder(String.valueOf(i17).length() + 28), "Audio format not supported: ", i17));
                            }
                            b4Var.f12624c = true;
                        }
                        h3 h3Var2 = (h3) b4Var.f17550a;
                        if (b4Var.f12626e == 2) {
                            int iB = np0VarA.B();
                            h3Var2.b(iB, np0VarA);
                            h3Var2.c(j13, 1, iB, 0, null);
                        } else {
                            int iK3 = np0VarA.K();
                            z12 = false;
                            if (iK3 == 0 && !b4Var.f12625d) {
                                int iB2 = np0VarA.B();
                                byte[] bArr = new byte[iB2];
                                np0VarA.H(bArr, 0, iB2);
                                v1 v1VarP = dv.p(new gp0(bArr, iB2), false);
                                i12 i12Var3 = new i12();
                                i12Var3.d("video/x-flv");
                                i12Var3.e(MimeTypes.AUDIO_AAC);
                                i12Var3.f15508j = v1VarP.f20993a;
                                i12Var3.F = v1VarP.f20995c;
                                i12Var3.H = v1VarP.f20994b;
                                i12Var3.f15514q = Collections.singletonList(bArr);
                                h3Var2.f(new g22(i12Var3));
                                b4Var.f12625d = true;
                            } else if (b4Var.f12626e != 10 || iK3 == 1) {
                                int iB3 = np0VarA.B();
                                h3Var2.b(iB3, np0VarA);
                                h3Var2.c(j13, 1, iB3, 0, null);
                            }
                            z11 = z12;
                            z10 = true;
                            j10 = -9223372036854775807L;
                        }
                        z12 = true;
                        z11 = z12;
                        z10 = true;
                        j10 = -9223372036854775807L;
                    }
                    if (!this.f13023h && z11) {
                        this.f13023h = true;
                        if (d4Var.f13380c == j10) {
                            j11 = -this.f13027m;
                        } else {
                            j11 = 0;
                        }
                        this.f13024i = j11;
                    }
                    this.f13025j = 4;
                    this.f13022g = 2;
                    if (z10) {
                        return i10;
                    }
                } else {
                    i13 = i16;
                }
                i10 = 0;
                if (i13 != 9) {
                    j10 = -9223372036854775807L;
                    if (i13 != 18 || this.f13028n) {
                        n2Var.zzf(this.l);
                        z11 = false;
                        z10 = false;
                    } else {
                        np0 np0VarA2 = a(n2Var);
                        d4Var.getClass();
                        d4Var.getClass();
                        if (np0VarA2.K() == 2 && "onMetaData".equals(d4.X0(np0VarA2)) && np0VarA2.B() != 0 && np0VarA2.K() == 8) {
                            HashMap mapY0 = d4.Y0(np0VarA2);
                            Object obj = mapY0.get(IronSourceConstants.EVENTS_DURATION);
                            if (obj instanceof Double) {
                                double dDoubleValue = ((Double) obj).doubleValue();
                                if (dDoubleValue > 0.0d) {
                                    d4Var.f13380c = (long) (dDoubleValue * 1000000.0d);
                                }
                            }
                            Object obj2 = mapY0.get("keyframes");
                            if (obj2 instanceof Map) {
                                Map map = (Map) obj2;
                                Object obj3 = map.get("filepositions");
                                Object obj4 = map.get("times");
                                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                    List list = (List) obj3;
                                    List list2 = (List) obj4;
                                    int size = list2.size();
                                    d4Var.f13381d = new long[size];
                                    d4Var.f13382e = new long[size];
                                    for (int i19 = 0; i19 < size; i19++) {
                                        Object obj5 = list.get(i19);
                                        Object obj6 = list2.get(i19);
                                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                            d4Var.f13381d = new long[0];
                                            d4Var.f13382e = new long[0];
                                            break;
                                        }
                                        d4Var.f13381d[i19] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                        d4Var.f13382e[i19] = ((Double) obj5).longValue();
                                    }
                                }
                            }
                        }
                        long j14 = d4Var.f13380c;
                        if (j14 != C.TIME_UNSET) {
                            this.f13021f.o(new x2(d4Var.f13382e, d4Var.f13381d, j14));
                            this.f13028n = true;
                        }
                        z10 = true;
                        z11 = false;
                    }
                } else if (this.f13030p != null) {
                    if (!this.f13028n) {
                        this.f13021f.o(new r2(C.TIME_UNSET, 0L));
                        this.f13028n = true;
                    }
                    f4 f4Var = this.f13030p;
                    np0 np0VarA3 = a(n2Var);
                    f4Var.getClass();
                    int iK4 = np0VarA3.K();
                    int i20 = iK4 >> 4;
                    int i21 = iK4 & 15;
                    if (i21 != 7) {
                        throw new e4(l1.d.k(new StringBuilder(String.valueOf(i21).length() + 28), "Video format not supported: ", i21));
                    }
                    f4Var.f14208h = i20;
                    if (i20 != 5) {
                        h3 h3Var3 = (h3) f4Var.f17550a;
                        int iK5 = np0VarA3.K();
                        np0VarA3.v(3);
                        byte[] bArr2 = np0VarA3.f17880a;
                        int i22 = np0VarA3.f17881b;
                        int i23 = i22 + 1;
                        np0VarA3.f17881b = i23;
                        int i24 = bArr2[i22] & 255;
                        int i25 = i22 + 2;
                        np0VarA3.f17881b = i25;
                        int i26 = bArr2[i23] & 255;
                        np0VarA3.f17881b = i22 + 3;
                        long j15 = ((i24 << 24) >> 8) | (i26 << 8) | (bArr2[i25] & 255);
                        boolean z14 = false;
                        if (iK5 != 0) {
                            if (iK5 == 1 && f4Var.f14206f) {
                                int i27 = f4Var.f14208h == 1 ? 1 : 0;
                                if (f4Var.f14207g) {
                                    i11 = i27;
                                } else if (i27 != 0) {
                                    i11 = 1;
                                }
                                np0 np0Var3 = f4Var.f14204d;
                                byte[] bArr3 = np0Var3.f17880a;
                                bArr3[0] = 0;
                                bArr3[1] = 0;
                                bArr3[2] = 0;
                                int i28 = 4 - f4Var.f14205e;
                                int i29 = 0;
                                while (np0VarA3.B() > 0) {
                                    long j16 = j12;
                                    np0VarA3.H(np0Var3.f17880a, i28, f4Var.f14205e);
                                    np0Var3.E(0);
                                    np0 np0Var4 = f4Var.f14203c;
                                    int iH = np0Var3.h();
                                    np0Var4.E(0);
                                    h3Var3.b(4, np0Var4);
                                    h3Var3.b(iH, np0VarA3);
                                    i29 = i29 + 4 + iH;
                                    j12 = j16;
                                }
                                j10 = j12;
                                ((h3) f4Var.f17550a).c((j15 * 1000) + j13, i11, i29, 0, null);
                                f4Var.f14207g = true;
                                z14 = true;
                            }
                            z11 = z14;
                            z10 = true;
                        } else if (!f4Var.f14206f) {
                            byte[] bArr4 = new byte[np0VarA3.B()];
                            np0 np0Var5 = new np0(bArr4);
                            np0VarA3.H(bArr4, 0, np0VarA3.B());
                            z1 z1VarB = z1.b(np0Var5);
                            f4Var.f14205e = z1VarB.f22447b;
                            i12 i12Var4 = new i12();
                            i12Var4.d("video/x-flv");
                            i12Var4.e("video/avc");
                            i12Var4.f15508j = z1VarB.l;
                            i12Var4.f15518u = z1VarB.f22448c;
                            i12Var4.f15519v = z1VarB.f22449d;
                            i12Var4.A = z1VarB.f22456k;
                            i12Var4.f15514q = z1VarB.f22446a;
                            h3Var3.f(new g22(i12Var4));
                            f4Var.f14206f = true;
                        }
                        j10 = -9223372036854775807L;
                        if (z14) {
                        }
                        z10 = true;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    z10 = true;
                } else {
                    j10 = -9223372036854775807L;
                    n2Var.zzf(this.l);
                    z11 = false;
                    z10 = false;
                }
                if (!this.f13023h) {
                    this.f13023h = true;
                    if (d4Var.f13380c == j10) {
                        j11 = -this.f13027m;
                    } else {
                        j11 = 0;
                    }
                    this.f13024i = j11;
                }
                this.f13025j = 4;
                this.f13022g = 2;
                if (z10) {
                    return i10;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f13021f = o2Var;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
