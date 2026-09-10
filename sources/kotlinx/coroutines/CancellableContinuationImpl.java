package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006R\u000b\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004R\u0013\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004R\u0013\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "Lkotlinx/coroutines/DisposableHandle;", "_parentHandle", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame, Waiter {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g0 = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h0 = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Continuation e0;
    public final CoroutineContext f0;

    public CancellableContinuationImpl(int i2, Continuation continuation) {
        super(i2);
        this.e0 = continuation;
        this.f0 = continuation.getZ();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Active.X;
    }

    public static Object C(NotCompleted notCompleted, Object obj, int i2, Function3 function3) {
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (function3 != null || (notCompleted instanceof CancelHandler)) {
            return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function3, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void v(NotCompleted notCompleted, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + notCompleted + ", already has " + obj).toString());
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void A(Object obj) {
        n(this.Z);
    }

    public final void B(CoroutineDispatcher coroutineDispatcher, Object obj) {
        Continuation continuation = this.e0;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        z(obj, (dispatchedContinuation != null ? dispatchedContinuation.e0 : null) == coroutineDispatcher ? 4 : this.Z, null);
    }

    public final Symbol D(Object obj, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof NotCompleted;
            Symbol symbol = CancellableContinuationImplKt.f44740a;
            if (!z2) {
                boolean z3 = obj2 instanceof CompletedContinuation;
                return null;
            }
            Object objC = C((NotCompleted) obj2, obj, this.Z, function3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!u()) {
                        m();
                    }
                    return symbol;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public final void a(Segment segment, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = g0;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        t(segment);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof CompletedExceptionally) {
                return;
            }
            if (!(obj instanceof CompletedContinuation)) {
                cancellationException2 = cancellationException;
                CompletedContinuation completedContinuation = new CompletedContinuation(obj, (CancelHandler) null, (Function3) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuation)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj;
            if (completedContinuation2.f44745e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            CompletedContinuation completedContinuationA = CompletedContinuation.a(completedContinuation2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuationA)) {
                    CancelHandler cancelHandler = completedContinuation2.f44743b;
                    if (cancelHandler != null) {
                        j(cancelHandler, cancellationException);
                    }
                    Function3 function3 = completedContinuation2.f44744c;
                    if (function3 != null) {
                        k(function3, cancellationException, completedContinuation2.f44742a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Symbol c(Object obj, Function3 function3) {
        return D(obj, function3);
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Continuation getE0() {
        return this.e0;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean f(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            CancelledContinuation cancelledContinuation = new CancelledContinuation(this, th, (obj instanceof CancelHandler) || (obj instanceof Segment));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, cancelledContinuation)) {
                    NotCompleted notCompleted = (NotCompleted) obj;
                    if (notCompleted instanceof CancelHandler) {
                        j((CancelHandler) obj, th);
                    } else if (notCompleted instanceof Segment) {
                        l((Segment) obj, th);
                    }
                    if (!u()) {
                        m();
                    }
                    n(this.Z);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object g(Object obj) {
        return obj instanceof CompletedContinuation ? ((CompletedContinuation) obj).f44742a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.e0;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final CoroutineContext getZ() {
        return this.f0;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object i() {
        return h0.get(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean isActive() {
        return h0.get(this) instanceof NotCompleted;
    }

    public final void j(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.b(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.a(this.f0, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(Function3 function3, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.f0;
        try {
            function3.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.a(coroutineContext, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(Segment segment, Throwable th) {
        CoroutineContext coroutineContext = this.f0;
        int i2 = g0.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment.h(i2, coroutineContext);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.a(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
        DisposableHandle disposableHandle = (DisposableHandle) atomicReferenceFieldUpdater.get(this);
        if (disposableHandle == null) {
            return;
        }
        disposableHandle.dispose();
        atomicReferenceFieldUpdater.set(this, NonDisposableHandle.X);
    }

    public final void n(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = g0;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                Continuation continuation = this.e0;
                boolean z2 = i2 == 4;
                if (!z2 && (continuation instanceof DispatchedContinuation)) {
                    boolean z3 = i2 == 1 || i2 == 2;
                    int i5 = this.Z;
                    if (z3 == (i5 == 1 || i5 == 2)) {
                        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
                        CoroutineContext f0 = dispatchedContinuation.f0.getZ();
                        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.e0;
                        if (coroutineDispatcher.c0(f0)) {
                            coroutineDispatcher.U(f0, this);
                            return;
                        }
                        EventLoop eventLoopA = ThreadLocalEventLoop.a();
                        if (eventLoopA.f44753Y >= 4294967296L) {
                            eventLoopA.n0(this);
                            return;
                        }
                        eventLoopA.q0(true);
                        try {
                            DispatchedTaskKt.a(this, continuation, true);
                            do {
                            } while (eventLoopA.t0());
                        } catch (Throwable th) {
                            try {
                                h(th);
                            } finally {
                                eventLoopA.j0(true);
                            }
                        }
                        return;
                    }
                }
                DispatchedTaskKt.a(this, continuation, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable o(JobSupport jobSupport) {
        return jobSupport.p();
    }

    public final Object p() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean zU = u();
        do {
            atomicIntegerFieldUpdater = g0;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zU) {
                    y();
                }
                Object obj = h0.get(this);
                if (obj instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) obj).f44747a;
                }
                int i4 = this.Z;
                if (i4 == 1 || i4 == 2) {
                    Job job = (Job) this.f0.get(Job.Key.X);
                    if (job != null && !job.isActive()) {
                        CancellationException cancellationExceptionP = job.p();
                        b(cancellationExceptionP);
                        throw cancellationExceptionP;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((DisposableHandle) i0.get(this)) == null) {
            r();
        }
        if (zU) {
            y();
        }
        return CoroutineSingletons.X;
    }

    public final void q() {
        DisposableHandle disposableHandleR = r();
        if (disposableHandleR == null || (h0.get(this) instanceof NotCompleted)) {
            return;
        }
        disposableHandleR.dispose();
        i0.set(this, NonDisposableHandle.X);
    }

    public final DisposableHandle r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Job job = (Job) this.f0.get(Job.Key.X);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleC = JobKt.c(job, true, new ChildContinuation(this));
        do {
            atomicReferenceFieldUpdater = i0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, disposableHandleC)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return disposableHandleC;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new CompletedExceptionally(false, thA);
        }
        z(obj, this.Z, null);
    }

    public final void s(Function1 function1) {
        t(new CancelHandler.UserSupplied(function1));
    }

    public final void t(NotCompleted notCompleted) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Active) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, notCompleted)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof CancelHandler) || (obj instanceof Segment)) {
                v(notCompleted, obj);
                throw null;
            }
            if (obj instanceof CompletedExceptionally) {
                CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                completedExceptionally.getClass();
                if (!CompletedExceptionally.f44746b.compareAndSet(completedExceptionally, 0, 1)) {
                    v(notCompleted, obj);
                    throw null;
                }
                if (obj instanceof CancelledContinuation) {
                    if (obj == null) {
                        completedExceptionally = null;
                    }
                    Throwable th = completedExceptionally != null ? completedExceptionally.f44747a : null;
                    if (notCompleted instanceof CancelHandler) {
                        j((CancelHandler) notCompleted, th);
                        return;
                    } else {
                        Intrinsics.d(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((Segment) notCompleted, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof CompletedContinuation)) {
                if (notCompleted instanceof Segment) {
                    return;
                }
                Intrinsics.d(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                CompletedContinuation completedContinuation = new CompletedContinuation(obj, (CancelHandler) notCompleted, (Function3) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuation)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            CompletedContinuation completedContinuation2 = (CompletedContinuation) obj;
            if (completedContinuation2.f44743b != null) {
                v(notCompleted, obj);
                throw null;
            }
            if (notCompleted instanceof Segment) {
                return;
            }
            Intrinsics.d(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            CancelHandler cancelHandler = (CancelHandler) notCompleted;
            Throwable th2 = completedContinuation2.f44745e;
            if (th2 != null) {
                j(cancelHandler, th2);
                return;
            }
            CompletedContinuation completedContinuationA = CompletedContinuation.a(completedContinuation2, cancelHandler, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, completedContinuationA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(DebugStringsKt.b(this.e0));
        sb.append("){");
        Object obj = h0.get(this);
        if (obj instanceof NotCompleted) {
            str = "Active";
        } else {
            str = obj instanceof CancelledContinuation ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(DebugStringsKt.a(this));
        return sb.toString();
    }

    public final boolean u() {
        if (this.Z != 2) {
            return false;
        }
        Continuation continuation = this.e0;
        Intrinsics.d(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return DispatchedContinuation.i0.get((DispatchedContinuation) continuation) != null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void w(Object obj, Function3 function3) {
        z(obj, this.Z, function3);
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        Continuation continuation = this.e0;
        Throwable th = null;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = DispatchedContinuation.i0;
                Object obj = atomicReferenceFieldUpdater.get(dispatchedContinuation);
                Symbol symbol = DispatchedContinuationKt.f45030b;
                if (obj != symbol) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(dispatchedContinuation) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(dispatchedContinuation, symbol, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dispatchedContinuation) == symbol);
            }
            if (th == null) {
                return;
            }
            m();
            f(th);
        }
    }

    public final void z(Object obj, int i2, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                    cancelledContinuation.getClass();
                    if (CancelledContinuation.f44741c.compareAndSet(cancelledContinuation, 0, 1)) {
                        if (function3 != null) {
                            k(function3, cancelledContinuation.f44747a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objC = C((NotCompleted) obj2, obj, i2, function3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!u()) {
                        m();
                    }
                    n(i2);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
