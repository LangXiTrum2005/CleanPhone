package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DispatchedContinuationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Symbol f45029a = new Symbol("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Symbol f45030b = new Symbol("REUSABLE_CLAIMED");

    public static final void a(Object obj, Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            continuation.resumeWith(obj);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Throwable thA = Result.a(obj);
        Object completedExceptionally = thA == null ? obj : new CompletedExceptionally(false, thA);
        ContinuationImpl continuationImpl = dispatchedContinuation.f0;
        CoroutineContext z2 = continuationImpl.getF0();
        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.e0;
        if (coroutineDispatcher.c0(z2)) {
            dispatchedContinuation.g0 = completedExceptionally;
            dispatchedContinuation.Z = 1;
            coroutineDispatcher.U(continuationImpl.getF0(), dispatchedContinuation);
            return;
        }
        EventLoop eventLoopA = ThreadLocalEventLoop.a();
        if (eventLoopA.f44753Y >= 4294967296L) {
            dispatchedContinuation.g0 = completedExceptionally;
            dispatchedContinuation.Z = 1;
            eventLoopA.n0(dispatchedContinuation);
            return;
        }
        eventLoopA.q0(true);
        try {
            Job job = (Job) continuationImpl.getF0().get(Job.Key.X);
            if (job == null || job.isActive()) {
                Object obj2 = dispatchedContinuation.h0;
                CoroutineContext z3 = continuationImpl.getF0();
                Object objC = ThreadContextKt.c(z3, obj2);
                UndispatchedCoroutine undispatchedCoroutineC = objC != ThreadContextKt.f45048a ? CoroutineContextKt.c(continuationImpl, z3, objC) : null;
                try {
                    continuationImpl.resumeWith(obj);
                    if (undispatchedCoroutineC == null || undispatchedCoroutineC.t0()) {
                        ThreadContextKt.a(z3, objC);
                    }
                } catch (Throwable th) {
                    if (undispatchedCoroutineC == null || undispatchedCoroutineC.t0()) {
                        ThreadContextKt.a(z3, objC);
                    }
                    throw th;
                }
            } else {
                dispatchedContinuation.resumeWith(ResultKt.a(job.p()));
            }
            while (eventLoopA.t0()) {
            }
        } catch (Throwable th2) {
            try {
                dispatchedContinuation.h(th2);
            } finally {
                eventLoopA.j0(true);
            }
        }
    }
}
