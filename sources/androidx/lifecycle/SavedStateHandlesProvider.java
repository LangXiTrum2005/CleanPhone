package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavedStateRegistry f5266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f5268c;
    public final Lazy d;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, final ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.f(savedStateRegistry, "savedStateRegistry");
        this.f5266a = savedStateRegistry;
        this.d = LazyKt.b(new Function0<SavedStateHandlesVM>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavedStateHandleSupport.c(viewModelStoreOwner);
            }
        });
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5268c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.d.getX()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((SavedStateHandle) entry.getValue()).f5261e.a();
            if (!Intrinsics.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f5267b = false;
        return bundle;
    }

    public final void b() {
        if (this.f5267b) {
            return;
        }
        Bundle bundleA = this.f5266a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5268c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f5268c = bundle;
        this.f5267b = true;
    }
}
