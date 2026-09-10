package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11820a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f11821b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iw0 f11822c = new iw0(new CopyOnWriteArrayList(), false, null, 17);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f81 f11823d = new f81(new CopyOnWriteArrayList(), (r32) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f11824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ci f11825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j02 f11826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f11827h;

    public abstract void a(f5 f5Var);

    public abstract void b(q32 q32Var);

    public abstract q32 c(r32 r32Var, u uVar, long j10);

    public abstract f5 f();

    public abstract void h(ox1 ox1Var);

    public abstract void j();

    public final void k(ci ciVar) {
        this.f11825f = ciVar;
        ArrayList arrayList = this.f11820a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s32) arrayList.get(i10)).a(this, ciVar);
        }
    }

    public final void l(v32 v32Var) {
        CopyOnWriteArrayList<t32> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f11822c.f15865c;
        for (t32 t32Var : copyOnWriteArrayList) {
            if (t32Var.f20155b == v32Var) {
                copyOnWriteArrayList.remove(t32Var);
            }
        }
    }

    public final void m(c22 c22Var) {
        CopyOnWriteArrayList<b22> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f11823d.f14318c;
        for (b22 b22Var : copyOnWriteArrayList) {
            if (b22Var.f12617a == c22Var) {
                copyOnWriteArrayList.remove(b22Var);
            }
        }
    }

    public final void n(s32 s32Var, j02 j02Var, x xVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f11824e;
        boolean z10 = true;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        }
        ps1.v(z10);
        this.f11826g = j02Var;
        this.f11827h = xVar;
        ci ciVar = this.f11825f;
        this.f11820a.add(s32Var);
        if (this.f11824e != null) {
            if (ciVar != null) {
                o(s32Var);
                s32Var.a(this, ciVar);
                return;
            }
            return;
        }
        this.f11824e = looperMyLooper;
        this.f11821b.add(s32Var);
        z zVar = (z) xVar;
        zVar.getClass();
        h(zVar);
    }

    public final void o(s32 s32Var) {
        this.f11824e.getClass();
        HashSet hashSet = this.f11821b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(s32Var);
        if (zIsEmpty) {
            g();
        }
    }

    public final void p(s32 s32Var) {
        HashSet hashSet = this.f11821b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(s32Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(s32 s32Var) {
        ArrayList arrayList = this.f11820a;
        arrayList.remove(s32Var);
        if (!arrayList.isEmpty()) {
            p(s32Var);
            return;
        }
        this.f11824e = null;
        this.f11825f = null;
        this.f11826g = null;
        this.f11821b.clear();
        j();
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }

    public void g() {
    }

    public void i() {
    }
}
