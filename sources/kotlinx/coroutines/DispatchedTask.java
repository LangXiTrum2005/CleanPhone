package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DispatchedTask<T> extends Task {
    public int Z;

    public DispatchedTask(int i2) {
        super(0L, false);
        this.Z = i2;
    }

    /* JADX INFO: renamed from: d */
    public abstract Continuation getE0();

    public Throwable e(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.f44747a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th) {
        CoroutineExceptionHandlerKt.a(getE0().getF45023Y(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation e0 = getE0();
            Intrinsics.d(e0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) e0;
            ContinuationImpl continuationImpl = dispatchedContinuation.f0;
            Object obj = dispatchedContinuation.h0;
            CoroutineContext z2 = continuationImpl.getF45023Y();
            Object objC = ThreadContextKt.c(z2, obj);
            Job job = null;
            UndispatchedCoroutine undispatchedCoroutineC = objC != ThreadContextKt.f45048a ? CoroutineContextKt.c(continuationImpl, z2, objC) : null;
            try {
                CoroutineContext z3 = continuationImpl.getF45023Y();
                Object objI = i();
                Throwable thE = e(objI);
                if (thE == null) {
                    int i2 = this.Z;
                    boolean z4 = true;
                    if (i2 != 1 && i2 != 2) {
                        z4 = false;
                    }
                    if (z4) {
                        job = (Job) z3.get(Job.Key.X);
                    }
                }
                if (job != null && !job.isActive()) {
                    CancellationException cancellationExceptionP = job.p();
                    b(cancellationExceptionP);
                    continuationImpl.resumeWith(ResultKt.a(cancellationExceptionP));
                } else if (thE != null) {
                    continuationImpl.resumeWith(ResultKt.a(thE));
                } else {
                    continuationImpl.resumeWith(g(objI));
                }
            } finally {
                if (undispatchedCoroutineC == null || undispatchedCoroutineC.t0()) {
                    ThreadContextKt.a(z2, objC);
                }
            }
        } catch (Throwable th) {
            h(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }
}
