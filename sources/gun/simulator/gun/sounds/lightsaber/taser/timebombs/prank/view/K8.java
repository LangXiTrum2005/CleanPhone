package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: loaded from: classes4.dex */
public final class K8 extends X8 {
    private final A2 adPlayCallback;
    private final C3105bi0 adSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8(Context context, String str, C3105bi0 c3105bi0, C3573h1 c3573h1) {
        super(context, str, c3573h1);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3105bi0, "adSize");
        AbstractC2995aW.q(c3573h1, "adConfig");
        this.adSize = c3105bi0;
        Q1 adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC2995aW.o(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((N8) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new J8(this));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8
    public N8 constructAdInternal$vungle_ads_release(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        return new N8(context, this.adSize);
    }

    public final A2 getAdPlayCallback$vungle_ads_release() {
        return this.adPlayCallback;
    }

    public final C3105bi0 getAdViewSize() {
        Q1 adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC2995aW.o(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        C3105bi0 updatedAdSize$vungle_ads_release = ((N8) adInternal$vungle_ads_release).getUpdatedAdSize$vungle_ads_release();
        return updatedAdSize$vungle_ads_release == null ? this.adSize : updatedAdSize$vungle_ads_release;
    }
}
