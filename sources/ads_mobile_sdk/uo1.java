package ads_mobile_sdk;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.panocha;
import saneness.technofreak;

/* JADX INFO: loaded from: classes.dex */
public final class uo1 implements panocha {
    public final jk0 a;
    public final yj1 b;
    public final hb1 c;

    public uo1(jk0 flags, yj1 nativeAdCore) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        this.a = flags;
        this.b = nativeAdCore;
        this.c = new hb1();
    }

    public final Unit a() {
        FrameLayout nativeAdView;
        if (this.c.b() && (nativeAdView = ((cm1) ((technofreak) this.c.a("The backing field has not yet been initialized."))).c()) != null) {
            jk0 jk0Var = this.a;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:nas_interaction_ping_enabled_decagon", X3.i.W);
            if (((Boolean) jk0Var.a("gads:nas_interaction_ping_enabled_decagon", Boolean.FALSE, zk.b)).booleanValue()) {
                Map assetViews = ((cm1) ((technofreak) this.c.a("The backing field has not yet been initialized."))).b();
                ImageView.ScaleType mediaviewScaleType = ((cm1) ((technofreak) this.c.a("The backing field has not yet been initialized."))).e();
                if (mediaviewScaleType == null) {
                    mediaviewScaleType = gm1.i;
                }
                yj1 yj1Var = this.b;
                yj1Var.getClass();
                Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
                Intrinsics.checkNotNullParameter(assetViews, "assetViews");
                Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
                if (!yj1Var.b.getAndSet(true)) {
                    yj1Var.b(nativeAdView, mediaviewScaleType, assetViews);
                }
            }
        }
        return Unit.f29295attabal;
    }
}
