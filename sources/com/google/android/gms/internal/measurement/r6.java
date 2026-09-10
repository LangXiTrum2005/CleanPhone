package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8 f23919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d8 f23920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.e f23921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h6 f23922d;

    public r6() {
        d8 d8Var = new d8();
        this.f23919a = d8Var;
        this.f23920b = ((d8) d8Var.f23387b).d();
        this.f23921c = new v9.e(5);
        this.f23922d = new h6(9);
        a aVar = new a(this, 1);
        q6 q6Var = (q6) d8Var.f23390e;
        ((HashMap) q6Var.f23891b).put("internal.registerCallback", aVar);
        ((HashMap) q6Var.f23891b).put("internal.eventLogger", new a(this, 0));
    }

    public final boolean a(b bVar) throws g7 {
        v9.e eVar = this.f23921c;
        try {
            eVar.f52503b = bVar;
            eVar.f52504c = bVar.clone();
            ((ArrayList) eVar.f52505d).clear();
            ((d8) this.f23919a.f23389d).f("runtime.counter", new o3(Double.valueOf(0.0d)));
            this.f23922d.g(this.f23920b.d(), eVar);
            return (((b) eVar.f52504c).equals((b) eVar.f52503b) && ((ArrayList) eVar.f52505d).isEmpty()) ? false : true;
        } catch (Throwable th2) {
            throw new g7(th2);
        }
    }

    public final void b(pa paVar) {
        p4 p4Var;
        try {
            d8 d8Var = this.f23919a;
            this.f23920b = ((d8) d8Var.f23387b).d();
            if (d8Var.b(this.f23920b, (qa[]) paVar.u().toArray(new qa[0])) instanceof t2) {
                throw new IllegalStateException("Program loading failed");
            }
            for (oa oaVar : paVar.v().u()) {
                List listV = oaVar.v();
                String strU = oaVar.u();
                Iterator it = listV.iterator();
                while (it.hasNext()) {
                    b6 b6VarB = d8Var.b(this.f23920b, (qa) it.next());
                    if (!(b6VarB instanceof y5)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    d8 d8Var2 = this.f23920b;
                    if (d8Var2.e(strU)) {
                        b6 b6VarH = d8Var2.h(strU);
                        if (!(b6VarH instanceof p4)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strU)));
                        }
                        p4Var = (p4) b6VarH;
                    } else {
                        p4Var = null;
                    }
                    if (p4Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strU)));
                    }
                    p4Var.a(this.f23920b, Collections.singletonList(b6VarB));
                }
            }
        } catch (Throwable th2) {
            throw new g7(th2);
        }
    }
}
