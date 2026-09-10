package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43314a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f43315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f43316c;

    public f(View.OnFocusChangeListener onFocusChangeListener, si.a aVar) {
        this.f43315b = onFocusChangeListener;
        this.f43316c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f43314a) {
            case 0:
                g gVar = (g) this.f43316c;
                this.f43315b.onFocusChange(gVar, com.bumptech.glide.d.N(gVar, new ud.t(2)));
                break;
            default:
                si.a aVar = (si.a) this.f43316c;
                this.f43315b.onFocusChange(aVar, com.bumptech.glide.d.N(aVar, new ud.t(2)));
                break;
        }
    }

    public f(g gVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f43316c = gVar;
        this.f43315b = onFocusChangeListener;
    }
}
