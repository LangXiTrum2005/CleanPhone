package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.DebugStringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001R\u0011\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004R\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0002X\u0082\u0004R\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "Lkotlinx/coroutines/internal/Removed;", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class LockFreeLinkedListNode {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45035Y = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    public final boolean c(LockFreeLinkedListNode lockFreeLinkedListNode, int i2) {
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNodeE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45035Y;
            if (lockFreeLinkedListNodeE == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    lockFreeLinkedListNodeE = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNodeE.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeE);
                }
            }
            if (lockFreeLinkedListNodeE instanceof ListClosed) {
                return (((ListClosed) lockFreeLinkedListNodeE).e0 & i2) == 0 && lockFreeLinkedListNodeE.c(lockFreeLinkedListNode, i2);
            }
            atomicReferenceFieldUpdater.set(lockFreeLinkedListNode, lockFreeLinkedListNodeE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X;
            atomicReferenceFieldUpdater2.set(lockFreeLinkedListNode, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNodeE, this, lockFreeLinkedListNode)) {
                    lockFreeLinkedListNode.f(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNodeE) == this);
        }
    }

    public final void d(int i2) {
        c(new ListClosed(i2), i2);
    }

    public final LockFreeLinkedListNode e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f45035Y;
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) atomicReferenceFieldUpdater2.get(this);
            LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = X;
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2);
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2) {
                            return lockFreeLinkedListNode2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != lockFreeLinkedListNode) {
                                break;
                            }
                        }
                        return lockFreeLinkedListNode2;
                    }
                    if (h()) {
                        return null;
                    }
                    if (!(obj instanceof Removed)) {
                        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
                    } else {
                        if (lockFreeLinkedListNode3 != null) {
                            break;
                        }
                        lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode2);
                    }
                }
                LockFreeLinkedListNode lockFreeLinkedListNode4 = ((Removed) obj).f45044a;
                while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode3, lockFreeLinkedListNode2, lockFreeLinkedListNode4)) {
                    if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode3) != lockFreeLinkedListNode2) {
                        break;
                    }
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    public final void f(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45035Y;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (X.get(this) != lockFreeLinkedListNode) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                    if (h()) {
                        lockFreeLinkedListNode.e();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == lockFreeLinkedListNode2);
        }
    }

    public final LockFreeLinkedListNode g() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object obj = X.get(this);
        Removed removed = obj instanceof Removed ? (Removed) obj : null;
        if (removed != null && (lockFreeLinkedListNode = removed.f45044a) != null) {
            return lockFreeLinkedListNode;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (LockFreeLinkedListNode) obj;
    }

    public boolean h() {
        return X.get(this) instanceof Removed;
    }

    public final void i() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Removed) {
                LockFreeLinkedListNode lockFreeLinkedListNode = ((Removed) obj).f45044a;
                return;
            }
            if (obj == this) {
                return;
            }
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Z;
            Removed removed = (Removed) atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode2);
            if (removed == null) {
                removed = new Removed(lockFreeLinkedListNode2);
                atomicReferenceFieldUpdater2.set(lockFreeLinkedListNode2, removed);
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, removed)) {
                    lockFreeLinkedListNode2.e();
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public String toString() {
        return new AnonymousClass1(this, DebugStringsKt.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + DebugStringsKt.a(this);
    }
}
