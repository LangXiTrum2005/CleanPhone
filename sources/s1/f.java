package s1;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b2.p;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.b0;
import f2.a0;
import f2.c0;
import f2.i0;
import i1.t;
import i1.u;
import i1.v;
import i1.y;
import j2.o;
import j2.q;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.s1;
import n1.z;
import oa.k0;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends f2.a {
    public j2.m A;
    public z B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public t1.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public y O;
    public u P;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n1.g f50014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f50015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f50016k;
    public final u1.h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b0 f50017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k5.g f50018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f50019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f50020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i0 f50021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2.p f50022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final na.g f50023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f50024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f50025u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f50026v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f50027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k0 f50028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f50029y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n1.h f50030z;

    static {
        i1.z.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [s1.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [s1.c] */
    public f(y yVar, n1.g gVar, j2.p pVar, p pVar2, b0 b0Var, u1.h hVar, b0 b0Var2, long j10, long j11) {
        this.O = yVar;
        this.P = yVar.f42715c;
        v vVar = yVar.f42714b;
        vVar.getClass();
        Uri uri = vVar.f42704a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.f50014i = gVar;
        this.f50022r = pVar;
        this.f50015j = pVar2;
        this.l = hVar;
        this.f50017m = b0Var2;
        this.f50019o = j10;
        this.f50020p = j11;
        this.f50016k = b0Var;
        this.f50018n = new k5.g(17);
        this.f50013h = false;
        this.f50021q = a(null);
        this.f50024t = new Object();
        this.f50025u = new SparseArray();
        this.f50028x = new k0(this, 9);
        this.M = C.TIME_UNSET;
        this.K = C.TIME_UNSET;
        this.f50023s = new na.g(this, 11);
        this.f50029y = new x(this, 4);
        final int i10 = 0;
        this.f50026v = new Runnable(this) { // from class: s1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f50001b;

            {
                this.f50001b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                f fVar = this.f50001b;
                switch (i11) {
                    case 0:
                        fVar.D();
                        break;
                    default:
                        fVar.getClass();
                        try {
                            fVar.B(false);
                        } catch (Exception e10) {
                            fVar.C = new IOException(e10);
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f50027w = new Runnable(this) { // from class: s1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f50001b;

            {
                this.f50001b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                f fVar = this.f50001b;
                switch (i12) {
                    case 0:
                        fVar.D();
                        break;
                    default:
                        fVar.getClass();
                        try {
                            fVar.B(false);
                        } catch (Exception e10) {
                            fVar.C = new IOException(e10);
                        }
                        break;
                }
            }
        };
    }

    public static boolean x(t1.h hVar) {
        List list = hVar.f50374c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((t1.a) list.get(i10)).f50330b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    public final void A(IOException iOException) {
        l1.a.f("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        B(true);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x028e  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:166:0x0340  */
    /* JADX WARN: Code duplicated, block: B:169:0x0347  */
    /* JADX WARN: Code duplicated, block: B:211:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:213:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:236:0x0445  */
    /* JADX WARN: Code duplicated, block: B:238:0x044e  */
    /* JADX WARN: Code duplicated, block: B:243:0x048e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0497  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:250:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:252:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:267:0x04f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:268:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:270:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:272:0x0501  */
    /* JADX WARN: Code duplicated, block: B:274:0x0505  */
    /* JADX WARN: Code duplicated, block: B:283:0x03d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x03cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:? A[RETURN, SYNTHETIC] */
    public final void B(boolean z10) {
        t1.h hVar;
        long j10;
        long j11;
        boolean z11;
        long jMax;
        boolean z12;
        long j12;
        long j13;
        long j14;
        u uVar;
        t1.c cVar;
        long j15;
        List list;
        long jM;
        long jC;
        long jM2;
        long jM3;
        long jM4;
        int i10;
        List list2;
        int i11;
        g gVarB;
        long jH;
        long jMin;
        u uVar2;
        long j16;
        float f10;
        u uVar3;
        long jM5;
        long jMin2;
        SparseArray sparseArray;
        int i12;
        boolean z13;
        SparseArray sparseArray2;
        g2.i[] iVarArr;
        c cVar2 = this.f50027w;
        long j17 = this.f50020p;
        SparseArray sparseArray3 = this.f50025u;
        boolean z14 = false;
        int i13 = 0;
        while (i13 < sparseArray3.size()) {
            int iKeyAt = sparseArray3.keyAt(i13);
            if (iKeyAt >= this.N) {
                b bVar = (b) sparseArray3.valueAt(i13);
                t1.c cVar3 = this.G;
                int i14 = iKeyAt - this.N;
                bVar.f49995u = cVar3;
                bVar.f49996v = i14;
                m mVar = bVar.f49987m;
                mVar.f50072h = z14;
                mVar.f50070f = cVar3;
                Iterator it = mVar.f50069e.entrySet().iterator();
                while (it.hasNext()) {
                    int i15 = i13;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < mVar.f50070f.f50346h) {
                        it.remove();
                    }
                    i13 = i15;
                }
                i12 = i13;
                g2.i[] iVarArr2 = bVar.f49992r;
                if (iVarArr2 != null) {
                    int length = iVarArr2.length;
                    int i16 = 0;
                    while (i16 < length) {
                        i iVar = (i) iVarArr2[i16].f41384e;
                        h[] hVarArr = iVar.f50045i;
                        try {
                            iVar.f50047k = cVar3;
                            iVar.l = i14;
                            long jC2 = cVar3.c(i14);
                            try {
                                ArrayList arrayListF = iVar.f();
                                sparseArray2 = sparseArray3;
                                iVarArr = iVarArr2;
                                int i17 = 0;
                                while (i17 < hVarArr.length) {
                                    try {
                                        h[] hVarArr2 = hVarArr;
                                        hVarArr2[i17] = hVarArr2[i17].a(jC2, (t1.m) arrayListF.get(iVar.f50046j.getIndexInTrackGroup(i17)));
                                        i17++;
                                        hVarArr = hVarArr2;
                                    } catch (f2.b e10) {
                                        e = e10;
                                        iVar.f50048m = e;
                                    }
                                }
                            } catch (f2.b e11) {
                                e = e11;
                                sparseArray2 = sparseArray3;
                                iVarArr = iVarArr2;
                            }
                        } catch (f2.b e12) {
                            e = e12;
                            sparseArray2 = sparseArray3;
                            iVarArr = iVarArr2;
                        }
                        i16++;
                        sparseArray3 = sparseArray2;
                        iVarArr2 = iVarArr;
                    }
                    sparseArray = sparseArray3;
                    z13 = true;
                    bVar.f49991q.h(bVar);
                } else {
                    sparseArray = sparseArray3;
                    z13 = true;
                }
                bVar.f49997w = cVar3.a(i14).f50375d;
                for (j jVar : bVar.f49993s) {
                    for (t1.g gVar : bVar.f49997w) {
                        if (gVar.a().equals(jVar.f50054e.a())) {
                            jVar.a(gVar, (cVar3.f50342d && i14 == cVar3.f50350m.size() + (-1)) ? z13 : false);
                            break;
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i12 = i13;
            }
            i13 = i12 + 1;
            sparseArray3 = sparseArray;
            z14 = false;
        }
        int i18 = 1;
        t1.h hVarA = this.G.a(0);
        int size = this.G.f50350m.size() - 1;
        t1.h hVarA2 = this.G.a(size);
        long jC3 = this.G.c(size);
        long jM6 = l1.y.M(l1.y.B(this.K));
        long jC4 = this.G.c(0);
        long j18 = hVarA.f50373b;
        List list3 = hVarA.f50374c;
        long jM7 = l1.y.M(j18);
        boolean zX = x(hVarA);
        int i19 = 0;
        while (true) {
            hVar = hVarA;
            if (i19 >= list3.size()) {
                j10 = 0;
                break;
            }
            t1.a aVar = (t1.a) list3.get(i19);
            j10 = 0;
            List list4 = aVar.f50331c;
            int i20 = aVar.f50330b;
            boolean z15 = (i20 == i18 || i20 == 2) ? false : true;
            if ((!zX || !z15) && !list4.isEmpty()) {
                g gVarB2 = ((t1.m) list4.get(0)).b();
                if (gVarB2 == null || gVarB2.B(jC4, jM6) == 0) {
                    jM7 = jM7;
                    break;
                }
                jM7 = Math.max(jM7, gVarB2.getTimeUs(gVarB2.g(jC4, jM6)) + jM7);
            }
            i19++;
            i18 = 1;
            hVarA = hVar;
        }
        long j19 = hVarA2.f50373b;
        List list5 = hVarA2.f50374c;
        long jM8 = l1.y.M(j19);
        boolean zX2 = x(hVarA2);
        long jMin3 = Long.MAX_VALUE;
        int i21 = 0;
        while (true) {
            if (i21 >= list5.size()) {
                j11 = jMin3;
                break;
            }
            t1.a aVar2 = (t1.a) list5.get(i21);
            long j20 = jM8;
            List list6 = aVar2.f50331c;
            int i22 = aVar2.f50330b;
            boolean z16 = (i22 == 1 || i22 == 2) ? false : true;
            if ((!zX2 || !z16) && !list6.isEmpty()) {
                g gVarB3 = ((t1.m) list6.get(0)).b();
                if (gVarB3 == null) {
                    j11 = j20 + jC3;
                    break;
                }
                long jB = gVarB3.B(jC3, jM6);
                if (jB == j10) {
                    j11 = j20;
                    break;
                } else {
                    long jG = (gVarB3.g(jC3, jM6) + jB) - 1;
                    jMin3 = Math.min(jMin3, gVarB3.d(jG, jC3) + gVarB3.getTimeUs(jG) + j20);
                }
            }
            i21++;
            jM8 = j20;
            jM7 = jM7;
        }
        if (!this.G.f50342d) {
            z11 = false;
            break;
        }
        int i23 = 0;
        while (true) {
            if (i23 >= list5.size()) {
                z11 = true;
                break;
            }
            g gVarB4 = ((t1.m) ((t1.a) list5.get(i23)).f50331c.get(0)).b();
            if (gVarB4 == null || gVarB4.z()) {
                z11 = false;
                break;
            }
            i23++;
        }
        if (z11) {
            long j21 = this.G.f50344f;
            if (j21 != C.TIME_UNSET) {
                jMax = Math.max(jM7, j11 - l1.y.M(j21));
            } else {
                jMax = jM7;
            }
        } else {
            jMax = jM7;
        }
        long j22 = j11 - jMax;
        t1.c cVar4 = this.G;
        if (cVar4.f50342d) {
            go.k.t(cVar4.f50339a != C.TIME_UNSET);
            long jM9 = (jM6 - l1.y.M(this.G.f50339a)) - jMax;
            u uVar4 = k().f42715c;
            long jZ = l1.y.Z(jM9);
            j12 = -9223372036854775807L;
            long j23 = uVar4.f42696c;
            if (j23 != C.TIME_UNSET) {
                jMin = Math.min(jZ, j23);
            } else {
                t tVar = this.G.f50348j;
                if (tVar != null) {
                    long j24 = tVar.f42670c;
                    if (j24 != C.TIME_UNSET) {
                        jMin = Math.min(jZ, j24);
                    } else {
                        jMin = jZ;
                    }
                } else {
                    jMin = jZ;
                }
            }
            long jZ2 = l1.y.Z(jM9 - j22);
            if (jZ2 < j10 && jMin > j10) {
                jZ2 = j10;
            }
            boolean z17 = z11;
            long j25 = this.G.f50341c;
            if (j25 != C.TIME_UNSET) {
                jZ2 = Math.min(jZ2 + j25, jZ);
            }
            long jK = jZ2;
            long j26 = uVar4.f42695b;
            if (j26 != C.TIME_UNSET) {
                jK = l1.y.k(j26, jK, jZ);
            } else {
                t tVar2 = this.G.f50348j;
                if (tVar2 != null) {
                    long j27 = tVar2.f42669b;
                    if (j27 != C.TIME_UNSET) {
                        jK = l1.y.k(j27, jK, jZ);
                    }
                }
            }
            long j28 = jK;
            long j29 = j28 > jMin ? j28 : jMin;
            synchronized (this) {
                uVar2 = this.P;
            }
            long jK2 = uVar2.f42694a;
            if (jK2 == C.TIME_UNSET) {
                t1.c cVar5 = this.G;
                t tVar3 = cVar5.f50348j;
                if (tVar3 != null) {
                    long j30 = tVar3.f42668a;
                    if (j30 != C.TIME_UNSET) {
                        jK2 = j30;
                    } else {
                        jK2 = cVar5.f50345g;
                        if (jK2 == C.TIME_UNSET) {
                            jK2 = this.f50019o;
                        }
                    }
                } else {
                    jK2 = cVar5.f50345g;
                    if (jK2 == C.TIME_UNSET) {
                        jK2 = this.f50019o;
                    }
                }
            }
            if (jK2 < j28) {
                jK2 = j28;
            }
            if (jK2 > j29) {
                jK2 = l1.y.k(l1.y.Z(jM9 - Math.min(j17, j22 / 2)), j28, j29);
            }
            long j31 = j29;
            float f11 = uVar4.f42697d;
            if (f11 == -3.4028235E38f) {
                t tVar4 = this.G.f50348j;
                f11 = tVar4 != null ? tVar4.f42671d : -3.4028235E38f;
            }
            float f12 = uVar4.f42698e;
            if (f12 == -3.4028235E38f) {
                t tVar5 = this.G.f50348j;
                f12 = tVar5 != null ? tVar5.f42672e : -3.4028235E38f;
            }
            if (f11 == -3.4028235E38f && f12 == -3.4028235E38f) {
                t tVar6 = this.G.f50348j;
                j16 = jM9;
                z12 = z17;
                if (tVar6 == null || tVar6.f42668a == C.TIME_UNSET) {
                    f11 = 1.0f;
                    f10 = 1.0f;
                }
                t tVar7 = new t();
                tVar7.f42668a = jK2;
                tVar7.f42669b = j28;
                tVar7.f42670c = j31;
                tVar7.f42671d = f11;
                tVar7.f42672e = f10;
                uVar3 = new u(tVar7);
                synchronized (this) {
                    this.P = uVar3;
                }
                long jZ3 = l1.y.Z(jMax) + this.G.f50339a;
                synchronized (this) {
                    u uVar5 = this.P;
                }
                jM5 = j16 - l1.y.M(uVar5.f42694a);
                jMin2 = Math.min(j17, j22 / 2);
                if (jM5 < jMin2) {
                    j14 = jMin2;
                } else {
                    j14 = jM5;
                }
                j13 = jZ3;
            } else {
                j16 = jM9;
                z12 = z17;
            }
            f10 = f12;
            t tVar8 = new t();
            tVar8.f42668a = jK2;
            tVar8.f42669b = j28;
            tVar8.f42670c = j31;
            tVar8.f42671d = f11;
            tVar8.f42672e = f10;
            uVar3 = new u(tVar8);
            synchronized (this) {
                this.P = uVar3;
                long jZ4 = l1.y.Z(jMax) + this.G.f50339a;
                synchronized (this) {
                    u uVar6 = this.P;
                    jM5 = j16 - l1.y.M(uVar6.f42694a);
                    jMin2 = Math.min(j17, j22 / 2);
                    if (jM5 < jMin2) {
                        j14 = jMin2;
                    } else {
                        j14 = jM5;
                    }
                    j13 = jZ4;
                }
            }
            q(new d(j, j13, j, i, jM, j22, j14, cVar, yVarK, uVar));
            if (this.f50013h) {
            }
            this.D.removeCallbacks(cVar2);
            if (z12) {
                Handler handler = this.D;
                t1.c cVar6 = this.G;
                long jB2 = l1.y.B(this.K);
                int size2 = cVar6.f50350m.size() - 1;
                t1.h hVarA3 = cVar6.a(size2);
                long j32 = hVarA3.f50373b;
                list = hVarA3.f50374c;
                jM = l1.y.M(j32);
                jC = cVar6.c(size2);
                jM2 = l1.y.M(jB2);
                jM3 = l1.y.M(cVar6.f50339a);
                jM4 = l1.y.M(cVar6.f50343e);
                if (jM4 != j12 || jM4 >= 5000000) {
                    jM4 = 5000000;
                }
                i10 = 0;
                while (i10 < list.size()) {
                    list2 = ((t1.a) list.get(i10)).f50331c;
                    if (list2.isEmpty()) {
                        i11 = i10;
                    } else {
                        i11 = i10;
                        gVarB = ((t1.m) list2.get(0)).b();
                        if (gVarB != null) {
                            jH = (gVarB.h(jC, jM2) + (jM3 + jM)) - jM2;
                            if (jH > j10 && (jH < jM4 - 100000 || (jH > jM4 && jH < jM4 + 100000))) {
                                jM4 = jH;
                            }
                        }
                    }
                    i10 = i11 + 1;
                }
                handler.postDelayed(cVar2, com.bumptech.glide.c.j(jM4, 1000L, RoundingMode.CEILING));
            }
            if (this.H) {
                D();
                return;
            }
            if (z10) {
                cVar = this.G;
                if (cVar.f50342d) {
                    j15 = cVar.f50343e;
                    if (j15 != j12) {
                        if (j15 == j10) {
                            j15 = 5000;
                        }
                        this.D.postDelayed(this.f50026v, Math.max(j10, (this.I + j15) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
        z12 = z11;
        j12 = -9223372036854775807L;
        j13 = -9223372036854775807L;
        j14 = j10;
        long jM10 = jMax - l1.y.M(hVar.f50373b);
        t1.c cVar7 = this.G;
        long j33 = cVar7.f50339a;
        long j34 = this.K;
        int i24 = this.N;
        y yVarK = k();
        if (this.G.f50342d) {
            synchronized (this) {
                uVar = this.P;
            }
        } else {
            uVar = null;
        }
        q(new d(j33, j13, j34, i24, jM10, j22, j14, cVar7, yVarK, uVar));
        if (this.f50013h) {
            this.D.removeCallbacks(cVar2);
            if (z12) {
                Handler handler2 = this.D;
                t1.c cVar8 = this.G;
                long jB3 = l1.y.B(this.K);
                int size3 = cVar8.f50350m.size() - 1;
                t1.h hVarA4 = cVar8.a(size3);
                long j35 = hVarA4.f50373b;
                list = hVarA4.f50374c;
                jM = l1.y.M(j35);
                jC = cVar8.c(size3);
                jM2 = l1.y.M(jB3);
                jM3 = l1.y.M(cVar8.f50339a);
                jM4 = l1.y.M(cVar8.f50343e);
                if (jM4 != j12) {
                    jM4 = 5000000;
                } else {
                    jM4 = 5000000;
                }
                i10 = 0;
                while (i10 < list.size()) {
                    list2 = ((t1.a) list.get(i10)).f50331c;
                    if (list2.isEmpty()) {
                        i11 = i10;
                    } else {
                        i11 = i10;
                        gVarB = ((t1.m) list2.get(0)).b();
                        if (gVarB != null) {
                            jH = (gVarB.h(jC, jM2) + (jM3 + jM)) - jM2;
                            if (jH > j10) {
                                jM4 = jH;
                            }
                        }
                    }
                    i10 = i11 + 1;
                }
                handler2.postDelayed(cVar2, com.bumptech.glide.c.j(jM4, 1000L, RoundingMode.CEILING));
            }
            if (this.H) {
                D();
                return;
            }
            if (z10) {
                cVar = this.G;
                if (cVar.f50342d) {
                    j15 = cVar.f50343e;
                    if (j15 != j12) {
                        if (j15 == j10) {
                            j15 = 5000;
                        }
                        this.D.postDelayed(this.f50026v, Math.max(j10, (this.I + j15) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    public final void C(s1 s1Var, j2.p pVar) {
        n1.h hVar = this.f50030z;
        Uri uri = Uri.parse((String) s1Var.f45752c);
        Map map = Collections.EMPTY_MAP;
        go.k.o(uri, "The uri must be set.");
        this.A.e(new q(hVar, new n1.k(uri, 1, null, map, 0L, -1L, null, 1), 5, pVar), new b2.t(this, 2), 1);
    }

    public final void D() {
        Uri uri;
        this.D.removeCallbacks(this.f50026v);
        if (this.A.b()) {
            return;
        }
        if (this.A.c()) {
            this.H = true;
            return;
        }
        synchronized (this.f50024t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        go.k.o(uri, "The uri must be set.");
        q qVar = new q(this.f50030z, new n1.k(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f50022r);
        na.g gVar = this.f50023s;
        this.f50017m.getClass();
        this.A.e(qVar, gVar, 3);
    }

    @Override // f2.a
    public final a0 c(c0 c0Var, v9.e eVar, long j10) {
        int iIntValue = ((Integer) c0Var.f40307a).intValue() - this.N;
        i0 i0VarA = a(c0Var);
        i0 i0Var = new i0(this.f40275d.f40371c, 0, c0Var);
        int i10 = this.N + iIntValue;
        t1.c cVar = this.G;
        z zVar = this.B;
        long j11 = this.K;
        q1.j jVar = this.f40278g;
        jVar.getClass();
        b bVar = new b(i10, cVar, this.f50018n, iIntValue, this.f50015j, zVar, this.l, i0Var, this.f50017m, i0VarA, j11, this.f50029y, eVar, this.f50016k, this.f50028x, jVar);
        this.f50025u.put(i10, bVar);
        return bVar;
    }

    @Override // f2.a
    public final synchronized y k() {
        return this.O;
    }

    @Override // f2.a
    public final void m() {
        this.f50029y.maybeThrowError();
    }

    @Override // f2.a
    public final void p(z zVar) {
        this.B = zVar;
        Looper looperMyLooper = Looper.myLooper();
        q1.j jVar = this.f40278g;
        jVar.getClass();
        u1.h hVar = this.l;
        hVar.a(looperMyLooper, jVar);
        hVar.c();
        if (this.f50013h) {
            B(false);
            return;
        }
        this.f50030z = this.f50014i.createDataSource();
        this.A = new j2.m("DashMediaSource");
        this.D = l1.y.q(null);
        D();
    }

    @Override // f2.a
    public final void r(a0 a0Var) {
        b bVar = (b) a0Var;
        m mVar = bVar.f49987m;
        mVar.f50073i = true;
        mVar.f50068d.removeCallbacksAndMessages(null);
        for (g2.i iVar : bVar.f49992r) {
            iVar.q(bVar);
        }
        bVar.f49991q = null;
        this.f50025u.remove(bVar.f49976a);
    }

    @Override // f2.a
    public final void t() {
        this.H = false;
        this.f50030z = null;
        j2.m mVar = this.A;
        if (mVar != null) {
            mVar.d(null);
            this.A = null;
        }
        u uVar = k().f42715c;
        synchronized (this) {
            this.P = uVar;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = C.TIME_UNSET;
        this.L = 0;
        this.M = C.TIME_UNSET;
        this.f50025u.clear();
        k5.g gVar = this.f50018n;
        ((HashMap) gVar.f44325a).clear();
        ((HashMap) gVar.f44326b).clear();
        ((HashMap) gVar.f44327c).clear();
        this.l.release();
    }

    @Override // f2.a
    public final synchronized void w(y yVar) {
        this.O = yVar;
        this.P = yVar.f42715c;
    }

    public final void y() {
        boolean z10;
        j2.m mVar = this.A;
        rb.c cVar = new rb.c(this, 2);
        synchronized (k2.b.f44265b) {
            z10 = k2.b.f44266c;
        }
        if (z10) {
            cVar.q();
            return;
        }
        if (mVar == null) {
            mVar = new j2.m("SntpClient");
        }
        mVar.e(new jj.d(1), new b2.t(cVar, 1), 1);
    }

    public final void z(q qVar, long j10, long j11) {
        long j12 = qVar.f43678a;
        n1.k kVar = qVar.f43679b;
        n1.y yVar = qVar.f43681d;
        f2.u uVar = new f2.u(kVar, yVar.f46418c, yVar.f46419d, j10, j11, yVar.f46417b);
        this.f50017m.getClass();
        this.f50021q.c(uVar, qVar.f43680c, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }
}
