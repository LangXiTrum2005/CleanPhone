package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004R\u000b\u0010\n\u001a\u00020\t8\u0016X\u0096\u0005¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/atomicfu/AtomicRef;", "", "_reusableCancellableContinuation", "Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final CoroutineDispatcher e0;
    public final ContinuationImpl f0;
    public Object g0;
    public final Object h0;

    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, ContinuationImpl continuationImpl) {
        super(-1);
        this.e0 = coroutineDispatcher;
        this.f0 = continuationImpl;
        this.g0 = DispatchedContinuationKt.f45029a;
        this.h0 = ThreadContextKt.b(continuationImpl.getF45023Y());
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* JADX INFO: renamed from: d */
    public final Continuation getE0() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return this.f0;
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF45023Y() {
        return this.f0.getF45023Y();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final Object i() {
        Object obj = this.g0;
        this.g0 = DispatchedContinuationKt.f45029a;
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        Object completedExceptionally = thA == null ? obj : new CompletedExceptionally(false, thA);
        ContinuationImpl continuationImpl = this.f0;
        CoroutineContext z2 = continuationImpl.getF45023Y();
        CoroutineDispatcher coroutineDispatcher = this.e0;
        if (coroutineDispatcher.c0(z2)) {
            this.g0 = completedExceptionally;
            this.Z = 0;
            coroutineDispatcher.U(continuationImpl.getF45023Y(), this);
            return;
        }
        EventLoop eventLoopA = ThreadLocalEventLoop.a();
        if (eventLoopA.f44753Y >= 4294967296L) {
            this.g0 = completedExceptionally;
            this.Z = 0;
            eventLoopA.n0(this);
            return;
        }
        eventLoopA.q0(true);
        try {
            CoroutineContext z3 = continuationImpl.getF45023Y();
            Object objC = ThreadContextKt.c(z3, this.h0);
            try {
                continuationImpl.resumeWith(obj);
                ThreadContextKt.a(z3, objC);
                while (eventLoopA.t0()) {
                }
            } catch (Throwable th) {
                ThreadContextKt.a(z3, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2);
            } finally {
                eventLoopA.j0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.e0 + ", " + DebugStringsKt.b(this.f0) + AbstractJsonLexerKt.END_LIST;
    }
}
