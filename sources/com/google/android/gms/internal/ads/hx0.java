package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.hx0;
import ea.f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 implements k9.b, k9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15422f;

    public hx0(Context context, Looper looper, s6 s6Var) {
        this.f15417a = 0;
        this.f15420d = new md0(context.getApplicationContext(), 28);
        this.f15421e = s6Var.u(looper, null);
        this.f15422f = s6Var.u(Looper.getMainLooper(), null);
    }

    public static void a(Object obj, ArrayList arrayList, al.f fVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) fVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, fVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:63:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:1: B:30:0x0071->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static ql.h b(zk.m0 m0Var) {
        ?? arrayList;
        ql.g gVar;
        pm.y yVarF;
        kotlin.jvm.internal.n.f(m0Var, "<this>");
        if (!(m0Var instanceof ml.g0)) {
            return null;
        }
        List upperBounds = m0Var.getUpperBounds();
        kotlin.jvm.internal.n.e(upperBounds, "this.upperBounds");
        List<sm.c> list = upperBounds;
        boolean z10 = list instanceof Collection;
        if (z10 && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!qm.g.B((sm.c) it.next())) {
                if (z10 && list.isEmpty()) {
                    if (!z10) {
                    }
                    for (sm.c cVar : list) {
                        kotlin.jvm.internal.n.f(cVar, "<this>");
                        if (pm.c.f((pm.y) cVar) != null) {
                            arrayList = new ArrayList();
                            for (sm.c cVar2 : list) {
                                kotlin.jvm.internal.n.f(cVar2, "<this>");
                                yVarF = pm.c.f((pm.y) cVar2);
                                if (yVarF != null) {
                                    arrayList.add(yVarF);
                                }
                            }
                        }
                    }
                    return null;
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (!z10 && list.isEmpty()) {
                            return null;
                        }
                        while (r2.hasNext()) {
                            kotlin.jvm.internal.n.f(cVar, "<this>");
                            if (pm.c.f((pm.y) cVar) != null) {
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    kotlin.jvm.internal.n.f(cVar2, "<this>");
                                    yVarF = pm.c.f((pm.y) cVar2);
                                    if (yVarF != null) {
                                        arrayList.add(yVarF);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    if (e((sm.c) it2.next()) != null) {
                        arrayList = upperBounds;
                    }
                }
                Iterable iterable = (Iterable) arrayList;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it3 = iterable.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            gVar = ql.g.f49144b;
                            break;
                        }
                        if (!qm.g.H((sm.c) it3.next())) {
                            gVar = ql.g.f49145c;
                            break;
                        }
                    }
                } else {
                    gVar = ql.g.f49144b;
                    break;
                }
                return new ql.h(gVar, arrayList != upperBounds);
            }
        }
        return null;
    }

    public static yl.e c(pm.c0 c0Var) {
        rm.f fVar = pm.y0.f48489a;
        zk.g gVarE = c0Var.P().e();
        zk.e eVar = gVarE instanceof zk.e ? (zk.e) gVarE : null;
        if (eVar != null) {
            return bm.e.g(eVar);
        }
        return null;
    }

    public static ql.g e(sm.c cVar) {
        pm.c0 c0VarH;
        pm.c0 c0VarH2;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        pm.r rVarG = qm.g.g(cVar);
        if (rVarG == null || (c0VarH = qm.g.N(rVarG)) == null) {
            c0VarH = qm.g.h(cVar);
            kotlin.jvm.internal.n.c(c0VarH);
        }
        if (qm.g.F(c0VarH)) {
            return ql.g.f49144b;
        }
        pm.r rVarG2 = qm.g.g(cVar);
        if (rVarG2 == null || (c0VarH2 = qm.g.Y(rVarG2)) == null) {
            c0VarH2 = qm.g.h(cVar);
            kotlin.jvm.internal.n.c(c0VarH2);
        }
        if (qm.g.F(c0VarH2)) {
            return null;
        }
        return ql.g.f49145c;
    }

    @Override // k9.b
    public void d(Bundle bundle) {
        synchronized (this.f15422f) {
            try {
                if (this.f15419c) {
                    return;
                }
                this.f15419c = true;
                try {
                    h01 h01Var = (h01) ((e01) this.f15420d).getService();
                    d01 d01Var = new d01(1, ((a01) this.f15421e).b());
                    Parcel parcelQ = h01Var.q();
                    rh.c(parcelQ, d01Var);
                    h01Var.m0(parcelQ, 2);
                } catch (Exception unused) {
                } finally {
                    k();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int[] f() {
        synchronized (this) {
            try {
                if (this.f15418b && !this.f15419c) {
                    int length = ((long[]) this.f15420d).length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f15419c = true;
                            this.f15418b = false;
                            return (int[]) this.f15422f;
                        }
                        boolean z10 = ((long[]) this.f15420d)[i10] > 0;
                        boolean[] zArr = (boolean[]) this.f15421e;
                        if (z10 != zArr[i10]) {
                            int[] iArr = (int[]) this.f15422f;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            ((int[]) this.f15422f)[i10] = 0;
                        }
                        zArr[i10] = z10;
                        i10++;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(final boolean z10, final boolean z11) {
        l1.w wVar = (l1.w) this.f15421e;
        if (z10 && z11) {
            wVar.c(new Runnable() { // from class: l1.z
                @Override // java.lang.Runnable
                public final void run() {
                    f2.a((f2) this.f44841a.f15420d, z10, z11);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        l1.w wVar2 = (l1.w) this.f15422f;
        wVar2.f44825a.postDelayed(new com.unity3d.services.ads.operation.show.b(27, this, atomicBoolean), 1000L);
        wVar.c(new Runnable() { // from class: l1.a0
            @Override // java.lang.Runnable
            public final void run() {
                hx0 hx0Var = this.f44771a;
                hx0Var.getClass();
                atomicBoolean.set(false);
                f2.a((f2) hx0Var.f15420d, z10, z11);
            }
        });
    }

    public void h(boolean z10) {
        if (this.f15419c == z10) {
            return;
        }
        this.f15419c = z10;
        if (this.f15418b) {
            g(true, z10);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, wj.d] */
    public ArrayList i(sm.c cVar) {
        com.google.android.gms.internal.measurement.nf nfVar = (com.google.android.gms.internal.measurement.nf) this.f15421e;
        il.v vVar = (il.v) nfVar.f23785e.getValue();
        il.c cVar2 = ((ll.a) nfVar.f23782b).f45500q;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        ql.a aVar = new ql.a(cVar, cVar2.b(vVar, ((pm.y) cVar).getAnnotations()), null);
        al.f fVar = new al.f(this, 23);
        ArrayList arrayList = new ArrayList(1);
        a(aVar, arrayList, fVar);
        return arrayList;
    }

    public void j(boolean z10) {
        if (this.f15419c == z10) {
            return;
        }
        this.f15419c = z10;
        if (this.f15418b) {
            l(true, z10);
        }
    }

    public void k() {
        synchronized (this.f15422f) {
            try {
                e01 e01Var = (e01) this.f15420d;
                if (e01Var.isConnected() || e01Var.isConnecting()) {
                    e01Var.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(final boolean z10, final boolean z11) {
        ys0 ys0Var = (ys0) this.f15421e;
        if (z10 && z11) {
            ys0Var.e(new Runnable() { // from class: com.google.android.gms.internal.ads.ov0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ((md0) this.f18385a.f15420d).f(z10, z11);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ys0 ys0Var2 = (ys0) this.f15422f;
        ys0Var2.f22362a.postDelayed(new gm0(10, this, atomicBoolean), 1000L);
        ys0Var.e(new Runnable() { // from class: com.google.android.gms.internal.ads.dv0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                hx0 hx0Var = this.f13748a;
                hx0Var.getClass();
                atomicBoolean.set(false);
                ((md0) hx0Var.f15420d).f(z10, z11);
            }
        });
    }

    public String toString() {
        switch (this.f15417a) {
            case 5:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f15418b + ", prettyPrintIndent='" + ((String) this.f15420d) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f15421e) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f15419c + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((sn.a) this.f15422f) + ')';
            default:
                return super.toString();
        }
    }

    public hx0(Context context, Looper looper, a01 a01Var) {
        this.f15417a = 1;
        this.f15422f = new Object();
        this.f15418b = false;
        this.f15419c = false;
        this.f15421e = a01Var;
        this.f15420d = new e01(context, looper, this, this, 12800000);
    }

    public hx0(al.a aVar, boolean z10, com.google.android.gms.internal.measurement.nf containerContext, il.a aVar2, boolean z11) {
        this.f15417a = 4;
        kotlin.jvm.internal.n.f(containerContext, "containerContext");
        this.f15420d = aVar;
        this.f15418b = z10;
        this.f15421e = containerContext;
        this.f15422f = aVar2;
        this.f15419c = z11;
    }

    public hx0() {
        this.f15417a = 5;
        this.f15418b = true;
        this.f15420d = "    ";
        this.f15421e = "type";
        this.f15419c = true;
        this.f15422f = sn.a.f50280a;
    }

    public hx0(Context context, Looper looper, l1.u uVar) {
        this.f15417a = 3;
        this.f15420d = new ea.f2(context.getApplicationContext(), 26);
        this.f15421e = uVar.a(looper, null);
        this.f15422f = uVar.a(Looper.getMainLooper(), null);
    }

    public hx0(int i10) {
        this.f15417a = 2;
        long[] jArr = new long[i10];
        this.f15420d = jArr;
        boolean[] zArr = new boolean[i10];
        this.f15421e = zArr;
        this.f15422f = new int[i10];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    @Override // k9.b
    public void q(int i10) {
    }

    @Override // k9.c
    public void r(ConnectionResult connectionResult) {
    }
}
