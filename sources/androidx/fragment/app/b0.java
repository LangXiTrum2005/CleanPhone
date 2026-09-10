package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements androidx.lifecycle.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f4262a;

    public b0(Fragment fragment) {
        this.f4262a = fragment;
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
        View view;
        if (mVar != androidx.lifecycle.m.ON_STOP || (view = this.f4262a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
