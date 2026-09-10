package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001R\u0017\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class LockFreeTaskQueue<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45036a = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new LockFreeTaskQueueCore(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45036a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            int iA = lockFreeTaskQueueCore.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                LockFreeTaskQueueCore lockFreeTaskQueueCoreC = lockFreeTaskQueueCore.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCoreC) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45036a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore.b()) {
                return;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCoreC = lockFreeTaskQueueCore.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCoreC) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }

    public final int c() {
        LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) f45036a.get(this);
        lockFreeTaskQueueCore.getClass();
        long j = LockFreeTaskQueueCore.f.get(lockFreeTaskQueueCore);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45036a;
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            Object objD = lockFreeTaskQueueCore.d();
            if (objD != LockFreeTaskQueueCore.g) {
                return objD;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCoreC = lockFreeTaskQueueCore.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeTaskQueueCore, lockFreeTaskQueueCoreC) && atomicReferenceFieldUpdater.get(this) == lockFreeTaskQueueCore) {
            }
        }
    }
}
