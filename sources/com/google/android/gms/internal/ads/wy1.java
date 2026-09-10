package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.ironsource.Xa;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 implements Handler.Callback, p32, oz1, d1 {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final long f21622d0 = uu0.s(Xa.f27908s);
    public boolean B;
    public boolean C;
    public vy1 D;
    public int E;
    public nz1 F;
    public androidx.recyclerview.widget.w G;
    public boolean H;
    public boolean J;
    public boolean K;
    public boolean M;
    public boolean P;
    public int Q;
    public vy1 R;
    public long S;
    public long T;
    public int U;
    public boolean V;
    public dy1 W;
    public gy1 Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uz1[] f21623a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f21624a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ux1[] f21625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f21627c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final zx1 f21628c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f21629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f21630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zy1 f21631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ys0 f21632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vc f21633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f21634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ih f21635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ug f21636k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sr0 f21637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f21638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s6 f21639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wv0 f21640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fz1 f21641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lo0 f21642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f21643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j02 f21644t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f21645u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d02 f21646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ys0 f21647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f21648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sy f21649y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public wz1 f21650z;
    public long Z = C.TIME_UNSET;
    public int N = 0;
    public boolean O = false;
    public boolean I = false;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f21626b0 = 1.0f;
    public vz1 A = vz1.f21326b;
    public long X = C.TIME_UNSET;
    public long L = C.TIME_UNSET;

    public wy1(Context context, ux1[] ux1VarArr, ux1[] ux1VarArr2, m mVar, s sVar, zy1 zy1Var, x xVar, d02 d02Var, wz1 wz1Var, zx1 zx1Var, long j10, boolean z10, Looper looper, s6 s6Var, wv0 wv0Var, j02 j02Var, gy1 gy1Var) {
        Looper looper2;
        this.f21640p = wv0Var;
        this.f21629d = mVar;
        this.f21630e = sVar;
        this.f21631f = zy1Var;
        boolean z11 = false;
        this.f21650z = wz1Var;
        this.f21628c0 = zx1Var;
        this.f21643s = j10;
        this.f21645u = z10;
        this.f21639o = s6Var;
        this.f21644t = j02Var;
        this.Y = gy1Var;
        this.f21646v = d02Var;
        this.l = zy1Var.zzf();
        gg ggVar = ci.f13168a;
        nz1 nz1VarA = nz1.a(sVar);
        this.F = nz1VarA;
        this.G = new androidx.recyclerview.widget.w(nz1VarA, 1);
        int length = ux1VarArr.length;
        this.f21625b = new ux1[2];
        this.f21627c = new boolean[2];
        mVar.getClass();
        this.f21623a = new uz1[2];
        boolean z12 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            ux1 ux1Var = ux1VarArr[i10];
            ux1Var.f20945e = i10;
            ux1Var.f20946f = j02Var;
            ux1Var.f20947g = s6Var;
            ux1[] ux1VarArr3 = this.f21625b;
            ux1Var.getClass();
            ux1VarArr3[i10] = ux1Var;
            ux1 ux1Var2 = this.f21625b[i10];
            synchronized (ux1Var2.f20941a) {
                ux1Var2.f20958s = mVar;
            }
            ux1 ux1Var3 = ux1VarArr2[i10];
            if (ux1Var3 != null) {
                ux1Var3.f20945e = i10;
                ux1Var3.f20946f = j02Var;
                ux1Var3.f20947g = s6Var;
                z12 = true;
            }
            this.f21623a[i10] = new uz1(i10, ux1VarArr[i10], ux1Var3);
        }
        this.f21648x = z12;
        this.f21637m = new sr0(this);
        this.f21638n = new ArrayList();
        this.f21635j = new ih();
        this.f21636k = new ug();
        ps1.c0(mVar.f17171a == null);
        mVar.f17171a = this;
        mVar.f17172b = xVar;
        this.V = true;
        ys0 ys0VarU = s6Var.u(looper, null);
        this.f21647w = ys0VarU;
        this.f21641q = new fz1(d02Var, ys0VarU, new uo0(this, 15), gy1Var);
        this.f21642r = new lo0(this, d02Var, ys0VarU, j02Var, xVar);
        vc vcVar = new vc();
        vcVar.f21149b = new Object();
        vcVar.f21150c = null;
        vcVar.f21151d = null;
        vcVar.f21148a = 0;
        this.f21633h = vcVar;
        synchronized (vcVar.f21149b) {
            try {
                if (((Looper) vcVar.f21150c) == null) {
                    if (vcVar.f21148a == 0 && ((HandlerThread) vcVar.f21151d) == null) {
                        z11 = true;
                    }
                    ps1.c0(z11);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    vcVar.f21151d = handlerThread;
                    handlerThread.start();
                    vcVar.f21150c = ((HandlerThread) vcVar.f21151d).getLooper();
                }
                vcVar.f21148a++;
                looper2 = (Looper) vcVar.f21150c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f21634i = looper2;
        ys0 ys0VarU2 = s6Var.u(looper2, this);
        this.f21632g = ys0VarU2;
        this.f21649y = new sy(context, looper2, this);
        ys0VarU2.b(35, new d1() { // from class: com.google.android.gms.internal.ads.ty1
            @Override // com.google.android.gms.internal.ads.d1
            public final /* synthetic */ void a(long j11, long j12, g22 g22Var, MediaFormat mediaFormat) {
                this.f20532a.a(j11, j12, g22Var, mediaFormat);
            }
        }).a();
    }

    public static final boolean A(dz1 dz1Var) {
        if (dz1Var != null) {
            try {
                k32 k32Var = dz1Var.f13774a;
                if (dz1Var.f13778e) {
                    o42[] o42VarArr = dz1Var.f13776c;
                    for (int i10 = 0; i10 < 2; i10++) {
                        o42 o42Var = o42VarArr[i10];
                        if (o42Var != null) {
                            o42Var.zzb();
                        }
                    }
                } else {
                    k32Var.zzm();
                }
                if ((!dz1Var.f13778e ? 0L : k32Var.zzc()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int W(ih ihVar, ug ugVar, int i10, boolean z10, Object obj, ci ciVar, ci ciVar2) {
        ci ciVar3 = ciVar;
        Object obj2 = ciVar3.b(ciVar3.o(obj, ugVar).f20772c, ihVar, 0L).f15744a;
        for (int i11 = 0; i11 < ciVar2.a(); i11++) {
            if (ciVar2.b(i11, ihVar, 0L).f15744a.equals(obj2)) {
                return i11;
            }
        }
        int iE = ciVar3.e(obj);
        int iC = ciVar3.c();
        int iE2 = -1;
        int i12 = 0;
        while (i12 < iC && iE2 == -1) {
            ci ciVar4 = ciVar3;
            int iL = ciVar4.l(iE, ugVar, ihVar, i10, z10);
            if (iL == -1) {
                iE2 = -1;
                break;
            }
            iE2 = ciVar2.e(ciVar4.f(iL));
            i12++;
            ciVar3 = ciVar4;
            iE = iL;
        }
        if (iE2 == -1) {
            return -1;
        }
        return ciVar2.d(iE2, ugVar, false).f20772c;
    }

    public static Pair z(ci ciVar, vy1 vy1Var, int i10, boolean z10, ih ihVar, ug ugVar) {
        ci ciVar2 = vy1Var.f21320a;
        if (ciVar.g()) {
            return null;
        }
        ci ciVar3 = true == ciVar2.g() ? ciVar : ciVar2;
        try {
            Pair pairM = ciVar3.m(ihVar, ugVar, vy1Var.f21321b, vy1Var.f21322c);
            if (!ciVar.equals(ciVar3)) {
                if (ciVar.e(pairM.first) == -1) {
                    int iW = W(ihVar, ugVar, i10, z10, pairM.first, ciVar3, ciVar);
                    if (iW != -1) {
                        return ciVar.m(ihVar, ugVar, iW, C.TIME_UNSET);
                    }
                    return null;
                }
                if (ciVar3.o(pairM.first, ugVar).f20774e && ciVar3.b(ugVar.f20772c, ihVar, 0L).f15754k == ciVar3.e(pairM.first)) {
                    return ciVar.m(ihVar, ugVar, ciVar.o(pairM.first, ugVar).f20772c, vy1Var.f21322c);
                }
            }
            return pairM;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final void B() {
        for (int i10 = 0; i10 < 2; i10++) {
            uz1[] uz1VarArr = this.f21623a;
            int iE = uz1VarArr[i10].E();
            uz1 uz1Var = uz1VarArr[i10];
            ux1 ux1Var = (ux1) uz1Var.f20972e;
            ux1 ux1Var2 = (ux1) uz1Var.f20973f;
            sr0 sr0Var = this.f21637m;
            uz1Var.v(ux1Var, sr0Var);
            if (ux1Var2 != null) {
                boolean z10 = (ux1Var2.f20948h == 0 || uz1Var.f20971d == 3) ? false : true;
                uz1Var.v(ux1Var2, sr0Var);
                uz1Var.w(false);
                if (z10) {
                    ux1 ux1Var3 = (ux1) uz1Var.f20972e;
                    ux1Var2.getClass();
                    ux1Var2.b(17, ux1Var3);
                }
            }
            uz1Var.f20971d = 0;
            m(i10, false);
            this.Q -= iE;
        }
        this.Z = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a A[Catch: RuntimeException -> 0x0044, TryCatch #1 {RuntimeException -> 0x0044, blocks: (B:21:0x0035, B:24:0x0040, B:22:0x003a, B:28:0x0047), top: B:43:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void C() {
        boolean z10;
        ux1 ux1Var;
        if (!this.f21648x || !V()) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = 2;
            if (i10 >= 2) {
                this.Z = C.TIME_UNSET;
                return;
            }
            uz1 uz1Var = this.f21623a[i10];
            int iE = uz1Var.E();
            sr0 sr0Var = this.f21637m;
            if (uz1Var.D()) {
                int i12 = uz1Var.f20971d;
                try {
                    if (i12 != 4) {
                        if (i12 != 2) {
                            i11 = i12;
                            z10 = false;
                        }
                        if (z10) {
                            try {
                                ux1Var = (ux1) uz1Var.f20972e;
                            } catch (RuntimeException e10) {
                                v71.J("RendererHolder", "Disable prewarming failed.", e10);
                            }
                        } else {
                            ux1Var = (ux1) uz1Var.f20973f;
                            if (ux1Var == null) {
                                throw null;
                            }
                        }
                        uz1Var.v(ux1Var, sr0Var);
                        uz1Var.w(z10);
                        uz1Var.f20971d = i11 != 4 ? 0 : 1;
                    } else {
                        i11 = i12;
                    }
                    uz1Var.w(z10);
                } catch (RuntimeException e11) {
                    v71.J("RendererHolder", "Reset prewarming failed.", e11);
                }
                z10 = true;
                if (z10) {
                    ux1Var = (ux1) uz1Var.f20972e;
                } else {
                    ux1Var = (ux1) uz1Var.f20973f;
                    if (ux1Var == null) {
                        throw null;
                    }
                }
                uz1Var.v(ux1Var, sr0Var);
                uz1Var.f20971d = i11 != 4 ? 0 : 1;
            }
            this.Q -= iE - uz1Var.E();
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0168  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public final void D() {
        int i10;
        int i11;
        int i12;
        sr0 sr0Var = this.f21637m;
        float f10 = sr0Var.zzj().f13130a;
        fz1 fz1Var = this.f21641q;
        dz1 dz1Var = (dz1) fz1Var.l;
        dz1 dz1Var2 = (dz1) fz1Var.f14617m;
        s sVar = null;
        dz1 dz1Var3 = dz1Var;
        boolean z10 = true;
        while (dz1Var3 != null && dz1Var3.f13778e) {
            s sVarF = dz1Var3.f(this.F.f18038a);
            s sVar2 = dz1Var3 == ((dz1) fz1Var.l) ? sVarF : sVar;
            s sVar3 = dz1Var3.f13787o;
            boolean z11 = false;
            if (sVar3 != null) {
                p[] pVarArr = (p[]) sVarF.f19744c;
                if (((p[]) sVar3.f19744c).length == pVarArr.length) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= pVarArr.length) {
                            if (dz1Var3 != dz1Var2) {
                                z11 = true;
                            }
                            z10 &= z11;
                            dz1Var3 = dz1Var3.f13785m;
                            sVar = sVar2;
                        } else if (sVarF.c(sVar3, i13)) {
                            i13++;
                        }
                    }
                }
            }
            if (!z10) {
                i10 = 4;
                fz1Var.R(dz1Var3);
                if (dz1Var3.f13778e) {
                    long jMax = Math.max(dz1Var3.f13780g.f14117b, this.S - dz1Var3.f13788p);
                    if (this.f21648x && V() && ((dz1) fz1Var.f14618n) == dz1Var3) {
                        C();
                    }
                    i11 = 4;
                    i12 = 2;
                    dz1Var3.g(sVarF, jMax, false, new boolean[2]);
                }
                Q(true);
                if (this.F.f18042e != i11) {
                    L();
                    l();
                    this.f21632g.c(i12);
                    return;
                }
                return;
            }
            dz1 dz1Var4 = (dz1) fz1Var.l;
            int iR = fz1Var.R(dz1Var4) & 1;
            uz1[] uz1VarArr = this.f21623a;
            boolean[] zArr = new boolean[2];
            sVar2.getClass();
            long jG = dz1Var4.g(sVar2, this.F.f18054r, 1 == iR, zArr);
            nz1 nz1Var = this.F;
            boolean z12 = (nz1Var.f18042e == 4 || jG == nz1Var.f18054r) ? false : true;
            nz1 nz1Var2 = this.F;
            boolean z13 = z12;
            i10 = 4;
            this.F = N(nz1Var2.f18039b, jG, nz1Var2.f18040c, nz1Var2.f18041d, z13, 5);
            if (z13) {
                s(jG, true);
            }
            C();
            boolean[] zArr2 = new boolean[2];
            int i14 = 0;
            for (int i15 = 2; i14 < i15; i15 = 2) {
                int iE = uz1VarArr[i14].E();
                zArr2[i14] = uz1VarArr[i14].t();
                uz1 uz1Var = uz1VarArr[i14];
                o42 o42Var = dz1Var4.f13776c[i14];
                long j10 = this.S;
                boolean z14 = zArr[i14];
                ux1 ux1Var = (ux1) uz1Var.f20972e;
                if (uz1.y(ux1Var)) {
                    if (o42Var != ux1Var.f20949i) {
                        uz1Var.v(ux1Var, sr0Var);
                    } else if (z14) {
                        ux1Var.u(j10, false, true);
                    }
                }
                ux1 ux1Var2 = (ux1) uz1Var.f20973f;
                if (ux1Var2 != null && uz1.y(ux1Var2)) {
                    if (o42Var != ux1Var2.f20949i) {
                        uz1Var.v(ux1Var2, sr0Var);
                    } else if (z14) {
                        ux1Var2.u(j10, false, true);
                    }
                }
                if (iE - uz1VarArr[i14].E() > 0) {
                    m(i14, false);
                }
                this.Q -= iE - uz1VarArr[i14].E();
                i14++;
            }
            O(zArr2, this.S);
            dz1Var4.f13781h = true;
            i11 = i10;
            i12 = 2;
            Q(true);
            if (this.F.f18042e != i11) {
                L();
                l();
                this.f21632g.c(i12);
                return;
            }
            return;
        }
    }

    public final boolean E() {
        dz1 dz1Var = (dz1) this.f21641q.l;
        long j10 = dz1Var.f13780g.f14120e;
        if (dz1Var.f13778e) {
            return j10 == C.TIME_UNSET || this.F.f18054r < j10 || !T();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0227  */
    /* JADX WARN: Code duplicated, block: B:107:0x022e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0234  */
    /* JADX WARN: Code duplicated, block: B:110:0x0238  */
    /* JADX WARN: Code duplicated, block: B:120:0x025a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0262  */
    /* JADX WARN: Code duplicated, block: B:130:0x0284  */
    /* JADX WARN: Code duplicated, block: B:132:0x028a  */
    /* JADX WARN: Code duplicated, block: B:136:0x029b  */
    /* JADX WARN: Code duplicated, block: B:142:0x02af  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02de  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:242:0x0414  */
    /* JADX WARN: Code duplicated, block: B:243:0x0417  */
    /* JADX WARN: Code duplicated, block: B:248:0x042b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x042d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0435  */
    /* JADX WARN: Code duplicated, block: B:255:0x045a  */
    /* JADX WARN: Code duplicated, block: B:260:0x0470  */
    /* JADX WARN: Code duplicated, block: B:261:0x0473  */
    /* JADX WARN: Code duplicated, block: B:264:0x047d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0485 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x0487  */
    /* JADX WARN: Code duplicated, block: B:269:0x048c  */
    /* JADX WARN: Code duplicated, block: B:273:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x018b  */
    /* JADX WARN: Code duplicated, block: B:72:0x019b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v26, types: [com.google.android.gms.internal.ads.ci] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [com.google.android.gms.internal.ads.vy1] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [com.google.android.gms.internal.ads.vy1] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.google.android.gms.internal.ads.ci] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.google.android.gms.internal.ads.nz1] */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.google.android.gms.internal.ads.wy1] */
    /* JADX WARN: Type inference failed for: r35v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v17 */
    /* JADX WARN: Type inference failed for: r35v18 */
    /* JADX WARN: Type inference failed for: r35v19 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void F(ci ciVar, boolean z10) throws Throwable {
        long j10;
        boolean z11;
        long j11;
        ih ihVar;
        int iK;
        ug ugVar;
        r32 r32Var;
        long j12;
        Object obj;
        ci ciVar2;
        ci ciVar3;
        boolean z12;
        ci ciVar4;
        long j13;
        Object obj2;
        boolean z13;
        boolean z14;
        long jMax;
        int iW;
        boolean z15;
        ci ciVar5;
        ug ugVar2;
        long jMin;
        r32 r32VarX;
        boolean zEquals;
        boolean z16;
        r32 r32Var2;
        a aVarA;
        long j14;
        int i10;
        int i11;
        long j15;
        boolean z17;
        Object obj3;
        boolean z18;
        boolean z19;
        boolean z20;
        ?? r10;
        r32 r32Var3;
        ?? r12;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        a aVarA2;
        int i15;
        int[] iArr2;
        int i16;
        Pair pairZ;
        long j16;
        long jLongValue;
        int iK2;
        boolean z21;
        boolean z22;
        ?? r35;
        ?? r13;
        ?? r14;
        ?? r11;
        r32 r32Var4;
        Throwable th2;
        long j17;
        r32 r32Var5;
        long j18;
        long j19;
        ci ciVar6;
        ?? r15;
        ?? r36;
        ?? r16;
        ?? r17;
        long j20;
        r32 r32Var6;
        long j21;
        long j22;
        ?? r37;
        ?? r18;
        ?? r19;
        ?? r110;
        ?? r38;
        Object obj4;
        boolean z23;
        nz1 nz1Var = this.F;
        vy1 vy1Var = this.R;
        ug ugVar3 = this.f21636k;
        int i17 = this.N;
        boolean z24 = this.O;
        int i18 = 4;
        long jH = 0;
        if (ciVar.g()) {
            r32 r32Var7 = nz1.f18037t;
            r32 r32Var8 = nz1Var.f18039b;
            boolean z25 = (r32Var7.equals(r32Var8) && nz1Var.f18054r == 0) ? false : true;
            if (!z25 || z10 == 0) {
                z23 = false;
            } else {
                ci ciVar7 = nz1Var.f18038a;
                if (ciVar7.g() || ciVar7.o(r32Var8.f19359a, ugVar3).f20774e) {
                    z23 = false;
                } else {
                    z23 = true;
                }
            }
            z19 = z23;
            r32Var3 = r32Var7;
            r12 = z25;
            jH = 0;
            z20 = false;
            r10 = 0;
            j10 = C.TIME_UNSET;
            j12 = C.TIME_UNSET;
            z14 = true;
            ciVar5 = ciVar;
        } else {
            r32 r32Var9 = nz1Var.f18039b;
            Object obj5 = r32Var9.f19359a;
            ci ciVar8 = nz1Var.f18038a;
            if (ciVar8.g()) {
                j10 = C.TIME_UNSET;
            } else {
                j10 = C.TIME_UNSET;
                if (!ciVar8.o(r32Var9.f19359a, ugVar3).f20774e) {
                    z11 = false;
                }
                j11 = (!r32Var9.b() || z11) ? nz1Var.f18040c : nz1Var.f18054r;
                ihVar = this.f21635j;
                iK = -1;
                if (vy1Var != null) {
                    r32Var = r32Var9;
                    obj = obj5;
                    ugVar = ugVar3;
                    pairZ = z(ciVar, vy1Var, i17, z24, ihVar, ugVar);
                    if (pairZ == null) {
                        iK2 = ciVar.k(z24);
                        obj2 = obj;
                        jLongValue = j11;
                        j16 = jLongValue;
                        z21 = false;
                        z22 = false;
                        z14 = true;
                    } else {
                        j16 = j11;
                        if (vy1Var.f21322c == j10) {
                            iK2 = ciVar.o(pairZ.first, ugVar).f20772c;
                            obj2 = obj;
                            jLongValue = j16;
                            z21 = false;
                        } else {
                            Object obj6 = pairZ.first;
                            jLongValue = ((Long) pairZ.second).longValue();
                            obj2 = obj6;
                            iK2 = -1;
                            z21 = true;
                        }
                        if (nz1Var.f18042e == 4) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z14 = false;
                    }
                    boolean z26 = z22;
                    z13 = z21;
                    z12 = z26;
                    long j23 = jLongValue;
                    ciVar4 = ciVar;
                    iK = iK2;
                    j13 = j16;
                    j12 = j23;
                } else {
                    ugVar = ugVar3;
                    r32Var = r32Var9;
                    j12 = j11;
                    obj = obj5;
                    ciVar2 = ciVar;
                    ciVar3 = nz1Var.f18038a;
                    if (ciVar3.g()) {
                        iK = ciVar2.k(z24);
                        obj2 = obj;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else if (ciVar2.e(obj) == -1) {
                        z12 = false;
                        iW = W(ihVar, ugVar, i17, z24, obj, ciVar3, ciVar2);
                        if (iW == -1) {
                            ihVar = ihVar;
                            ciVar2 = ciVar2;
                            obj = obj;
                            iW = ciVar2.k(z24);
                            z15 = true;
                        } else {
                            ihVar = ihVar;
                            ciVar2 = ciVar2;
                            obj = obj;
                            z15 = false;
                        }
                        z14 = z15;
                        obj2 = obj;
                        z13 = false;
                        iK = iW;
                    } else {
                        z12 = false;
                        if (j12 == j10) {
                            iK = ciVar2.o(obj, ugVar).f20772c;
                            obj2 = obj;
                            z13 = false;
                            z14 = false;
                        } else {
                            if (z11 != 0) {
                                ciVar3.o(obj, ugVar);
                                if (ciVar3.b(ugVar.f20772c, ihVar, 0L).f15754k == ciVar3.e(obj)) {
                                    Pair pairM = ciVar2.m(ihVar, ugVar, ciVar2.o(obj, ugVar).f20772c, j12);
                                    ciVar4 = ciVar2;
                                    ihVar = ihVar;
                                    ugVar = ugVar;
                                    j13 = j12;
                                    obj2 = pairM.first;
                                    jMax = ((Long) pairM.second).longValue();
                                } else {
                                    ciVar4 = ciVar2;
                                    ugVar = ugVar;
                                    j13 = j12;
                                    if (ciVar4.o(obj, ugVar).f20773d != j10) {
                                        long j24 = ugVar.f20773d - 1;
                                        String str = uu0.f20901a;
                                        jMax = Math.max(0L, Math.min(j13, j24));
                                    } else {
                                        jMax = j13;
                                    }
                                    obj2 = obj;
                                }
                                j12 = jMax;
                                z12 = false;
                                z13 = true;
                            } else {
                                ciVar4 = ciVar2;
                                ugVar = ugVar;
                                j13 = j12;
                                obj2 = obj;
                                z12 = false;
                                z13 = false;
                            }
                            z14 = false;
                        }
                    }
                    ciVar4 = ciVar2;
                    j13 = j12;
                }
                if (iK != -1) {
                    ugVar2 = ugVar;
                    ciVar5 = ciVar;
                    Pair pairM2 = ciVar5.m(ihVar, ugVar2, iK, C.TIME_UNSET);
                    obj2 = pairM2.first;
                    jMin = ((Long) pairM2.second).longValue();
                    j12 = j10;
                } else {
                    ciVar5 = ciVar4;
                    ugVar2 = ugVar;
                    jMin = j12;
                }
                r32VarX = this.f21641q.X(ciVar5, obj2);
                zEquals = obj.equals(obj2);
                if (zEquals || r32Var.b() || r32VarX.b()) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                ug ugVarO = ciVar5.o(obj2, ugVar2);
                if (z11 && j13 == j12 && obj.equals(r32VarX.f19359a)) {
                    if (r32Var.b()) {
                        r32Var2 = r32Var;
                        ugVarO.c(r32Var2.f19360b);
                    } else {
                        r32Var2 = r32Var;
                    }
                    if (r32VarX.b()) {
                        ugVarO.c(-1);
                    }
                } else {
                    r32Var2 = r32Var;
                }
                if (true == z16) {
                    r32VarX = r32Var2;
                }
                if (r32VarX.b()) {
                    if (r32VarX.equals(r32Var2)) {
                        jMin = nz1Var.f18054r;
                    } else {
                        ciVar5.o(r32VarX.f19359a, ugVar2);
                        i14 = r32VarX.f19361c;
                        aVarA2 = ugVar2.f20775f.a(r32VarX.f19360b);
                        i15 = 0;
                        while (true) {
                            iArr2 = aVarA2.f11787d;
                            if (i15 < iArr2.length || (i16 = iArr2[i15]) == 0 || i16 == 1) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (i14 == i15) {
                            ugVar2.f20775f.getClass();
                        }
                        jMin = 0;
                    }
                } else if (zEquals && r32Var2.b()) {
                    aVarA = ciVar5.o(obj2, ugVar2).f20775f.a(r32Var2.f19360b);
                    aVarA.getClass();
                    j14 = nz1Var.f18040c;
                    if (j14 != j10 || j14 < jH) {
                        i10 = aVarA.f11784a;
                        i11 = r32Var2.f19361c;
                        if (i10 > i11 && aVarA.f11787d[i11] == 2) {
                            j15 = ciVar5.o(obj2, ugVar2).f20773d;
                            if (j15 != j10) {
                                jMin = Math.min(j15 - 1, jMin);
                            }
                            j12 = jMin;
                        }
                    }
                }
                if (r32VarX.equals(r32Var2) || jMin != nz1Var.f18054r) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (ciVar5.e(obj) == -1) {
                    i18 = 4;
                } else {
                    i18 = 3;
                }
                obj3 = r32VarX.f19359a;
                if (obj3.equals(obj) && (i12 = r32VarX.f19360b) != -1) {
                    a aVarA3 = ciVar5.o(obj3, ugVar2).f20775f.a(i12);
                    i13 = r32VarX.f19361c;
                    iArr = aVarA3.f11787d;
                    if (i13 < iArr.length || iArr[i13] != 2) {
                        i18 = 0;
                    }
                }
                if (z17 || z10 == 0) {
                    z18 = false;
                } else {
                    ci ciVar9 = nz1Var.f18038a;
                    if (ciVar9.g() || ciVar9.o(obj, ugVar2).f20774e) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                }
                jH = jMin;
                z19 = z18;
                z20 = z12;
                r10 = z13;
                r32Var3 = r32VarX;
                r12 = z17;
            }
            z11 = true;
            if (r32Var9.b()) {
            }
            ihVar = this.f21635j;
            iK = -1;
            if (vy1Var != null) {
                r32Var = r32Var9;
                obj = obj5;
                ugVar = ugVar3;
                pairZ = z(ciVar, vy1Var, i17, z24, ihVar, ugVar);
                if (pairZ == null) {
                    iK2 = ciVar.k(z24);
                    obj2 = obj;
                    jLongValue = j11;
                    j16 = jLongValue;
                    z21 = false;
                    z22 = false;
                    z14 = true;
                } else {
                    j16 = j11;
                    if (vy1Var.f21322c == j10) {
                        iK2 = ciVar.o(pairZ.first, ugVar).f20772c;
                        obj2 = obj;
                        jLongValue = j16;
                        z21 = false;
                    } else {
                        Object obj7 = pairZ.first;
                        jLongValue = ((Long) pairZ.second).longValue();
                        obj2 = obj7;
                        iK2 = -1;
                        z21 = true;
                    }
                    if (nz1Var.f18042e == 4) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z14 = false;
                }
                boolean z27 = z22;
                z13 = z21;
                z12 = z27;
                long j25 = jLongValue;
                ciVar4 = ciVar;
                iK = iK2;
                j13 = j16;
                j12 = j25;
            } else {
                ugVar = ugVar3;
                r32Var = r32Var9;
                j12 = j11;
                obj = obj5;
                ciVar2 = ciVar;
                ciVar3 = nz1Var.f18038a;
                if (ciVar3.g()) {
                    iK = ciVar2.k(z24);
                    obj2 = obj;
                    z12 = false;
                    z13 = false;
                    z14 = false;
                } else if (ciVar2.e(obj) == -1) {
                    z12 = false;
                    iW = W(ihVar, ugVar, i17, z24, obj, ciVar3, ciVar2);
                    if (iW == -1) {
                        ihVar = ihVar;
                        ciVar2 = ciVar2;
                        obj = obj;
                        iW = ciVar2.k(z24);
                        z15 = true;
                    } else {
                        ihVar = ihVar;
                        ciVar2 = ciVar2;
                        obj = obj;
                        z15 = false;
                    }
                    z14 = z15;
                    obj2 = obj;
                    z13 = false;
                    iK = iW;
                } else {
                    z12 = false;
                    if (j12 == j10) {
                        iK = ciVar2.o(obj, ugVar).f20772c;
                        obj2 = obj;
                        z13 = false;
                        z14 = false;
                    } else {
                        if (z11 != 0) {
                            ciVar3.o(obj, ugVar);
                            if (ciVar3.b(ugVar.f20772c, ihVar, 0L).f15754k == ciVar3.e(obj)) {
                                Pair pairM3 = ciVar2.m(ihVar, ugVar, ciVar2.o(obj, ugVar).f20772c, j12);
                                ciVar4 = ciVar2;
                                ihVar = ihVar;
                                ugVar = ugVar;
                                j13 = j12;
                                obj2 = pairM3.first;
                                jMax = ((Long) pairM3.second).longValue();
                            } else {
                                ciVar4 = ciVar2;
                                ugVar = ugVar;
                                j13 = j12;
                                if (ciVar4.o(obj, ugVar).f20773d != j10) {
                                    long j26 = ugVar.f20773d - 1;
                                    String str2 = uu0.f20901a;
                                    jMax = Math.max(0L, Math.min(j13, j26));
                                } else {
                                    jMax = j13;
                                }
                                obj2 = obj;
                            }
                            j12 = jMax;
                            z12 = false;
                            z13 = true;
                        } else {
                            ciVar4 = ciVar2;
                            ugVar = ugVar;
                            j13 = j12;
                            obj2 = obj;
                            z12 = false;
                            z13 = false;
                        }
                        z14 = false;
                    }
                }
                ciVar4 = ciVar2;
                j13 = j12;
            }
            if (iK != -1) {
                ugVar2 = ugVar;
                ciVar5 = ciVar;
                Pair pairM4 = ciVar5.m(ihVar, ugVar2, iK, C.TIME_UNSET);
                obj2 = pairM4.first;
                jMin = ((Long) pairM4.second).longValue();
                j12 = j10;
            } else {
                ciVar5 = ciVar4;
                ugVar2 = ugVar;
                jMin = j12;
            }
            r32VarX = this.f21641q.X(ciVar5, obj2);
            zEquals = obj.equals(obj2);
            if (zEquals) {
                z16 = false;
            } else {
                z16 = false;
            }
            ug ugVarO2 = ciVar5.o(obj2, ugVar2);
            if (z11) {
                r32Var2 = r32Var;
            } else {
                r32Var2 = r32Var;
            }
            if (true == z16) {
                r32VarX = r32Var2;
            }
            if (r32VarX.b()) {
                if (r32VarX.equals(r32Var2)) {
                    jMin = nz1Var.f18054r;
                } else {
                    ciVar5.o(r32VarX.f19359a, ugVar2);
                    i14 = r32VarX.f19361c;
                    aVarA2 = ugVar2.f20775f.a(r32VarX.f19360b);
                    i15 = 0;
                    while (true) {
                        iArr2 = aVarA2.f11787d;
                        if (i15 < iArr2.length) {
                            break;
                        } else {
                            break;
                        }
                        i15++;
                    }
                    if (i14 == i15) {
                        ugVar2.f20775f.getClass();
                    }
                    jMin = 0;
                }
            } else if (zEquals) {
                aVarA = ciVar5.o(obj2, ugVar2).f20775f.a(r32Var2.f19360b);
                aVarA.getClass();
                j14 = nz1Var.f18040c;
                if (j14 != j10) {
                    i10 = aVarA.f11784a;
                    i11 = r32Var2.f19361c;
                    if (i10 > i11) {
                        j15 = ciVar5.o(obj2, ugVar2).f20773d;
                        if (j15 != j10) {
                            jMin = Math.min(j15 - 1, jMin);
                        }
                        j12 = jMin;
                    }
                } else {
                    i10 = aVarA.f11784a;
                    i11 = r32Var2.f19361c;
                    if (i10 > i11) {
                        j15 = ciVar5.o(obj2, ugVar2).f20773d;
                        if (j15 != j10) {
                            jMin = Math.min(j15 - 1, jMin);
                        }
                        j12 = jMin;
                    }
                }
            }
            if (r32VarX.equals(r32Var2)) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (ciVar5.e(obj) == -1) {
                i18 = 4;
            } else {
                i18 = 3;
            }
            obj3 = r32VarX.f19359a;
            if (obj3.equals(obj)) {
                a aVarA4 = ciVar5.o(obj3, ugVar2).f20775f.a(i12);
                i13 = r32VarX.f19361c;
                iArr = aVarA4.f11787d;
                if (i13 < iArr.length) {
                    i18 = 0;
                } else {
                    i18 = 0;
                }
            }
            if (z17) {
                z18 = false;
            } else {
                z18 = false;
            }
            jH = jMin;
            z19 = z18;
            z20 = z12;
            r10 = z13;
            r32Var3 = r32VarX;
            r12 = z17;
        }
        int i19 = i18;
        if (z14) {
            try {
                if (this.F.f18042e != 1) {
                    c(4);
                }
                v(false, false, false, true);
            } catch (Throwable th3) {
                th2 = th3;
                r32 r32Var10 = r32Var3;
                ciVar6 = ciVar5;
                r32Var4 = r32Var10;
                r14 = 0;
                r11 = ciVar6;
                r13 = r10;
                r35 = r12;
                nz1 nz1Var2 = this.F;
                ci ciVar10 = nz1Var2.f18038a;
                r32 r32Var11 = nz1Var2.f18039b;
                if (1 != r13) {
                    j17 = j10;
                } else {
                    j17 = jH;
                }
                r32Var5 = r32Var4;
                G(r11, r32Var5, ciVar10, r32Var11, j17, false);
                if (r35 == 0) {
                    if (z19) {
                        j19 = jH;
                        j18 = j19;
                    } else {
                        j18 = this.F.f18041d;
                        j19 = jH;
                    }
                    this.F = N(r32Var5, j19, j12, j18, z19, i19);
                } else {
                    if (z19) {
                        j19 = jH;
                        j18 = j19;
                    } else {
                        j18 = this.F.f18041d;
                        j19 = jH;
                    }
                    this.F = N(r32Var5, j19, j12, j18, z19, i19);
                }
                J();
                x(r11, this.F.f18038a);
                this.F = this.F.c(r11);
                if (!r11.g()) {
                    this.R = r14;
                }
                Q(false);
                this.f21632g.c(2);
                throw th2;
            }
        }
        uz1[] uz1VarArr = this.f21623a;
        int i20 = 0;
        while (true) {
            r15 = 2;
            if (i20 < 2) {
                uz1 uz1Var = uz1VarArr[i20];
                ux1 ux1Var = (ux1) uz1Var.f20972e;
                if (!Objects.equals(ux1Var.f20955p, ciVar5)) {
                    ux1Var.f20955p = ciVar5;
                    ux1Var.v();
                    ((s22) ux1Var).q0();
                }
                ux1 ux1Var2 = (ux1) uz1Var.f20973f;
                if (ux1Var2 != null && !Objects.equals(ux1Var2.f20955p, ciVar5)) {
                    ux1Var2.f20955p = ciVar5;
                    ux1Var2.v();
                    ((s22) ux1Var2).q0();
                }
                i20++;
            } else {
                try {
                    break;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        }
        if (r12 != 0) {
            r110 = r10;
            r38 = r12;
            ci ciVar11 = ciVar5;
            obj4 = null;
            if (!ciVar11.g()) {
                try {
                    r19 = obj4;
                    r18 = r110;
                    r37 = r38;
                    fz1 fz1Var = this.f21641q;
                    for (dz1 dz1Var = (dz1) fz1Var.l; dz1Var != null; dz1Var = dz1Var.f13785m) {
                        if (dz1Var.f13780g.f14116a.equals(r32Var3)) {
                            dz1Var.f13780g = fz1Var.W(ciVar11, dz1Var.f13780g);
                        }
                    }
                    fz1 fz1Var2 = this.f21641q;
                    r32Var4 = r32Var3;
                    long j27 = jH;
                    try {
                        jH = r(r32Var4, j27, ((dz1) fz1Var2.l) != ((dz1) fz1Var2.f14617m), z20);
                        r17 = obj4;
                        r16 = r110;
                        r36 = r38;
                    } catch (Throwable th5) {
                        th2 = th5;
                        jH = j27;
                        r11 = ciVar11;
                        z19 = z19;
                        i19 = i19;
                        r14 = obj4;
                        r13 = r110;
                        r35 = r38;
                        nz1 nz1Var3 = this.F;
                        ci ciVar12 = nz1Var3.f18038a;
                        r32 r32Var12 = nz1Var3.f18039b;
                        if (1 != r13) {
                            j17 = j10;
                        } else {
                            j17 = jH;
                        }
                        r32Var5 = r32Var4;
                        G(r11, r32Var5, ciVar12, r32Var12, j17, false);
                        if (r35 == 0 || j12 != this.F.f18040c) {
                            if (z19) {
                                j19 = jH;
                                j18 = j19;
                            } else {
                                j18 = this.F.f18041d;
                                j19 = jH;
                            }
                            this.F = N(r32Var5, j19, j12, j18, z19, i19);
                        }
                        J();
                        x(r11, this.F.f18038a);
                        this.F = this.F.c(r11);
                        if (!r11.g()) {
                            this.R = r14;
                        }
                        Q(false);
                        this.f21632g.c(2);
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    r32Var4 = r32Var3;
                }
            }
            nz1 nz1Var4 = this.F;
            ci ciVar13 = nz1Var4.f18038a;
            r32 r32Var13 = nz1Var4.f18039b;
            if (1 != r16) {
                j20 = j10;
            } else {
                j20 = jH;
            }
            r32Var6 = r32Var4;
            G(ciVar, r32Var6, ciVar13, r32Var13, j20, false);
            if (r36 == 0 || j12 != this.F.f18040c) {
                if (z19) {
                    j22 = jH;
                    j21 = j22;
                } else {
                    j21 = this.F.f18041d;
                    j22 = jH;
                }
                this.F = N(r32Var6, j22, j12, j21, z19, i19);
            }
            J();
            x(ciVar, this.F.f18038a);
            this.F = this.F.c(ciVar);
            if (!ciVar.g()) {
                this.R = r17;
            }
            Q(false);
            this.f21632g.c(2);
        }
        try {
            fz1 fz1Var3 = this.f21641q;
            dz1 dz1Var2 = (dz1) fz1Var3.f14617m;
            long jH2 = dz1Var2 == null ? jH : H(dz1Var2);
            if (V()) {
                try {
                    dz1 dz1Var3 = (dz1) fz1Var3.f14618n;
                    if (dz1Var3 != null) {
                        jH = H(dz1Var3);
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    r32Var4 = r32Var3;
                    ciVar6 = ciVar;
                    r14 = 0;
                    r11 = ciVar6;
                    r13 = r10;
                    r35 = r12;
                    nz1 nz1Var5 = this.F;
                    ci ciVar14 = nz1Var5.f18038a;
                    r32 r32Var14 = nz1Var5.f18039b;
                    if (1 != r13) {
                        j17 = j10;
                    } else {
                        j17 = jH;
                    }
                    r32Var5 = r32Var4;
                    G(r11, r32Var5, ciVar14, r32Var14, j17, false);
                    if (r35 == 0) {
                        if (z19) {
                            j19 = jH;
                            j18 = j19;
                        } else {
                            j18 = this.F.f18041d;
                            j19 = jH;
                        }
                        this.F = N(r32Var5, j19, j12, j18, z19, i19);
                    } else {
                        if (z19) {
                            j19 = jH;
                            j18 = j19;
                        } else {
                            j18 = this.F.f18041d;
                            j19 = jH;
                        }
                        this.F = N(r32Var5, j19, j12, j18, z19, i19);
                    }
                    J();
                    x(r11, this.F.f18038a);
                    this.F = this.F.c(r11);
                    if (!r11.g()) {
                        this.R = r14;
                    }
                    Q(false);
                    this.f21632g.c(2);
                    throw th2;
                }
            }
            r15 = r10;
            z10 = r12;
            r12 = 0;
            try {
                int iV = fz1Var3.V(ciVar, this.S, jH2, jH);
                if ((iV & 1) != 0) {
                    i(false);
                    r19 = r12;
                    r18 = r15;
                    r37 = z10;
                } else if ((iV & 2) != 0) {
                    r19 = r12;
                    r18 = r15;
                    r37 = z10;
                    C();
                    r19 = r12;
                    r18 = r15;
                    r37 = z10;
                }
            } catch (Throwable th8) {
                th2 = th8;
                r10 = ciVar;
                z19 = z19;
                r32Var4 = r32Var3;
                i19 = i19;
                r11 = r10;
                r14 = r12;
                r13 = r15;
                r35 = z10;
                nz1 nz1Var6 = this.F;
                ci ciVar15 = nz1Var6.f18038a;
                r32 r32Var15 = nz1Var6.f18039b;
                if (1 != r13) {
                    j17 = j10;
                } else {
                    j17 = jH;
                }
                r32Var5 = r32Var4;
                G(r11, r32Var5, ciVar15, r32Var15, j17, false);
                if (r35 == 0) {
                    if (z19) {
                        j19 = jH;
                        j18 = j19;
                    } else {
                        j18 = this.F.f18041d;
                        j19 = jH;
                    }
                    this.F = N(r32Var5, j19, j12, j18, z19, i19);
                } else {
                    if (z19) {
                        j19 = jH;
                        j18 = j19;
                    } else {
                        j18 = this.F.f18041d;
                        j19 = jH;
                    }
                    this.F = N(r32Var5, j19, j12, j18, z19, i19);
                }
                J();
                x(r11, this.F.f18038a);
                this.F = this.F.c(r11);
                if (!r11.g()) {
                    this.R = r14;
                }
                Q(false);
                this.f21632g.c(2);
                throw th2;
            }
        } catch (Throwable th9) {
            th2 = th9;
            r15 = r10;
            z10 = r12;
            r10 = ciVar;
            r12 = 0;
        }
        r19 = r12;
        r18 = r15;
        r37 = z10;
        r19 = obj4;
        r18 = r110;
        r37 = r38;
        r32Var4 = r32Var3;
        r17 = r19;
        r16 = r18;
        r36 = r37;
        nz1 nz1Var7 = this.F;
        ci ciVar16 = nz1Var7.f18038a;
        r32 r32Var16 = nz1Var7.f18039b;
        if (1 != r16) {
            j20 = j10;
        } else {
            j20 = jH;
        }
        r32Var6 = r32Var4;
        G(ciVar, r32Var6, ciVar16, r32Var16, j20, false);
        if (r36 == 0) {
            if (z19) {
                j22 = jH;
                j21 = j22;
            } else {
                j21 = this.F.f18041d;
                j22 = jH;
            }
            this.F = N(r32Var6, j22, j12, j21, z19, i19);
        } else {
            if (z19) {
                j22 = jH;
                j21 = j22;
            } else {
                j21 = this.F.f18041d;
                j22 = jH;
            }
            this.F = N(r32Var6, j22, j12, j21, z19, i19);
        }
        J();
        x(ciVar, this.F.f18038a);
        this.F = this.F.c(ciVar);
        if (!ciVar.g()) {
            this.R = r17;
        }
        Q(false);
        this.f21632g.c(2);
    }

    public final void G(ci ciVar, r32 r32Var, ci ciVar2, r32 r32Var2, long j10, boolean z10) {
        if (!o(ciVar, r32Var)) {
            cc ccVar = r32Var.b() ? cc.f13129d : this.F.f18051o;
            sr0 sr0Var = this.f21637m;
            if (sr0Var.zzj().equals(ccVar)) {
                return;
            }
            this.f21632g.d(16);
            sr0Var.c(ccVar);
            K(this.F.f18051o, ccVar.f13130a, false, false);
            return;
        }
        Object obj = r32Var.f19359a;
        ug ugVar = this.f21636k;
        int i10 = ciVar.o(obj, ugVar).f20772c;
        ih ihVar = this.f21635j;
        ciVar.b(i10, ihVar, 0L);
        w1 w1Var = ihVar.f15751h;
        String str = uu0.f20901a;
        zx1 zx1Var = this.f21628c0;
        zx1Var.getClass();
        w1Var.getClass();
        long jT = uu0.t(C.TIME_UNSET);
        zx1Var.f22753c = jT;
        zx1Var.f22756f = jT;
        zx1Var.f22757g = jT;
        zx1Var.c();
        if (j10 != C.TIME_UNSET) {
            zx1Var.f22754d = n(ciVar, obj, j10);
            zx1Var.c();
            return;
        }
        if (!Objects.equals(!ciVar2.g() ? ciVar2.b(ciVar2.o(r32Var2.f19359a, ugVar).f20772c, ihVar, 0L).f15744a : null, ihVar.f15744a) || z10) {
            zx1Var.f22754d = C.TIME_UNSET;
            zx1Var.c();
        }
    }

    public final long H(dz1 dz1Var) {
        if (dz1Var == null) {
            return 0L;
        }
        long jMax = dz1Var.f13788p;
        if (dz1Var.f13778e) {
            for (int i10 = 0; i10 < 2; i10++) {
                uz1[] uz1VarArr = this.f21623a;
                if (uz1VarArr[i10].z(dz1Var) != null) {
                    ux1 ux1VarZ = uz1VarArr[i10].z(dz1Var);
                    Objects.requireNonNull(ux1VarZ);
                    long j10 = ux1VarZ.f20952m;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j10, jMax);
                }
            }
        }
        return jMax;
    }

    public final void I() {
        boolean z10;
        fz1 fz1Var = this.f21641q;
        fz1Var.S();
        dz1 dz1Var = (dz1) fz1Var.f14620p;
        if (dz1Var != null) {
            k32 k32Var = dz1Var.f13774a;
            if ((!dz1Var.f13777d || dz1Var.f13778e) && !k32Var.zze()) {
                ci ciVar = this.F.f18038a;
                if (dz1Var.f13778e) {
                    k32Var.zzb();
                }
                if (this.f21631f.zzj()) {
                    if (!dz1Var.f13777d) {
                        long j10 = dz1Var.f13780g.f14117b;
                        dz1Var.f13777d = true;
                        k32Var.g(this, j10);
                        return;
                    }
                    az1 az1Var = new az1();
                    az1Var.f12554a = this.S - dz1Var.f13788p;
                    float f10 = this.f21637m.zzj().f13130a;
                    ps1.v(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 == -3.4028235E38f);
                    az1Var.f12555b = f10;
                    long j11 = this.L;
                    if (j11 >= 0) {
                        z10 = true;
                    } else if (j11 == C.TIME_UNSET) {
                        z10 = true;
                        j11 = -9223372036854775807L;
                    } else {
                        z10 = false;
                    }
                    ps1.v(z10);
                    az1Var.f12556c = j11;
                    bz1 bz1Var = new bz1(az1Var);
                    ps1.c0(dz1Var.f13785m == null);
                    k32Var.b(bz1Var);
                }
            }
        }
    }

    public final void J() {
        dz1 dz1Var = (dz1) this.f21641q.l;
        boolean z10 = false;
        if (dz1Var != null && dz1Var.f13780g.f14122g && this.I) {
            z10 = true;
        }
        this.J = z10;
    }

    public final void K(cc ccVar, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.G.f(1);
            }
            nz1 nz1Var = this.F;
            this.F = new nz1(nz1Var.f18038a, nz1Var.f18039b, nz1Var.f18040c, nz1Var.f18041d, nz1Var.f18042e, nz1Var.f18043f, nz1Var.f18044g, nz1Var.f18045h, nz1Var.f18046i, nz1Var.f18047j, nz1Var.f18048k, nz1Var.l, nz1Var.f18049m, nz1Var.f18050n, ccVar, nz1Var.f18052p, nz1Var.f18053q, nz1Var.f18054r, nz1Var.f18055s);
        }
        float f11 = ccVar.f13130a;
        dz1 dz1Var = (dz1) this.f21641q.l;
        while (true) {
            i10 = 0;
            if (dz1Var == null) {
                break;
            }
            p[] pVarArr = (p[]) dz1Var.f13787o.f19744c;
            int length = pVarArr.length;
            while (i10 < length) {
                p pVar = pVarArr[i10];
                i10++;
            }
            dz1Var = dz1Var.f13785m;
        }
        uz1[] uz1VarArr = this.f21623a;
        while (i10 < 2) {
            uz1 uz1Var = uz1VarArr[i10];
            ((ux1) uz1Var.f20972e).n(f10, f11);
            ux1 ux1Var = (ux1) uz1Var.f20973f;
            if (ux1Var != null) {
                ux1Var.n(f10, f11);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    public final void L() {
        boolean zC;
        boolean z10;
        fz1 fz1Var = this.f21641q;
        boolean zA = A((dz1) fz1Var.f14619o);
        long j10 = C.TIME_UNSET;
        if (zA) {
            dz1 dz1Var = (dz1) fz1Var.f14619o;
            long jR = R(!dz1Var.f13778e ? 0L : dz1Var.f13774a.zzc());
            long j11 = o(this.F.f18038a, dz1Var.f13780g.f14116a) ? this.f21628c0.f22758h : -9223372036854775807L;
            j02 j02Var = this.f21644t;
            ci ciVar = this.F.f18038a;
            r32 r32Var = dz1Var.f13780g.f14116a;
            float f10 = this.f21637m.zzj().f13130a;
            boolean z11 = this.F.l;
            xy1 xy1Var = new xy1(j02Var, ciVar, r32Var, jR, f10, this.K, j11);
            zy1 zy1Var = this.f21631f;
            zC = zy1Var.c(xy1Var);
            dz1 dz1Var2 = (dz1) fz1Var.l;
            if (!zC && dz1Var2.f13778e && jR < 500000 && this.l > 0) {
                dz1Var2.f13774a.i(this.F.f18054r);
                zC = zy1Var.c(xy1Var);
            }
        } else {
            zC = false;
        }
        this.M = zC;
        if (zC) {
            dz1 dz1Var3 = (dz1) fz1Var.f14619o;
            dz1Var3.getClass();
            az1 az1Var = new az1();
            az1Var.f12554a = this.S - dz1Var3.f13788p;
            float f11 = this.f21637m.zzj().f13130a;
            ps1.v(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11 == -3.4028235E38f);
            az1Var.f12555b = f11;
            long j12 = this.L;
            if (j12 < 0) {
                if (j12 != C.TIME_UNSET) {
                    z10 = false;
                    j10 = j12;
                }
                ps1.v(z10);
                az1Var.f12556c = j10;
                bz1 bz1Var = new bz1(az1Var);
                ps1.c0(dz1Var3.f13785m == null);
                dz1Var3.f13774a.b(bz1Var);
            } else {
                j10 = j12;
            }
            z10 = true;
            ps1.v(z10);
            az1Var.f12556c = j10;
            bz1 bz1Var2 = new bz1(az1Var);
            ps1.c0(dz1Var3.f13785m == null);
            dz1Var3.f13774a.b(bz1Var2);
        }
        M();
    }

    public final void M() {
        dz1 dz1Var = (dz1) this.f21641q.f14619o;
        boolean z10 = true;
        if (!this.M && (dz1Var == null || !dz1Var.f13774a.zze())) {
            z10 = false;
        }
        nz1 nz1Var = this.F;
        if (z10 != nz1Var.f18044g) {
            this.F = nz1Var.f(z10);
        }
    }

    public final nz1 N(r32 r32Var, long j10, long j11, long j12, boolean z10, int i10) {
        v42 v42Var;
        s sVar;
        List list;
        ya1 ya1VarF;
        this.V = (!this.V && j10 == this.F.f18054r && r32Var.equals(this.F.f18039b)) ? false : true;
        J();
        nz1 nz1Var = this.F;
        v42 v42Var2 = nz1Var.f18045h;
        s sVar2 = nz1Var.f18046i;
        List list2 = nz1Var.f18047j;
        if (this.f21642r.f17080a) {
            fz1 fz1Var = this.f21641q;
            dz1 dz1Var = (dz1) fz1Var.l;
            v42 v42Var3 = dz1Var == null ? v42.f21027d : dz1Var.f13786n;
            s sVar3 = dz1Var == null ? this.f21630e : dz1Var.f13787o;
            p[] pVarArr = (p[]) sVar3.f19744c;
            z91 z91Var = new z91(4);
            boolean z11 = false;
            for (p pVar : pVarArr) {
                if (pVar != null) {
                    s8 s8Var = pVar.zzb(0).l;
                    if (s8Var == null) {
                        z91Var.a(new s8(new v7[0]));
                    } else {
                        z91Var.a(s8Var);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                ya1VarF = z91Var.f();
            } else {
                aa1 aa1Var = ca1.f13122b;
                ya1VarF = ya1.f22208e;
            }
            if (dz1Var != null) {
                ez1 ez1Var = dz1Var.f13780g;
                long j13 = ez1Var.f14119d;
                if (j13 != j11) {
                    if (j11 != j13) {
                        ez1Var = new ez1(ez1Var.f14116a, ez1Var.f14117b, ez1Var.f14118c, j11, ez1Var.f14120e, ez1Var.f14121f, ez1Var.f14122g, ez1Var.f14123h);
                    }
                    dz1Var.f13780g = ez1Var;
                }
            }
            dz1 dz1Var2 = (dz1) fz1Var.l;
            if (dz1Var2 == ((dz1) fz1Var.f14617m) && dz1Var2 != null) {
                s sVar4 = dz1Var2.f13787o;
                int i11 = 0;
                while (true) {
                    uz1[] uz1VarArr = this.f21623a;
                    if (i11 >= 2) {
                        break;
                    }
                    if (sVar4.b(i11)) {
                        if (((ux1) uz1VarArr[i11].f20972e).f20942b != 1) {
                            break;
                        }
                        ((tz1[]) sVar4.f19743b)[i11].getClass();
                    }
                    i11++;
                }
            }
            v42Var = v42Var3;
            sVar = sVar3;
            list = ya1VarF;
        } else {
            if (!r32Var.equals(nz1Var.f18039b)) {
                sVar2 = this.f21630e;
                v42Var2 = v42.f21027d;
                list2 = ya1.f22208e;
            }
            v42Var = v42Var2;
            sVar = sVar2;
            list = list2;
        }
        if (z10) {
            androidx.recyclerview.widget.w wVar = this.G;
            if (!wVar.f4946d || wVar.f4947e == 5) {
                wVar.f4944b = true;
                wVar.f4946d = true;
                wVar.f4947e = i10;
            } else {
                ps1.v(i10 == 5);
            }
        }
        nz1 nz1Var2 = this.F;
        return nz1Var2.b(r32Var, j10, j11, j12, R(nz1Var2.f18052p), v42Var, sVar, list);
    }

    public final void O(boolean[] zArr, long j10) {
        uz1[] uz1VarArr;
        wy1 wy1Var;
        long j11;
        dz1 dz1Var = (dz1) this.f21641q.f14617m;
        s sVar = dz1Var.f13787o;
        int i10 = 0;
        while (true) {
            uz1VarArr = this.f21623a;
            if (i10 >= 2) {
                break;
            }
            if (!sVar.b(i10)) {
                uz1VarArr[i10].o();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < 2) {
            if (sVar.b(i11) && uz1VarArr[i11].z(dz1Var) == null) {
                wy1Var = this;
                j11 = j10;
                wy1Var.P(dz1Var, i11, zArr[i11], j11);
            } else {
                wy1Var = this;
                j11 = j10;
            }
            i11++;
            this = wy1Var;
            j10 = j11;
        }
    }

    public final void P(dz1 dz1Var, int i10, boolean z10, long j10) {
        int iZze;
        int i11;
        uz1 uz1Var = this.f21623a[i10];
        if (uz1Var.t()) {
            return;
        }
        boolean z11 = dz1Var == ((dz1) this.f21641q.l);
        s sVar = dz1Var.f13787o;
        tz1 tz1Var = ((tz1[]) sVar.f19743b)[i10];
        p pVar = ((p[]) sVar.f19744c)[i10];
        boolean z12 = T() && this.F.f18042e == 3;
        boolean z13 = !z10 && z12;
        this.Q++;
        o42 o42Var = dz1Var.f13776c[i10];
        long j11 = dz1Var.f13788p;
        r32 r32Var = dz1Var.f13780g.f14116a;
        if (pVar != null) {
            iZze = pVar.zze();
            i11 = 0;
        } else {
            iZze = 0;
            i11 = 0;
        }
        g22[] g22VarArr = new g22[iZze];
        while (i11 < iZze) {
            pVar.getClass();
            g22VarArr[i11] = pVar.zzb(i11);
            i11++;
        }
        int i12 = uz1Var.f20971d;
        sr0 sr0Var = this.f21637m;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            uz1Var.f20968a = true;
            ux1 ux1Var = (ux1) uz1Var.f20972e;
            ps1.c0(ux1Var.f20948h == 0);
            ux1Var.f20944d = tz1Var;
            ux1Var.f20956q = r32Var;
            ux1Var.f20948h = 1;
            ux1Var.A(z13, z11);
            ux1Var.w(g22VarArr, o42Var, j10, j11, r32Var);
            ux1Var.u(j10, z13, true);
            sr0Var.e(ux1Var);
        } else {
            uz1Var.f20969b = true;
            ux1 ux1Var2 = (ux1) uz1Var.f20973f;
            ux1Var2.getClass();
            ps1.c0(ux1Var2.f20948h == 0);
            ux1Var2.f20944d = tz1Var;
            ux1Var2.f20956q = r32Var;
            ux1Var2.f20948h = 1;
            ux1Var2.A(z13, z11);
            ux1Var2.w(g22VarArr, o42Var, j10, j11, r32Var);
            ux1Var2.u(j10, z13, true);
            sr0Var.e(ux1Var2);
        }
        sy1 sy1Var = new sy1(this);
        ux1 ux1VarZ = uz1Var.z(dz1Var);
        ux1VarZ.getClass();
        ux1VarZ.b(11, sy1Var);
        if (z12 && z11) {
            uz1Var.Q();
        }
    }

    public final void Q(boolean z10) {
        dz1 dz1Var = (dz1) this.f21641q.f14619o;
        r32 r32Var = dz1Var == null ? this.F.f18039b : dz1Var.f13780g.f14116a;
        boolean zEquals = this.F.f18048k.equals(r32Var);
        if (!zEquals) {
            this.F = this.F.g(r32Var);
        }
        nz1 nz1Var = this.F;
        nz1Var.f18052p = dz1Var == null ? nz1Var.f18054r : dz1Var.d();
        nz1 nz1Var2 = this.F;
        nz1Var2.f18053q = R(nz1Var2.f18052p);
        if ((!zEquals || z10) && dz1Var != null && dz1Var.f13778e) {
            S(dz1Var.f13780g.f14116a, dz1Var.f13786n, dz1Var.f13787o);
        }
    }

    public final long R(long j10) {
        dz1 dz1Var = (dz1) this.f21641q.f14619o;
        if (dz1Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.S - dz1Var.f13788p));
    }

    public final void S(r32 r32Var, v42 v42Var, s sVar) {
        dz1 dz1Var = (dz1) this.f21641q.f14619o;
        dz1Var.getClass();
        long jR = R(dz1Var.d());
        long j10 = o(this.F.f18038a, dz1Var.f13780g.f14116a) ? this.f21628c0.f22758h : C.TIME_UNSET;
        ci ciVar = this.F.f18038a;
        float f10 = this.f21637m.zzj().f13130a;
        boolean z10 = this.F.l;
        this.f21631f.a(new xy1(this.f21644t, ciVar, r32Var, jR, f10, this.K, j10), (p[]) sVar.f19744c);
    }

    public final boolean T() {
        nz1 nz1Var = this.F;
        return nz1Var.l && nz1Var.f18050n == 0;
    }

    public final void U(int i10) {
        uz1 uz1Var = this.f21623a[i10];
        try {
            dz1 dz1Var = (dz1) this.f21641q.l;
            if (dz1Var == null) {
                throw null;
            }
            ux1 ux1VarZ = uz1Var.z(dz1Var);
            ux1VarZ.getClass();
            o42 o42Var = ux1VarZ.f20949i;
            o42Var.getClass();
            o42Var.zzb();
        } catch (IOException | RuntimeException e10) {
            int i11 = ((ux1) uz1Var.f20972e).f20942b;
            throw e10;
        }
    }

    public final boolean V() {
        if (!this.f21648x) {
            return false;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f21623a[i10].D()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.d1
    public final void a(long j10, long j11, g22 g22Var, MediaFormat mediaFormat) {
        if (this.C) {
            Handler handler = this.f21632g.f22362a;
            ss0 ss0VarG = ys0.g();
            ss0VarG.f20047a = handler.obtainMessage(37);
            ss0VarG.a();
        }
    }

    public final void b(int i10, IOException iOException) {
        dy1 dy1Var = new dy1(0, iOException, i10);
        dz1 dz1Var = (dz1) this.f21641q.l;
        if (dz1Var != null) {
            dy1Var = dy1Var.a(dz1Var.f13780g.f14116a);
        }
        v71.J("ExoPlayerImplInternal", "Playback error", dy1Var);
        u(false, false);
        this.F = this.F.e(dy1Var);
    }

    public final void c(int i10) {
        nz1 nz1Var = this.F;
        if (nz1Var.f18042e != i10) {
            if (i10 != 2) {
                this.X = C.TIME_UNSET;
            }
            this.F = nz1Var.d(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.p32
    public final void d(q32 q32Var) {
        this.f21632g.b(8, q32Var).a();
    }

    @Override // com.google.android.gms.internal.ads.p32
    public final /* bridge */ /* synthetic */ void e(p42 p42Var) {
        this.f21632g.b(9, (q32) p42Var).a();
    }

    public final void f(int i10) {
        androidx.recyclerview.widget.w wVar = this.G;
        nz1 nz1Var = this.F;
        boolean z10 = wVar.f4944b | (((nz1) wVar.f4948f) != nz1Var);
        wVar.f4944b = z10;
        wVar.f4948f = nz1Var;
        if (z10) {
            if (!nz1Var.f18038a.g()) {
                nz1 nz1Var2 = this.F;
                boolean z11 = nz1Var2.f18038a.e(nz1Var2.f18039b.f19359a) != -1;
                Locale locale = Locale.US;
                nz1 nz1Var3 = this.F;
                ps1.d0(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", nz1Var3.f18039b.f19359a, nz1Var3.f18038a.getClass().getName(), Integer.valueOf(this.F.f18038a.a()), Integer.valueOf(i10)), z11);
            }
            androidx.recyclerview.widget.w wVar2 = this.G;
            ry1 ry1Var = (ry1) this.f21640p.f21612b;
            ry1Var.f19720k.e(new gm0(21, ry1Var, wVar2));
            this.G = new androidx.recyclerview.widget.w(this.F, 1);
        }
    }

    public final void g(float f10) {
        this.f21626b0 = f10;
        float f11 = f10 * this.f21649y.f20074d;
        for (int i10 = 0; i10 < 2; i10++) {
            uz1 uz1Var = this.f21623a[i10];
            ux1 ux1Var = (ux1) uz1Var.f20972e;
            if (ux1Var.f20942b == 1) {
                Float fValueOf = Float.valueOf(f11);
                ux1Var.b(2, fValueOf);
                ux1 ux1Var2 = (ux1) uz1Var.f20973f;
                if (ux1Var2 != null) {
                    ux1Var2.b(2, fValueOf);
                }
            }
        }
    }

    public final void h(int i10, int i11, int i12, boolean z10) {
        boolean z11;
        if (!z10) {
            z11 = false;
        } else if (i10 != -1) {
            z11 = true;
        } else {
            i10 = -1;
            z11 = false;
        }
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.B;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        nz1 nz1Var = this.F;
        if (nz1Var.l == z11 && nz1Var.f18050n == i11 && nz1Var.f18049m == i12) {
            return;
        }
        this.F = nz1Var.h(i12, i11, z11);
        y(false, false);
        fz1 fz1Var = this.f21641q;
        for (dz1 dz1Var = (dz1) fz1Var.l; dz1Var != null; dz1Var = dz1Var.f13785m) {
            for (p pVar : (p[]) dz1Var.f13787o.f19744c) {
            }
        }
        if (!T()) {
            k();
            l();
            this.F.getClass();
            fz1Var.G(this.S);
            return;
        }
        int i13 = this.F.f18042e;
        ys0 ys0Var = this.f21632g;
        if (i13 != 3) {
            if (i13 == 2) {
                ys0Var.c(2);
                return;
            }
            return;
        }
        sr0 sr0Var = this.f21637m;
        sr0Var.f20038b = true;
        yz1 yz1Var = (yz1) sr0Var.f20039c;
        if (!yz1Var.f22417b) {
            yz1Var.f22419d = SystemClock.elapsedRealtime();
            yz1Var.f22417b = true;
        }
        j();
        ys0Var.c(2);
    }

    /* JADX WARN: Code duplicated, block: B:302:0x0652  */
    /* JADX WARN: Code duplicated, block: B:305:0x065a  */
    /* JADX WARN: Code duplicated, block: B:443:0x08bf A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, LOOP:8: B:441:0x08bc->B:443:0x08bf, LOOP_END, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:446:0x08cd A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:450:0x08de A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:452:0x08e4 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:506:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:533:0x0a70 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:535:0x0a81 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:539:0x0a94 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:541:0x0a98 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:543:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a9f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:545:0x0aa1 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:547:0x0ab1 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:549:0x0ab7 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:551:0x0ac3 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, LOOP:13: B:550:0x0ac1->B:551:0x0ac3, LOOP_END, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:557:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:560:0x0ae1 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:562:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:563:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:565:0x0aee A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:583:0x0b38 A[Catch: RuntimeException -> 0x05fd, IOException -> 0x0602, xl1 -> 0x0607, ab -> 0x060c, a22 -> 0x0611, dy1 -> 0x0616, TryCatch #9 {a22 -> 0x0611, ab -> 0x060c, dy1 -> 0x0616, xl1 -> 0x0607, IOException -> 0x0602, RuntimeException -> 0x05fd, blocks: (B:223:0x04eb, B:228:0x04ff, B:230:0x0507, B:233:0x0514, B:247:0x055c, B:252:0x0571, B:254:0x0578, B:256:0x057c, B:258:0x0580, B:260:0x0586, B:262:0x058c, B:264:0x0592, B:266:0x0598, B:268:0x05a0, B:270:0x05bf, B:272:0x05c9, B:273:0x05ce, B:275:0x05d2, B:277:0x05d8, B:279:0x05e0, B:281:0x05e8, B:295:0x0622, B:296:0x0629, B:298:0x0634, B:300:0x0642, B:303:0x0654, B:382:0x07b3, B:384:0x07b9, B:386:0x07bf, B:389:0x07c4, B:390:0x07ce, B:392:0x07d3, B:397:0x07fb, B:399:0x0801, B:404:0x080e, B:405:0x0816, B:406:0x0819, B:408:0x0821, B:457:0x08f7, B:458:0x08fc, B:460:0x0904, B:462:0x090d, B:464:0x091b, B:465:0x0934, B:467:0x0939, B:469:0x0941, B:483:0x096b, B:470:0x0946, B:472:0x094f, B:476:0x0958, B:482:0x0968, B:485:0x0975, B:487:0x097b, B:491:0x0988, B:500:0x09c4, B:502:0x09cb, B:504:0x09cf, B:531:0x0a64, B:533:0x0a70, B:535:0x0a81, B:536:0x0a8a, B:555:0x0ad5, B:558:0x0add, B:560:0x0ae1, B:565:0x0aee, B:566:0x0af1, B:567:0x0af5, B:569:0x0afb, B:571:0x0b04, B:573:0x0b0e, B:575:0x0b14, B:577:0x0b1a, B:584:0x0b3c, B:586:0x0b42, B:590:0x0b4b, B:600:0x0b66, B:597:0x0b5f, B:599:0x0b63, B:578:0x0b21, B:581:0x0b2f, B:582:0x0b37, B:583:0x0b38, B:537:0x0a8e, B:539:0x0a94, B:541:0x0a98, B:545:0x0aa1, B:547:0x0ab1, B:549:0x0ab7, B:551:0x0ac3, B:552:0x0ac8, B:553:0x0acd, B:554:0x0ad2, B:507:0x09dd, B:509:0x09e1, B:511:0x09f3, B:513:0x09fe, B:515:0x0a08, B:519:0x0a11, B:521:0x0a1b, B:527:0x0a26, B:493:0x0990, B:495:0x0994, B:496:0x09ae, B:498:0x09b4, B:484:0x096e, B:411:0x082a, B:413:0x082e, B:415:0x0834, B:417:0x083a, B:419:0x0844, B:422:0x084a, B:423:0x084e, B:425:0x0857, B:427:0x0869, B:429:0x0872, B:431:0x087a, B:436:0x0886, B:438:0x08b3, B:440:0x08b9, B:443:0x08bf, B:444:0x08c7, B:446:0x08cd, B:447:0x08d0, B:448:0x08d9, B:450:0x08de, B:452:0x08e4, B:453:0x08e9, B:456:0x08f6, B:306:0x065e, B:308:0x0664, B:311:0x066c, B:314:0x0675, B:316:0x0679, B:318:0x0681, B:319:0x0684, B:321:0x068a, B:323:0x0694, B:325:0x069c, B:327:0x06aa, B:329:0x06b2, B:331:0x06d1, B:333:0x0706, B:335:0x070a, B:339:0x071a, B:341:0x071e, B:346:0x0726, B:348:0x072c, B:350:0x074b, B:353:0x0754, B:364:0x077d, B:355:0x0759, B:358:0x0760, B:359:0x0768, B:361:0x076e, B:337:0x0710, B:365:0x0789, B:367:0x078f, B:369:0x0793, B:372:0x0799, B:381:0x07b0, B:378:0x07a7, B:380:0x07ad, B:251:0x056e), top: B:690:0x04eb }] */
    /* JADX WARN: Code duplicated, block: B:589:0x0b4a  */
    /* JADX WARN: Code duplicated, block: B:613:0x0b9a  */
    /* JADX WARN: Code duplicated, block: B:620:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:622:0x0bcd  */
    /* JADX WARN: Code duplicated, block: B:623:0x0bd0  */
    /* JADX WARN: Code duplicated, block: B:624:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:629:0x0be6  */
    /* JADX WARN: Code duplicated, block: B:636:0x0bff  */
    /* JADX WARN: Code duplicated, block: B:655:0x0c61  */
    /* JADX WARN: Code duplicated, block: B:657:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:660:0x0c6f  */
    /* JADX WARN: Code duplicated, block: B:662:0x0c7b A[LOOP:20: B:662:0x0c7b->B:664:0x0c85, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:664:0x0c85 A[LOOP:20: B:662:0x0c7b->B:664:0x0c85, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:668:0x0cad  */
    /* JADX WARN: Code duplicated, block: B:713:0x08e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x0af5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x0af1 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:549:0x0ab7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r2v118 */
    /* JADX WARN: Type inference failed for: r2v120 */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v123 */
    /* JADX WARN: Type inference failed for: r2v124 */
    /* JADX WARN: Type inference failed for: r2v125 */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.google.android.gms.internal.ads.p32, com.google.android.gms.internal.ads.wy1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i10;
        dy1 dy1Var;
        boolean z10;
        int i11;
        fz1 fz1Var;
        r32 r32Var;
        dz1 dz1VarM;
        int i12;
        long j10;
        int i13;
        boolean z11;
        boolean z12;
        long j11;
        int i14;
        boolean z13;
        int i15;
        int i16;
        uz1[] uz1VarArr;
        nz1 nz1Var;
        boolean z14;
        dz1 dz1VarL;
        int i17;
        boolean zB;
        yz1 yz1Var;
        fz1 fz1Var2;
        long j12;
        int i18;
        boolean z15;
        dz1 dz1VarL2;
        dz1 dz1VarI;
        byte b10;
        boolean z16;
        s sVarK;
        int i19;
        uz1[] uz1VarArr2;
        uz1[] uz1VarArr3;
        int i20;
        dz1 dz1VarN;
        ez1 ez1VarI;
        Message message2 = message;
        Handler.Callback callback = null;
        ?? r2 = 0;
        Object obj = null;
        ?? r3 = 0;
        ?? r10 = 0;
        z80 z80Var = null;
        ?? r11 = 0;
        boolean z17 = true;
        try {
            try {
                switch (message2.what) {
                    case 1:
                        boolean z18 = message2.arg1 != 0;
                        int i21 = message2.arg2;
                        this.G.f(1);
                        h(this.f21649y.f(this.F.f18042e, z18), i21 >> 4, i21 & 15, z18);
                        z10 = true;
                        f(message2.what);
                        return z10;
                    case 2:
                        try {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            ys0 ys0Var = this.f21632g;
                            ys0Var.d(2);
                            nz1 nz1Var2 = this.F;
                            int i22 = nz1Var2.f18042e;
                            z17 = true;
                            if (i22 == 1) {
                                message2 = message;
                                z10 = z17;
                                f(message2.what);
                                return z10;
                            }
                            if (i22 != 4) {
                                if (nz1Var2.f18038a.g() || !this.f21642r.j()) {
                                    j10 = jUptimeMillis;
                                    i13 = 3;
                                } else {
                                    fz1 fz1Var3 = this.f21641q;
                                    fz1Var3.G(this.S);
                                    if (fz1Var3.H() && (ez1VarI = fz1Var3.I(this.S, this.F)) != null) {
                                        dz1 dz1VarJ = fz1Var3.J(ez1VarI);
                                        if (!dz1VarJ.f13777d) {
                                            long j13 = ez1VarI.f14117b;
                                            dz1VarJ.f13777d = true;
                                            dz1VarJ.f13774a.g(this, j13);
                                        } else if (dz1VarJ.f13778e) {
                                            ys0Var.b(8, dz1VarJ.f13774a).a();
                                        }
                                        if (fz1Var3.L() == dz1VarJ) {
                                            s(ez1VarI.f14117b, true);
                                        }
                                        Q(false);
                                    }
                                    if (this.M) {
                                        this.M = A((dz1) fz1Var3.f14619o);
                                        M();
                                    } else {
                                        L();
                                    }
                                    if (this.J || !this.f21648x || this.f21624a0 || V() || (dz1VarN = fz1Var3.N()) == null || dz1VarN != fz1Var3.M() || dz1VarN.i() == null || !dz1VarN.i().f13778e) {
                                        fz1Var2 = fz1Var3;
                                        j12 = C.TIME_UNSET;
                                    } else {
                                        dz1 dz1VarI2 = dz1VarN.i();
                                        ps1.c0(dz1VarI2.f13778e);
                                        if (((long) ((dz1VarI2.a() - this.S) / this.f21637m.zzj().f13130a)) <= 10000000) {
                                            fz1Var3.P();
                                            fz1Var2 = fz1Var3;
                                            dz1 dz1VarN2 = fz1Var2.N();
                                            if (dz1VarN2 != null) {
                                                s sVarK2 = dz1VarN2.k();
                                                int i23 = 0;
                                                while (true) {
                                                    uz1[] uz1VarArr4 = this.f21623a;
                                                    if (i23 < 2) {
                                                        if (sVarK2.b(i23) && uz1VarArr4[i23].B() && !uz1VarArr4[i23].D()) {
                                                            uz1VarArr4[i23].C();
                                                            P(dz1VarN2, i23, false, dz1VarN2.a());
                                                        }
                                                        i23++;
                                                        sVarK2 = sVarK2;
                                                    } else {
                                                        j12 = C.TIME_UNSET;
                                                        if (V()) {
                                                            this.Z = dz1VarN2.f13774a.zzr();
                                                            if (!dz1VarN2.b()) {
                                                                fz1Var2.R(dz1VarN2);
                                                                Q(false);
                                                                L();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            fz1Var2 = fz1Var3;
                                        }
                                        j12 = C.TIME_UNSET;
                                    }
                                    dz1 dz1VarM2 = fz1Var2.M();
                                    if (dz1VarM2 == null) {
                                        j10 = jUptimeMillis;
                                    } else if (dz1VarM2.i() == null || this.J) {
                                        j10 = jUptimeMillis;
                                        if (dz1VarM2.f13780g.f14123h || this.J) {
                                            uz1[] uz1VarArr5 = this.f21623a;
                                            for (int i24 = 0; i24 < 2; i24++) {
                                                uz1 uz1Var = uz1VarArr5[i24];
                                                if ((uz1Var.z(dz1VarM2) != null) && uz1Var.G(dz1VarM2)) {
                                                    uz1Var.H(dz1VarM2);
                                                }
                                            }
                                        }
                                    } else {
                                        dz1 dz1VarM3 = fz1Var2.M();
                                        if (dz1VarM3.f13778e) {
                                            int i25 = 0;
                                            while (true) {
                                                uz1[] uz1VarArr6 = this.f21623a;
                                                if (i25 < 2) {
                                                    if (uz1VarArr6[i25].N(dz1VarM3)) {
                                                        i25++;
                                                    }
                                                } else if ((!V() || fz1Var2.N() != fz1Var2.M()) && (dz1VarM2.i().f13778e || this.S >= dz1VarM2.i().a())) {
                                                    if (dz1VarM2.i().f13778e) {
                                                        dz1 dz1VarI3 = dz1VarM2.i();
                                                        ps1.c0(dz1VarI3.f13778e);
                                                        if (((long) ((dz1VarI3.a() - this.S) / this.f21637m.zzj().f13130a)) <= 10000000) {
                                                        }
                                                    }
                                                    s sVarK3 = dz1VarM2.k();
                                                    dz1 dz1VarO = fz1Var2.O();
                                                    s sVarK4 = dz1VarO.k();
                                                    ci ciVar = this.F.f18038a;
                                                    j10 = jUptimeMillis;
                                                    G(ciVar, dz1VarO.f13780g.f14116a, ciVar, dz1VarM2.f13780g.f14116a, C.TIME_UNSET, false);
                                                    if (!dz1VarO.f13778e || ((!(z15 = this.f21648x) || this.Z == j12) && dz1VarO.f13774a.zzr() == j12)) {
                                                        i18 = 2;
                                                    } else {
                                                        this.Z = j12;
                                                        if (z15 && !this.f21624a0) {
                                                            int i26 = 0;
                                                            while (true) {
                                                                i18 = 2;
                                                                if (i26 < 2) {
                                                                    if (sVarK4.b(i26)) {
                                                                        uz1VarArr6[i26].F();
                                                                        p[] pVarArr = (p[]) sVarK4.f19744c;
                                                                        if (na.c(pVarArr[i26].zzc().f14678o, pVarArr[i26].zzc().f14675k) || uz1VarArr6[i26].D()) {
                                                                        }
                                                                    }
                                                                    i26++;
                                                                }
                                                            }
                                                        }
                                                        dz1VarO.a();
                                                        for (int i27 = 0; i27 < 2; i27++) {
                                                            uz1VarArr6[i27].J();
                                                        }
                                                        if (!dz1VarO.b()) {
                                                            fz1Var2.R(dz1VarO);
                                                            Q(false);
                                                            L();
                                                        }
                                                    }
                                                    int i28 = 0;
                                                    while (i28 < i18) {
                                                        uz1 uz1Var2 = uz1VarArr6[i28];
                                                        dz1VarO.a();
                                                        uz1Var2.I(sVarK3, sVarK4);
                                                        i28++;
                                                        i18 = 2;
                                                    }
                                                }
                                                j10 = jUptimeMillis;
                                            }
                                        } else {
                                            j10 = jUptimeMillis;
                                        }
                                    }
                                    dz1 dz1VarM4 = fz1Var2.M();
                                    if (dz1VarM4 != null && fz1Var2.L() != dz1VarM4 && !dz1VarM4.f13781h) {
                                        dz1 dz1VarM5 = fz1Var2.M();
                                        s sVarK5 = dz1VarM5.k();
                                        int i29 = 1;
                                        int i30 = 0;
                                        while (true) {
                                            uz1[] uz1VarArr7 = this.f21623a;
                                            if (i30 < 2) {
                                                int iE = uz1VarArr7[i30].E();
                                                int iP = uz1VarArr7[i30].p(dz1VarM5, sVarK5, this.f21637m);
                                                this.Q -= iE - uz1VarArr7[i30].E();
                                                i29 &= iP & 1;
                                                i30++;
                                            } else if (i29 != 0) {
                                                for (int i31 = 0; i31 < 2; i31++) {
                                                    if (sVarK5.b(i31)) {
                                                        if (!(uz1VarArr7[i31].z(dz1VarM5) != null)) {
                                                            P(dz1VarM5, i31, false, dz1VarM5.a());
                                                        }
                                                    }
                                                }
                                                fz1Var2.M().f13781h = true;
                                            }
                                        }
                                    }
                                    boolean z19 = false;
                                    while (T() && !this.J && (dz1VarL2 = fz1Var2.L()) != null && (dz1VarI = dz1VarL2.i()) != null && this.S >= dz1VarI.a() && dz1VarI.f13781h) {
                                        if (z19) {
                                            f(-1);
                                        }
                                        this.f21624a0 = false;
                                        dz1 dz1VarQ = fz1Var2.Q();
                                        if (dz1VarQ == null) {
                                            throw null;
                                        }
                                        if (this.F.f18039b.f19359a.equals(dz1VarQ.f13780g.f14116a.f19359a)) {
                                            r32 r32Var2 = this.F.f18039b;
                                            b10 = -1;
                                            if (r32Var2.f19360b == -1) {
                                                r32 r32Var3 = dz1VarQ.f13780g.f14116a;
                                                if (r32Var3.f19360b == -1 && r32Var2.f19363e != r32Var3.f19363e) {
                                                    z16 = true;
                                                }
                                            }
                                            ez1 ez1Var = dz1VarQ.f13780g;
                                            boolean z20 = z16;
                                            r32 r32Var4 = ez1Var.f14116a;
                                            long j14 = ez1Var.f14117b;
                                            this.F = N(r32Var4, j14, ez1Var.f14119d, j14, !z20, 0);
                                            J();
                                            l();
                                            if (V() && dz1VarQ == fz1Var2.N()) {
                                                uz1VarArr3 = this.f21623a;
                                                for (i20 = 0; i20 < 2; i20++) {
                                                    uz1VarArr3[i20].n();
                                                }
                                            }
                                            if (this.F.f18042e == 3) {
                                                j();
                                            }
                                            sVarK = fz1Var2.L().k();
                                            i19 = 0;
                                            while (true) {
                                                uz1VarArr2 = this.f21623a;
                                                if (i19 < 2) {
                                                    if (sVarK.b(i19)) {
                                                        uz1VarArr2[i19].K();
                                                    }
                                                    i19++;
                                                }
                                            }
                                            z19 = true;
                                            j12 = C.TIME_UNSET;
                                        } else {
                                            b10 = -1;
                                        }
                                        z16 = false;
                                        ez1 ez1Var2 = dz1VarQ.f13780g;
                                        boolean z21 = z16;
                                        r32 r32Var5 = ez1Var2.f14116a;
                                        long j15 = ez1Var2.f14117b;
                                        this.F = N(r32Var5, j15, ez1Var2.f14119d, j15, !z21, 0);
                                        J();
                                        l();
                                        if (V()) {
                                            uz1VarArr3 = this.f21623a;
                                            while (i20 < 2) {
                                                uz1VarArr3[i20].n();
                                            }
                                        }
                                        if (this.F.f18042e == 3) {
                                            j();
                                        }
                                        sVarK = fz1Var2.L().k();
                                        i19 = 0;
                                        while (true) {
                                            uz1VarArr2 = this.f21623a;
                                            if (i19 < 2) {
                                                if (sVarK.b(i19)) {
                                                    uz1VarArr2[i19].K();
                                                }
                                                i19++;
                                            }
                                        }
                                        z19 = true;
                                        j12 = C.TIME_UNSET;
                                    }
                                    i13 = 3;
                                    this.Y.getClass();
                                }
                                fz1 fz1Var4 = this.f21641q;
                                dz1 dz1VarL3 = fz1Var4.L();
                                if (dz1VarL3 == null) {
                                    p(j10);
                                } else {
                                    long j16 = j10;
                                    Trace.beginSection("doSomeWork");
                                    l();
                                    if (dz1VarL3.f13778e) {
                                        this.T = uu0.t(SystemClock.elapsedRealtime());
                                        dz1VarL3.f13774a.i(this.F.f18054r - this.l);
                                        z11 = true;
                                        z12 = true;
                                        int i32 = 0;
                                        while (true) {
                                            uz1[] uz1VarArr8 = this.f21623a;
                                            if (i32 < 2) {
                                                uz1 uz1Var3 = uz1VarArr8[i32];
                                                if (uz1Var3.E() == 0) {
                                                    m(i32, false);
                                                } else {
                                                    uz1Var3.O(this.S, this.T);
                                                    z11 = z11 && uz1Var3.L();
                                                    boolean zP = uz1Var3.P(dz1VarL3);
                                                    m(i32, zP);
                                                    z12 = z12 && zP;
                                                    if (!zP) {
                                                        U(i32);
                                                    }
                                                }
                                                i32++;
                                            }
                                        }
                                    } else {
                                        dz1VarL3.f13774a.zzm();
                                        z11 = true;
                                        z12 = true;
                                    }
                                    long j17 = dz1VarL3.f13780g.f14120e;
                                    if (z11 && dz1VarL3.f13778e) {
                                        j11 = C.TIME_UNSET;
                                        if (j17 == C.TIME_UNSET || j17 <= this.F.f18054r) {
                                            if (this.J) {
                                                this.J = false;
                                                int i33 = this.F.f18050n;
                                                this.G.f(0);
                                                h(this.f21649y.f(this.F.f18042e, false), i33, 5, false);
                                            }
                                            if (dz1VarL3.f13780g.f14123h) {
                                                c(4);
                                                k();
                                                j11 = -9223372036854775807L;
                                            }
                                        }
                                        i14 = 2;
                                        if (this.F.f18042e == 2) {
                                            i16 = 0;
                                            while (true) {
                                                uz1VarArr = this.f21623a;
                                                if (i16 < i14) {
                                                    if (uz1VarArr[i16].z(dz1VarL3) != null) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        U(i16);
                                                    }
                                                    i16++;
                                                    i14 = 2;
                                                } else {
                                                    nz1Var = this.F;
                                                    if (!nz1Var.f18044g || nz1Var.f18053q >= 500000 || !A((dz1) fz1Var4.f14619o) || !T()) {
                                                        this.X = j11;
                                                    } else if (this.X == j11) {
                                                        this.X = SystemClock.elapsedRealtime();
                                                    } else if (SystemClock.elapsedRealtime() - this.X >= 4000) {
                                                        throw new ks0(0, 4000);
                                                    }
                                                }
                                            }
                                        } else {
                                            this.X = j11;
                                        }
                                        if (T() || this.F.f18042e != i13) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                        this.F.getClass();
                                        i15 = this.F.f18042e;
                                        if (i15 != 4 && (z13 || i15 == 2 || (i15 == i13 && this.Q != 0))) {
                                            p(j16);
                                        }
                                        Trace.endSection();
                                    } else {
                                        j11 = C.TIME_UNSET;
                                    }
                                    nz1 nz1Var3 = this.F;
                                    if (nz1Var3.f18042e != 2) {
                                        j11 = j11;
                                        if (this.F.f18042e == i13) {
                                            if (this.Q == 0) {
                                                if (!E()) {
                                                    y(T(), false);
                                                    c(2);
                                                    if (this.K) {
                                                        for (dz1VarL = fz1Var4.L(); dz1VarL != null; dz1VarL = dz1VarL.i()) {
                                                            for (p pVar : (p[]) dz1VarL.k().f19744c) {
                                                            }
                                                        }
                                                        this.f21628c0.a();
                                                    }
                                                    k();
                                                }
                                            } else if (!z12) {
                                                y(T(), false);
                                                c(2);
                                                if (this.K) {
                                                    while (dz1VarL != null) {
                                                        while (i17 < r7) {
                                                        }
                                                    }
                                                    this.f21628c0.a();
                                                }
                                                k();
                                            }
                                        }
                                    } else {
                                        if (this.Q == 0) {
                                            zB = E();
                                        } else {
                                            if (z12) {
                                                if (nz1Var3.f18044g) {
                                                    dz1 dz1VarL4 = fz1Var4.L();
                                                    long jB = o(this.F.f18038a, dz1VarL4.f13780g.f14116a) ? this.f21628c0.b() : j11;
                                                    dz1 dz1Var = (dz1) fz1Var4.f14619o;
                                                    boolean z22 = dz1Var.b() && dz1Var.f13780g.f14123h;
                                                    boolean z23 = dz1Var.f13780g.f14116a.b() && !dz1Var.f13778e;
                                                    if (!z22 && !z23) {
                                                        long jR = R(dz1Var.d());
                                                        zy1 zy1Var = this.f21631f;
                                                        j02 j02Var = this.f21644t;
                                                        ci ciVar2 = this.F.f18038a;
                                                        r32 r32Var6 = dz1VarL4.f13780g.f14116a;
                                                        float f10 = this.f21637m.zzj().f13130a;
                                                        boolean z24 = this.F.l;
                                                        zB = zy1Var.b(new xy1(j02Var, ciVar2, r32Var6, jR, f10, this.K, jB));
                                                    }
                                                    c(i13);
                                                    this.W = null;
                                                    if (T()) {
                                                        y(false, false);
                                                        sr0 sr0Var = this.f21637m;
                                                        sr0Var.f20038b = true;
                                                        yz1Var = (yz1) sr0Var.f20039c;
                                                        if (!yz1Var.f22417b) {
                                                            yz1Var.f22419d = SystemClock.elapsedRealtime();
                                                            yz1Var.f22417b = true;
                                                        }
                                                        j();
                                                    }
                                                }
                                                j11 = j11;
                                                c(i13);
                                                this.W = null;
                                                if (T()) {
                                                    y(false, false);
                                                    sr0 sr0Var2 = this.f21637m;
                                                    sr0Var2.f20038b = true;
                                                    yz1Var = (yz1) sr0Var2.f20039c;
                                                    if (!yz1Var.f22417b) {
                                                        yz1Var.f22419d = SystemClock.elapsedRealtime();
                                                        yz1Var.f22417b = true;
                                                    }
                                                    j();
                                                }
                                            } else {
                                                j11 = j11;
                                            }
                                            if (this.F.f18042e == i13) {
                                                if (this.Q == 0) {
                                                    if (!E()) {
                                                        y(T(), false);
                                                        c(2);
                                                        if (this.K) {
                                                            while (dz1VarL != null) {
                                                                while (i17 < r7) {
                                                                }
                                                            }
                                                            this.f21628c0.a();
                                                        }
                                                        k();
                                                    }
                                                } else if (!z12) {
                                                    y(T(), false);
                                                    c(2);
                                                    if (this.K) {
                                                        while (dz1VarL != null) {
                                                            while (i17 < r7) {
                                                            }
                                                        }
                                                        this.f21628c0.a();
                                                    }
                                                    k();
                                                }
                                            }
                                        }
                                        if (zB) {
                                            c(i13);
                                            this.W = null;
                                            if (T()) {
                                                y(false, false);
                                                sr0 sr0Var3 = this.f21637m;
                                                sr0Var3.f20038b = true;
                                                yz1Var = (yz1) sr0Var3.f20039c;
                                                if (!yz1Var.f22417b) {
                                                    yz1Var.f22419d = SystemClock.elapsedRealtime();
                                                    yz1Var.f22417b = true;
                                                }
                                                j();
                                            }
                                        } else if (this.F.f18042e == i13) {
                                            if (this.Q == 0) {
                                                if (!E()) {
                                                    y(T(), false);
                                                    c(2);
                                                    if (this.K) {
                                                        while (dz1VarL != null) {
                                                            while (i17 < r7) {
                                                            }
                                                        }
                                                        this.f21628c0.a();
                                                    }
                                                    k();
                                                }
                                            } else if (!z12) {
                                                y(T(), false);
                                                c(2);
                                                if (this.K) {
                                                    while (dz1VarL != null) {
                                                        while (i17 < r7) {
                                                        }
                                                    }
                                                    this.f21628c0.a();
                                                }
                                                k();
                                            }
                                        }
                                    }
                                    i14 = 2;
                                    if (this.F.f18042e == 2) {
                                        i16 = 0;
                                        while (true) {
                                            uz1VarArr = this.f21623a;
                                            if (i16 < i14) {
                                                if (uz1VarArr[i16].z(dz1VarL3) != null) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    U(i16);
                                                }
                                                i16++;
                                                i14 = 2;
                                            } else {
                                                nz1Var = this.F;
                                                if (!nz1Var.f18044g) {
                                                    this.X = j11;
                                                } else {
                                                    this.X = j11;
                                                }
                                            }
                                        }
                                    } else {
                                        this.X = j11;
                                    }
                                    if (T()) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    this.F.getClass();
                                    i15 = this.F.f18042e;
                                    if (i15 != 4) {
                                        p(j16);
                                    }
                                    Trace.endSection();
                                }
                                message2 = message;
                            }
                            z10 = true;
                            f(message2.what);
                            return z10;
                        } catch (a22 e10) {
                            e = e10;
                            message2 = message;
                            b(e.f11816a, e);
                        } catch (ab e11) {
                            e = e11;
                            message2 = message;
                            if (e.f11967b == 1) {
                                i12 = 1000;
                            } else if (true != e.f11966a) {
                                i12 = 3003;
                            } else {
                                i12 = IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED;
                            }
                            b(i12, e);
                        } catch (dy1 e12) {
                            e = e12;
                            message2 = message;
                            if (e.f13760c == 1) {
                                e = e.a(dz1VarM.f13780g.f14116a);
                            }
                            if (e.f13760c == 1) {
                                dy1Var = this.W;
                                if (dy1Var != null) {
                                    dy1Var.addSuppressed(e);
                                    e = this.W;
                                }
                                if (e.f13760c == 1) {
                                    fz1Var = this.f21641q;
                                    if (fz1Var.L() != fz1Var.M()) {
                                        while (fz1Var.L() != fz1Var.M()) {
                                            fz1Var.Q();
                                        }
                                        dz1 dz1VarL5 = fz1Var.L();
                                        dz1VarL5.getClass();
                                        f(message2.what);
                                        ez1 ez1Var3 = dz1VarL5.f13780g;
                                        r32 r32Var7 = ez1Var3.f14116a;
                                        long j18 = ez1Var3.f14117b;
                                        this.F = N(r32Var7, j18, ez1Var3.f14119d, j18, true, 0);
                                    }
                                }
                                if (e.f13766i) {
                                }
                                v71.J("ExoPlayerImplInternal", "Playback error", e);
                                z10 = true;
                                u(true, false);
                                this.F = this.F.e(e);
                            } else {
                                dy1Var = this.W;
                                if (dy1Var != null) {
                                    dy1Var.addSuppressed(e);
                                    e = this.W;
                                }
                                if (e.f13760c == 1) {
                                    fz1Var = this.f21641q;
                                    if (fz1Var.L() != fz1Var.M()) {
                                        while (fz1Var.L() != fz1Var.M()) {
                                            fz1Var.Q();
                                        }
                                        dz1 dz1VarL6 = fz1Var.L();
                                        dz1VarL6.getClass();
                                        f(message2.what);
                                        ez1 ez1Var4 = dz1VarL6.f13780g;
                                        r32 r32Var8 = ez1Var4.f14116a;
                                        long j19 = ez1Var4.f14117b;
                                        this.F = N(r32Var8, j19, ez1Var4.f14119d, j19, true, 0);
                                    }
                                }
                                if (e.f13766i) {
                                }
                                v71.J("ExoPlayerImplInternal", "Playback error", e);
                                z10 = true;
                                u(true, false);
                                this.F = this.F.e(e);
                            }
                        } catch (xl1 e13) {
                            e = e13;
                            message2 = message;
                            b(e.f21920a, e);
                        } catch (IOException e14) {
                            e = e14;
                            message2 = message;
                            b(2000, e);
                        } catch (RuntimeException e15) {
                            e = e15;
                            message2 = message;
                            if (e instanceof IllegalStateException) {
                                i10 = 1004;
                            } else {
                                i10 = 1004;
                            }
                            dy1 dy1Var2 = new dy1(2, e, i10);
                            v71.J("ExoPlayerImplInternal", "Playback error", dy1Var2);
                            u(true, false);
                            this.F = this.F.e(dy1Var2);
                        }
                        break;
                    case 3:
                        q((vy1) message2.obj);
                        z10 = true;
                        f(message2.what);
                        return z10;
                    case 4:
                        cc ccVar = (cc) message2.obj;
                        this.f21632g.d(16);
                        this.f21637m.c(ccVar);
                        cc ccVarZzj = this.f21637m.zzj();
                        K(ccVarZzj, ccVarZzj.f13130a, true, true);
                        z10 = true;
                        f(message2.what);
                        return z10;
                    case 5:
                        this.f21650z = (wz1) message2.obj;
                        z10 = true;
                        f(message2.what);
                        return z10;
                    case 6:
                        u(false, true);
                        z10 = true;
                        f(message2.what);
                        return z10;
                    case 7:
                        qf0 qf0Var = (qf0) message2.obj;
                        try {
                            v(true, false, true, false);
                            int i34 = 0;
                            while (true) {
                                uz1[] uz1VarArr9 = this.f21623a;
                                if (i34 >= 2) {
                                    this.f21631f.d(this.f21644t);
                                    this.f21649y.g();
                                    this.f21629d.c();
                                    c(1);
                                    Handler handler = this.f21632g.f22362a;
                                    return true;
                                }
                                this.f21625b[i34].z();
                                uz1VarArr9[i34].q();
                                i34++;
                            }
                        } finally {
                            this.f21632g.f22362a.removeCallbacksAndMessages(null);
                            this.f21633h.d();
                            qf0Var.a();
                        }
                        break;
                    case 8:
                        try {
                            try {
                                q32 q32Var = (q32) message2.obj;
                                fz1 fz1Var5 = this.f21641q;
                                dz1 dz1Var2 = (dz1) fz1Var5.f14619o;
                                if ((dz1Var2 != null && dz1Var2.f13774a == q32Var) == true) {
                                    if (dz1Var2 == null) {
                                        throw (r2 == true ? 1 : 0);
                                    }
                                    if (!dz1Var2.f13778e) {
                                        float f11 = this.f21637m.zzj().f13130a;
                                        dz1Var2.e(this.F.f18038a);
                                    }
                                    S(dz1Var2.f13780g.f14116a, dz1Var2.j(), dz1Var2.k());
                                    if (dz1Var2 == fz1Var5.L()) {
                                        s(dz1Var2.f13780g.f14117b, true);
                                        O(new boolean[2], ((dz1) this.f21641q.f14617m).a());
                                        dz1Var2.f13781h = true;
                                        nz1 nz1Var4 = this.F;
                                        try {
                                            r32 r32Var9 = nz1Var4.f18039b;
                                            long j20 = dz1Var2.f13780g.f14117b;
                                            this.F = N(r32Var9, j20, nz1Var4.f18040c, j20, false, 5);
                                        } catch (dy1 e16) {
                                            e = e16;
                                            if (e.f13760c == 1) {
                                                e = e.a(dz1VarM.f13780g.f14116a);
                                            }
                                            if (e.f13760c == 1) {
                                                dy1Var = this.W;
                                                if (dy1Var != null) {
                                                    dy1Var.addSuppressed(e);
                                                    e = this.W;
                                                }
                                                if (e.f13760c == 1) {
                                                    fz1Var = this.f21641q;
                                                    if (fz1Var.L() != fz1Var.M()) {
                                                        while (fz1Var.L() != fz1Var.M()) {
                                                            fz1Var.Q();
                                                        }
                                                        dz1 dz1VarL7 = fz1Var.L();
                                                        dz1VarL7.getClass();
                                                        f(message2.what);
                                                        ez1 ez1Var5 = dz1VarL7.f13780g;
                                                        r32 r32Var10 = ez1Var5.f14116a;
                                                        long j110 = ez1Var5.f14117b;
                                                        this.F = N(r32Var10, j110, ez1Var5.f14119d, j110, true, 0);
                                                    }
                                                }
                                                if (e.f13766i) {
                                                }
                                                v71.J("ExoPlayerImplInternal", "Playback error", e);
                                                z10 = true;
                                                u(true, false);
                                                this.F = this.F.e(e);
                                            } else {
                                                dy1Var = this.W;
                                                if (dy1Var != null) {
                                                    dy1Var.addSuppressed(e);
                                                    e = this.W;
                                                }
                                                if (e.f13760c == 1) {
                                                    fz1Var = this.f21641q;
                                                    if (fz1Var.L() != fz1Var.M()) {
                                                        while (fz1Var.L() != fz1Var.M()) {
                                                            fz1Var.Q();
                                                        }
                                                        dz1 dz1VarL8 = fz1Var.L();
                                                        dz1VarL8.getClass();
                                                        f(message2.what);
                                                        ez1 ez1Var6 = dz1VarL8.f13780g;
                                                        r32 r32Var11 = ez1Var6.f14116a;
                                                        long j111 = ez1Var6.f14117b;
                                                        this.F = N(r32Var11, j111, ez1Var6.f14119d, j111, true, 0);
                                                    }
                                                }
                                                if (e.f13766i) {
                                                }
                                                v71.J("ExoPlayerImplInternal", "Playback error", e);
                                                z10 = true;
                                                u(true, false);
                                                this.F = this.F.e(e);
                                            }
                                        }
                                    }
                                    L();
                                    if (e.f13760c == 1 && (dz1VarM = this.f21641q.M()) != null && e.f13765h == null) {
                                        e = e.a(dz1VarM.f13780g.f14116a);
                                    }
                                    if (e.f13760c == 1 || (r32Var = e.f13765h) == null) {
                                        dy1Var = this.W;
                                        if (dy1Var != null) {
                                            dy1Var.addSuppressed(e);
                                            e = this.W;
                                        }
                                        if (e.f13760c == 1) {
                                            fz1Var = this.f21641q;
                                            if (fz1Var.L() != fz1Var.M()) {
                                                while (fz1Var.L() != fz1Var.M()) {
                                                    fz1Var.Q();
                                                }
                                                dz1 dz1VarL9 = fz1Var.L();
                                                dz1VarL9.getClass();
                                                f(message2.what);
                                                ez1 ez1Var7 = dz1VarL9.f13780g;
                                                r32 r32Var12 = ez1Var7.f14116a;
                                                long j112 = ez1Var7.f14117b;
                                                this.F = N(r32Var12, j112, ez1Var7.f14119d, j112, true, 0);
                                            }
                                        }
                                        if (e.f13766i || !(this.W == null || (i11 = e.f13758a) == 5004 || i11 == 5003)) {
                                            v71.J("ExoPlayerImplInternal", "Playback error", e);
                                            z10 = true;
                                            u(true, false);
                                            this.F = this.F.e(e);
                                        } else {
                                            v71.B("ExoPlayerImplInternal", "Recoverable renderer error", e);
                                            if (this.W == null) {
                                                this.W = e;
                                            }
                                            ys0 ys0Var2 = this.f21632g;
                                            ss0 ss0VarB = ys0Var2.b(25, e);
                                            Handler handler2 = ys0Var2.f22362a;
                                            Message message3 = ss0VarB.f20047a;
                                            message3.getClass();
                                            handler2.sendMessageAtFrontOfQueue(message3);
                                            ss0VarB.f20047a = null;
                                            ys0.f(ss0VarB);
                                            z10 = true;
                                        }
                                    } else {
                                        int i35 = e.f13762e;
                                        fz1 fz1Var6 = this.f21641q;
                                        if (fz1Var6.N() != null && fz1Var6.N().f13780g.f14116a.equals(r32Var) && this.f21623a[i35].M(fz1Var6.N())) {
                                            this.f21624a0 = true;
                                            C();
                                            dz1 dz1VarN3 = fz1Var6.N();
                                            dz1 dz1VarL10 = fz1Var6.L();
                                            if (fz1Var6.L() != dz1VarN3) {
                                                while (dz1VarL10 != null && dz1VarL10.i() != dz1VarN3) {
                                                    dz1VarL10 = dz1VarL10.i();
                                                }
                                            }
                                            fz1Var6.R(dz1VarL10);
                                            if (this.F.f18042e != 4) {
                                                L();
                                                this.f21632g.c(2);
                                            }
                                        } else {
                                            dy1Var = this.W;
                                            if (dy1Var != null) {
                                                dy1Var.addSuppressed(e);
                                                e = this.W;
                                            }
                                            if (e.f13760c == 1) {
                                                fz1Var = this.f21641q;
                                                if (fz1Var.L() != fz1Var.M()) {
                                                    while (fz1Var.L() != fz1Var.M()) {
                                                        fz1Var.Q();
                                                    }
                                                    dz1 dz1VarL11 = fz1Var.L();
                                                    dz1VarL11.getClass();
                                                    f(message2.what);
                                                    ez1 ez1Var8 = dz1VarL11.f13780g;
                                                    r32 r32Var13 = ez1Var8.f14116a;
                                                    long j113 = ez1Var8.f14117b;
                                                    this.F = N(r32Var13, j113, ez1Var8.f14119d, j113, true, 0);
                                                }
                                            }
                                            if (e.f13766i) {
                                            }
                                            v71.J("ExoPlayerImplInternal", "Playback error", e);
                                            z10 = true;
                                            u(true, false);
                                            this.F = this.F.e(e);
                                        }
                                        z10 = true;
                                    }
                                    f(message2.what);
                                    return z10;
                                }
                                z17 = true;
                                dz1 dz1VarT = fz1Var5.T(q32Var);
                                if (dz1VarT != null) {
                                    ps1.c0(!dz1VarT.f13778e);
                                    float f12 = this.f21637m.zzj().f13130a;
                                    dz1VarT.e(this.F.f18038a);
                                    dz1 dz1Var3 = (dz1) fz1Var5.f14620p;
                                    if ((dz1Var3 != null && dz1Var3.f13774a == q32Var) != false) {
                                        I();
                                    }
                                }
                                z10 = z17;
                            } catch (a22 e17) {
                                e = e17;
                                b(e.f11816a, e);
                                z10 = true;
                            } catch (ab e18) {
                                e = e18;
                                if (e.f11967b == 1) {
                                    i12 = 1000;
                                } else if (true != e.f11966a) {
                                    i12 = 3003;
                                } else {
                                    i12 = IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED;
                                }
                                b(i12, e);
                                z10 = true;
                            } catch (xl1 e19) {
                                e = e19;
                                b(e.f21920a, e);
                                z10 = true;
                            } catch (IOException e20) {
                                e = e20;
                                b(2000, e);
                                z10 = true;
                            } catch (RuntimeException e21) {
                                e = e21;
                                if ((e instanceof IllegalStateException) || (e instanceof IllegalArgumentException)) {
                                    i10 = 1004;
                                } else {
                                    i10 = 1000;
                                }
                                dy1 dy1Var3 = new dy1(2, e, i10);
                                v71.J("ExoPlayerImplInternal", "Playback error", dy1Var3);
                                u(true, false);
                                this.F = this.F.e(dy1Var3);
                                z10 = true;
                            }
                        } catch (dy1 e22) {
                            e = e22;
                        }
                        f(message2.what);
                        return z10;
                    case 9:
                        q32 q32Var2 = (q32) message2.obj;
                        fz1 fz1Var7 = this.f21641q;
                        dz1 dz1Var4 = (dz1) fz1Var7.f14619o;
                        if ((dz1Var4 != null && dz1Var4.f13774a == q32Var2) == true) {
                            fz1Var7.G(this.S);
                            L();
                        } else {
                            dz1 dz1Var5 = (dz1) fz1Var7.f14620p;
                            if ((dz1Var5 != null && dz1Var5.f13774a == q32Var2) != false) {
                                I();
                            }
                        }
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 10:
                        D();
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 11:
                        int i36 = message2.arg1;
                        this.N = i36;
                        int iD = this.f21641q.D(this.F.f18038a, i36);
                        if ((iD & 1) != 0) {
                            i(true);
                        } else if ((iD & 2) != 0) {
                            C();
                        }
                        Q(false);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 12:
                        boolean z25 = message2.arg1 != 0;
                        this.O = z25;
                        int iE2 = this.f21641q.E(this.F.f18038a, z25);
                        if ((iE2 & 1) != 0) {
                            i(true);
                        } else if ((iE2 & 2) != 0) {
                            C();
                        }
                        Q(false);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 13:
                        boolean z26 = message2.arg1 != 0;
                        qf0 qf0Var2 = (qf0) message2.obj;
                        if (this.P != z26) {
                            this.P = z26;
                            if (!z26) {
                                uz1[] uz1VarArr10 = this.f21623a;
                                for (int i37 = 0; i37 < 2; i37++) {
                                    uz1VarArr10[i37].o();
                                }
                            }
                        }
                        if (qf0Var2 != null) {
                            qf0Var2.a();
                        }
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 14:
                        qz1 qz1Var = (qz1) message2.obj;
                        if (qz1Var.f19254e == this.f21634i) {
                            synchronized (qz1Var) {
                            }
                            try {
                                qz1Var.f19250a.b(qz1Var.f19252c, qz1Var.f19253d);
                                qz1Var.b(true);
                                int i38 = this.F.f18042e;
                                if (i38 == 3 || i38 == 2) {
                                    this.f21632g.c(2);
                                }
                            } catch (Throwable th2) {
                                qz1Var.b(true);
                                throw th2;
                            }
                        } else {
                            this.f21632g.b(15, qz1Var).a();
                        }
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 15:
                        qz1 qz1Var2 = (qz1) message2.obj;
                        Looper looper = qz1Var2.f19254e;
                        if (looper.getThread().isAlive()) {
                            this.f21639o.u(looper, callback).e(new ry0(qz1Var2, 15));
                        } else {
                            v71.y("TAG", "Trying to send message on a dead thread.");
                            qz1Var2.b(false);
                        }
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 16:
                        cc ccVar2 = (cc) message2.obj;
                        K(ccVar2, ccVar2.f13130a, true, false);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 17:
                        uy1 uy1Var = (uy1) message2.obj;
                        this.G.f(1);
                        if (uy1Var.f20964b != -1) {
                            this.R = new vy1(new sz1(uy1Var.f20963a, uy1Var.f20966d), uy1Var.f20964b, uy1Var.a());
                        }
                        F(this.f21642r.m(uy1Var.f20963a, uy1Var.f20966d), false);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 18:
                        uy1 uy1Var2 = (uy1) message2.obj;
                        int size = message2.arg1;
                        this.G.f(1);
                        lo0 lo0Var = this.f21642r;
                        if (size == -1) {
                            size = ((ArrayList) lo0Var.f17083d).size();
                        }
                        F(lo0Var.n(size, uy1Var2.f20963a, uy1Var2.f20966d), false);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 19:
                        defpackage.e.z(message2.obj);
                        this.G.f(1);
                        throw (r11 == true ? 1 : 0);
                    case 20:
                        int i39 = message2.arg1;
                        int i40 = message2.arg2;
                        q42 q42Var = (q42) message2.obj;
                        this.G.f(1);
                        F(this.f21642r.o(i39, i40, q42Var), false);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 21:
                        q42 q42Var2 = (q42) message2.obj;
                        this.G.f(1);
                        F(this.f21642r.p(q42Var2), false);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 22:
                        F(this.f21642r.l(), true);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 23:
                        this.I = message2.arg1 != 0;
                        J();
                        if (this.J) {
                            fz1 fz1Var8 = this.f21641q;
                            if (fz1Var8.M() != fz1Var8.L()) {
                                i(true);
                                Q(false);
                            }
                        }
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 24:
                    default:
                        return false;
                    case 25:
                        D();
                        i(true);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                        D();
                        i(true);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 27:
                        int i41 = message2.arg1;
                        int i42 = message2.arg2;
                        List list = (List) message2.obj;
                        this.G.f(1);
                        F(this.f21642r.i(i41, i42, list), false);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                        gy1 gy1Var = (gy1) message2.obj;
                        this.Y = gy1Var;
                        fz1 fz1Var9 = this.f21641q;
                        ci ciVar3 = this.F.f18038a;
                        fz1Var9.F(gy1Var);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                        this.G.f(1);
                        v(false, false, false, true);
                        this.f21631f.g(this.f21644t);
                        c(true != this.F.f18038a.g() ? 2 : 4);
                        nz1 nz1Var5 = this.F;
                        boolean z27 = nz1Var5.l;
                        h(this.f21649y.f(nz1Var5.f18042e, z27), nz1Var5.f18050n, nz1Var5.f18049m, z27);
                        this.f21642r.k();
                        this.f21632g.c(2);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                        Pair pair = (Pair) message2.obj;
                        Object obj2 = pair.first;
                        qf0 qf0Var3 = (qf0) pair.second;
                        uz1[] uz1VarArr11 = this.f21623a;
                        for (int i43 = 0; i43 < 2; i43++) {
                            uz1VarArr11[i43].r(obj2);
                        }
                        int i44 = this.F.f18042e;
                        if (i44 == 3 || i44 == 2) {
                            this.f21632g.c(2);
                        }
                        if (qf0Var3 != null) {
                            qf0Var3.a();
                        }
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 31:
                        z80 z80Var2 = (z80) message2.obj;
                        int i45 = message2.arg1;
                        this.f21629d.d(z80Var2);
                        sy syVar = this.f21649y;
                        if (i45 == 0) {
                            z80Var2 = z80Var;
                        }
                        syVar.e(z80Var2);
                        nz1 nz1Var6 = this.F;
                        boolean z28 = nz1Var6.l;
                        h(this.f21649y.f(nz1Var6.f18042e, z28), nz1Var6.f18050n, nz1Var6.f18049m, z28);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 32:
                        g(((Float) message2.obj).floatValue());
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 33:
                        int i46 = message2.arg1;
                        nz1 nz1Var7 = this.F;
                        h(i46, nz1Var7.f18050n, nz1Var7.f18049m, nz1Var7.l);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 34:
                        g(this.f21626b0);
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        d1 d1Var = (d1) message2.obj;
                        uz1[] uz1VarArr12 = this.f21623a;
                        for (int i47 = 0; i47 < 2; i47++) {
                            uz1VarArr12[i47].s(d1Var);
                        }
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 36:
                        boolean zBooleanValue = ((Boolean) message2.obj).booleanValue();
                        if (!zBooleanValue) {
                            if (this.D != null && this.C && !this.f21632g.a()) {
                                this.E++;
                            }
                            int i48 = this.E;
                            if (i48 > 0) {
                                this.f21647w.e(new ry0((wy1) this, i48));
                            }
                            this.E = 0;
                            this.C = false;
                            this.f21632g.d(37);
                            vy1 vy1Var = this.D;
                            if (vy1Var != null) {
                                q(vy1Var);
                                this.D = r10 == true ? 1 : 0;
                                this.C = false;
                            }
                        }
                        this.B = zBooleanValue;
                        t();
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case 37:
                        this.C = false;
                        vy1 vy1Var2 = this.D;
                        if (vy1Var2 != null) {
                            q(vy1Var2);
                            this.D = r3 == true ? 1 : 0;
                        }
                        z10 = z17;
                        f(message2.what);
                        return z10;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        this.A = (vz1) message2.obj;
                        t();
                        z10 = z17;
                        f(message2.what);
                        return z10;
                }
            } catch (a22 e23) {
                e = e23;
            } catch (ab e24) {
                e = e24;
            } catch (dy1 e25) {
                e = e25;
            } catch (xl1 e26) {
                e = e26;
            } catch (IOException e27) {
                e = e27;
            }
        } catch (RuntimeException e28) {
            e = e28;
        }
    }

    public final void i(boolean z10) {
        r32 r32Var = ((dz1) this.f21641q.l).f13780g.f14116a;
        long jR = r(r32Var, this.F.f18054r, true, false);
        if (jR != this.F.f18054r) {
            nz1 nz1Var = this.F;
            this.F = N(r32Var, jR, nz1Var.f18040c, nz1Var.f18041d, z10, 5);
        }
    }

    public final void j() {
        dz1 dz1Var = (dz1) this.f21641q.l;
        if (dz1Var == null) {
            return;
        }
        s sVar = dz1Var.f13787o;
        for (int i10 = 0; i10 < 2; i10++) {
            if (sVar.b(i10)) {
                this.f21623a[i10].Q();
            }
        }
    }

    public final void k() {
        sr0 sr0Var = this.f21637m;
        sr0Var.f20038b = false;
        yz1 yz1Var = (yz1) sr0Var.f20039c;
        if (yz1Var.f22417b) {
            yz1Var.a(yz1Var.zzg());
            yz1Var.f22417b = false;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            uz1 uz1Var = this.f21623a[i10];
            ux1 ux1Var = (ux1) uz1Var.f20972e;
            if (uz1.y(ux1Var)) {
                uz1.A(ux1Var);
            }
            ux1 ux1Var2 = (ux1) uz1Var.f20973f;
            if (ux1Var2 != null && ux1Var2.f20948h != 0) {
                uz1.A(ux1Var2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void l() {
        long j10;
        cc ccVarZzj;
        ?? r11;
        long j11;
        long j12;
        long jMax;
        fz1 fz1Var = this.f21641q;
        dz1 dz1Var = (dz1) fz1Var.l;
        if (dz1Var == null) {
            return;
        }
        long jZzr = dz1Var.f13778e ? dz1Var.f13774a.zzr() : -9223372036854775807L;
        if (jZzr != C.TIME_UNSET) {
            if (!dz1Var.b()) {
                fz1Var.R(dz1Var);
                Q(false);
                L();
            }
            s(jZzr, true);
            if (jZzr != this.F.f18054r) {
                nz1 nz1Var = this.F;
                j10 = -9223372036854775807L;
                r11 = 0;
                this.F = N(nz1Var.f18039b, jZzr, nz1Var.f18040c, jZzr, true, 5);
            } else {
                j10 = -9223372036854775807L;
                r11 = 0;
            }
        } else {
            j10 = -9223372036854775807L;
            boolean z10 = false;
            sr0 sr0Var = this.f21637m;
            boolean z11 = dz1Var != ((dz1) fz1Var.f14617m);
            yz1 yz1Var = (yz1) sr0Var.f20039c;
            ux1 ux1Var = (ux1) sr0Var.f20041e;
            if (ux1Var == null || ux1Var.r() || ((z11 && ((ux1) sr0Var.f20041e).f20948h != 2) || (!((ux1) sr0Var.f20041e).q() && (z11 || ((ux1) sr0Var.f20041e).x())))) {
                sr0Var.f20037a = true;
                if (sr0Var.f20038b && !yz1Var.f22417b) {
                    yz1Var.f22419d = SystemClock.elapsedRealtime();
                    yz1Var.f22417b = true;
                }
            } else {
                cz1 cz1Var = (cz1) sr0Var.f20042f;
                cz1Var.getClass();
                long jZzg = cz1Var.zzg();
                if (!sr0Var.f20037a) {
                    yz1Var.a(jZzg);
                    ccVarZzj = cz1Var.zzj();
                    if (!ccVarZzj.equals((cc) yz1Var.f22420e)) {
                        yz1Var.c(ccVarZzj);
                        ((wy1) sr0Var.f20040d).f21632g.b(16, ccVarZzj).a();
                    }
                } else if (jZzg >= yz1Var.zzg()) {
                    sr0Var.f20037a = false;
                    if (sr0Var.f20038b && !yz1Var.f22417b) {
                        yz1Var.f22419d = SystemClock.elapsedRealtime();
                        yz1Var.f22417b = true;
                    }
                    yz1Var.a(jZzg);
                    ccVarZzj = cz1Var.zzj();
                    if (!ccVarZzj.equals((cc) yz1Var.f22420e)) {
                        yz1Var.c(ccVarZzj);
                        ((wy1) sr0Var.f20040d).f21632g.b(16, ccVarZzj).a();
                    }
                } else if (yz1Var.f22417b) {
                    yz1Var.a(yz1Var.zzg());
                    yz1Var.f22417b = false;
                }
            }
            long jZzg2 = sr0Var.zzg();
            this.S = jZzg2;
            long j13 = jZzg2 - dz1Var.f13788p;
            long j14 = this.F.f18054r;
            ArrayList arrayList = this.f21638n;
            if (!arrayList.isEmpty() && !this.F.f18039b.b()) {
                if (this.V) {
                    this.V = false;
                }
                nz1 nz1Var2 = this.F;
                nz1Var2.f18038a.e(nz1Var2.f18039b.f19359a);
                int iMin = Math.min(this.U, arrayList.size());
                if (iMin > 0 && arrayList.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < arrayList.size() && arrayList.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.U = iMin;
            }
            if (sr0Var.zzh()) {
                boolean z12 = !this.G.f4946d;
                nz1 nz1Var3 = this.F;
                this.F = N(nz1Var3.f18039b, j13, nz1Var3.f18040c, j13, z12, 6);
                r11 = z10;
            } else {
                nz1 nz1Var4 = this.F;
                nz1Var4.f18054r = j13;
                nz1Var4.f18055s = SystemClock.elapsedRealtime();
                r11 = z10;
            }
        }
        this.F.f18052p = ((dz1) fz1Var.f14619o).d();
        nz1 nz1Var5 = this.F;
        nz1Var5.f18053q = R(nz1Var5.f18052p);
        nz1 nz1Var6 = this.F;
        if (nz1Var6.l && nz1Var6.f18042e == 3 && o(nz1Var6.f18038a, nz1Var6.f18039b)) {
            nz1 nz1Var7 = this.F;
            float fMax = 1.0f;
            if (nz1Var7.f18051o.f13130a == 1.0f) {
                zx1 zx1Var = this.f21628c0;
                long jN = n(nz1Var7.f18038a, nz1Var7.f18039b.f19359a, nz1Var7.f18054r);
                long j15 = this.F.f18053q;
                if (zx1Var.f22753c != j10) {
                    long j16 = jN - j15;
                    long j17 = zx1Var.f22761k;
                    if (j17 == j10) {
                        zx1Var.f22761k = j16;
                        zx1Var.l = 0L;
                    } else {
                        long jMax2 = Math.max(j16, (long) ((j16 * 9.999871E-4f) + (j17 * 0.999f)));
                        zx1Var.f22761k = jMax2;
                        zx1Var.l = (long) ((Math.abs(j16 - jMax2) * 9.999871E-4f) + (zx1Var.l * 0.999f));
                    }
                    if (zx1Var.f22760j != j10) {
                        j11 = 1000;
                        if (SystemClock.elapsedRealtime() - zx1Var.f22760j < 1000) {
                            fMax = zx1Var.f22759i;
                        }
                    } else {
                        j11 = 1000;
                    }
                    zx1Var.f22760j = SystemClock.elapsedRealtime();
                    long j18 = (zx1Var.l * 3) + zx1Var.f22761k;
                    if (zx1Var.f22758h > j18) {
                        long jT = uu0.t(j11);
                        float f10 = zx1Var.f22759i - 1.0f;
                        long j19 = zx1Var.f22755e;
                        j12 = jN;
                        float f11 = jT;
                        long j20 = zx1Var.f22758h - (((long) (f10 * f11)) + ((long) (0.029999971f * f11)));
                        long[] jArr = new long[3];
                        jArr[r11] = j18;
                        jArr[1] = j19;
                        jArr[2] = j20;
                        jMax = jArr[r11];
                        for (int i10 = 1; i10 < 3; i10++) {
                            long j21 = jArr[i10];
                            if (j21 > jMax) {
                                jMax = j21;
                            }
                        }
                        zx1Var.f22758h = jMax;
                    } else {
                        j12 = jN;
                        long jMax3 = j12 - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, zx1Var.f22759i - 1.0f) / 1.0E-7f));
                        long j22 = zx1Var.f22758h;
                        String str = uu0.f20901a;
                        jMax = Math.max(j22, Math.min(jMax3, j18));
                        zx1Var.f22758h = jMax;
                        long j23 = zx1Var.f22757g;
                        if (j23 != j10 && jMax > j23) {
                            zx1Var.f22758h = j23;
                            jMax = j23;
                        }
                    }
                    long j24 = j12 - jMax;
                    if (Math.abs(j24) < zx1Var.f22751a) {
                        zx1Var.f22759i = 1.0f;
                        fMax = 1.0f;
                    } else {
                        fMax = Math.max(0.97f, Math.min((j24 * 1.0E-7f) + 1.0f, 1.03f));
                        zx1Var.f22759i = fMax;
                    }
                }
                sr0 sr0Var2 = this.f21637m;
                if (sr0Var2.zzj().f13130a != fMax) {
                    cc ccVar = new cc(fMax, this.F.f18051o.f13131b);
                    this.f21632g.d(16);
                    this.f21637m.c(ccVar);
                    K(this.F.f18051o, sr0Var2.zzj().f13130a, r11, r11);
                }
            }
        }
    }

    public final void m(int i10, boolean z10) {
        boolean[] zArr = this.f21627c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f21647w.e(new com.google.android.gms.common.api.internal.q(this, i10, z10));
        }
    }

    public final long n(ci ciVar, Object obj, long j10) {
        int i10 = ciVar.o(obj, this.f21636k).f20772c;
        ih ihVar = this.f21635j;
        ciVar.b(i10, ihVar, 0L);
        if (ihVar.f15747d == C.TIME_UNSET || !ihVar.b() || !ihVar.f15750g) {
            return C.TIME_UNSET;
        }
        long j11 = ihVar.f15748e;
        String str = uu0.f20901a;
        return uu0.t((j11 == C.TIME_UNSET ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - ihVar.f15747d) - j10;
    }

    public final boolean o(ci ciVar, r32 r32Var) {
        if (r32Var.b() || ciVar.g()) {
            return false;
        }
        int i10 = ciVar.o(r32Var.f19359a, this.f21636k).f20772c;
        ih ihVar = this.f21635j;
        ciVar.b(i10, ihVar, 0L);
        return ihVar.b() && ihVar.f15750g && ihVar.f15747d != C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    public final void p(long j10) {
        int i10;
        dz1 dz1Var;
        dz1 dz1Var2;
        long j11;
        ux1 ux1Var;
        long jMin;
        ux1 ux1Var2;
        boolean z10 = this.f21645u;
        long jMin2 = 1000;
        long j12 = f21622d0;
        if (z10) {
            jMin2 = this.F.f18042e != 3 ? j12 : 1000L;
            for (i10 = 0; i10 < 2; i10++) {
                uz1 uz1Var = this.f21623a[i10];
                j11 = this.S;
                ux1Var = (ux1) uz1Var.f20972e;
                if (uz1.y(ux1Var)) {
                    jMin = ((s22) ux1Var).V(j11);
                } else {
                    jMin = Long.MAX_VALUE;
                }
                ux1Var2 = (ux1) uz1Var.f20973f;
                if (ux1Var2 == null && ux1Var2.f20948h != 0) {
                    jMin = Math.min(jMin, ((s22) ux1Var2).V(j11));
                }
                jMin2 = Math.min(jMin2, uu0.s(jMin));
            }
            if (this.F.i()) {
                dz1Var = (dz1) this.f21641q.l;
                if (dz1Var != null) {
                    dz1Var2 = dz1Var.f13785m;
                } else {
                    dz1Var2 = null;
                }
                if (dz1Var2 != null) {
                    if (this.S + (uu0.t(jMin2) * this.F.f18051o.f13130a) >= dz1Var2.a()) {
                        jMin2 = Math.min(jMin2, j12);
                    }
                }
            }
        } else if (this.B) {
            this.A.getClass();
            if (this.F.f18042e != 3) {
            }
            while (i10 < 2) {
                uz1 uz1Var2 = this.f21623a[i10];
                j11 = this.S;
                ux1Var = (ux1) uz1Var2.f20972e;
                if (uz1.y(ux1Var)) {
                    jMin = ((s22) ux1Var).V(j11);
                } else {
                    jMin = Long.MAX_VALUE;
                }
                ux1Var2 = (ux1) uz1Var2.f20973f;
                if (ux1Var2 == null) {
                }
                jMin2 = Math.min(jMin2, uu0.s(jMin));
            }
            if (this.F.i()) {
                dz1Var = (dz1) this.f21641q.l;
                if (dz1Var != null) {
                    dz1Var2 = dz1Var.f13785m;
                } else {
                    dz1Var2 = null;
                }
                if (dz1Var2 != null) {
                    if (this.S + (uu0.t(jMin2) * this.F.f18051o.f13130a) >= dz1Var2.a()) {
                        jMin2 = Math.min(jMin2, j12);
                    }
                }
            }
        } else if (this.F.f18042e != 3 || T()) {
            jMin2 = j12;
        }
        this.f21632g.f22362a.sendEmptyMessageAtTime(2, j10 + jMin2);
    }

    public final void q(vy1 vy1Var) throws Throwable {
        long jLongValue;
        r32 r32VarX;
        boolean z10;
        int i10;
        long j10;
        boolean z11;
        long j11;
        long j12;
        long j13;
        boolean z12;
        long j14;
        long jF;
        nz1 nz1Var;
        int i11;
        if (this.C) {
            if (this.D != null) {
                this.E++;
                this.G.f(1);
            }
            this.D = vy1Var;
            return;
        }
        this.G.f(1);
        ci ciVar = this.F.f18038a;
        int i12 = this.N;
        boolean z13 = this.O;
        ih ihVar = this.f21635j;
        ug ugVar = this.f21636k;
        Pair pairZ = z(ciVar, vy1Var, i12, z13, ihVar, ugVar);
        long jMax = C.TIME_UNSET;
        if (pairZ == null) {
            Pair pairW = w(this.F.f18038a);
            r32 r32Var = (r32) pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            z10 = !this.F.f18038a.g();
            r32VarX = r32Var;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairZ.first;
            jLongValue = ((Long) pairZ.second).longValue();
            long j15 = vy1Var.f21322c;
            if (j15 != C.TIME_UNSET) {
                jMax = jLongValue;
            }
            r32VarX = this.f21641q.X(this.F.f18038a, obj);
            if (r32VarX.b()) {
                this.F.f18038a.o(r32VarX.f19359a, ugVar);
                a aVarA = ugVar.f20775f.a(-1);
                int i13 = 0;
                while (true) {
                    int[] iArr = aVarA.f11787d;
                    if (i13 >= iArr.length || (i10 = iArr[i13]) == 0 || i10 == 1) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 == -1) {
                    ugVar.f20775f.getClass();
                }
                ugVar.f20775f.a(-1).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j15 != C.TIME_UNSET) {
                z10 = false;
            }
            z10 = true;
        }
        try {
            if (this.F.f18038a.g()) {
                this.R = vy1Var;
            } else if (pairZ == null) {
                if (this.F.f18042e != 1) {
                    c(4);
                }
                v(false, true, false, true);
            } else {
                if (r32VarX.equals(this.F.f18039b)) {
                    dz1 dz1Var = (dz1) this.f21641q.l;
                    if (dz1Var == null || !dz1Var.f13778e || jLongValue == 0) {
                        jF = jLongValue;
                    } else {
                        k32 k32Var = dz1Var.f13774a;
                        long j16 = ihVar.f15753j;
                        if (this.B && j16 != jMax) {
                            this.A.getClass();
                        }
                        jF = k32Var.f(jLongValue, this.f21650z);
                    }
                    long j17 = jF;
                    if (uu0.s(jF) == uu0.s(this.F.f18054r) && ((i11 = (nz1Var = this.F).f18042e) == 2 || i11 == 3)) {
                        jLongValue = nz1Var.f18054r;
                    } else {
                        j12 = j17;
                    }
                } else {
                    j12 = jLongValue;
                }
                if (this.B) {
                    uz1[] uz1VarArr = this.f21623a;
                    for (int i14 = 0; i14 < 2; i14++) {
                        uz1 uz1Var = uz1VarArr[i14];
                        if (uz1Var.t() && ((ux1) uz1Var.f20972e).f20942b == 2) {
                            this.C = true;
                            break;
                        }
                    }
                }
                boolean z14 = this.F.f18042e == 4;
                fz1 fz1Var = this.f21641q;
                long jR = r(r32VarX, j12, ((dz1) fz1Var.l) != ((dz1) fz1Var.f14617m), z14);
                boolean z15 = z10 | (jLongValue != jR);
                try {
                    nz1 nz1Var2 = this.F;
                    r32 r32Var2 = r32VarX;
                    try {
                        ci ciVar2 = nz1Var2.f18038a;
                        long j18 = jMax;
                        try {
                            G(ciVar2, r32Var2, ciVar2, nz1Var2.f18039b, j18, true);
                            r32VarX = r32Var2;
                            j13 = j18;
                            z12 = z15;
                            j14 = jR;
                            this.F = N(r32VarX, j14, j13, j14, z12, 2);
                        } catch (Throwable th2) {
                            th = th2;
                            r32VarX = r32Var2;
                            j10 = j18;
                            z11 = z15;
                            j11 = jR;
                            this.F = N(r32VarX, j11, j10, j11, z11, 2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r32VarX = r32Var2;
                        j10 = jMax;
                        z11 = z15;
                        j11 = jR;
                        this.F = N(r32VarX, j11, j10, j11, z11, 2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            j13 = jMax;
            j14 = jLongValue;
            z12 = z10;
            this.F = N(r32VarX, j14, j13, j14, z12, 2);
        } catch (Throwable th5) {
            th = th5;
            j10 = jMax;
            z11 = z10;
            j11 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    public final long r(r32 r32Var, long j10, boolean z10, boolean z11) {
        k();
        boolean z12 = true;
        y(false, true);
        if (z11 || this.F.f18042e == 3) {
            c(2);
        }
        fz1 fz1Var = this.f21641q;
        dz1 dz1Var = (dz1) fz1Var.l;
        dz1 dz1Var2 = dz1Var;
        while (dz1Var2 != null && !r32Var.equals(dz1Var2.f13780g.f14116a)) {
            dz1Var2 = dz1Var2.f13785m;
        }
        if (z10 || dz1Var != dz1Var2 || (dz1Var2 != null && dz1Var2.f13788p + j10 < 0)) {
            B();
            if (dz1Var2 != null) {
                while (((dz1) fz1Var.l) != dz1Var2) {
                    fz1Var.Q();
                }
                fz1Var.R(dz1Var2);
                dz1Var2.f13788p = 1000000000000L;
                O(new boolean[2], ((dz1) this.f21641q.f14617m).a());
                dz1Var2.f13781h = true;
            }
        }
        C();
        if (dz1Var2 != null) {
            fz1Var.R(dz1Var2);
            if (!dz1Var2.f13778e) {
                dz1Var2.f13780g = dz1Var2.f13780g.a(j10, C.TIME_UNSET);
            } else if (dz1Var2.f13779f) {
                if (this.B) {
                    this.A.getClass();
                    if (this.F.f18038a.g() || !dz1Var2.f13780g.f14116a.equals(this.F.f18039b)) {
                        k32 k32Var = dz1Var2.f13774a;
                        j10 = k32Var.c(j10);
                        k32Var.i(j10 - this.l);
                    } else {
                        long j11 = dz1Var2.f13788p + j10;
                        uz1[] uz1VarArr = this.f21623a;
                        boolean z13 = true;
                        for (int i10 = 0; i10 < 2; i10++) {
                            uz1 uz1Var = uz1VarArr[i10];
                            if (uz1Var.t()) {
                                ux1 ux1VarZ = uz1Var.z(dz1Var2);
                                z13 &= ux1VarZ != null && ux1VarZ.m(j11);
                            }
                        }
                        if (z13) {
                            k32 k32Var2 = dz1Var2.f13774a;
                            long j12 = this.F.f18054r;
                            wz1 wz1Var = wz1.f21652b;
                            if (k32Var2.f(j12, wz1Var) == k32Var2.f(j10, wz1Var)) {
                                z12 = false;
                            } else {
                                k32 k32Var3 = dz1Var2.f13774a;
                                j10 = k32Var3.c(j10);
                                k32Var3.i(j10 - this.l);
                            }
                        } else {
                            k32 k32Var4 = dz1Var2.f13774a;
                            j10 = k32Var4.c(j10);
                            k32Var4.i(j10 - this.l);
                        }
                    }
                } else {
                    k32 k32Var5 = dz1Var2.f13774a;
                    j10 = k32Var5.c(j10);
                    k32Var5.i(j10 - this.l);
                }
            }
            s(j10, z12);
            L();
        } else {
            fz1Var.U();
            s(j10, true);
        }
        Q(false);
        this.f21632g.c(2);
        return j10;
    }

    public final void s(long j10, boolean z10) {
        fz1 fz1Var = this.f21641q;
        dz1 dz1Var = (dz1) fz1Var.l;
        long j11 = j10 + (dz1Var == null ? 1000000000000L : dz1Var.f13788p);
        this.S = j11;
        ((yz1) this.f21637m.f20039c).a(j11);
        for (int i10 = 0; i10 < 2; i10++) {
            uz1 uz1Var = this.f21623a[i10];
            long j12 = this.S;
            ux1 ux1VarZ = uz1Var.z(dz1Var);
            if (ux1VarZ != null) {
                ux1VarZ.u(j12, false, z10);
            }
        }
        for (dz1 dz1Var2 = (dz1) fz1Var.l; dz1Var2 != null; dz1Var2 = dz1Var2.f13785m) {
            for (p pVar : (p[]) dz1Var2.f13787o.f19744c) {
            }
        }
    }

    public final void t() {
        for (int i10 = 0; i10 < 2; i10++) {
            uz1 uz1Var = this.f21623a[i10];
            vz1 vz1Var = this.B ? this.A : null;
            ((ux1) uz1Var.f20972e).b(18, vz1Var);
            ux1 ux1Var = (ux1) uz1Var.f20973f;
            if (ux1Var != null) {
                ux1Var.b(18, vz1Var);
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        v(z10 || !this.P, false, true, false);
        this.G.f(z11 ? 1 : 0);
        this.f21631f.e(this.f21644t);
        this.f21649y.f(1, this.F.l);
        c(1);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9 A[PHI: r2 r7 r9
  0x00b9: PHI (r2v2 com.google.android.gms.internal.ads.r32) = (r2v1 com.google.android.gms.internal.ads.r32), (r2v9 com.google.android.gms.internal.ads.r32) binds: [B:31:0x008f, B:33:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r7v4 long) = (r7v3 long), (r7v17 long) binds: [B:31:0x008f, B:33:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r9v2 long) = (r9v1 long), (r9v10 long) binds: [B:31:0x008f, B:33:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    public final void v(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        boolean z14;
        r32 r32Var;
        ci ciVar;
        List list;
        this.f21632g.d(2);
        this.C = false;
        if (this.D != null) {
            this.G.f(1);
            this.D = null;
        }
        this.W = null;
        y(false, true);
        sr0 sr0Var = this.f21637m;
        sr0Var.f20038b = false;
        yz1 yz1Var = (yz1) sr0Var.f20039c;
        if (yz1Var.f22417b) {
            yz1Var.a(yz1Var.zzg());
            yz1Var.f22417b = false;
        }
        this.S = 1000000000000L;
        try {
            B();
        } catch (dy1 | RuntimeException e10) {
            v71.J("ExoPlayerImplInternal", "Disable failed.", e10);
        }
        if (z10) {
            uz1[] uz1VarArr = this.f21623a;
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    uz1VarArr[i10].o();
                } catch (RuntimeException e11) {
                    v71.J("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.Q = 0;
        nz1 nz1Var = this.F;
        r32 r32Var2 = nz1Var.f18039b;
        long jLongValue = nz1Var.f18054r;
        if (this.F.f18039b.b()) {
            j10 = this.F.f18040c;
        } else {
            nz1 nz1Var2 = this.F;
            ug ugVar = this.f21636k;
            r32 r32Var3 = nz1Var2.f18039b;
            ci ciVar2 = nz1Var2.f18038a;
            if (ciVar2.g() || ciVar2.o(r32Var3.f19359a, ugVar).f20774e) {
                j10 = this.F.f18040c;
            } else {
                j10 = this.F.f18054r;
            }
        }
        if (z11) {
            this.R = null;
            Pair pairW = w(this.F.f18038a);
            r32Var2 = (r32) pairW.first;
            jLongValue = ((Long) pairW.second).longValue();
            boolean zEquals = r32Var2.equals(this.F.f18039b);
            j10 = C.TIME_UNSET;
            z14 = zEquals ? false : true;
        }
        long j11 = jLongValue;
        long j12 = j10;
        fz1 fz1Var = this.f21641q;
        fz1Var.U();
        this.M = false;
        ci ciVar3 = this.F.f18038a;
        if (z12 && (ciVar3 instanceof sz1)) {
            sz1 sz1Var = (sz1) ciVar3;
            q42 q42Var = (q42) this.f21642r.l;
            ci[] ciVarArr = sz1Var.f20099h;
            ci[] ciVarArr2 = new ci[ciVarArr.length];
            for (int i11 = 0; i11 < ciVarArr.length; i11++) {
                ciVarArr2[i11] = new rz1(sz1Var, ciVarArr[i11]);
            }
            sz1 sz1Var2 = new sz1(ciVarArr2, sz1Var.f20100i, q42Var);
            if (r32Var2.f19360b != -1) {
                Object obj = r32Var2.f19359a;
                ug ugVar2 = this.f21636k;
                sz1Var2.o(obj, ugVar2);
                ih ihVar = this.f21635j;
                sz1Var2.b(ugVar2.f20772c, ihVar, 0L);
                if (ihVar.b()) {
                    ciVar = sz1Var2;
                    r32Var = new r32(obj, r32Var2.f19362d);
                } else {
                    r32Var = r32Var2;
                    ciVar = sz1Var2;
                }
            } else {
                r32Var = r32Var2;
                ciVar = sz1Var2;
            }
        } else {
            r32Var = r32Var2;
            ciVar = ciVar3;
        }
        nz1 nz1Var3 = this.F;
        int i12 = nz1Var3.f18042e;
        dy1 dy1Var = z13 ? null : nz1Var3.f18043f;
        v42 v42Var = z14 ? v42.f21027d : nz1Var3.f18045h;
        s sVar = z14 ? this.f21630e : nz1Var3.f18046i;
        if (z14) {
            aa1 aa1Var = ca1.f13122b;
            list = ya1.f22208e;
        } else {
            list = nz1Var3.f18047j;
        }
        this.F = new nz1(ciVar, r32Var, j12, j11, i12, dy1Var, false, v42Var, sVar, list, r32Var, nz1Var3.l, nz1Var3.f18049m, nz1Var3.f18050n, nz1Var3.f18051o, j11, 0L, j11, 0L);
        if (z12) {
            fz1Var.K();
            lo0 lo0Var = this.f21642r;
            HashMap map = (HashMap) lo0Var.f17087h;
            for (kz1 kz1Var : map.values()) {
                try {
                    kz1Var.f16587a.q(kz1Var.f16588b);
                } catch (RuntimeException e12) {
                    v71.J("MediaSourceList", "Failed to release child source.", e12);
                }
                a32 a32Var = kz1Var.f16587a;
                jz1 jz1Var = kz1Var.f16589c;
                a32Var.l(jz1Var);
                a32Var.m(jz1Var);
            }
            map.clear();
            ((HashSet) lo0Var.f17088i).clear();
            lo0Var.f17080a = false;
        }
    }

    public final Pair w(ci ciVar) {
        int i10;
        long j10 = 0;
        if (ciVar.g()) {
            return Pair.create(nz1.f18037t, 0L);
        }
        int iK = ciVar.k(this.O);
        ih ihVar = this.f21635j;
        ug ugVar = this.f21636k;
        Pair pairM = ciVar.m(ihVar, ugVar, iK, C.TIME_UNSET);
        r32 r32VarX = this.f21641q.X(ciVar, pairM.first);
        long jLongValue = ((Long) pairM.second).longValue();
        if (r32VarX.b()) {
            ciVar.o(r32VarX.f19359a, ugVar);
            a aVarA = ugVar.f20775f.a(-1);
            int i11 = 0;
            while (true) {
                int[] iArr = aVarA.f11787d;
                if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                    break;
                }
                i11++;
            }
            if (-1 == i11) {
                ugVar.f20775f.getClass();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(r32VarX, Long.valueOf(j10));
    }

    public final void x(ci ciVar, ci ciVar2) {
        if (ciVar.g() && ciVar2.g()) {
            return;
        }
        ArrayList arrayList = this.f21638n;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void y(boolean z10, boolean z11) {
        this.K = z10;
        long jElapsedRealtime = C.TIME_UNSET;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.L = jElapsedRealtime;
    }
}
