package ads_mobile_sdk;

import android.widget.FrameLayout;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.technofreak;
import saneness.webby;

/* JADX INFO: loaded from: classes.dex */
public final class om1 {
    public final webby a;
    public final km1 b;
    public final uo1 c;

    public om1(webby nativeAdViewabilityMonitor, km1 nativeAdViewVisibilityChangedListenerImpl, uo1 nativeMediaViewFullyVisibleEventListenerImpl) {
        Intrinsics.checkNotNullParameter(nativeAdViewabilityMonitor, "nativeAdViewabilityMonitor");
        Intrinsics.checkNotNullParameter(nativeAdViewVisibilityChangedListenerImpl, "nativeAdViewVisibilityChangedListenerImpl");
        Intrinsics.checkNotNullParameter(nativeMediaViewFullyVisibleEventListenerImpl, "nativeMediaViewFullyVisibleEventListenerImpl");
        this.a = nativeAdViewabilityMonitor;
        this.b = nativeAdViewVisibilityChangedListenerImpl;
        this.c = nativeMediaViewFullyVisibleEventListenerImpl;
    }

    public final void a(technofreak nativeAdViewContainer) {
        Intrinsics.checkNotNullParameter(nativeAdViewContainer, "nativeAdViewContainer");
        this.b.b.a(nativeAdViewContainer);
        this.c.c.a(nativeAdViewContainer);
        FrameLayout targetView = ((cm1) nativeAdViewContainer).c();
        if (targetView != null) {
            webby webbyVar = this.a;
            webbyVar.getClass();
            Intrinsics.checkNotNullParameter(targetView, "targetView");
            webbyVar.e = targetView;
            webbyVar.f = true;
            webbyVar.a(targetView);
        }
    }
}
