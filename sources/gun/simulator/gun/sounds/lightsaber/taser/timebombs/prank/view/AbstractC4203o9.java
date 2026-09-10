package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.o9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4203o9 extends X8 implements InterfaceC2636Nw {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4203o9(Context context, String str, C3573h1 c3573h1) {
        super(context, str, c3573h1);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3573h1, "adConfig");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A0
    public void load(String str) {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().getSignaledAd(getPlacementId()));
        super.load(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8
    public void onAdLoaded$vungle_ads_release(C4980x2 c4980x2) {
        AbstractC2995aW.q(c4980x2, "advertisement");
        super.onAdLoaded$vungle_ads_release(c4980x2);
        O60 signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release == null) {
            return;
        }
        signaledAd$vungle_ads_release.setAdAvailabilityCallbackTime(System.currentTimeMillis());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2636Nw
    public void play(Context context) {
        C2961a4 c2961a4 = C2961a4.INSTANCE;
        C2961a4.logMetric$vungle_ads_release$default(c2961a4, new C3586h70(B30.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(c2961a4, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getShowToFailMetric$vungle_ads_release().markStart();
        getShowToCloseMetric$vungle_ads_release().markStart();
        O60 signaledAd$vungle_ads_release = getSignaledAd$vungle_ads_release();
        if (signaledAd$vungle_ads_release != null) {
            signaledAd$vungle_ads_release.setPlayAdTime(System.currentTimeMillis());
            signaledAd$vungle_ads_release.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager$vungle_ads_release().registerSignaledAd(context, signaledAd$vungle_ads_release);
        }
        getAdInternal$vungle_ads_release().play(context, new C4115n9(this));
    }
}
