package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    public final Lifecycle X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final CoroutineContext f5233Y;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        Job job;
        Intrinsics.f(coroutineContext, "coroutineContext");
        this.X = lifecycle;
        this.f5233Y = coroutineContext;
        if (lifecycle.getD() != Lifecycle.State.X || (job = (Job) coroutineContext.get(Job.Key.X)) == null) {
            return;
        }
        job.a(null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF5233Y() {
        return this.f5233Y;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle lifecycle = this.X;
        if (lifecycle.getD().compareTo(Lifecycle.State.X) <= 0) {
            lifecycle.c(this);
            Job job = (Job) this.f5233Y.get(Job.Key.X);
            if (job != null) {
                job.a(null);
            }
        }
    }
}
