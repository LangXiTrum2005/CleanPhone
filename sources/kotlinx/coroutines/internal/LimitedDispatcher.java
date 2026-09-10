package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097A¢\u0006\u0004\b\u0006\u0010\u0007R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "", "time", "", "delay", "(J)V", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h0 = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Delay f45033Y;
    public final CoroutineDispatcher Z;
    public final int e0;
    public final LockFreeTaskQueue f0;
    public final Object g0;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Worker implements Runnable {
        public Runnable X;

        public Worker(Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i2 = 0;
            while (true) {
                try {
                    this.X.run();
                } catch (Throwable th) {
                    CoroutineExceptionHandlerKt.a(EmptyCoroutineContext.X, th);
                }
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LimitedDispatcher.h0;
                LimitedDispatcher limitedDispatcher = LimitedDispatcher.this;
                Runnable runnableJ0 = limitedDispatcher.j0();
                if (runnableJ0 == null) {
                    return;
                }
                this.X = runnableJ0;
                i2++;
                if (i2 >= 16) {
                    CoroutineDispatcher coroutineDispatcher = limitedDispatcher.Z;
                    if (coroutineDispatcher.c0(limitedDispatcher)) {
                        coroutineDispatcher.U(limitedDispatcher, this);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i2) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.f45033Y = delay == null ? DefaultExecutorKt.f44750a : delay;
        this.Z = coroutineDispatcher;
        this.e0 = i2;
        this.f0 = new LockFreeTaskQueue();
        this.g0 = new Object();
    }

    @Override // kotlinx.coroutines.Delay
    public final void S(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f45033Y.S(j, cancellableContinuationImpl);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableJ0;
        this.f0.a(runnable);
        if (h0.get(this) >= this.e0 || !q0() || (runnableJ0 = j0()) == null) {
            return;
        }
        this.Z.U(this, new Worker(runnableJ0));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void Y(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableJ0;
        this.f0.a(runnable);
        if (h0.get(this) >= this.e0 || !q0() || (runnableJ0 = j0()) == null) {
            return;
        }
        this.Z.Y(this, new Worker(runnableJ0));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher e0(int i2) {
        LimitedDispatcherKt.a(1);
        return 1 >= this.e0 ? this : super.e0(1);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f45033Y.i(j, runnable, coroutineContext);
    }

    public final Runnable j0() {
        while (true) {
            Runnable runnable = (Runnable) this.f0.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.g0) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f0.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean q0() {
        synchronized (this.g0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0;
            if (atomicIntegerFieldUpdater.get(this) >= this.e0) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.Z);
        sb.append(".limitedParallelism(");
        return android.support.v4.media.a.p(sb, this.e0, ')');
    }
}
