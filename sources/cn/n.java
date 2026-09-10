package cn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f6747f;

    public /* synthetic */ n(l lVar, int i10) {
        this.f6746e = i10;
        this.f6747f = lVar;
    }

    @Override // cn.j1
    public final boolean i() {
        switch (this.f6746e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // cn.j1
    public final void j(Throwable th2) {
        switch (this.f6746e) {
            case 0:
                q1 q1VarH = h();
                l lVar = this.f6747f;
                Throwable thR = lVar.r(q1VarH);
                if (lVar.x()) {
                    hn.g gVar = (hn.g) lVar.f6733d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hn.g.f42427h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        hn.u uVar = hn.b.f42417c;
                        if (kotlin.jvm.internal.n.a(obj, uVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, uVar, thR)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != uVar) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                lVar.f(thR);
                if (!lVar.x()) {
                    lVar.o();
                }
                break;
            default:
                this.f6747f.resumeWith(wj.r.f53297a);
                break;
        }
    }
}
