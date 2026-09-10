package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DelayKt {
    public static final Object a(long j, Continuation continuation) throws Throwable {
        Unit unit = Unit.f43263a;
        if (j > 0) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
            cancellableContinuationImpl.q();
            if (j < Long.MAX_VALUE) {
                b(cancellableContinuationImpl.f0).S(j, cancellableContinuationImpl);
            }
            Object objP = cancellableContinuationImpl.p();
            if (objP == CoroutineSingletons.X) {
                return objP;
            }
        }
        return unit;
    }

    public static final Delay b(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.Key.X);
        Delay delay = element instanceof Delay ? (Delay) element : null;
        return delay == null ? DefaultExecutorKt.f44750a : delay;
    }

    public static final long c(long j) {
        Duration.Companion companion = Duration.f44719Y;
        boolean z2 = j > 0;
        if (z2) {
            return Duration.f(Duration.i(j, DurationKt.h(999999L, DurationUnit.NANOSECONDS)));
        }
        if (z2) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
