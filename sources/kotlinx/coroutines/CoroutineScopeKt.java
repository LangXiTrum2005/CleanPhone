package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CoroutineScopeKt {
    public static final ContextScope a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key.X) == null) {
            coroutineContext = coroutineContext.plus(JobKt.a());
        }
        return new ContextScope(coroutineContext);
    }

    public static final ContextScope b() {
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        return new ContextScope(CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, MainDispatcherLoader.f45042a));
    }

    public static final void c(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getX().get(Job.Key.X);
        if (job != null) {
            job.a(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    public static final Object d(Function2 function2, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation, continuation.getF45023Y());
        Object objA = UndispatchedKt.a(scopeCoroutine, scopeCoroutine, function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objA;
    }

    public static final boolean e(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getX().get(Job.Key.X);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final ContextScope f(CoroutineScope coroutineScope, AbstractCoroutineContextElement abstractCoroutineContextElement) {
        return new ContextScope(coroutineScope.getX().plus(abstractCoroutineContextElement));
    }
}
