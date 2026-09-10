package f2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f40389h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f40390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n1.z f40391j;

    public abstract void A(Object obj, a aVar, i1.p0 p0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [f2.d0, f2.i] */
    public final void B(final Object obj, a aVar) {
        HashMap map = this.f40389h;
        go.k.i(!map.containsKey(obj));
        ?? r2 = new d0() { // from class: f2.i
            @Override // f2.d0
            public final void a(a aVar2, i1.p0 p0Var) {
                this.f40367a.A(obj, aVar2, p0Var);
            }
        };
        j jVar = new j(this, obj);
        map.put(obj, new k(aVar, r2, jVar));
        Handler handler = this.f40390i;
        handler.getClass();
        aVar.getClass();
        i0 i0Var = aVar.f40274c;
        i0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = i0Var.f40371c;
        h0 h0Var = new h0();
        h0Var.f40363a = handler;
        h0Var.f40364b = jVar;
        copyOnWriteArrayList.add(h0Var);
        this.f40390i.getClass();
        i0 i0Var2 = aVar.f40275d;
        i0Var2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = i0Var2.f40371c;
        u1.d dVar = new u1.d();
        dVar.f51659a = jVar;
        copyOnWriteArrayList2.add(dVar);
        n1.z zVar = this.f40391j;
        q1.j jVar2 = this.f40278g;
        jVar2.getClass();
        aVar.o(r2, zVar, jVar2);
        if (this.f40273b.isEmpty()) {
            aVar.e(r2);
        }
    }

    @Override // f2.a
    public final void f() {
        for (k kVar : this.f40389h.values()) {
            kVar.f40380a.e(kVar.f40381b);
        }
    }

    @Override // f2.a
    public final void h() {
        for (k kVar : this.f40389h.values()) {
            kVar.f40380a.g(kVar.f40381b);
        }
    }

    @Override // f2.a
    public void m() {
        Iterator it = this.f40389h.values().iterator();
        while (it.hasNext()) {
            ((k) it.next()).f40380a.m();
        }
    }

    @Override // f2.a
    public void t() {
        HashMap map = this.f40389h;
        for (k kVar : map.values()) {
            a aVar = kVar.f40380a;
            j jVar = kVar.f40382c;
            aVar.s(kVar.f40381b);
            aVar.v(jVar);
            aVar.u(jVar);
        }
        map.clear();
    }

    public abstract c0 x(Object obj, c0 c0Var);

    public long y(Object obj, long j10) {
        return j10;
    }

    public int z(Object obj, int i10) {
        return i10;
    }
}
