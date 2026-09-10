package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleController implements LifecycleEventObserver {
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final SavedStateHandle f5262Y;
    public boolean Z;

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.X = str;
        this.f5262Y = savedStateHandle;
    }

    public final void a(Lifecycle lifecycle, SavedStateRegistry registry) {
        Intrinsics.f(registry, "registry");
        Intrinsics.f(lifecycle, "lifecycle");
        if (this.Z) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.Z = true;
        lifecycle.a(this);
        registry.c(this.X, this.f5262Y.f5261e);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.Z = false;
            lifecycleOwner.getLifecycle().c(this);
        }
    }
}
