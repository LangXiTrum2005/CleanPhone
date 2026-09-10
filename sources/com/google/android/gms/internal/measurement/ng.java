package com.google.android.gms.internal.measurement;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ng {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lg f23787d = new lg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ng f23788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x.i f23789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23790c = false;

    public /* synthetic */ ng(ng ngVar, x.i iVar) {
        if (ngVar != null) {
            go.k.i(ngVar.f23790c);
        }
        this.f23788a = ngVar;
        this.f23789b = iVar;
    }

    public static ng a(ng ngVar, ng ngVar2) {
        ngVar.getClass();
        ng ngVar3 = mg.f23751e;
        if (ngVar == ngVar3) {
            return ngVar2;
        }
        ngVar2.getClass();
        if (ngVar2 == ngVar3) {
            return ngVar;
        }
        oa.u0<ng> u0VarU = oa.u0.u(2, ngVar, ngVar2);
        if (u0VarU.isEmpty()) {
            return ngVar3;
        }
        if (u0VarU.size() == 1) {
            return (ng) u0VarU.iterator().next();
        }
        int i10 = 0;
        for (ng ngVar4 : u0VarU) {
            do {
                i10 += ngVar4.f23789b.f53506c;
                ngVar4 = ngVar4.f23788a;
            } while (ngVar4 != null);
        }
        if (i10 == 0) {
            return mg.f23751e;
        }
        x.i iVar = new x.i(i10);
        for (ng ngVar5 : u0VarU) {
            do {
                int i11 = 0;
                while (true) {
                    x.i iVar2 = ngVar5.f23789b;
                    if (i11 >= iVar2.f53506c) {
                        break;
                    }
                    go.k.k(iVar.put((lg) iVar2.f(i11), iVar2.j(i11)) == null, "Duplicate bindings: %s", iVar2.f(i11));
                    i11++;
                }
                ngVar5 = ngVar5.f23788a;
            } while (ngVar5 != null);
        }
        return new mg(null, iVar).b();
    }

    public final ng b() {
        if (this.f23790c) {
            throw new IllegalStateException("Already frozen");
        }
        this.f23790c = true;
        ng ngVar = this.f23788a;
        return (ngVar == null || !this.f23789b.isEmpty()) ? this : ngVar;
    }

    public final boolean c() {
        if (this.f23789b.containsKey(f23787d)) {
            return true;
        }
        ng ngVar = this.f23788a;
        return ngVar != null && ngVar.c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (ng ngVar = this; ngVar != null; ngVar = ngVar.f23788a) {
            for (int i10 = 0; i10 < ngVar.f23789b.f53506c; i10++) {
                sb2.append(X3.j.f27834d);
                sb2.append(this.f23789b.j(i10));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }
}
