package xd;

import java.util.concurrent.atomic.AtomicReference;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fn.f, kotlin.jvm.internal.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f53760a;

    public k(AtomicReference atomicReference) {
        this.f53760a = atomicReference;
    }

    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) {
        this.f53760a.set((g) obj);
        return r.f53297a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fn.f) && (obj instanceof kotlin.jvm.internal.h)) {
            return kotlin.jvm.internal.n.a(getFunctionDelegate(), ((kotlin.jvm.internal.h) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public final wj.a getFunctionDelegate() {
        return new kotlin.jvm.internal.a(2, this.f53760a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
