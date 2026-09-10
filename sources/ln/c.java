package ln;

import cn.d0;
import cn.l;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.sdk.controller.y;
import hn.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends g implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45604h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f45605a;
    }

    public final boolean d() {
        return Math.max(g.f45612g.get(this), 0) == 0;
    }

    public final Object e(ak.f fVar) {
        boolean zF = f();
        r rVar = r.f53297a;
        if (!zF) {
            l lVarS = d0.s(q1.t(fVar));
            try {
                b bVar = new b(this, lVarS);
                while (true) {
                    int andDecrement = g.f45612g.getAndDecrement(this);
                    if (andDecrement <= this.f45613a) {
                        if (andDecrement > 0) {
                            c cVar = bVar.f45603b;
                            f45604h.set(cVar, null);
                            bVar.f45602a.e(rVar, new y(cVar, bVar));
                            break;
                        }
                        if (b(bVar)) {
                            break;
                        }
                    }
                }
                Object objS = lVarS.s();
                bk.a aVar = bk.a.f5708a;
                if (objS != aVar) {
                    objS = rVar;
                }
                if (objS == aVar) {
                    return objS;
                }
            } catch (Throwable th2) {
                lVarS.A();
                throw th2;
            }
        }
        return rVar;
    }

    public final boolean f() {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f45612g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f45613a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i12) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f45604h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void g(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45604h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u uVar = d.f45605a;
            if (obj2 != uVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
                        c();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + d0.q(this) + "[isLocked=" + d() + ",owner=" + f45604h.get(this) + ']';
    }
}
