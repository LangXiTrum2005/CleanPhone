package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recreator implements LifecycleEventObserver {
    public final SavedStateRegistryOwner X;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/Recreator$Companion;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f8354a;

        public SavedStateProvider(SavedStateRegistry registry) {
            Intrinsics.f(registry, "registry");
            this.f8354a = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f8354a));
            return bundle;
        }
    }

    public Recreator(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.X = savedStateRegistryOwner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner.getLifecycle().c(this);
        SavedStateRegistryOwner savedStateRegistryOwner = this.X;
        Bundle bundleA = savedStateRegistryOwner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
                Intrinsics.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        Intrinsics.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((SavedStateRegistry.AutoRecreated) objNewInstance).a(savedStateRegistryOwner);
                    } catch (Exception e2) {
                        throw new RuntimeException(android.support.v4.media.a.C("Failed to instantiate ", str), e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(android.support.v4.media.a.n("Class ", str, " wasn't found"), e4);
            }
        }
    }
}
