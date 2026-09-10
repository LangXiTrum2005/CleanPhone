package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f43312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.f f43313b;

    public c(i3.f fVar, View view) {
        this.f43313b = fVar;
        this.f43312a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        this.f43312a.post(new com.applovin.impl.adview.o(i10, 3, this));
    }
}
