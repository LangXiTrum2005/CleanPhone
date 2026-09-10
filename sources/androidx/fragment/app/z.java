package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f4515a;

    public z(Fragment fragment) {
        this.f4515a = fragment;
    }

    @Override // androidx.fragment.app.f0
    public final void a() {
        Fragment fragment = this.f4515a;
        fragment.mSavedStateRegistryController.a();
        androidx.lifecycle.r0.d(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
