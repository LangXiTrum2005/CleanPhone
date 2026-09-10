package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/coroutines/NotCompleted;", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Segment<S extends Segment<S>> extends ConcurrentLinkedListNode<S> implements NotCompleted {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e0 = AtomicIntegerFieldUpdater.newUpdater(Segment.class, "cleanedAndPointers$volatile");
    public final long Z;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public Segment(long j, Segment segment, int i2) {
        super(segment);
        this.Z = j;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public final boolean d() {
        return e0.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return e0.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i2, CoroutineContext coroutineContext);

    public final void i() {
        if (e0.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = e0;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
