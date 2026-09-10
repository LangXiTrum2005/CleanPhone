package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LifecycleOwnerKt {
    public static final LifecycleCoroutineScopeImpl a(LifecycleOwner lifecycleOwner) {
        Intrinsics.f(lifecycleOwner, "<this>");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Intrinsics.f(lifecycle, "<this>");
        while (true) {
            AtomicReference atomicReference = lifecycle.f5230a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            Job jobB = SupervisorKt.b();
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, MainDispatcherLoader.f45042a.j0()));
            do {
                if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                    DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
                    BuildersKt.c(lifecycleCoroutineScopeImpl2, MainDispatcherLoader.f45042a.j0(), null, new LifecycleCoroutineScopeImpl$register$1(lifecycleCoroutineScopeImpl2, null), 2);
                    return lifecycleCoroutineScopeImpl2;
                }
            } while (atomicReference.get() == null);
        }
    }
}
