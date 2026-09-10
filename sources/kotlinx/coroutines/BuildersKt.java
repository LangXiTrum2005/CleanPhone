package kotlinx.coroutines;

import com.startapp.sdk.components.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class BuildersKt {
    public static Deferred a(CoroutineScope coroutineScope, CoroutineDispatcher coroutineDispatcher, Function2 function2, int i2) {
        CoroutineContext coroutineContext = coroutineDispatcher;
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.X;
        }
        CoroutineStart coroutineStart = CoroutineStart.X;
        CoroutineContext coroutineContextB = CoroutineContextKt.b(coroutineScope, coroutineContext);
        CoroutineStart coroutineStart2 = CoroutineStart.X;
        DeferredCoroutine deferredCoroutine = new DeferredCoroutine(coroutineContextB, true);
        deferredCoroutine.s0(coroutineStart, deferredCoroutine, function2);
        return deferredCoroutine;
    }

    public static final Job b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2) {
        CoroutineContext coroutineContextB = CoroutineContextKt.b(coroutineScope, coroutineContext);
        coroutineStart.getClass();
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart == CoroutineStart.f44749Y ? new LazyStandaloneCoroutine(coroutineContextB, function2) : new StandaloneCoroutine(coroutineContextB, true);
        lazyStandaloneCoroutine.s0(coroutineStart, lazyStandaloneCoroutine, function2);
        return lazyStandaloneCoroutine;
    }

    public static /* synthetic */ Job c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.X;
        }
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.X;
        }
        return b(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final Object d(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        EventLoop eventLoopA;
        CoroutineContext coroutineContextB;
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key.X);
        GlobalScope globalScope = GlobalScope.X;
        if (continuationInterceptor == null) {
            eventLoopA = ThreadLocalEventLoop.a();
            coroutineContextB = CoroutineContextKt.b(globalScope, coroutineContext.plus(eventLoopA));
        } else {
            if (continuationInterceptor instanceof EventLoop) {
            }
            eventLoopA = (EventLoop) ThreadLocalEventLoop.f44768a.get();
            coroutineContextB = CoroutineContextKt.b(globalScope, coroutineContext);
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(coroutineContextB, threadCurrentThread, eventLoopA);
        blockingCoroutine.s0(CoroutineStart.X, blockingCoroutine, function2);
        EventLoop eventLoop = blockingCoroutine.f0;
        if (eventLoop != null) {
            int i2 = EventLoop.f0;
            eventLoop.q0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jS0 = eventLoop != null ? eventLoop.s0() : Long.MAX_VALUE;
                if (blockingCoroutine.h()) {
                    if (eventLoop != null) {
                        int i3 = EventLoop.f0;
                        eventLoop.j0(false);
                    }
                    Object objA = JobSupportKt.a(JobSupport.X.get(blockingCoroutine));
                    CompletedExceptionally completedExceptionally = objA instanceof CompletedExceptionally ? (CompletedExceptionally) objA : null;
                    if (completedExceptionally == null) {
                        return objA;
                    }
                    throw completedExceptionally.f44747a;
                }
                LockSupport.parkNanos(blockingCoroutine, jS0);
            } catch (Throwable th) {
                if (eventLoop != null) {
                    int i4 = EventLoop.f0;
                    eventLoop.j0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        blockingCoroutine.E(interruptedException);
        throw interruptedException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object f(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Object objA;
        CoroutineContext context = continuation.getF45023Y();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new e(3))).booleanValue() ? context.plus(coroutineContext) : CoroutineContextKt.a(context, coroutineContext, false);
        JobKt.b(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation, coroutineContextPlus);
            objA = UndispatchedKt.a(scopeCoroutine, scopeCoroutine, function2);
        } else {
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key.X;
            if (Intrinsics.a(coroutineContextPlus.get(key), context.get(key))) {
                UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(continuation, coroutineContextPlus);
                CoroutineContext coroutineContext2 = undispatchedCoroutine.Z;
                Object objC = ThreadContextKt.c(coroutineContext2, null);
                try {
                    Object objA2 = UndispatchedKt.a(undispatchedCoroutine, undispatchedCoroutine, function2);
                    ThreadContextKt.a(coroutineContext2, objC);
                    objA = objA2;
                } catch (Throwable th) {
                    ThreadContextKt.a(coroutineContext2, objC);
                    throw th;
                }
            } else {
                DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(continuation, coroutineContextPlus);
                try {
                    DispatchedContinuationKt.a(Unit.f43263a, IntrinsicsKt.b(((BaseContinuationImpl) function2).create(dispatchedCoroutine, dispatchedCoroutine)));
                    do {
                        atomicIntegerFieldUpdater = DispatchedCoroutine.f0;
                        int i2 = atomicIntegerFieldUpdater.get(dispatchedCoroutine);
                        if (i2 != 0) {
                            if (i2 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objA = JobSupportKt.a(JobSupport.X.get(dispatchedCoroutine));
                            if (objA instanceof CompletedExceptionally) {
                                throw ((CompletedExceptionally) objA).f44747a;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(dispatchedCoroutine, 0, 1));
                    objA = CoroutineSingletons.X;
                } catch (Throwable th2) {
                    dispatchedCoroutine.resumeWith(ResultKt.a(th2));
                    throw th2;
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objA;
    }
}
