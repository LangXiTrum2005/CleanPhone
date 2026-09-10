package androidx.fragment.app;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends q0 implements c0.d, c0.e, b0.m0, b0.n0, androidx.lifecycle.d1, f.v, h.i, j4.g, l1, m0.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f4380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f4380e = fragmentActivity;
    }

    @Override // m0.n
    public final void addMenuProvider(m0.r rVar) {
        this.f4380e.addMenuProvider(rVar);
    }

    @Override // c0.d
    public final void addOnConfigurationChangedListener(l0.a aVar) {
        this.f4380e.addOnConfigurationChangedListener(aVar);
    }

    @Override // b0.m0
    public final void addOnMultiWindowModeChangedListener(l0.a aVar) {
        this.f4380e.addOnMultiWindowModeChangedListener(aVar);
    }

    @Override // b0.n0
    public final void addOnPictureInPictureModeChangedListener(l0.a aVar) {
        this.f4380e.addOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // c0.e
    public final void addOnTrimMemoryListener(l0.a aVar) {
        this.f4380e.addOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.o0
    public final View b(int i10) {
        return this.f4380e.findViewById(i10);
    }

    @Override // androidx.fragment.app.o0
    public final boolean c() {
        Window window = this.f4380e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // h.i
    public final h.h getActivityResultRegistry() {
        return this.f4380e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.o getLifecycle() {
        return this.f4380e.f4222c;
    }

    @Override // f.v
    public final f.t getOnBackPressedDispatcher() {
        return this.f4380e.getOnBackPressedDispatcher();
    }

    @Override // j4.g
    public final j4.e getSavedStateRegistry() {
        return this.f4380e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.d1
    public final androidx.lifecycle.c1 getViewModelStore() {
        return this.f4380e.getViewModelStore();
    }

    @Override // m0.n
    public final void removeMenuProvider(m0.r rVar) {
        this.f4380e.removeMenuProvider(rVar);
    }

    @Override // c0.d
    public final void removeOnConfigurationChangedListener(l0.a aVar) {
        this.f4380e.removeOnConfigurationChangedListener(aVar);
    }

    @Override // b0.m0
    public final void removeOnMultiWindowModeChangedListener(l0.a aVar) {
        this.f4380e.removeOnMultiWindowModeChangedListener(aVar);
    }

    @Override // b0.n0
    public final void removeOnPictureInPictureModeChangedListener(l0.a aVar) {
        this.f4380e.removeOnPictureInPictureModeChangedListener(aVar);
    }

    @Override // c0.e
    public final void removeOnTrimMemoryListener(l0.a aVar) {
        this.f4380e.removeOnTrimMemoryListener(aVar);
    }

    @Override // androidx.fragment.app.l1
    public final void a(Fragment fragment) {
    }
}
