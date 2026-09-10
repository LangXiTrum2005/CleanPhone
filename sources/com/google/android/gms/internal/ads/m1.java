package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.os.Trace;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import eb.d0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f17197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f17198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f17199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f17200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f17201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f17202k;
    public Object l;

    public m1(lj1 lj1Var, f1 f1Var, g1 g1Var) {
        this.l = lj1Var;
        this.f17196e = f1Var;
        this.f17201j = g1Var;
        this.f17197f = new e1();
        this.f17198g = new ht0(0);
        this.f17199h = new ht0(0);
        ml0 ml0Var = new ml0();
        int i10 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        ml0Var.f17470a = 0;
        ml0Var.f17471b = -1;
        ml0Var.f17472c = 0;
        ml0Var.f17473d = new long[i10];
        ml0Var.f17474e = i10 - 1;
        this.f17200i = ml0Var;
        this.f17192a = C.TIME_UNSET;
        this.f17202k = lt.f17121d;
        this.f17193b = C.TIME_UNSET;
        this.f17194c = C.TIME_UNSET;
    }

    public void a(long j10, long j11) {
        final eb.d0 d0Var = (eb.d0) this.f17196e;
        l2.c cVar = (l2.c) d0Var.f39977c;
        e1 e1Var = (e1) this.f17198g;
        l2.q qVar = (l2.q) this.f17197f;
        ml0 ml0Var = (ml0) this.f17201j;
        while (true) {
            int i10 = ml0Var.f17472c;
            if (i10 == 0) {
                return;
            }
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            long j12 = ml0Var.f17473d[ml0Var.f17470a];
            Long l = (Long) ((ht0) this.f17200i).d(j12);
            if (l != null && l.longValue() != this.f17195d) {
                this.f17195d = l.longValue();
                qVar.e(2);
            }
            l2.q qVar2 = qVar;
            ml0 ml0Var2 = ml0Var;
            int iA = ((l2.q) this.f17197f).a(j12, j10, j11, this.f17195d, false, false, e1Var);
            if (iA != 5 && iA != 4) {
                ((g1) this.f17202k).a(j12, e1Var.f13801a);
            }
            if (iA == 0 || iA == 1) {
                this.f17193b = j12;
                boolean z10 = iA == 0;
                long jA = ml0Var2.a();
                i1.z0 z0Var = (i1.z0) ((ht0) this.f17199h).d(jA);
                if (z0Var != null && !z0Var.equals(i1.z0.f42722d) && !z0Var.equals((i1.z0) this.l)) {
                    this.l = z0Var;
                    i1.o oVar = new i1.o();
                    oVar.f42607t = z0Var.f42723a;
                    oVar.f42608u = z0Var.f42724b;
                    oVar.f42600m = i1.d0.n("video/raw");
                    d0Var.f39976b = new i1.p(oVar);
                    cVar.f44854i.execute(new com.unity3d.services.ads.operation.show.b(29, d0Var, z0Var));
                }
                long jNanoTime = z10 ? System.nanoTime() : e1Var.f13802b;
                qVar = qVar2;
                boolean z11 = qVar.f44926e != 3;
                qVar.f44926e = 3;
                qVar.l.getClass();
                qVar.f44928g = l1.y.M(SystemClock.elapsedRealtime());
                if (z11 && cVar.f44850e != null) {
                    final int i11 = 0;
                    cVar.f44854i.execute(new Runnable() { // from class: l2.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i12 = i11;
                            d0 d0Var2 = d0Var;
                            switch (i12) {
                                case 0:
                                    ((c) d0Var2.f39977c).f44853h.b();
                                    break;
                                default:
                                    ((c) d0Var2.f39977c).f44853h.c();
                                    break;
                            }
                        }
                    });
                }
                i1.p pVar = (i1.p) d0Var.f39976b;
                cVar.f44855j.a(jA, jNanoTime, pVar == null ? new i1.p(new i1.o()) : pVar, null);
                l2.f fVar = (l2.f) cVar.f44849d.remove();
                fVar.f44859c.J0(fVar.f44857a, fVar.f44858b, jNanoTime);
            } else {
                if (iA == 2 || iA == 3) {
                    this.f17193b = j12;
                    ml0Var2.a();
                    final int i12 = 1;
                    cVar.f44854i.execute(new Runnable() { // from class: l2.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = i12;
                            d0 d0Var2 = d0Var;
                            switch (i13) {
                                case 0:
                                    ((c) d0Var2.f39977c).f44853h.b();
                                    break;
                                default:
                                    ((c) d0Var2.f39977c).f44853h.c();
                                    break;
                            }
                        }
                    });
                    l2.f fVar2 = (l2.f) cVar.f44849d.remove();
                    l2.h hVar = fVar2.f44859c;
                    y1.j jVar = fVar2.f44857a;
                    int i13 = fVar2.f44858b;
                    Trace.beginSection("dropVideoBuffer");
                    jVar.t(i13);
                    Trace.endSection();
                    hVar.O0(0, 1);
                } else {
                    if (iA != 4) {
                        if (iA != 5) {
                            throw new IllegalStateException(String.valueOf(iA));
                        }
                        return;
                    }
                    this.f17193b = j12;
                }
                qVar = qVar2;
            }
            ml0Var = ml0Var2;
        }
    }

    public void b(long j10, long j11) {
        lj1 lj1Var = (lj1) this.l;
        n0 n0Var = (n0) lj1Var.f17037c;
        while (true) {
            ml0 ml0Var = (ml0) this.f17200i;
            int i10 = ml0Var.f17472c;
            if (i10 == 0) {
                return;
            }
            ht0 ht0Var = (ht0) this.f17199h;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            long j12 = ml0Var.f17473d[ml0Var.f17470a];
            Long l = (Long) ht0Var.j(j12);
            if (l != null && l.longValue() != this.f17195d) {
                this.f17195d = l.longValue();
                ((f1) this.f17196e).a(2);
            }
            f1 f1Var = (f1) this.f17196e;
            long j13 = this.f17195d;
            e1 e1Var = (e1) this.f17197f;
            int iF = f1Var.f(j12, j10, j11, j13, false, false, e1Var);
            if (iF != 5 && iF != 4) {
                ((g1) this.f17201j).d(j12, e1Var.f13801a);
            }
            if (iF == 0 || iF == 1) {
                this.f17193b = j12;
                long jB = ml0Var.b();
                lt ltVar = (lt) ((ht0) this.f17198g).j(jB);
                if (ltVar != null && !ltVar.equals(lt.f17121d) && !ltVar.equals((lt) this.f17202k)) {
                    this.f17202k = ltVar;
                    i12 i12Var = new i12();
                    i12Var.f15518u = ltVar.f17122a;
                    i12Var.f15519v = ltVar.f17123b;
                    i12Var.e("video/raw");
                    lj1Var.f17036b = new g22(i12Var);
                    n0Var.f17603i.execute(new m0(lj1Var, ltVar));
                }
                long jNanoTime = iF == 0 ? System.nanoTime() : e1Var.f13802b;
                int i11 = f1Var.f14159d;
                f1Var.f14159d = 3;
                f1Var.f14166k.getClass();
                f1Var.f14161f = uu0.t(SystemClock.elapsedRealtime());
                if ((i11 != 3) && n0Var.f17599e != null) {
                    n0Var.f17603i.execute(new m0(lj1Var, 0));
                }
                g22 g22Var = (g22) lj1Var.f17036b;
                if (g22Var == null) {
                    g22Var = new g22(new i12());
                }
                long j14 = jNanoTime;
                n0Var.f17604j.a(jB, j14, g22Var, null);
                s0 s0Var = (s0) n0Var.f17598d.remove();
                s0Var.f19749c.u0(s0Var.f19747a, s0Var.f19748b, j14);
            } else if (iF == 2 || iF == 3) {
                this.f17193b = j12;
                ml0Var.b();
                n0Var.f17603i.execute(new m0(lj1Var, 1));
                ((s0) n0Var.f17598d.remove()).a();
            } else if (iF != 4) {
                return;
            } else {
                this.f17193b = j12;
            }
        }
    }

    public m1(eb.d0 d0Var, l2.q qVar, g1 g1Var) {
        this.f17196e = d0Var;
        this.f17197f = qVar;
        this.f17202k = g1Var;
        this.f17198g = new e1();
        this.f17199h = new ht0(1);
        this.f17200i = new ht0(1);
        ml0 ml0Var = new ml0();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        ml0Var.f17470a = 0;
        ml0Var.f17471b = -1;
        ml0Var.f17472c = 0;
        ml0Var.f17473d = new long[iHighestOneBit];
        ml0Var.f17474e = iHighestOneBit - 1;
        this.f17201j = ml0Var;
        this.f17192a = C.TIME_UNSET;
        this.l = i1.z0.f42722d;
        this.f17193b = C.TIME_UNSET;
        this.f17194c = C.TIME_UNSET;
    }
}
