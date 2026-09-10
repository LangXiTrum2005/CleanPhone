package ads_mobile_sdk;

import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.emmesh;

/* JADX INFO: loaded from: classes.dex */
public final class zl1 implements emmesh {
    public final /* synthetic */ NativeAdView a;

    public zl1(NativeAdView nativeAdView) {
        this.a = nativeAdView;
    }

    public final void a(ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        cm1 nativeAdViewContainer = this.a.getNativeAdViewContainer();
        nativeAdViewContainer.getClass();
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        synchronized (nativeAdViewContainer) {
            if (nativeAdViewContainer.d.get()) {
                return;
            }
            nativeAdViewContainer.f = scaleType;
            Unit unit = Unit.f29295attabal;
        }
    }
}
