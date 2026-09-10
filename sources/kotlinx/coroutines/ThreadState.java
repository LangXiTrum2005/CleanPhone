package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/atomicfu/AtomicInt;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ThreadState extends JobNode {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f0 = AtomicIntegerFieldUpdater.newUpdater(ThreadState.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f0;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    return;
                }
                throw new IllegalStateException(("Illegal state " + i2).toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 2));
        throw null;
    }
}
