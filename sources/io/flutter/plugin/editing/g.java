package io.flutter.plugin.editing;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputMethodManager f43281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f43282b;

    public g(View view, InputMethodManager inputMethodManager, x xVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f43282b = view;
        this.f43281a = inputMethodManager;
        xVar.f49096b = this;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 34 && this.f43281a.isStylusHandwritingAvailable();
    }

    public final boolean b() {
        return this.f43281a.isStylusHandwritingAvailable();
    }

    public final void c() {
        this.f43281a.startStylusHandwriting(this.f43282b);
    }
}
