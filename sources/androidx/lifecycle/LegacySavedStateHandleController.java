package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacySavedStateHandleController {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public final void a(SavedStateRegistryOwner savedStateRegistryOwner) {
            if (!(savedStateRegistryOwner instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
            SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f5292a;
            for (String key : new HashSet(linkedHashMap.keySet())) {
                Intrinsics.f(key, "key");
                ViewModel viewModel = (ViewModel) linkedHashMap.get(key);
                Intrinsics.c(viewModel);
                LegacySavedStateHandleController.a(viewModel, savedStateRegistry, savedStateRegistryOwner.getLifecycle());
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final void a(ViewModel viewModel, SavedStateRegistry registry, Lifecycle lifecycle) {
        Object obj;
        Intrinsics.f(registry, "registry");
        Intrinsics.f(lifecycle, "lifecycle");
        HashMap map = viewModel.f5279a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = viewModel.f5279a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.Z) {
            return;
        }
        savedStateHandleController.a(lifecycle, registry);
        b(lifecycle, registry);
    }

    public static void b(final Lifecycle lifecycle, final SavedStateRegistry savedStateRegistry) {
        Lifecycle.State d = lifecycle.getD();
        if (d == Lifecycle.State.f5232Y || d.compareTo(Lifecycle.State.e0) >= 0) {
            savedStateRegistry.d();
        } else {
            lifecycle.a(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.c(this);
                        savedStateRegistry.d();
                    }
                }
            });
        }
    }
}
