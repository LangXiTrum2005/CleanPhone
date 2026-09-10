package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.ads.mediation.vungle.VungleConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: loaded from: classes4.dex */
public final class ZZ extends AbstractC4203o9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZZ(Context context, String str, C3573h1 c3573h1) {
        super(context, str, c3573h1);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3573h1, "adConfig");
    }

    private final C2954a00 getRewardedAdInternal() {
        Q1 adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC2995aW.o(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.RewardedAdInternal");
        return (C2954a00) adInternal$vungle_ads_release;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8
    public C2954a00 constructAdInternal$vungle_ads_release(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        return new C2954a00(context);
    }

    public final void setAlertBodyText(String str) {
        AbstractC2995aW.q(str, "bodyText");
        getRewardedAdInternal().setAlertBodyText$vungle_ads_release(str);
    }

    public final void setAlertCloseButtonText(String str) {
        AbstractC2995aW.q(str, "closeButtonText");
        getRewardedAdInternal().setAlertCloseButtonText$vungle_ads_release(str);
    }

    public final void setAlertContinueButtonText(String str) {
        AbstractC2995aW.q(str, "continueButtonText");
        getRewardedAdInternal().setAlertContinueButtonText$vungle_ads_release(str);
    }

    public final void setAlertTitleText(String str) {
        AbstractC2995aW.q(str, "titleText");
        getRewardedAdInternal().setAlertTitleText$vungle_ads_release(str);
    }

    public final void setUserId(String str) {
        AbstractC2995aW.q(str, VungleConstants.KEY_USER_ID);
        getRewardedAdInternal().setUserId$vungle_ads_release(str);
    }

    public /* synthetic */ ZZ(Context context, String str, C3573h1 c3573h1, int i, AbstractC2471Hm abstractC2471Hm) {
        this(context, str, (i & 4) != 0 ? new C3573h1() : c3573h1);
    }
}
