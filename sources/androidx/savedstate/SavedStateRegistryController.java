package androidx.savedstate;

import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "Companion", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateRegistryController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedStateRegistryOwner f8359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavedStateRegistry f8360b = new SavedStateRegistry();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8361c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f8359a = savedStateRegistryOwner;
    }

    public final void a() {
        SavedStateRegistryOwner savedStateRegistryOwner = this.f8359a;
        Lifecycle lifecycle = savedStateRegistryOwner.getLifecycle();
        if (lifecycle.getD() != Lifecycle.State.f5232Y) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new Recreator(savedStateRegistryOwner));
        final SavedStateRegistry savedStateRegistry = this.f8360b;
        if (savedStateRegistry.f8356b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new LifecycleEventObserver() { // from class: androidx.savedstate.a
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                SavedStateRegistry this$0 = savedStateRegistry;
                Intrinsics.f(this$0, "this$0");
                if (event == Lifecycle.Event.ON_START) {
                    this$0.f = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    this$0.f = false;
                }
            }
        });
        savedStateRegistry.f8356b = true;
        this.f8361c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f8361c) {
            a();
        }
        Lifecycle lifecycle = this.f8359a.getLifecycle();
        if (lifecycle.getD().compareTo(Lifecycle.State.e0) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getD()).toString());
        }
        SavedStateRegistry savedStateRegistry = this.f8360b;
        if (!savedStateRegistry.f8356b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (savedStateRegistry.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        savedStateRegistry.f8357c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        savedStateRegistry.d = true;
    }

    public final void c(Bundle bundle) {
        SavedStateRegistry savedStateRegistry = this.f8360b;
        savedStateRegistry.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = savedStateRegistry.f8357c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        SafeIterableMap safeIterableMap = savedStateRegistry.f8355a;
        safeIterableMap.getClass();
        SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
        safeIterableMap.Z.put(iteratorWithAdditions, Boolean.FALSE);
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry entry = (Map.Entry) iteratorWithAdditions.next();
            bundle2.putBundle((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
