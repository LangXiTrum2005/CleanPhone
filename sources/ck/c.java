package ck;

import ak.k;
import cn.l;
import cn.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends a {
    private final k _context;
    private transient ak.f intercepted;

    public c(ak.f fVar, k kVar) {
        super(fVar);
        this._context = kVar;
    }

    @Override // ak.f
    public k getContext() {
        k kVar = this._context;
        n.c(kVar);
        return kVar;
    }

    public final ak.f intercepted() {
        ak.f fVar = this.intercepted;
        if (fVar != null) {
            return fVar;
        }
        ak.h hVar = (ak.h) getContext().get(ak.g.f3619a);
        ak.f gVar = hVar != null ? new hn.g((w) hVar, this) : this;
        this.intercepted = gVar;
        return gVar;
    }

    @Override // ck.a
    public void releaseIntercepted() {
        ak.f fVar = this.intercepted;
        if (fVar != null && fVar != this) {
            ak.i iVar = getContext().get(ak.g.f3619a);
            n.c(iVar);
            hn.g gVar = (hn.g) fVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hn.g.f42427h;
            while (atomicReferenceFieldUpdater.get(gVar) == hn.b.f42417c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            l lVar = obj instanceof l ? (l) obj : null;
            if (lVar != null) {
                lVar.o();
            }
        }
        this.intercepted = b.f6469a;
    }

    public c(ak.f fVar) {
        this(fVar, fVar != null ? fVar.getContext() : null);
    }
}
