package f2;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40272a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f40273b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f40274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f40275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f40276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i1.p0 f40277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q1.j f40278g;

    public a() {
        int i10 = 0;
        c0 c0Var = null;
        this.f40274c = new i0(new CopyOnWriteArrayList(), i10, c0Var);
        this.f40275d = new i0(new CopyOnWriteArrayList(), i10, c0Var);
    }

    public final i0 a(c0 c0Var) {
        return new i0(this.f40274c.f40371c, 0, c0Var);
    }

    public abstract a0 c(c0 c0Var, v9.e eVar, long j10);

    public final void e(d0 d0Var) {
        HashSet hashSet = this.f40273b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(d0Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        f();
    }

    public final void g(d0 d0Var) {
        this.f40276e.getClass();
        HashSet hashSet = this.f40273b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(d0Var);
        if (zIsEmpty) {
            h();
        }
    }

    public i1.p0 i() {
        return null;
    }

    public abstract i1.y k();

    public boolean l() {
        return true;
    }

    public abstract void m();

    public final void o(d0 d0Var, n1.z zVar, q1.j jVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f40276e;
        go.k.i(looper == null || looper == looperMyLooper);
        this.f40278g = jVar;
        i1.p0 p0Var = this.f40277f;
        this.f40272a.add(d0Var);
        if (this.f40276e == null) {
            this.f40276e = looperMyLooper;
            this.f40273b.add(d0Var);
            p(zVar);
        } else if (p0Var != null) {
            g(d0Var);
            d0Var.a(this, p0Var);
        }
    }

    public abstract void p(n1.z zVar);

    public final void q(i1.p0 p0Var) {
        this.f40277f = p0Var;
        Iterator it = this.f40272a.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a(this, p0Var);
        }
    }

    public abstract void r(a0 a0Var);

    public final void s(d0 d0Var) {
        ArrayList arrayList = this.f40272a;
        arrayList.remove(d0Var);
        if (!arrayList.isEmpty()) {
            e(d0Var);
            return;
        }
        this.f40276e = null;
        this.f40277f = null;
        this.f40278g = null;
        this.f40273b.clear();
        t();
    }

    public abstract void t();

    public final void u(u1.e eVar) {
        CopyOnWriteArrayList<u1.d> copyOnWriteArrayList = this.f40275d.f40371c;
        for (u1.d dVar : copyOnWriteArrayList) {
            if (dVar.f51659a == eVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void v(j0 j0Var) {
        CopyOnWriteArrayList<h0> copyOnWriteArrayList = this.f40274c.f40371c;
        for (h0 h0Var : copyOnWriteArrayList) {
            if (h0Var.f40364b == j0Var) {
                copyOnWriteArrayList.remove(h0Var);
            }
        }
    }

    public abstract void w(i1.y yVar);

    public void f() {
    }

    public void h() {
    }
}
