package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ac0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f11984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f11985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f11986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f11987k;
    public final Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f11988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f11989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f11990o;

    public ac0() {
        this.f11977a = new HashSet();
        this.f11978b = new HashSet();
        this.f11979c = new HashSet();
        this.f11980d = new HashSet();
        this.f11981e = new HashSet();
        this.f11982f = new HashSet();
        this.f11983g = new HashSet();
        this.f11984h = new HashSet();
        this.f11985i = new HashSet();
        this.f11986j = new HashSet();
        this.f11987k = new HashSet();
        this.l = new HashSet();
        this.f11988m = new HashSet();
        this.f11989n = new HashSet();
    }

    public void a(ha0 ha0Var, Executor executor) {
        ((HashSet) this.f11985i).add(new nc0(ha0Var, executor));
    }

    public void b(AppEventListener appEventListener, Executor executor) {
        ((HashSet) this.f11987k).add(new nc0(appEventListener, executor));
    }

    public void c(qc0 qc0Var, Executor executor) {
        ((HashSet) this.f11980d).add(new nc0(qc0Var, executor));
    }

    public void d(mb0 mb0Var, Executor executor) {
        ((HashSet) this.f11978b).add(new nc0(mb0Var, executor));
    }

    public ac0(ExecutorService executorService, Context context, h21 h21Var) {
        this.f11977a = this;
        hx1 hx1VarA = hx1.a(context);
        this.f11978b = hx1VarA;
        fx1 fx1VarA = fx1.a(ps1.f18805n);
        this.f11979c = fx1VarA;
        hx1 hx1VarA2 = hx1.a(executorService);
        this.f11980d = hx1VarA2;
        fx1 fx1VarA2 = fx1.a(new fz(hx1VarA, fx1VarA, hx1VarA2));
        int i10 = 2;
        fx1 fx1VarA3 = fx1.a(new dz(hx1VarA, hx1VarA2, i10));
        fx1 fx1VarA4 = fx1.a(new dz(hx1VarA, hx1VarA2, 3));
        int i11 = 16;
        fx1 fx1VarA5 = fx1.a(new g40(fx1.a(hx1VarA2), fx1VarA, i11));
        fx1 fx1VarA6 = fx1.a(dv.f13740m);
        hx1 hx1VarA3 = hx1.a(h21Var);
        this.f11981e = hx1VarA3;
        fx1 fx1VarA7 = fx1.a(new fz(fx1VarA5, fx1VarA6, hx1VarA3));
        this.f11982f = fx1VarA7;
        int i12 = 1;
        fx1 fx1VarA8 = fx1.a(new dz(hx1VarA2, hx1VarA3, i12));
        this.f11983g = fx1VarA8;
        fx1 fx1VarA9 = fx1.a(new d80((Object) hx1VarA, fx1VarA7, (Object) hx1VarA2, (Object) fx1VarA8, (Object) hx1VarA3, 19));
        this.f11984h = fx1VarA9;
        int i13 = lx1.f17149c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(fx1VarA2);
        arrayList.add(fx1VarA3);
        arrayList.add(fx1VarA4);
        arrayList.add(fx1VarA9);
        lx1 lx1Var = new lx1(arrayList, list);
        fx1 fx1VarA10 = fx1.a(new e60(new i21(this, 0), 23));
        fx1 fx1VarA11 = fx1.a(new e60(new i21(this, i12), 24));
        fx1 fx1VarA12 = fx1.a(new e60(new i21(this, i10), 25));
        fx1 fx1VarA13 = fx1.a(new g40(fx1VarA, fx1VarA9, 17));
        this.f11985i = fx1VarA13;
        fx1 fx1VarA14 = fx1.a(new d80(hx1VarA3, fx1.a(new n60(fx1VarA10, fx1VarA11, fx1VarA12, hx1VarA3, hx1VarA2, fx1VarA13)), fx1VarA9, hx1VarA2, fx1VarA13, 20));
        fx1 fx1VarA15 = fx1.a(new ni0(hx1VarA2, 5));
        this.f11986j = fx1VarA15;
        fx1 fx1VarA16 = fx1.a(new x41(hx1VarA, fx1VarA13, hx1VarA3, fx1VarA15));
        fx1 fx1VarA17 = fx1.a(new x41(2, fx1VarA13, fx1VarA15, hx1VarA, hx1VarA3));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(fx1VarA14);
        arrayList2.add(fx1VarA16);
        arrayList2.add(fx1VarA17);
        fx1 fx1VarA18 = fx1.a(new l40((kx1) lx1Var, (kx1) new lx1(arrayList2, list2), (gx1) hx1VarA2, fx1VarA13, 17));
        fx1 fx1VarA19 = fx1.a(ps1.f18806o);
        fx1 fx1VarA20 = fx1.a(new ej0(fx1VarA, i11));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(fx1VarA19);
        arrayList3.add(fx1VarA2);
        arrayList3.add(fx1VarA3);
        arrayList3.add(fx1VarA20);
        arrayList3.add(fx1VarA4);
        arrayList3.add(fx1VarA16);
        arrayList3.add(fx1VarA17);
        int i14 = 15;
        fx1 fx1VarA21 = fx1.a(new cr0(fx1VarA19, new lx1(arrayList3, list3), i14));
        this.f11987k = fx1VarA21;
        fx1 fx1VarA22 = fx1.a(new ej0(fx1VarA13, i14));
        this.l = fx1VarA22;
        this.f11988m = fx1.a(new j90(fx1VarA18, fx1VarA14, fx1VarA21, fx1VarA13, fx1VarA7, fx1.a(new x41(0, fx1VarA13, fx1VarA22, hx1VarA, hx1VarA3)), hx1VarA3));
        this.f11989n = fx1.a(new ni0(hx1VarA, 4));
        this.f11990o = fx1.a(new ni0(hx1VarA2, 6));
    }
}
