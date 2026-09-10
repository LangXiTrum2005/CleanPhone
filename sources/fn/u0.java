package fn;

import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.play_billing.q1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class u0 extends fs1 implements m0, e, gn.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f41165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final en.a f41167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f41168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f41170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41172k;

    public u0(int i10, int i11, en.a aVar) {
        this.f41165d = i10;
        this.f41166e = i11;
        this.f41167f = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void e0(u0 u0Var, f fVar, ak.f fVar2) throws Throwable {
        t0 t0Var;
        u0 u0Var2;
        Throwable th2;
        v0 v0Var;
        f fVar3;
        cn.f1 f1Var;
        if (fVar2 instanceof t0) {
            t0Var = (t0) fVar2;
            int i10 = t0Var.l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t0Var.l = i10 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(u0Var, fVar2);
            }
        } else {
            t0Var = new t0(u0Var, fVar2);
        }
        Object obj = t0Var.f41159j;
        int i11 = t0Var.l;
        bk.a aVar = bk.a.f5708a;
        if (i11 != 0) {
            if (i11 == 1) {
                v0Var = t0Var.f41157h;
                f fVar4 = t0Var.f41156g;
                u0 u0Var3 = t0Var.f41155f;
                try {
                    t9.e.z(obj);
                    fVar3 = fVar4;
                    u0Var = u0Var3;
                    try {
                        f1Var = (cn.f1) t0Var.getContext().get(cn.e1.f6705a);
                    } catch (Throwable th3) {
                        u0Var2 = u0Var;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    u0Var2 = u0Var3;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cn.f1 f1Var2 = t0Var.f41158i;
                v0Var = t0Var.f41157h;
                f fVar5 = t0Var.f41156g;
                u0Var2 = t0Var.f41155f;
                try {
                    t9.e.z(obj);
                    fVar3 = fVar5;
                    f1Var = f1Var2;
                    u0Var = u0Var2;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            u0Var2.g(v0Var);
            throw th2;
        }
        t9.e.z(obj);
        v0 v0Var2 = (v0) u0Var.d();
        try {
            if (fVar instanceof d1) {
                t0Var.f41155f = u0Var;
                t0Var.f41156g = fVar;
                t0Var.f41157h = v0Var2;
                t0Var.l = 1;
                if (((d1) fVar).b(t0Var) == aVar) {
                    return;
                }
            }
            fVar3 = fVar;
            v0Var = v0Var2;
            f1Var = (cn.f1) t0Var.getContext().get(cn.e1.f6705a);
        } catch (Throwable th6) {
            u0Var2 = u0Var;
            th2 = th6;
            v0Var = v0Var2;
        }
        while (true) {
            Object objM0 = u0Var.m0(v0Var);
            if (objM0 == g.f41070a) {
                t0Var.f41155f = u0Var;
                t0Var.f41156g = fVar3;
                t0Var.f41157h = v0Var;
                t0Var.f41158i = f1Var;
                t0Var.l = 2;
                if (u0Var.c0(v0Var, t0Var) == aVar) {
                    return;
                }
            } else {
                if (f1Var != null && !f1Var.isActive()) {
                    throw f1Var.h();
                }
                t0Var.f41155f = u0Var;
                t0Var.f41156g = fVar3;
                t0Var.f41157h = v0Var;
                t0Var.f41158i = f1Var;
                t0Var.l = 3;
                if (fVar3.emit(objM0, t0Var) == aVar) {
                    return;
                }
            }
        }
    }

    @Override // fn.m0
    public final boolean a(Object obj) {
        int i10;
        boolean z10;
        ak.f[] fVarArrH0 = gn.b.f41981a;
        synchronized (this) {
            if (k0(obj)) {
                fVarArrH0 = h0(fVarArrH0);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (ak.f fVar : fVarArrH0) {
            if (fVar != null) {
                fVar.resumeWith(wj.r.f53297a);
            }
        }
        return z10;
    }

    @Override // gn.l
    public final e b(ak.k kVar, int i10, en.a aVar) {
        return g.n(this, kVar, i10, aVar);
    }

    public final Object c0(v0 v0Var, t0 t0Var) {
        cn.l lVar = new cn.l(1, q1.t(t0Var));
        lVar.t();
        synchronized (this) {
            try {
                if (l0(v0Var) < 0) {
                    v0Var.f41177b = lVar;
                } else {
                    lVar.resumeWith(wj.r.f53297a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objS = lVar.s();
        return objS == bk.a.f5708a ? objS : wj.r.f53297a;
    }

    @Override // fn.e
    public final Object collect(f fVar, ak.f fVar2) throws Throwable {
        e0(this, fVar, fVar2);
        return bk.a.f5708a;
    }

    public final void d0() {
        if (this.f41166e != 0 || this.f41172k > 1) {
            Object[] objArr = this.f41168g;
            kotlin.jvm.internal.n.c(objArr);
            while (this.f41172k > 0) {
                long jI0 = i0();
                int i10 = this.f41171j;
                int i11 = this.f41172k;
                if (objArr[((int) ((jI0 + ((long) (i10 + i11))) - 1)) & (objArr.length - 1)] != g.f41070a) {
                    return;
                }
                this.f41172k = i11 - 1;
                g.f(objArr, i0() + ((long) (this.f41171j + this.f41172k)), null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final gn.c e() {
        v0 v0Var = new v0();
        v0Var.f41176a = -1L;
        return v0Var;
    }

    @Override // fn.m0, fn.f
    public final Object emit(Object obj, ak.f fVar) throws Throwable {
        u0 u0Var;
        Throwable th2;
        ak.f[] fVarArrH0;
        s0 s0Var;
        if (a(obj)) {
            return wj.r.f53297a;
        }
        cn.l lVar = new cn.l(1, q1.t(fVar));
        lVar.t();
        ak.f[] fVarArrH1 = gn.b.f41981a;
        synchronized (this) {
            try {
                if (k0(obj)) {
                    try {
                        lVar.resumeWith(wj.r.f53297a);
                        fVarArrH0 = h0(fVarArrH1);
                        s0Var = null;
                        u0Var = this;
                    } catch (Throwable th3) {
                        th2 = th3;
                        u0Var = this;
                        throw th2;
                    }
                } else {
                    try {
                        u0Var = this;
                        try {
                            s0 s0Var2 = new s0(u0Var, i0() + ((long) (this.f41171j + this.f41172k)), obj, lVar);
                            u0Var.g0(s0Var2);
                            u0Var.f41172k++;
                            if (u0Var.f41166e == 0) {
                                fVarArrH1 = u0Var.h0(fVarArrH1);
                            }
                            fVarArrH0 = fVarArrH1;
                            s0Var = s0Var2;
                        } catch (Throwable th4) {
                            th = th4;
                            th2 = th;
                            throw th2;
                        }
                    } catch (Throwable th5) {
                        u0Var = this;
                        th2 = th5;
                        throw th2;
                    }
                }
                if (s0Var != null) {
                    lVar.w(new cn.h(s0Var, 2));
                }
                for (ak.f fVar2 : fVarArrH0) {
                    if (fVar2 != null) {
                        fVar2.resumeWith(wj.r.f53297a);
                    }
                }
                Object objS = lVar.s();
                bk.a aVar = bk.a.f5708a;
                if (objS != aVar) {
                    objS = wj.r.f53297a;
                }
                return objS == aVar ? objS : wj.r.f53297a;
            } catch (Throwable th6) {
                th = th6;
                u0Var = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final gn.c[] f() {
        return new v0[2];
    }

    public final void f0() {
        gn.c[] cVarArr;
        Object[] objArr = this.f41168g;
        kotlin.jvm.internal.n.c(objArr);
        g.f(objArr, i0(), null);
        this.f41171j--;
        long jI0 = i0() + 1;
        if (this.f41169h < jI0) {
            this.f41169h = jI0;
        }
        if (this.f41170i < jI0) {
            if (this.f14523a != 0 && (cVarArr = (gn.c[]) this.f14525c) != null) {
                for (gn.c cVar : cVarArr) {
                    if (cVar != null) {
                        v0 v0Var = (v0) cVar;
                        long j10 = v0Var.f41176a;
                        if (0 <= j10 && j10 < jI0) {
                            v0Var.f41176a = jI0;
                        }
                    }
                }
            }
            this.f41170i = jI0;
        }
    }

    public final void g0(Object obj) {
        int i10 = this.f41171j + this.f41172k;
        Object[] objArrJ0 = this.f41168g;
        if (objArrJ0 == null) {
            objArrJ0 = j0(0, 2, null);
        } else if (i10 >= objArrJ0.length) {
            objArrJ0 = j0(i10, objArrJ0.length * 2, objArrJ0);
        }
        g.f(objArrJ0, i0() + ((long) i10), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ak.f[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final ak.f[] h0(ak.f[] fVarArr) {
        gn.c[] cVarArr;
        v0 v0Var;
        cn.l lVar;
        int length = fVarArr.length;
        if (this.f14523a != 0 && (cVarArr = (gn.c[]) this.f14525c) != null) {
            int length2 = cVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                gn.c cVar = cVarArr[i10];
                if (cVar == null || (lVar = (v0Var = (v0) cVar).f41177b) == null || l0(v0Var) < 0) {
                    fVarArr = fVarArr;
                } else {
                    if (length >= fVarArr.length) {
                        fVarArr = fVarArr;
                        fVarArr = fVarArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) fVarArr, Math.max(2, fVarArr.length * 2));
                        kotlin.jvm.internal.n.e(objArrCopyOf, "copyOf(...)");
                        fVarArr = objArrCopyOf;
                    }
                    fVarArr = fVarArr;
                    fVarArr = fVarArr;
                    ((ak.f[]) fVarArr)[length] = lVar;
                    v0Var.f41177b = null;
                    length++;
                }
                i10++;
                fVarArr = fVarArr;
            }
            fVarArr = fVarArr;
        }
        return (ak.f[]) fVarArr;
    }

    public final long i0() {
        return Math.min(this.f41170i, this.f41169h);
    }

    public final Object[] j0(int i10, int i11, Object[] objArr) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f41168g = objArr2;
        if (objArr != null) {
            long jI0 = i0();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jI0;
                g.f(objArr2, j10, objArr[((int) j10) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    public final boolean k0(Object obj) {
        int i10;
        long jI0;
        long j10;
        int i11 = this.f14523a;
        int i12 = this.f41165d;
        if (i11 != 0) {
            int i13 = this.f41171j;
            int i14 = this.f41166e;
            if (i13 < i14 || this.f41170i > this.f41169h) {
                g0(obj);
                i10 = this.f41171j + 1;
                this.f41171j = i10;
                if (i10 > i14) {
                    f0();
                }
                jI0 = i0() + ((long) this.f41171j);
                j10 = this.f41169h;
                if (((int) (jI0 - j10)) > i12) {
                    n0(1 + j10, this.f41170i, i0() + ((long) this.f41171j), i0() + ((long) this.f41171j) + ((long) this.f41172k));
                }
            } else {
                int iOrdinal = this.f41167f.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    g0(obj);
                    i10 = this.f41171j + 1;
                    this.f41171j = i10;
                    if (i10 > i14) {
                        f0();
                    }
                    jI0 = i0() + ((long) this.f41171j);
                    j10 = this.f41169h;
                    if (((int) (jI0 - j10)) > i12) {
                        n0(1 + j10, this.f41170i, i0() + ((long) this.f41171j), i0() + ((long) this.f41171j) + ((long) this.f41172k));
                    }
                } else if (iOrdinal != 2) {
                    throw new aa.b((byte) 0, 20);
                }
            }
        } else if (i12 != 0) {
            g0(obj);
            int i15 = this.f41171j + 1;
            this.f41171j = i15;
            if (i15 > i12) {
                f0();
            }
            this.f41170i = i0() + ((long) this.f41171j);
            return true;
        }
        return true;
    }

    public final long l0(v0 v0Var) {
        long j10 = v0Var.f41176a;
        if (j10 >= i0() + ((long) this.f41171j) && (this.f41166e > 0 || j10 > i0() || this.f41172k == 0)) {
            return -1L;
        }
        return j10;
    }

    public final Object m0(v0 v0Var) {
        Object obj;
        ak.f[] fVarArrO0 = gn.b.f41981a;
        synchronized (this) {
            try {
                long jL0 = l0(v0Var);
                if (jL0 < 0) {
                    obj = g.f41070a;
                } else {
                    long j10 = v0Var.f41176a;
                    Object[] objArr = this.f41168g;
                    kotlin.jvm.internal.n.c(objArr);
                    Object obj2 = objArr[((int) jL0) & (objArr.length - 1)];
                    if (obj2 instanceof s0) {
                        obj2 = ((s0) obj2).f41149c;
                    }
                    v0Var.f41176a = jL0 + 1;
                    Object obj3 = obj2;
                    fVarArrO0 = o0(j10);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (ak.f fVar : fVarArrO0) {
            if (fVar != null) {
                fVar.resumeWith(wj.r.f53297a);
            }
        }
        return obj;
    }

    public final void n0(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jI0 = i0(); jI0 < jMin; jI0++) {
            Object[] objArr = this.f41168g;
            kotlin.jvm.internal.n.c(objArr);
            g.f(objArr, jI0, null);
        }
        this.f41169h = j10;
        this.f41170i = j11;
        this.f41171j = (int) (j12 - jMin);
        this.f41172k = (int) (j13 - j12);
    }

    public final ak.f[] o0(long j10) {
        int i10;
        long j11;
        ak.f[] fVarArr;
        ak.f[] fVarArr2;
        gn.c[] cVarArr;
        hn.u uVar = g.f41070a;
        ak.f[] fVarArr3 = gn.b.f41981a;
        if (j10 <= this.f41170i) {
            long jI0 = i0();
            long j12 = ((long) this.f41171j) + jI0;
            int i11 = this.f41166e;
            if (i11 == 0 && this.f41172k > 0) {
                j12++;
            }
            int i12 = 0;
            if (this.f14523a != 0 && (cVarArr = (gn.c[]) this.f14525c) != null) {
                for (gn.c cVar : cVarArr) {
                    if (cVar != null) {
                        long j13 = ((v0) cVar).f41176a;
                        if (0 <= j13 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.f41170i) {
                long jI1 = i0() + ((long) this.f41171j);
                int iMin = this.f14523a > 0 ? Math.min(this.f41172k, i11 - ((int) (jI1 - j12))) : this.f41172k;
                long j14 = ((long) this.f41172k) + jI1;
                if (iMin > 0) {
                    ak.f[] fVarArr4 = new ak.f[iMin];
                    j11 = 1;
                    Object[] objArr = this.f41168g;
                    kotlin.jvm.internal.n.c(objArr);
                    long j15 = jI1;
                    while (true) {
                        if (jI1 >= j14) {
                            fVarArr2 = fVarArr4;
                            i10 = i11;
                            break;
                        }
                        fVarArr2 = fVarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jI1)];
                        if (obj != uVar) {
                            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            s0 s0Var = (s0) obj;
                            int i13 = i12 + 1;
                            i10 = i11;
                            fVarArr2[i12] = s0Var.f41150d;
                            g.f(objArr, jI1, uVar);
                            g.f(objArr, j15, s0Var.f41149c);
                            j15++;
                            if (i13 >= iMin) {
                                break;
                            }
                            i12 = i13;
                        } else {
                            i10 = i11;
                        }
                        jI1++;
                        fVarArr4 = fVarArr2;
                        i11 = i10;
                    }
                    jI1 = j15;
                    fVarArr = fVarArr2;
                } else {
                    i10 = i11;
                    j11 = 1;
                    fVarArr = fVarArr3;
                }
                long jMax = Math.max(this.f41169h, Math.max(jI0, jI1 - ((long) this.f41165d)));
                if (i10 == 0 && jMax < j14) {
                    Object[] objArr2 = this.f41168g;
                    kotlin.jvm.internal.n.c(objArr2);
                    if (kotlin.jvm.internal.n.a(objArr2[((int) jMax) & (objArr2.length - 1)], uVar)) {
                        jI1 += j11;
                        jMax += j11;
                    }
                }
                long j16 = jI1;
                n0(jMax, this.f14523a == 0 ? j16 : j12, j16, j14);
                d0();
                return fVarArr.length == 0 ? fVarArr : h0(fVarArr);
            }
        }
        return fVarArr3;
    }
}
