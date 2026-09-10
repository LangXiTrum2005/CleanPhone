package en;

import cn.j2;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends hn.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f40170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f40171f;

    public m(long j10, m mVar, e eVar, int i10) {
        super(j10, mVar, i10);
        this.f40170e = eVar;
        this.f40171f = new AtomicReferenceArray(g.f40147b * 2);
    }

    @Override // hn.s
    public final int g() {
        return g.f40147b;
    }

    @Override // hn.s
    public final void h(int i10, ak.k kVar) {
        e eVar;
        int i11 = g.f40147b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        this.f40171f.get(i10 * 2);
        while (true) {
            Object objL = l(i10);
            boolean z11 = objL instanceof j2;
            eVar = this.f40170e;
            if (z11 || (objL instanceof v)) {
                if (k(i10, objL, z10 ? g.f40155j : g.f40156k)) {
                    n(i10, null);
                    m(i10, !z10);
                    if (z10) {
                        kotlin.jvm.internal.n.c(eVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == g.f40155j || objL == g.f40156k) {
                    break;
                }
                if (objL != g.f40152g && objL != g.f40151f) {
                    if (objL == g.f40154i || objL == g.f40149d || objL == g.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
        n(i10, null);
        if (z10) {
            kotlin.jvm.internal.n.c(eVar);
        }
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f40171f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f40171f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            e eVar = this.f40170e;
            kotlin.jvm.internal.n.c(eVar);
            eVar.I((this.f42455c * ((long) g.f40147b)) + ((long) i10));
        }
        i();
    }

    public final void n(int i10, Object obj) {
        this.f40171f.set(i10 * 2, obj);
    }

    public final void o(int i10, Object obj) {
        this.f40171f.set((i10 * 2) + 1, obj);
    }
}
