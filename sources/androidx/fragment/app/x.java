package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4503a;

    public x(AtomicReference atomicReference) {
        this.f4503a = atomicReference;
    }

    @Override // h.c
    public final void a(Object obj) {
        h.c cVar = (h.c) this.f4503a.get();
        if (cVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.a(obj);
    }
}
