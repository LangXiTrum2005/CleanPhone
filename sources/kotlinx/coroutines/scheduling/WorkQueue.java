package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R\u0013\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004R\u000b\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/scheduling/Task;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicInt;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkQueue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45071b = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45072c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45073e = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f45074a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final Task a(Task task) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f45072c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return task;
        }
        if (task.f45065Y) {
            f45073e.incrementAndGet(this);
        }
        int i2 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f45074a;
            if (atomicReferenceArray.get(i2) == null) {
                atomicReferenceArray.lazySet(i2, task);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final Task b() {
        Task task;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f45072c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (task = (Task) this.f45074a.getAndSet(i3, null)) != null) {
                if (task.f45065Y) {
                    f45073e.decrementAndGet(this);
                }
                return task;
            }
        }
    }

    public final Task c(int i2, boolean z2) {
        int i3 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f45074a;
        Task task = (Task) atomicReferenceArray.get(i3);
        if (task != null && task.f45065Y == z2) {
            while (!atomicReferenceArray.compareAndSet(i3, task, null)) {
                if (atomicReferenceArray.get(i3) != task) {
                }
            }
            if (z2) {
                f45073e.decrementAndGet(this);
            }
            return task;
        }
        return null;
    }
}
