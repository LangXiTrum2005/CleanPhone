package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004\n\u000b\f\rR\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004R\u0013\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/atomicfu/AtomicRef;", "", "_queue", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "DelayedTask", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h0 = AtomicReferenceFieldUpdater.newUpdater(EventLoopImplBase.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater i0 = AtomicIntegerFieldUpdater.newUpdater(EventLoopImplBase.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DelayedResumeTask extends DelayedTask {
        public final CancellableContinuationImpl Z;

        public DelayedResumeTask(long j, CancellableContinuationImpl cancellableContinuationImpl) {
            super(j);
            this.Z = cancellableContinuationImpl;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.Z.B(EventLoopImplBase.this, Unit.f43263a);
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public final String toString() {
            return super.toString() + this.Z;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DelayedRunnableTask extends DelayedTask {
        public final Runnable Z;

        public DelayedRunnableTask(long j, Runnable runnable) {
            super(j);
            this.Z = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.Z.run();
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public final String toString() {
            return super.toString() + this.Z;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "_heap", "Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {
        public long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f44754Y = -1;
        private volatile Object _heap;

        public DelayedTask(long j) {
            this.X = j;
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public final void b(DelayedTaskQueue delayedTaskQueue) {
            if (this._heap == EventLoop_commonKt.f44756a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = delayedTaskQueue;
        }

        @Override // java.lang.Comparable
        public final int compareTo(DelayedTask delayedTask) {
            long j = this.X - delayedTask.X;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        public final int d(long j, DelayedTaskQueue delayedTaskQueue, EventLoopImplBase eventLoopImplBase) {
            synchronized (this) {
                if (this._heap == EventLoop_commonKt.f44756a) {
                    return 2;
                }
                synchronized (delayedTaskQueue) {
                    try {
                        ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue.f45053a;
                        DelayedTask delayedTask = (DelayedTask) (threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = EventLoopImplBase.g0;
                        eventLoopImplBase.getClass();
                        if (EventLoopImplBase.i0.get(eventLoopImplBase) != 0) {
                            return 1;
                        }
                        if (delayedTask == null) {
                            delayedTaskQueue.f44755c = j;
                        } else {
                            long j2 = delayedTask.X;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - delayedTaskQueue.f44755c > 0) {
                                delayedTaskQueue.f44755c = j;
                            }
                        }
                        long j3 = this.X;
                        long j4 = delayedTaskQueue.f44755c;
                        if (j3 - j4 < 0) {
                            this.X = j4;
                        }
                        delayedTaskQueue.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    Symbol symbol = EventLoop_commonKt.f44756a;
                    if (obj == symbol) {
                        return;
                    }
                    DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
                    if (delayedTaskQueue != null) {
                        synchronized (delayedTaskQueue) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof ThreadSafeHeap ? (ThreadSafeHeap) obj2 : null) != null) {
                                delayedTaskQueue.b(this.f44754Y);
                            }
                        }
                    }
                    this._heap = symbol;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public final void setIndex(int i2) {
            this.f44754Y = i2;
        }

        public String toString() {
            return androidx.media3.extractor.text.ttml.a.o(new StringBuilder("Delayed[nanos="), this.X, AbstractJsonLexerKt.END_LIST);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f44755c;
    }

    public final void C0() {
        ThreadSafeHeapNode threadSafeHeapNodeB;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) h0.get(this);
        if (delayedTaskQueue == null || ThreadSafeHeap.f45052b.get(delayedTaskQueue) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (delayedTaskQueue) {
                try {
                    ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue.f45053a;
                    threadSafeHeapNodeB = null;
                    ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                    if (threadSafeHeapNode != null) {
                        DelayedTask delayedTask = (DelayedTask) threadSafeHeapNode;
                        threadSafeHeapNodeB = ((jNanoTime - delayedTask.X) > 0L ? 1 : ((jNanoTime - delayedTask.X) == 0L ? 0 : -1)) >= 0 ? D0(delayedTask) : false ? delayedTaskQueue.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((DelayedTask) threadSafeHeapNodeB) != null);
    }

    public final boolean D0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (i0.get(this) != 0) {
                break;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                if (obj == EventLoop_commonKt.f44757b) {
                    break;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore.a((Runnable) obj);
                lockFreeTaskQueueCore.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) obj;
            int iA = lockFreeTaskQueueCore2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                LockFreeTaskQueueCore lockFreeTaskQueueCoreC = lockFreeTaskQueueCore2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCoreC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                break;
            }
        }
        return false;
    }

    public final boolean E0() {
        DelayedTaskQueue delayedTaskQueue;
        ArrayDeque arrayDeque = this.e0;
        if (!(arrayDeque != null ? arrayDeque.isEmpty() : true) || ((delayedTaskQueue = (DelayedTaskQueue) h0.get(this)) != null && ThreadSafeHeap.f45052b.get(delayedTaskQueue) != 0)) {
            return false;
        }
        Object obj = g0.get(this);
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                long j = LockFreeTaskQueueCore.f.get((LockFreeTaskQueueCore) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != EventLoop_commonKt.f44757b) {
                return false;
            }
        }
        return true;
    }

    public final void G0(long j, DelayedTask delayedTask) {
        int iD;
        Thread threadU0;
        boolean z2 = i0.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
        ThreadSafeHeapNode threadSafeHeapNode = null;
        if (z2) {
            iD = 1;
        } else {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
            if (delayedTaskQueue == null) {
                DelayedTaskQueue delayedTaskQueue2 = new DelayedTaskQueue();
                delayedTaskQueue2.f44755c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, delayedTaskQueue2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.c(obj);
                delayedTaskQueue = (DelayedTaskQueue) obj;
            }
            iD = delayedTask.d(j, delayedTaskQueue, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                w0(j, delayedTask);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        DelayedTaskQueue delayedTaskQueue3 = (DelayedTaskQueue) atomicReferenceFieldUpdater.get(this);
        if (delayedTaskQueue3 != null) {
            synchronized (delayedTaskQueue3) {
                ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue3.f45053a;
                threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
            }
            threadSafeHeapNode = (DelayedTask) threadSafeHeapNode;
        }
        if (threadSafeHeapNode != delayedTask || Thread.currentThread() == (threadU0 = getJ0())) {
            return;
        }
        LockSupport.unpark(threadU0);
    }

    @Override // kotlinx.coroutines.Delay
    public final void S(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        long jA = EventLoop_commonKt.a(j);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(jA + jNanoTime, cancellableContinuationImpl);
            G0(jNanoTime, delayedResumeTask);
            CancellableContinuationKt.a(cancellableContinuationImpl, delayedResumeTask);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        z0(runnable);
    }

    public DisposableHandle i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return DefaultExecutorKt.f44750a.i(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.EventLoop
    public final long s0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Symbol symbol;
        Runnable runnable;
        ThreadSafeHeapNode threadSafeHeapNode;
        if (!t0()) {
            C0();
            loop0: while (true) {
                atomicReferenceFieldUpdater = g0;
                Object obj = atomicReferenceFieldUpdater.get(this);
                symbol = EventLoop_commonKt.f44757b;
                if (obj != null) {
                    if (obj instanceof LockFreeTaskQueueCore) {
                        LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                        Object objD = lockFreeTaskQueueCore.d();
                        if (objD != LockFreeTaskQueueCore.g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        LockFreeTaskQueueCore lockFreeTaskQueueCoreC = lockFreeTaskQueueCore.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCoreC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != symbol) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ArrayDeque arrayDeque = this.e0;
            if (((arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof LockFreeTaskQueueCore) {
                        long j = LockFreeTaskQueueCore.f.get((LockFreeTaskQueueCore) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == symbol) {
                        return Long.MAX_VALUE;
                    }
                }
                DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) h0.get(this);
                if (delayedTaskQueue != null) {
                    synchronized (delayedTaskQueue) {
                        ThreadSafeHeapNode[] threadSafeHeapNodeArr = delayedTaskQueue.f45053a;
                        threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                    }
                    DelayedTask delayedTask = (DelayedTask) threadSafeHeapNode;
                    if (delayedTask != null) {
                        long jNanoTime = delayedTask.X - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
        ThreadSafeHeapNode threadSafeHeapNodeB;
        ThreadLocalEventLoop.f44768a.set(null);
        i0.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = EventLoop_commonKt.f44757b;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore) obj).b();
                break;
            } else {
                if (obj == symbol) {
                    break;
                }
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                lockFreeTaskQueueCore.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (s0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) h0.get(this);
            if (delayedTaskQueue == null) {
                return;
            }
            synchronized (delayedTaskQueue) {
                threadSafeHeapNodeB = ThreadSafeHeap.f45052b.get(delayedTaskQueue) > 0 ? delayedTaskQueue.b(0) : null;
            }
            DelayedTask delayedTask = (DelayedTask) threadSafeHeapNodeB;
            if (delayedTask == null) {
                return;
            } else {
                w0(jNanoTime, delayedTask);
            }
        }
    }

    public void z0(Runnable runnable) {
        C0();
        if (!D0(runnable)) {
            DefaultExecutor.j0.z0(runnable);
            return;
        }
        Thread threadU0 = getJ0();
        if (Thread.currentThread() != threadU0) {
            LockSupport.unpark(threadU0);
        }
    }
}
