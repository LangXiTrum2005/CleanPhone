package androidx.savedstate;

import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LegacySavedStateHandleController;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "AutoRecreated", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateRegistry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f8357c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Recreator.SavedStateProvider f8358e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeIterableMap f8355a = new SafeIterableMap();
    public boolean f = true;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface AutoRecreated {
        void a(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$Companion;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface SavedStateProvider {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f8357c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f8357c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f8357c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f8357c = null;
        return bundle2;
    }

    public final SavedStateProvider b() {
        for (Map.Entry components : this.f8355a) {
            Intrinsics.e(components, "components");
            String str = (String) components.getKey();
            SavedStateProvider savedStateProvider = (SavedStateProvider) components.getValue();
            if (Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return savedStateProvider;
            }
        }
        return null;
    }

    public final void c(String str, SavedStateProvider provider) {
        Intrinsics.f(provider, "provider");
        if (((SavedStateProvider) this.f8355a.c(str, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.SavedStateProvider savedStateProvider = this.f8358e;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.f8358e = savedStateProvider;
        try {
            LegacySavedStateHandleController.OnRecreation.class.getDeclaredConstructor(new Class[0]);
            Recreator.SavedStateProvider savedStateProvider2 = this.f8358e;
            if (savedStateProvider2 != null) {
                savedStateProvider2.f8354a.add(LegacySavedStateHandleController.OnRecreation.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + LegacySavedStateHandleController.OnRecreation.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
