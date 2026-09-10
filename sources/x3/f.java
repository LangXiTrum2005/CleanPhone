package x3;

import f.n;
import f.p;
import fn.a1;
import fn.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xj.t;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f53585a = fn.g.c(g.f53598e);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f53586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f53587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xj.j f53588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xj.j f53589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f53590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f53592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f53593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f53594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f53595k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f53596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f53597n;

    public f() {
        a1 a1VarC = fn.g.c(new d());
        this.f53586b = a1VarC;
        this.f53587c = new p0(a1VarC);
        this.f53588d = new xj.j();
        this.f53589e = new xj.j();
        this.f53593i = new LinkedHashSet();
        this.f53594j = new LinkedHashSet();
        this.f53595k = new LinkedHashSet();
    }

    public final void a(c dispatcher, e eVar, int i10) {
        LinkedHashSet linkedHashSet;
        boolean z10;
        kotlin.jvm.internal.n.f(dispatcher, "dispatcher");
        if (eVar.f53583a != null) {
            throw new IllegalArgumentException(("Input '" + eVar + "' is already added to dispatcher " + eVar.f53583a + '.').toString());
        }
        if (i10 != 0) {
            linkedHashSet = i10 != 1 ? this.f53593i : this.f53594j;
        } else {
            linkedHashSet = this.f53595k;
        }
        linkedHashSet.add(eVar);
        eVar.f53583a = dispatcher;
        d history = (d) this.f53587c.f41136a.getValue();
        kotlin.jvm.internal.n.f(history, "history");
        if (i10 != 0) {
            z10 = i10 != 1 ? this.f53597n : this.l;
        } else {
            z10 = this.f53596m;
        }
        eVar.b(z10);
    }

    public final void b() {
        boolean z10;
        boolean z11;
        d dVar;
        xj.j jVar = this.f53588d;
        if (jVar != null && jVar.isEmpty()) {
            z10 = false;
            break;
        }
        Iterator it = jVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (((n) it.next()).f40237b) {
                z10 = true;
                break;
            }
        }
        xj.j jVar2 = this.f53589e;
        if (jVar2 != null && jVar2.isEmpty()) {
            z11 = false;
            break;
        }
        Iterator it2 = jVar2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z11 = false;
                break;
            } else if (((n) it2.next()).f40237b) {
                z11 = true;
                break;
            }
        }
        boolean z12 = z10 || z11;
        boolean z13 = this.f53596m != z10;
        boolean z14 = this.l != z11;
        boolean z15 = this.f53597n != z12;
        LinkedHashSet linkedHashSet = this.f53595k;
        if (z13) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((e) it3.next()).b(z10);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f53594j;
        if (z14) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((e) it4.next()).b(z11);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f53593i;
        if (z15) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((e) it5.next()).b(z12);
            }
        }
        this.f53596m = z10;
        this.l = z11;
        this.f53597n = z12;
        n nVarC = this.f53590f;
        if (nVarC == null) {
            nVarC = c(0);
        }
        n nVarC2 = this.f53590f;
        if (nVarC2 == null) {
            nVarC2 = c(0);
        }
        if (kotlin.jvm.internal.n.a(nVarC2, nVarC)) {
            if (nVarC2 == null) {
                dVar = new d();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = jVar.iterator();
                while (it6.hasNext()) {
                    ((n) it6.next()).getClass();
                }
                Iterator<E> it7 = jVar2.iterator();
                while (it7.hasNext()) {
                    ((n) it7.next()).getClass();
                }
                p pVar = nVarC2.f40236a;
                yj.c cVarM = j1.f.m();
                t.a0(arrayList, cVarM);
                cVarM.add(pVar);
                t.a0(v.f53866a, cVarM);
                dVar = new d(j1.f.d(cVarM), arrayList.size());
            }
            a1 a1Var = this.f53586b;
            if (kotlin.jvm.internal.n.a((d) a1Var.getValue(), dVar)) {
                return;
            }
            a1Var.e0(null, dVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((e) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((e) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((e) it10.next()).getClass();
            }
        }
    }

    public final n c(int i10) {
        Object next;
        Object next2;
        xj.j jVar = this.f53589e;
        xj.j jVar2 = this.f53588d;
        Object obj = null;
        if (i10 == -1) {
            Iterator it = jVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((n) next).f40237b);
            n nVar = (n) next;
            if (nVar != null) {
                return nVar;
            }
            for (Object obj2 : jVar) {
                if (((n) obj2).f40237b) {
                    obj = obj2;
                    break;
                }
            }
            return (n) obj;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i10 + "'.").toString());
            }
            Iterator it2 = jVar2.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).getClass();
            }
            Iterator it3 = jVar.iterator();
            while (it3.hasNext()) {
                ((n) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = jVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((n) next2).f40237b);
        n nVar2 = (n) next2;
        if (nVar2 != null) {
            return nVar2;
        }
        for (Object obj3 : jVar) {
            if (((n) obj3).f40237b) {
                obj = obj3;
                break;
            }
        }
        return (n) obj;
    }
}
