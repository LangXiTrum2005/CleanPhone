package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.concur;

/* JADX INFO: loaded from: classes.dex */
public final class xq0 extends FrameLayout {
    public final gq0 a;
    public concur b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq0(gq0 gmaWebView) {
        super(gmaWebView.getContext());
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        this.a = gmaWebView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(gmaWebView);
        setBackgroundColor(0);
    }

    public final gq0 a() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        concur concurVar = this.b;
        if (concurVar == null) {
            return false;
        }
        ((oa0) concurVar).a(ev);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        kn0.b("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        kn0.b("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        kn0.b("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        kn0.b("Attempting to remove ad from its container, this should not be done unless the ad is destroyed.", null);
        super.removeViews(i, i2);
    }
}
