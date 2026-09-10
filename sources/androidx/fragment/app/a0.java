package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f4244a;

    public a0(Fragment fragment) {
        this.f4244a = fragment;
    }

    @Override // androidx.fragment.app.o0
    public final View b(int i10) {
        Fragment fragment = this.f4244a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a view");
    }

    @Override // androidx.fragment.app.o0
    public final boolean c() {
        return this.f4244a.mView != null;
    }
}
