package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h42 implements q32, o2, d0 {
    public static final Map O;
    public static final g22 P;
    public long A;
    public boolean B;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public long I;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f15124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk1 f15125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s6 f15126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iw0 f15127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f81 f15128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j42 f15129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f15130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f15132i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ay0 f15134k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f15138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q4 f15139q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15143u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15144v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f15145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hz f15147y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a3 f15148z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vu0 f15133j = new vu0();
    public final qf0 l = new qf0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e42 f15135m = new e42(this, 2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e42 f15136n = new e42(this, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f15137o = uu0.o();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g42[] f15142t = new g42[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n42[] f15141s = new n42[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c42[] f15140r = new c42[0];
    public long J = C.TIME_UNSET;
    public int C = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        O = Collections.unmodifiableMap(map);
        i12 i12Var = new i12();
        i12Var.f15499a = "icy";
        i12Var.e("application/x-icy");
        P = new g22(i12Var);
    }

    public h42(Uri uri, wk1 wk1Var, ay0 ay0Var, s6 s6Var, f81 f81Var, iw0 iw0Var, j42 j42Var, u uVar, int i10, long j10) {
        this.f15124a = uri;
        this.f15125b = wk1Var;
        this.f15126c = s6Var;
        this.f15128e = f81Var;
        this.f15127d = iw0Var;
        this.f15129f = j42Var;
        this.f15130g = uVar;
        this.f15131h = i10;
        this.f15134k = ay0Var;
        this.f15132i = j10;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean b(bz1 bz1Var) {
        if (this.M) {
            return false;
        }
        vu0 vu0Var = this.f15133j;
        if (((IOException) vu0Var.f21276d) != null || this.K) {
            return false;
        }
        if (this.f15144v && this.G == 0) {
            return false;
        }
        boolean zA = this.l.a();
        if (((c0) vu0Var.f21275c) != null) {
            return zA;
        }
        q();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2 A[LOOP:1: B:66:0x00c0->B:67:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de A[LOOP:2: B:71:0x00dc->B:72:0x00de, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x00bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x00d5, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.q32
    public final long c(long j10) throws Throwable {
        vu0 vu0Var;
        int i10;
        int i11;
        boolean zN;
        int i12;
        int i13;
        u();
        boolean[] zArr = (boolean[]) this.f15147y.f15434c;
        if (true != this.f15148z.zzb()) {
            j10 = 0;
        }
        this.E = false;
        long j11 = this.I;
        this.I = j10;
        if (t()) {
            this.J = j10;
            return j10;
        }
        if (this.C == 7 || (!this.M && ((c0) this.f15133j.f21275c) == null)) {
            this.K = false;
            this.J = j10;
            this.M = false;
            this.F = false;
            vu0Var = this.f15133j;
            if (((c0) vu0Var.f21275c) != null) {
                vu0Var.f21276d = null;
                for (n42 n42Var : this.f15141s) {
                    n42Var.k(false);
                }
                break;
            }
            for (n42 n42Var2 : this.f15141s) {
                n42Var2.o();
            }
            c0 c0Var = (c0) vu0Var.f21275c;
            c0Var.getClass();
            c0Var.a(false);
            return j10;
        }
        int length = this.f15141s.length;
        for (int i14 = 0; i14 < length; i14++) {
            n42 n42Var3 = this.f15141s[i14];
            if (this.f15140r[i14].f13039d.get() == b42.f12630a) {
                int i15 = n42Var3.f17659p;
                if (n42Var3.f17661r + i15 != 0 || j11 != j10) {
                    if (this.f15146x) {
                        synchronized (n42Var3) {
                            synchronized (n42Var3) {
                                n42Var3.f17661r = 0;
                                k42 k42Var = n42Var3.f17645a;
                                k42Var.f16315e = (c7) k42Var.f16314d;
                            }
                        }
                        int i16 = n42Var3.f17659p;
                        if (i15 < i16 || i15 > n42Var3.f17658o + i16 || (((i12 = n42Var3.f17666w) != -1 && i15 >= i12) || ((i13 = n42Var3.f17667x) != -1 && i15 >= i13))) {
                            zN = false;
                        } else {
                            n42Var3.f17662s = Long.MIN_VALUE;
                            n42Var3.f17661r = i15 - i16;
                            zN = true;
                        }
                    } else {
                        zN = n42Var3.n(j10, this.M);
                    }
                    if (!zN && (zArr[i14] || !this.f15145w)) {
                        this.K = false;
                        this.J = j10;
                        this.M = false;
                        this.F = false;
                        vu0Var = this.f15133j;
                        if (((c0) vu0Var.f21275c) != null) {
                            vu0Var.f21276d = null;
                            while (i10 < r0) {
                                n42Var.k(false);
                            }
                            break;
                            break;
                        }
                        while (i11 < r2) {
                            n42Var2.o();
                        }
                        c0 c0Var2 = (c0) vu0Var.f21275c;
                        c0Var2.getClass();
                        c0Var2.a(false);
                        return j10;
                    }
                }
            }
        }
        return j10;
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    public final void d(d42 d42Var, boolean z10) {
        Object obj = d42Var.f13388b.f15865c;
        j32 j32Var = new j32();
        long j10 = d42Var.f13395i;
        long j11 = this.A;
        iw0 iw0Var = this.f15127d;
        iw0Var.B(new u32(iw0Var, j32Var, new o32(-1, null, uu0.s(j10), uu0.s(j11)), 1));
        if (z10) {
            return;
        }
        for (n42 n42Var : this.f15141s) {
            n42Var.k(false);
        }
        if (this.G > 0) {
            ?? r14 = this.f15138p;
            r14.getClass();
            r14.e(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final h3 e(int i10, int i11) {
        return n(new g42(i10, false));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.q32
    public final long f(long j10, wz1 wz1Var) {
        long j11;
        boolean z10;
        long j12;
        boolean z11;
        u();
        if (!this.f15148z.zzb()) {
            return 0L;
        }
        z2 z2VarB = this.f15148z.b(j10);
        b3 b3Var = z2VarB.f22469a;
        b3 b3Var2 = z2VarB.f22470b;
        long j13 = wz1Var.f21654a;
        if (j13 == 0) {
            return j10;
        }
        String str = uu0.f20901a;
        long j14 = j10 - j13;
        long j15 = Long.MAX_VALUE;
        long j16 = (((j10 ^ j14) > 0L ? 1 : ((j10 ^ j14) == 0L ? 0 : -1)) >= 0) | (((j13 ^ j10) > 0L ? 1 : ((j13 ^ j10) == 0L ? 0 : -1)) >= 0) ? j14 : ((j14 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j17 = Long.MIN_VALUE;
        if (j16 != Long.MIN_VALUE) {
            if (j16 == Long.MAX_VALUE) {
                if (j14 != Long.MAX_VALUE) {
                    j16 = Long.MIN_VALUE;
                } else {
                    j16 = Long.MAX_VALUE;
                }
            }
        } else if (j14 == Long.MIN_VALUE) {
            j14 = Long.MIN_VALUE;
            if (j16 == Long.MAX_VALUE) {
                if (j14 != Long.MAX_VALUE) {
                    j16 = Long.MIN_VALUE;
                } else {
                    j16 = Long.MAX_VALUE;
                }
            }
        } else {
            j16 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            if (j10 == Long.MIN_VALUE) {
            }
            j11 = b3Var.f12619a;
            if (j16 <= j11 || j11 > j15) {
                z10 = false;
            } else {
                z10 = true;
            }
            j12 = b3Var2.f12619a;
            z11 = j16 > j12 && j12 <= j15;
            if (!z10 && z11) {
                if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                    return j11;
                }
                return j12;
            }
            if (!z10) {
                if (z11) {
                    return j12;
                }
                return j16;
            }
            return j11;
        }
        j17 = j10;
        if (j10 == Long.MAX_VALUE) {
            int i10 = (j17 > Long.MAX_VALUE ? 1 : (j17 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j15 = j10;
        }
        j11 = b3Var.f12619a;
        if (j16 <= j11) {
            z10 = false;
        } else {
            z10 = false;
        }
        j12 = b3Var2.f12619a;
        if (j16 > j12) {
        }
        if (!z10) {
        }
        if (!z10) {
            if (z11) {
                return j12;
            }
            return j16;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void g(p32 p32Var, long j10) {
        this.f15138p = p32Var;
        this.l.a();
        q();
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long h(p[] pVarArr, boolean[] zArr, o42[] o42VarArr, boolean[] zArr2, long j10) throws Throwable {
        p pVar;
        u();
        hz hzVar = this.f15147y;
        v42 v42Var = (v42) hzVar.f15433b;
        boolean[] zArr3 = (boolean[]) hzVar.f15435d;
        int i10 = this.G;
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            o42 o42Var = o42VarArr[i11];
            if (o42Var != null && (pVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((f42) o42Var).f14211a;
                ps1.c0(zArr3[i12]);
                this.G--;
                zArr3[i12] = false;
                o42VarArr[i11] = null;
            }
        }
        boolean z10 = !this.D ? j10 == 0 || this.f15146x : i10 != 0;
        for (int i13 = 0; i13 < pVarArr.length; i13++) {
            if (o42VarArr[i13] == null && (pVar = pVarArr[i13]) != null) {
                ps1.c0(pVar.zze() == 1);
                ps1.c0(pVar.zzf(0) == 0);
                int iIndexOf = v42Var.f21029b.indexOf(pVar.zza());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                ps1.c0(!zArr3[iIndexOf]);
                this.G++;
                zArr3[iIndexOf] = true;
                this.F = pVar.zzc().f14684u | this.F;
                o42VarArr[i13] = new f42(this, iIndexOf);
                zArr2[i13] = true;
                if (!z10) {
                    n42 n42Var = this.f15141s[iIndexOf];
                    z10 = (n42Var.f17659p + n42Var.f17661r == 0 || n42Var.n(j10, true)) ? false : true;
                }
            }
        }
        if (this.G == 0) {
            this.K = false;
            this.E = false;
            this.F = false;
            vu0 vu0Var = this.f15133j;
            if (((c0) vu0Var.f21275c) != null) {
                for (n42 n42Var2 : this.f15141s) {
                    n42Var2.o();
                }
                c0 c0Var = (c0) vu0Var.f21275c;
                c0Var.getClass();
                c0Var.a(false);
            } else {
                this.M = false;
                for (n42 n42Var3 : this.f15141s) {
                    n42Var3.k(false);
                }
            }
        } else if (z10) {
            j10 = c(j10);
            for (int i14 = 0; i14 < o42VarArr.length; i14++) {
                if (o42VarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.D = true;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // com.google.android.gms.internal.ads.q32
    public final void i(long j10) {
        long j11;
        long jI;
        int i10;
        if (this.f15146x) {
            return;
        }
        u();
        if (t()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f15147y.f15435d;
        int length = this.f15141s.length;
        int i11 = 0;
        while (i11 < length) {
            n42 n42Var = this.f15141s[i11];
            boolean z10 = zArr[i11];
            k42 k42Var = n42Var.f17645a;
            synchronized (n42Var) {
                try {
                    int i12 = n42Var.f17658o;
                    if (i12 != 0) {
                        long[] jArr = n42Var.f17656m;
                        int i13 = n42Var.f17660q;
                        if (j10 < jArr[i13]) {
                            j11 = j10;
                        } else {
                            j11 = j10;
                            int iH = n42Var.h(i13, (!z10 || (i10 = n42Var.f17661r) == i12) ? i12 : i10 + 1, j11, false);
                            jI = iH != -1 ? n42Var.i(iH) : -1L;
                        }
                    } else {
                        j11 = j10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            k42Var.a(jI);
            i11++;
            j10 = j11;
        }
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    public final void j(d42 d42Var) {
        if (this.A == C.TIME_UNSET && this.f15148z != null) {
            long jS = s(true);
            long j10 = jS == Long.MIN_VALUE ? 0L : jS + Xa.f27908s;
            this.A = j10;
            this.f15129f.s(j10, this.f15148z, this.B);
        }
        Object obj = d42Var.f13388b.f15865c;
        j32 j32Var = new j32();
        long j11 = d42Var.f13395i;
        long j12 = this.A;
        iw0 iw0Var = this.f15127d;
        iw0Var.B(new u32(iw0Var, j32Var, new o32(-1, null, uu0.s(j11), uu0.s(j12)), 0));
        this.M = true;
        ?? r15 = this.f15138p;
        r15.getClass();
        r15.e(this);
    }

    public final void k(int i10) {
        u();
        hz hzVar = this.f15147y;
        boolean[] zArr = (boolean[]) hzVar.f15436e;
        if (zArr[i10]) {
            return;
        }
        g22 g22Var = ((v42) hzVar.f15433b).a(i10).f17832d[0];
        o32 o32Var = new o32(na.e(g22Var.f14678o), g22Var, uu0.s(this.I), C.TIME_UNSET);
        iw0 iw0Var = this.f15127d;
        iw0Var.B(new f81(12, iw0Var, o32Var));
        zArr[i10] = true;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    public final void l(int i10) {
        u();
        if (this.K) {
            if ((!this.f15145w || ((boolean[]) this.f15147y.f15434c)[i10]) && !this.f15141s[i10].m(false)) {
                this.J = 0L;
                this.K = false;
                this.E = true;
                this.I = 0L;
                this.L = 0;
                for (n42 n42Var : this.f15141s) {
                    n42Var.k(false);
                }
                ?? r10 = this.f15138p;
                r10.getClass();
                r10.e(this);
            }
        }
    }

    public final boolean m() {
        return this.E || t();
    }

    public final h3 n(g42 g42Var) {
        int length = this.f15141s.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (g42Var.equals(this.f15142t[i10])) {
                return this.f15141s[i10];
            }
        }
        if (this.f15143u) {
            int i11 = g42Var.f14758a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i11);
            sb2.append(") after finishing tracks.");
            v71.y("ProgressiveMediaPeriod", sb2.toString());
            return new k2();
        }
        n42 n42Var = new n42(this.f15130g, this.f15126c, this.f15128e);
        c42 c42Var = new c42(n42Var);
        n42Var.f17649e = this;
        int i12 = length + 1;
        g42[] g42VarArr = (g42[]) Arrays.copyOf(this.f15142t, i12);
        g42VarArr[length] = g42Var;
        String str = uu0.f20901a;
        this.f15142t = g42VarArr;
        n42[] n42VarArr = (n42[]) Arrays.copyOf(this.f15141s, i12);
        n42VarArr[length] = n42Var;
        this.f15141s = n42VarArr;
        c42[] c42VarArr = (c42[]) Arrays.copyOf(this.f15140r, i12);
        c42VarArr[length] = c42Var;
        this.f15140r = c42VarArr;
        return c42Var;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void o(a3 a3Var) {
        this.f15137o.post(new f12(4, this, a3Var));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    public final void p() {
        int i10;
        char c4;
        if (this.N || this.f15144v || !this.f15143u || this.f15148z == null) {
            return;
        }
        for (n42 n42Var : this.f15141s) {
            if (n42Var.l() == null) {
                return;
            }
        }
        qf0 qf0Var = this.l;
        synchronized (qf0Var) {
            qf0Var.f19045a = false;
        }
        int length = this.f15141s.length;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            char c5 = 1;
            if (i12 >= length) {
                break;
            }
            g22 g22VarL = this.f15141s[i12].l();
            g22VarL.getClass();
            int iE = na.e(g22VarL.f14678o);
            if (iE == 1) {
                c4 = 3;
            } else if (iE == 2) {
                c4 = 4;
            } else if (iE != 3) {
                c4 = iE != 4 ? (char) 0 : (char) 2;
            } else {
                c4 = 1;
            }
            if (i11 == 1) {
                c5 = 3;
            } else if (i11 == 2) {
                c5 = 4;
            } else if (i11 != 3) {
                c5 = i11 != 4 ? (char) 0 : (char) 2;
            }
            if (c4 > c5) {
                i11 = iE;
            }
            if (c4 > c5) {
                i13 = i12;
            }
            i12++;
        }
        ni[] niVarArr = new ni[length];
        boolean[] zArr = new boolean[length];
        for (int i14 = 0; i14 < length; i14++) {
            g22 g22VarL2 = this.f15141s[i14].l();
            g22VarL2.getClass();
            String str = g22VarL2.f14678o;
            boolean zEquals = "audio".equals(na.i(str));
            boolean z10 = zEquals || na.a(str);
            zArr[i14] = z10;
            this.f15145w = z10 | this.f15145w;
            this.f15146x = this.f15132i != C.TIME_UNSET && length == 1 && na.b(str);
            q4 q4Var = this.f15139q;
            if (q4Var != null) {
                if (zEquals || this.f15142t[i14].f14759b) {
                    s8 s8Var = g22VarL2.l;
                    s8 s8Var2 = s8Var == null ? new s8(q4Var) : s8Var.c(q4Var);
                    i12 i12Var = new i12(g22VarL2);
                    i12Var.f15509k = s8Var2;
                    g22VarL2 = new g22(i12Var);
                }
                if (zEquals && g22VarL2.f14672h == -1 && g22VarL2.f14673i == -1 && (i10 = q4Var.f18917a) != -1) {
                    i12 i12Var2 = new i12(g22VarL2);
                    i12Var2.f15506h = i10;
                    g22VarL2 = new g22(i12Var2);
                }
            }
            this.f15126c.getClass();
            int i15 = g22VarL2.f14682s != null ? 1 : 0;
            i12 i12Var3 = new i12(g22VarL2);
            i12Var3.N = i15;
            g22 g22Var = new g22(i12Var3);
            if (i14 != i13) {
                i12 i12Var4 = new i12(g22Var);
                i12Var4.l = Integer.toString(i13);
                g22Var = new g22(i12Var4);
            }
            niVarArr[i14] = new ni(Integer.toString(i14), g22Var);
            this.F = g22Var.f14684u | this.F;
            n42 n42Var2 = this.f15141s[i14];
            synchronized (n42Var2) {
                if (n42Var2.f17663t != Long.MIN_VALUE) {
                    n42Var2.f17663t = Long.MIN_VALUE;
                    n42Var2.f17666w = -1;
                    n42Var2.f17667x = -1;
                }
            }
        }
        this.f15147y = new hz(new v42(niVarArr), zArr);
        if (this.f15146x && this.A == C.TIME_UNSET) {
            this.A = this.f15132i;
            this.f15148z = new a42(this, this.f15148z);
        }
        this.f15129f.s(this.A, this.f15148z, this.B);
        this.f15144v = true;
        ?? r0 = this.f15138p;
        r0.getClass();
        r0.d(this);
    }

    public final void q() {
        d42 d42Var = new d42(this, this.f15124a, this.f15125b, this.f15134k, this, this.l);
        if (this.f15144v) {
            ps1.c0(t());
            long j10 = this.A;
            if (j10 != C.TIME_UNSET && this.J > j10) {
                this.M = true;
                this.J = C.TIME_UNSET;
                return;
            }
            a3 a3Var = this.f15148z;
            a3Var.getClass();
            b3 b3Var = a3Var.b(this.J).f22469a;
            long j11 = this.J;
            d42Var.f13392f.f18888a = b3Var.f12620b;
            d42Var.f13395i = j11;
            d42Var.f13394h = true;
            d42Var.l = false;
            for (n42 n42Var : this.f15141s) {
                n42Var.f17662s = this.J;
            }
            this.J = C.TIME_UNSET;
        }
        this.L = r();
        vu0 vu0Var = this.f15133j;
        vu0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        vu0Var.f21276d = null;
        c0 c0Var = new c0(vu0Var, looperMyLooper, d42Var, this, SystemClock.elapsedRealtime());
        vu0 vu0Var2 = c0Var.f12956h;
        ps1.c0(((c0) vu0Var2.f21275c) == null);
        vu0Var2.f21275c = c0Var;
        c0Var.b();
    }

    public final int r() {
        int i10 = 0;
        for (n42 n42Var : this.f15141s) {
            i10 += n42Var.f17659p + n42Var.f17658o;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long s(boolean z10) {
        n42 n42Var;
        int i10 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            n42[] n42VarArr = this.f15141s;
            if (i10 >= n42VarArr.length) {
                return jMax;
            }
            if (z10) {
                n42Var = n42VarArr[i10];
                synchronized (n42Var) {
                    jMax = Math.max(jMax, n42Var.f17665v);
                }
            } else {
                hz hzVar = this.f15147y;
                hzVar.getClass();
                if (((boolean[]) hzVar.f15435d)[i10]) {
                    n42Var = n42VarArr[i10];
                    synchronized (n42Var) {
                    }
                    jMax = Math.max(jMax, n42Var.f17665v);
                } else {
                    continue;
                }
            }
            i10++;
        }
    }

    public final boolean t() {
        return this.J != C.TIME_UNSET;
    }

    public final void u() {
        ps1.c0(this.f15144v);
        this.f15147y.getClass();
        this.f15148z.getClass();
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzb() {
        long jS;
        boolean z10;
        long j10;
        u();
        if (this.M || this.G == 0) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.J;
        }
        if (this.f15145w) {
            int length = this.f15141s.length;
            jS = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                hz hzVar = this.f15147y;
                if (((boolean[]) hzVar.f15434c)[i10] && ((boolean[]) hzVar.f15435d)[i10]) {
                    n42 n42Var = this.f15141s[i10];
                    synchronized (n42Var) {
                        z10 = n42Var.f17668y;
                    }
                    if (z10) {
                        continue;
                    } else {
                        n42 n42Var2 = this.f15141s[i10];
                        synchronized (n42Var2) {
                            j10 = n42Var2.f17665v;
                        }
                        jS = Math.min(jS, j10);
                    }
                }
            }
        } else {
            jS = Long.MAX_VALUE;
        }
        if (jS == Long.MAX_VALUE) {
            jS = s(false);
        }
        return jS == Long.MIN_VALUE ? this.I : jS;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean zze() {
        boolean z10;
        if (this.M || ((c0) this.f15133j.f21275c) == null) {
            return false;
        }
        qf0 qf0Var = this.l;
        synchronized (qf0Var) {
            z10 = qf0Var.f19045a;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void zzm() throws IOException {
        IOException iOException;
        int i10 = this.C == 7 ? 6 : 3;
        vu0 vu0Var = this.f15133j;
        IOException iOException2 = (IOException) vu0Var.f21276d;
        if (iOException2 != null) {
            throw iOException2;
        }
        c0 c0Var = (c0) vu0Var.f21275c;
        if (c0Var != null && (iOException = c0Var.f12951c) != null && c0Var.f12952d > i10) {
            throw iOException;
        }
        if (this.M && !this.f15144v) {
            throw ab.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final v42 zzn() {
        u();
        return (v42) this.f15147y.f15433b;
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long zzr() {
        if (this.F) {
            this.F = false;
        } else {
            if (!this.E) {
                return C.TIME_UNSET;
            }
            if (!this.M && r() <= this.L) {
                return C.TIME_UNSET;
            }
            this.E = false;
        }
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void zzv() {
        this.f15143u = true;
        this.f15137o.post(this.f15135m);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void a(long j10) {
    }
}
