package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e32 extends a32 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f13825i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f13826j;

    @Override // com.google.android.gms.internal.ads.a32
    public final void g() {
        for (d32 d32Var : this.f13825i.values()) {
            d32Var.f13377a.o(d32Var.f13378b);
        }
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void i() {
        for (d32 d32Var : this.f13825i.values()) {
            d32Var.f13377a.p(d32Var.f13378b);
        }
    }

    @Override // com.google.android.gms.internal.ads.a32
    public void j() {
        HashMap map = this.f13825i;
        for (d32 d32Var : map.values()) {
            a32 a32Var = d32Var.f13377a;
            a32Var.q(d32Var.f13378b);
            c32 c32Var = d32Var.f13379c;
            a32Var.l(c32Var);
            a32Var.m(c32Var);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.a32
    public void r() {
        Iterator it = this.f13825i.values().iterator();
        while (it.hasNext()) {
            ((d32) it.next()).f13377a.r();
        }
    }

    public abstract void s(Object obj, a32 a32Var, ci ciVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.b32, com.google.android.gms.internal.ads.s32] */
    public final void t(final Integer num, a32 a32Var) {
        HashMap map = this.f13825i;
        ps1.v(!map.containsKey(num));
        ?? r2 = new s32() { // from class: com.google.android.gms.internal.ads.b32
            @Override // com.google.android.gms.internal.ads.s32
            public final /* synthetic */ void a(a32 a32Var2, ci ciVar) {
                this.f12621a.s(num, a32Var2, ciVar);
            }
        };
        c32 c32Var = new c32(this, num);
        map.put(num, new d32(a32Var, r2, c32Var));
        Handler handler = this.f13826j;
        handler.getClass();
        iw0 iw0Var = a32Var.f11822c;
        iw0Var.getClass();
        ((CopyOnWriteArrayList) iw0Var.f15865c).add(new t32(handler, c32Var));
        this.f13826j.getClass();
        f81 f81Var = a32Var.f11823d;
        f81Var.getClass();
        ((CopyOnWriteArrayList) f81Var.f14318c).add(new b22(c32Var));
        j02 j02Var = this.f11826g;
        j02Var.getClass();
        x xVar = this.f11827h;
        xVar.getClass();
        a32Var.n(r2, j02Var, xVar);
        if (this.f11821b.isEmpty()) {
            a32Var.p(r2);
        }
    }

    public abstract r32 v(Object obj, r32 r32Var);

    public void u(Object obj) {
    }

    public void w(long j10, Object obj) {
    }
}
