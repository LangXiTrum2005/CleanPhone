package kotlinx.coroutines.scheduling;

import androidx.datastore.preferences.protobuf.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\b\t\nR\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStack", "controlState", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoroutineScheduler implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater i0 = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j0 = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater k0 = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");
    public static final Symbol l0 = new Symbol("NOT_IN_STACK");
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f45059Y;
    public final long Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final String e0;
    public final GlobalQueue f0;
    public final GlobalQueue g0;
    public final ResizableAtomicArray h0;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "Lkotlinx/coroutines/internal/Symbol;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "", "PARKED", "I", "CLAIMED", "TERMINATED", "BLOCKING_SHIFT", "", "CREATED_MASK", "J", "BLOCKING_MASK", "CPU_PERMITS_SHIFT", "CPU_PERMITS_MASK", "MIN_SUPPORTED_POOL_SIZE", "MAX_SUPPORTED_POOL_SIZE", "PARKED_INDEX_MASK", "PARKED_VERSION_MASK", "PARKED_VERSION_INC", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WorkerState workerState = WorkerState.X;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                WorkerState workerState2 = WorkerState.X;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                WorkerState workerState3 = WorkerState.X;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                WorkerState workerState4 = WorkerState.X;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\b\u0010\u0012\u001a\u00020\u00118\u0006¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "", "index", "indexInArray", "I", "b", "()I", f.j, "(I)V", "", "nextParkedWorker", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", g.f40227p, "(Ljava/lang/Object;)V", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Worker extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater j0 = AtomicIntegerFieldUpdater.newUpdater(Worker.class, "workerCtl$volatile");
        public final WorkQueue X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Ref.ObjectRef f45060Y;
        public WorkerState Z;
        public long e0;
        public long f0;
        public int g0;
        public boolean h0;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public Worker(int i2) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.X = new WorkQueue();
            this.f45060Y = new Ref.ObjectRef();
            this.Z = WorkerState.e0;
            this.nextParkedWorker = CoroutineScheduler.l0;
            int iNanoTime = (int) System.nanoTime();
            this.g0 = iNanoTime == 0 ? 42 : iNanoTime;
            f(i2);
        }

        public final Task a(boolean z2) {
            Task taskE;
            Task taskE2;
            CoroutineScheduler coroutineScheduler;
            long j;
            WorkerState workerState = this.Z;
            WorkerState workerState2 = WorkerState.X;
            Task task = null;
            WorkQueue workQueue = this.X;
            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
            if (workerState != workerState2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.j0;
                do {
                    coroutineScheduler = CoroutineScheduler.this;
                    j = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        workQueue.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WorkQueue.f45071b;
                            Task task2 = (Task) atomicReferenceFieldUpdater.get(workQueue);
                            if (task2 == null || !task2.f45065Y) {
                                int i2 = WorkQueue.d.get(workQueue);
                                int i3 = WorkQueue.f45072c.get(workQueue);
                                while (i2 != i3 && WorkQueue.f45073e.get(workQueue) != 0) {
                                    i3--;
                                    Task taskC = workQueue.c(i3, true);
                                    if (taskC != null) {
                                        task = taskC;
                                        break;
                                    }
                                }
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(workQueue, task2, null)) {
                                    task = task2;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(workQueue) == task2);
                        }
                        if (task != null) {
                            return task;
                        }
                        Task task3 = (Task) coroutineScheduler2.g0.d();
                        return task3 == null ? i(1) : task3;
                    }
                } while (!CoroutineScheduler.j0.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
                this.Z = WorkerState.X;
            }
            if (z2) {
                boolean z3 = d(coroutineScheduler2.X * 2) == 0;
                if (z3 && (taskE2 = e()) != null) {
                    return taskE2;
                }
                workQueue.getClass();
                Task taskB = (Task) WorkQueue.f45071b.getAndSet(workQueue, null);
                if (taskB == null) {
                    taskB = workQueue.b();
                }
                if (taskB != null) {
                    return taskB;
                }
                if (!z3 && (taskE = e()) != null) {
                    return taskE;
                }
            } else {
                Task taskE3 = e();
                if (taskE3 != null) {
                    return taskE3;
                }
            }
            return i(3);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final int d(int i2) {
            int i3 = this.g0;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.g0 = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final Task e() {
            int iD = d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iD == 0) {
                Task task = (Task) coroutineScheduler.f0.d();
                return task != null ? task : (Task) coroutineScheduler.g0.d();
            }
            Task task2 = (Task) coroutineScheduler.g0.d();
            return task2 != null ? task2 : (Task) coroutineScheduler.f0.d();
        }

        public final void f(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.e0);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.Z;
            boolean z2 = workerState2 == WorkerState.X;
            if (z2) {
                CoroutineScheduler.j0.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.Z = workerState;
            }
            return z2;
        }

        public final Task i(int i2) {
            int i3;
            long j;
            Task taskC;
            long j2;
            long j3;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.j0;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i4 = (int) (atomicLongFieldUpdater.get(coroutineScheduler) & 2097151);
            Task task = null;
            if (i4 < 2) {
                return null;
            }
            int iD = d(i4);
            int i5 = 0;
            long jMin = Long.MAX_VALUE;
            while (i5 < i4) {
                int i6 = iD + 1;
                if (i6 > i4) {
                    i6 = 1;
                }
                Worker worker = (Worker) coroutineScheduler.h0.b(i6);
                if (worker == null || worker == this) {
                    i3 = i6;
                } else {
                    WorkQueue workQueue = worker.X;
                    if (i2 != 3) {
                        workQueue.getClass();
                        int i7 = WorkQueue.d.get(workQueue);
                        int i8 = WorkQueue.f45072c.get(workQueue);
                        boolean z2 = i2 == 1;
                        while (true) {
                            if (i7 != i8) {
                                j = 0;
                                if (!z2 || WorkQueue.f45073e.get(workQueue) != 0) {
                                    int i9 = i7 + 1;
                                    taskC = workQueue.c(i7, z2);
                                    if (taskC != null) {
                                        break;
                                    }
                                    i7 = i9;
                                }
                            } else {
                                j = 0;
                            }
                            taskC = task;
                            break;
                        }
                    } else {
                        taskC = workQueue.b();
                        j = 0;
                    }
                    Ref.ObjectRef objectRef = this.f45060Y;
                    if (taskC == null) {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WorkQueue.f45071b;
                            Task task2 = (Task) atomicReferenceFieldUpdater.get(workQueue);
                            if (task2 == null) {
                                j2 = -1;
                            } else {
                                j2 = -1;
                                if (((task2.f45065Y ? 1 : 2) & i2) != 0) {
                                    TasksKt.f.getClass();
                                    i3 = i6;
                                    long jNanoTime = System.nanoTime() - task2.X;
                                    long j4 = TasksKt.f45067b;
                                    if (jNanoTime < j4) {
                                        j3 = j4 - jNanoTime;
                                        task = null;
                                        break;
                                    }
                                    do {
                                        task = null;
                                        if (atomicReferenceFieldUpdater.compareAndSet(workQueue, task2, null)) {
                                            objectRef.X = task2;
                                            j3 = -1;
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater.get(workQueue) == task2);
                                    i6 = i3;
                                    task = null;
                                }
                            }
                            j3 = -2;
                            i3 = i6;
                            break;
                        }
                    } else {
                        objectRef.X = taskC;
                        i3 = i6;
                        j3 = -1;
                        j2 = -1;
                    }
                    if (j3 == j2) {
                        Task task3 = (Task) objectRef.X;
                        objectRef.X = task;
                        return task3;
                    }
                    if (j3 > j) {
                        jMin = Math.min(jMin, j3);
                    }
                }
                i5++;
                iD = i3;
                task = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f0 = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            AtomicLongFieldUpdater atomicLongFieldUpdater;
            long j;
            int i2;
            loop0: while (true) {
                boolean z2 = false;
                while (true) {
                    CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                    coroutineScheduler.getClass();
                    if (CoroutineScheduler.k0.get(coroutineScheduler) == 0) {
                        WorkerState workerState = this.Z;
                        WorkerState workerState2 = WorkerState.f0;
                        if (workerState == workerState2) {
                            break loop0;
                        }
                        Task taskA = a(this.h0);
                        if (taskA == null) {
                            this.h0 = false;
                            if (this.f0 == 0) {
                                Object obj = this.nextParkedWorker;
                                Symbol symbol = CoroutineScheduler.l0;
                                long j2 = 2097151;
                                if (obj != symbol) {
                                    j0.set(this, -1);
                                    while (this.nextParkedWorker != CoroutineScheduler.l0) {
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0;
                                        if (atomicIntegerFieldUpdater.get(this) != -1) {
                                            break;
                                        }
                                        CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                                        coroutineScheduler2.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = CoroutineScheduler.k0;
                                        if (atomicIntegerFieldUpdater2.get(coroutineScheduler2) != 0) {
                                            break;
                                        }
                                        WorkerState workerState3 = this.Z;
                                        WorkerState workerState4 = WorkerState.f0;
                                        if (workerState3 == workerState4) {
                                            break;
                                        }
                                        h(WorkerState.Z);
                                        Thread.interrupted();
                                        if (this.e0 == 0) {
                                            this.e0 = System.nanoTime() + CoroutineScheduler.this.Z;
                                        }
                                        LockSupport.parkNanos(CoroutineScheduler.this.Z);
                                        if (System.nanoTime() - this.e0 >= 0) {
                                            this.e0 = 0L;
                                            CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                            synchronized (coroutineScheduler3.h0) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(coroutineScheduler3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = CoroutineScheduler.j0;
                                                        if (((int) (atomicLongFieldUpdater2.get(coroutineScheduler3) & j2)) > coroutineScheduler3.X) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i3 = this.indexInArray;
                                                                f(0);
                                                                coroutineScheduler3.j(this, i3, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(coroutineScheduler3) & j2);
                                                                if (andDecrement != i3) {
                                                                    Object objB = coroutineScheduler3.h0.b(andDecrement);
                                                                    Intrinsics.c(objB);
                                                                    Worker worker = (Worker) objB;
                                                                    coroutineScheduler3.h0.c(i3, worker);
                                                                    worker.f(i3);
                                                                    coroutineScheduler3.j(worker, andDecrement, i3);
                                                                }
                                                                coroutineScheduler3.h0.c(andDecrement, null);
                                                                this.Z = workerState4;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        j2 = j2;
                                    }
                                } else {
                                    CoroutineScheduler coroutineScheduler4 = CoroutineScheduler.this;
                                    coroutineScheduler4.getClass();
                                    if (this.nextParkedWorker == symbol) {
                                        do {
                                            atomicLongFieldUpdater = CoroutineScheduler.i0;
                                            j = atomicLongFieldUpdater.get(coroutineScheduler4);
                                            i2 = this.indexInArray;
                                            this.nextParkedWorker = coroutineScheduler4.h0.b((int) (j & 2097151));
                                        } while (!atomicLongFieldUpdater.compareAndSet(coroutineScheduler4, j, ((2097152 + j) & (-2097152)) | ((long) i2)));
                                    }
                                }
                            } else {
                                if (z2) {
                                    h(WorkerState.Z);
                                    Thread.interrupted();
                                    LockSupport.parkNanos(this.f0);
                                    this.f0 = 0L;
                                    break;
                                }
                                z2 = true;
                            }
                        } else {
                            this.f0 = 0L;
                            this.e0 = 0L;
                            if (this.Z == WorkerState.Z) {
                                this.Z = WorkerState.f45061Y;
                            }
                            boolean z3 = taskA.f45065Y;
                            CoroutineScheduler coroutineScheduler5 = CoroutineScheduler.this;
                            if (!z3) {
                                coroutineScheduler5.getClass();
                                try {
                                    taskA.run();
                                    break;
                                } catch (Throwable th2) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                    break;
                                }
                            }
                            if (h(WorkerState.f45061Y) && !coroutineScheduler5.m() && !coroutineScheduler5.k(CoroutineScheduler.j0.get(coroutineScheduler5))) {
                                coroutineScheduler5.m();
                            }
                            coroutineScheduler5.getClass();
                            try {
                                taskA.run();
                            } catch (Throwable th3) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                            }
                            CoroutineScheduler.j0.addAndGet(coroutineScheduler5, -2097152L);
                            if (this.Z == workerState2) {
                                break;
                            }
                            this.Z = WorkerState.e0;
                            break;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(WorkerState.f0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WorkerState {
        public static final WorkerState X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final WorkerState f45061Y;
        public static final WorkerState Z;
        public static final WorkerState e0;
        public static final WorkerState f0;
        public static final /* synthetic */ WorkerState[] g0;
        public static final /* synthetic */ EnumEntries h0;

        static {
            WorkerState workerState = new WorkerState("CPU_ACQUIRED", 0);
            X = workerState;
            WorkerState workerState2 = new WorkerState("BLOCKING", 1);
            f45061Y = workerState2;
            WorkerState workerState3 = new WorkerState("PARKING", 2);
            Z = workerState3;
            WorkerState workerState4 = new WorkerState("DORMANT", 3);
            e0 = workerState4;
            WorkerState workerState5 = new WorkerState("TERMINATED", 4);
            f0 = workerState5;
            WorkerState[] workerStateArr = {workerState, workerState2, workerState3, workerState4, workerState5};
            g0 = workerStateArr;
            h0 = EnumEntriesKt.a(workerStateArr);
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) g0.clone();
        }
    }

    public CoroutineScheduler(int i2, int i3, String str, long j) {
        this.X = i2;
        this.f45059Y = i3;
        this.Z = j;
        this.e0 = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(a.k("Core pool size ", i2, " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(android.support.v4.media.a.g(i3, i2, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(a.k("Max pool size ", i3, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(androidx.media3.extractor.text.ttml.a.j(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f0 = new GlobalQueue();
        this.g0 = new GlobalQueue();
        this.h0 = new ResizableAtomicArray((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void i(CoroutineScheduler coroutineScheduler, Runnable runnable, int i2) {
        coroutineScheduler.h(runnable, false, (i2 & 4) == 0);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i2;
        Task taskA;
        if (k0.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
            if (worker == null || !Intrinsics.a(CoroutineScheduler.this, this)) {
                worker = null;
            }
            synchronized (this.h0) {
                i2 = (int) (j0.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object objB = this.h0.b(i3);
                    Intrinsics.c(objB);
                    Worker worker2 = (Worker) objB;
                    if (worker2 != worker) {
                        while (worker2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(worker2);
                            worker2.join(10000L);
                        }
                        WorkQueue workQueue = worker2.X;
                        GlobalQueue globalQueue = this.g0;
                        workQueue.getClass();
                        Task task = (Task) WorkQueue.f45071b.getAndSet(workQueue, null);
                        if (task != null) {
                            globalQueue.a(task);
                        }
                        while (true) {
                            Task taskB = workQueue.b();
                            if (taskB == null) {
                                break;
                            } else {
                                globalQueue.a(taskB);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.g0.b();
            this.f0.b();
            while (true) {
                if (worker != null) {
                    taskA = worker.a(true);
                    if (taskA == null) {
                        taskA = (Task) this.f0.d();
                        if (taskA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    taskA = (Task) this.f0.d();
                    if (taskA == null && (taskA = (Task) this.g0.d()) == null) {
                        break;
                    }
                }
                try {
                    taskA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (worker != null) {
                worker.h(WorkerState.f0);
            }
            i0.set(this, 0L);
            j0.set(this, 0L);
        }
    }

    public final int d() {
        synchronized (this.h0) {
            try {
                if (k0.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
                long j = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j & 2097151);
                int i3 = i2 - ((int) ((j & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.X) {
                    return 0;
                }
                if (i2 >= this.f45059Y) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.h0.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Worker worker = new Worker(i4);
                this.h0.c(i4, worker);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                worker.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(this, runnable, 6);
    }

    public final void h(Runnable runnable, boolean z2, boolean z3) {
        Task taskImpl;
        WorkerState workerState;
        TasksKt.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof Task) {
            taskImpl = (Task) runnable;
            taskImpl.X = jNanoTime;
            taskImpl.f45065Y = z2;
        } else {
            taskImpl = new TaskImpl(jNanoTime, runnable, z2);
        }
        boolean z4 = taskImpl.f45065Y;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j0;
        long jAddAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        Worker worker = threadCurrentThread instanceof Worker ? (Worker) threadCurrentThread : null;
        if (worker == null || !Intrinsics.a(CoroutineScheduler.this, this)) {
            worker = null;
        }
        if (worker != null && (workerState = worker.Z) != WorkerState.f0 && (taskImpl.f45065Y || workerState != WorkerState.f45061Y)) {
            worker.h0 = true;
            WorkQueue workQueue = worker.X;
            if (z3) {
                taskImpl = workQueue.a(taskImpl);
            } else {
                workQueue.getClass();
                Task task = (Task) WorkQueue.f45071b.getAndSet(workQueue, taskImpl);
                taskImpl = task == null ? null : workQueue.a(task);
            }
        }
        if (taskImpl != null) {
            if (!(taskImpl.f45065Y ? this.g0.a(taskImpl) : this.f0.a(taskImpl))) {
                throw new RejectedExecutionException(android.support.v4.media.a.r(new StringBuilder(), this.e0, " was terminated"));
            }
        }
        boolean z5 = z3 && worker != null;
        if (z4) {
            if (z5 || m() || k(jAddAndGet)) {
                return;
            }
            m();
            return;
        }
        if (z5 || m() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m();
    }

    public final void j(Worker worker, int i2, int i3) {
        while (true) {
            long j = i0.get(this);
            int i4 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object nextParkedWorker = worker.getNextParkedWorker();
                    while (true) {
                        if (nextParkedWorker == l0) {
                            i4 = -1;
                            break;
                        }
                        if (nextParkedWorker == null) {
                            i4 = 0;
                            break;
                        }
                        Worker worker2 = (Worker) nextParkedWorker;
                        int indexInArray = worker2.getIndexInArray();
                        if (indexInArray != 0) {
                            i4 = indexInArray;
                            break;
                        }
                        nextParkedWorker = worker2.getNextParkedWorker();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (i0.compareAndSet(this, j, ((long) i4) | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean k(long j) {
        int i2 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.X;
        if (i2 < i3) {
            int iD = d();
            if (iD == 1 && i3 > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        Symbol symbol;
        int indexInArray;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i0;
            long j = atomicLongFieldUpdater.get(this);
            Worker worker = (Worker) this.h0.b((int) (2097151 & j));
            if (worker == null) {
                worker = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object nextParkedWorker = worker.getNextParkedWorker();
                while (true) {
                    symbol = l0;
                    if (nextParkedWorker == symbol) {
                        indexInArray = -1;
                        break;
                    }
                    if (nextParkedWorker == null) {
                        indexInArray = 0;
                        break;
                    }
                    Worker worker2 = (Worker) nextParkedWorker;
                    indexInArray = worker2.getIndexInArray();
                    if (indexInArray != 0) {
                        break;
                    }
                    nextParkedWorker = worker2.getNextParkedWorker();
                }
                if (indexInArray >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | ((long) indexInArray))) {
                    worker.g(symbol);
                }
            }
            if (worker == null) {
                return false;
            }
            if (Worker.j0.compareAndSet(worker, -1, 0)) {
                LockSupport.unpark(worker);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.h0;
        int iA = resizableAtomicArray.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            Worker worker = (Worker) resizableAtomicArray.b(i7);
            if (worker != null) {
                WorkQueue workQueue = worker.X;
                workQueue.getClass();
                int i8 = WorkQueue.f45071b.get(workQueue) != null ? (WorkQueue.f45072c.get(workQueue) - WorkQueue.d.get(workQueue)) + 1 : WorkQueue.f45072c.get(workQueue) - WorkQueue.d.get(workQueue);
                int iOrdinal = worker.Z.ordinal();
                if (iOrdinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i4++;
                } else if (iOrdinal == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6++;
                }
            }
        }
        long j = j0.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.e0);
        sb4.append('@');
        sb4.append(DebugStringsKt.a(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.X;
        sb4.append(i9);
        sb4.append(", max = ");
        a.y(sb4, this.f45059Y, "}, Worker States {CPU = ", i2, ", blocking = ");
        a.y(sb4, i3, ", parked = ", i4, ", dormant = ");
        a.y(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f0.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.g0.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
