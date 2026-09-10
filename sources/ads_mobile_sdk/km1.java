package ads_mobile_sdk;

import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.spatterdash;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class km1 implements spatterdash {
    public final yj1 a;
    public final hb1 b;

    public km1(yj1 nativeAdCore) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.a = nativeAdCore;
        this.b = new hb1();
    }

    @Override // saneness.spatterdash
    public final Object a(boolean z, wretchedly.dern dernVar) {
        FrameLayout nativeAdView;
        if (z && this.b.b() && (nativeAdView = ((cm1) ((technofreak) this.b.a("The backing field has not yet been initialized."))).c()) != null) {
            Map assetViews = ((cm1) ((technofreak) this.b.a("The backing field has not yet been initialized."))).b();
            ImageView.ScaleType mediaviewScaleType = ((cm1) ((technofreak) this.b.a("The backing field has not yet been initialized."))).e();
            if (mediaviewScaleType == null) {
                mediaviewScaleType = gm1.i;
            }
            yj1 yj1Var = this.a;
            yj1Var.getClass();
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(assetViews, "assetViews");
            Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
            if (!yj1Var.a.getAndSet(true)) {
                yj1Var.a(nativeAdView, mediaviewScaleType, assetViews);
            }
        }
        return Unit.f29295attabal;
    }
}
