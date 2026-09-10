package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.z40;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d8 implements ta.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f23389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f23390e;

    public /* synthetic */ d8(Object obj, ListenableFuture listenableFuture, ce ceVar, Executor executor, int i10) {
        this.f23386a = i10;
        this.f23388c = obj;
        this.f23387b = listenableFuture;
        this.f23389d = ceVar;
        this.f23390e = executor;
    }

    public b6 a(b6 b6Var) {
        return ((h6) this.f23388c).e(this, b6Var);
    }

    public b6 b(d8 d8Var, qa... qaVarArr) {
        b6 b6VarG = b6.S8;
        for (qa qaVar : qaVarArr) {
            b6VarG = h.g(qaVar);
            yg.o((d8) this.f23389d);
            if ((b6VarG instanceof c6) || (b6VarG instanceof a6)) {
                b6VarG = ((h6) this.f23388c).e(d8Var, b6VarG);
            }
        }
        return b6VarG;
    }

    public b6 c(m1 m1Var) {
        b6 b6VarE = b6.S8;
        Iterator itP = m1Var.p();
        while (itP.hasNext()) {
            b6VarE = ((h6) this.f23388c).e(this, m1Var.r(((Integer) itP.next()).intValue()));
            if (b6VarE instanceof t2) {
                break;
            }
        }
        return b6VarE;
    }

    @Override // ta.y
    public ListenableFuture call() {
        int i10 = this.f23386a;
        Object obj = this.f23387b;
        ta.c0 c0Var = ta.c0.f50592a;
        int i11 = 4;
        Object obj2 = this.f23390e;
        Object obj3 = this.f23389d;
        Object obj4 = this.f23388c;
        switch (i10) {
            case 2:
                final z40 z40Var = (z40) obj4;
                final int i12 = 0;
                final ta.s sVarG = ta.k0.g((ListenableFuture) obj, new pf(z40Var, i12), c0Var);
                final ta.s sVarG2 = ta.k0.g(sVarG, (ce) obj3, (Executor) obj2);
                ta.z zVar = new ta.z() { // from class: com.google.android.gms.internal.measurement.rf
                    @Override // ta.z
                    public final ListenableFuture apply(Object obj5) {
                        switch (i12) {
                            case 0:
                                z40 z40Var2 = (z40) z40Var;
                                ta.s sVar = (ta.s) sVarG;
                                ta.s sVar2 = (ta.s) sVarG2;
                                if (ta.k0.b(sVar).equals(ta.k0.b(sVar2))) {
                                    return ta.k0.d(obj5);
                                }
                                ce ceVar = new ce(2, z40Var2, sVar2);
                                int i13 = tg.f23998a;
                                ta.s sVarG3 = ta.k0.g(sVar2, new ce(4, dg.a(), ceVar), (ta.u0) z40Var2.f22494d);
                                synchronized (z40Var2.f22498h) {
                                    break;
                                }
                                return sVarG3;
                            default:
                                mf mfVar = (mf) z40Var;
                                return mfVar.f23744c.c((ce) sVarG, (Executor) sVarG2);
                        }
                    }
                };
                int i13 = tg.f23998a;
                return ta.k0.g(sVarG2, new ce(i11, dg.a(), zVar), c0Var);
            default:
                final mf mfVar = (mf) obj4;
                final ce ceVar = (ce) obj3;
                final Executor executor = (Executor) obj2;
                final int i14 = 1;
                ta.z zVar2 = new ta.z() { // from class: com.google.android.gms.internal.measurement.rf
                    @Override // ta.z
                    public final ListenableFuture apply(Object obj5) {
                        switch (i14) {
                            case 0:
                                z40 z40Var2 = (z40) mfVar;
                                ta.s sVar = (ta.s) ceVar;
                                ta.s sVar2 = (ta.s) executor;
                                if (ta.k0.b(sVar).equals(ta.k0.b(sVar2))) {
                                    return ta.k0.d(obj5);
                                }
                                ce ceVar2 = new ce(2, z40Var2, sVar2);
                                int i15 = tg.f23998a;
                                ta.s sVarG3 = ta.k0.g(sVar2, new ce(4, dg.a(), ceVar2), (ta.u0) z40Var2.f22494d);
                                synchronized (z40Var2.f22498h) {
                                    break;
                                }
                                return sVarG3;
                            default:
                                mf mfVar2 = (mf) mfVar;
                                return mfVar2.f23744c.c((ce) ceVar, (Executor) executor);
                        }
                    }
                };
                int i15 = tg.f23998a;
                return ta.k0.g((ta.r) obj, new ce(i11, dg.a(), zVar2), c0Var);
        }
    }

    public d8 d() {
        return new d8(this, (h6) this.f23388c);
    }

    public boolean e(String str) {
        if (((HashMap) this.f23389d).containsKey(str)) {
            return true;
        }
        d8 d8Var = (d8) this.f23387b;
        if (d8Var != null) {
            return d8Var.e(str);
        }
        return false;
    }

    public void f(String str, b6 b6Var) {
        d8 d8Var;
        HashMap map = (HashMap) this.f23389d;
        if (!map.containsKey(str) && (d8Var = (d8) this.f23387b) != null && d8Var.e(str)) {
            d8Var.f(str, b6Var);
        } else {
            if (((HashMap) this.f23390e).containsKey(str)) {
                return;
            }
            if (b6Var == null) {
                map.remove(str);
            } else {
                map.put(str, b6Var);
            }
        }
    }

    public void g(String str, b6 b6Var) {
        HashMap map = (HashMap) this.f23389d;
        if (((HashMap) this.f23390e).containsKey(str)) {
            return;
        }
        if (b6Var == null) {
            map.remove(str);
        } else {
            map.put(str, b6Var);
        }
    }

    public b6 h(String str) {
        HashMap map = (HashMap) this.f23389d;
        if (map.containsKey(str)) {
            return (b6) map.get(str);
        }
        d8 d8Var = (d8) this.f23387b;
        if (d8Var != null) {
            return d8Var.h(str);
        }
        throw new IllegalArgumentException(wi.d.h(str, " is not defined"));
    }

    public d8() {
        this.f23386a = 0;
        h6 h6Var = new h6(0);
        this.f23388c = h6Var;
        d8 d8Var = new d8(null, h6Var);
        this.f23389d = d8Var;
        this.f23387b = d8Var.d();
        q6 q6Var = new q6(5);
        this.f23390e = q6Var;
        d8Var.f("require", new fg(q6Var));
        ((HashMap) q6Var.f23891b).put("internal.platform", v7.f24079b);
        d8Var.f("runtime.counter", new o3(Double.valueOf(0.0d)));
    }

    public d8(d8 d8Var, h6 h6Var) {
        this.f23386a = 1;
        this.f23389d = new HashMap();
        this.f23390e = new HashMap();
        this.f23387b = d8Var;
        this.f23388c = h6Var;
    }
}
