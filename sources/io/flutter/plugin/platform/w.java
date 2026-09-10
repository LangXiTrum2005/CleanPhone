package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f43389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f43390b;

    public w(View view, v vVar) {
        this.f43389a = view;
        this.f43390b = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        v vVar = this.f43390b;
        if (vVar == null) {
            return;
        }
        vVar.run();
        this.f43390b = null;
        this.f43389a.post(new v(this, 1));
    }
}
