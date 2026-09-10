package hn;

import cn.d0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42439a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42440b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42441c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(k kVar, int i10) {
        while (true) {
            k kVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42440b;
            if (kVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    kVarD = (k) obj;
                    if (!kVarD.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVarD);
                }
            }
            if (kVarD instanceof i) {
                return (((i) kVarD).f42438d & i10) == 0 && kVarD.c(kVar, i10);
            }
            atomicReferenceFieldUpdater.set(kVar, kVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42439a;
            atomicReferenceFieldUpdater2.set(kVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(kVarD, this, kVar)) {
                    kVar.e(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(kVarD) == this);
        }
    }

    public final k d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42440b;
            k kVar = (k) atomicReferenceFieldUpdater2.get(this);
            k kVar2 = kVar;
            while (true) {
                k kVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f42439a;
                    obj = atomicReferenceFieldUpdater.get(kVar2);
                    if (obj == this) {
                        if (kVar == kVar2) {
                            return kVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, kVar, kVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != kVar) {
                                break;
                            }
                        }
                        return kVar2;
                    }
                    if (g()) {
                        return null;
                    }
                    if (!(obj instanceof p)) {
                        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        kVar3 = kVar2;
                        kVar2 = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar2 = (k) atomicReferenceFieldUpdater2.get(kVar2);
                    }
                }
                k kVar4 = ((p) obj).f42452a;
                while (!atomicReferenceFieldUpdater.compareAndSet(kVar3, kVar2, kVar4)) {
                    if (atomicReferenceFieldUpdater.get(kVar3) != kVar2) {
                        break;
                    }
                }
                kVar2 = kVar3;
            }
        }
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42440b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f42439a.get(this) != kVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                    if (g()) {
                        kVar.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(kVar) == kVar2);
        }
    }

    public final k f() {
        k kVar;
        Object obj = f42439a.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null && (kVar = pVar.f42452a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (k) obj;
    }

    public boolean g() {
        return f42439a.get(this) instanceof p;
    }

    public String toString() {
        return new j(this, d0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + d0.q(this);
    }
}
