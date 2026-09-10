package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.ServiceLocator$Companion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class X8 implements A0 {
    private final C3573h1 adConfig;
    private final InterfaceC3069bH adInternal$delegate;
    private Y8 adListener;
    private final Context context;
    private String creativeId;
    private final C5115yc0 displayToClickMetric;
    private String eventId;
    private final C3586h70 leaveApplicationMetric;
    private final C4126nJ logEntry;
    private final String placementId;
    private final C5115yc0 presentToDisplayMetric;
    private final C5115yc0 requestToResponseMetric;
    private final C5115yc0 responseToShowMetric;
    private final C3586h70 rewardedMetric;
    private final C5115yc0 showToCloseMetric;
    private final C5115yc0 showToFailMetric;
    private final InterfaceC3069bH signalManager$delegate;
    private O60 signaledAd;

    public X8(Context context, String str, C3573h1 c3573h1) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3573h1, "adConfig");
        this.context = context;
        this.placementId = str;
        this.adConfig = c3573h1;
        this.adInternal$delegate = AbstractC2340Cl.I(new U8(this));
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        this.signalManager$delegate = AbstractC2340Cl.H(EnumC4124nH.f4736a, new W8(context));
        C4126nJ c4126nJ = new C4126nJ();
        c4126nJ.setPlacementRefId$vungle_ads_release(str);
        this.logEntry = c4126nJ;
        this.requestToResponseMetric = new C5115yc0(B30.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.responseToShowMetric = new C5115yc0(B30.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new C5115yc0(B30.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new C5115yc0(B30.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new C5115yc0(B30.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new C3586h70(B30.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new C3586h70(B30.AD_REWARD_USER);
        this.showToCloseMetric = new C5115yc0(B30.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    private final void onLoadEnd() {
        this.requestToResponseMetric.markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.requestToResponseMetric, this.logEntry, (String) null, 4, (Object) null);
        this.responseToShowMetric.markStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLoadFailure$lambda-2, reason: not valid java name */
    public static final void m216onLoadFailure$lambda2(X8 x8, Ei0 ei0) {
        AbstractC2995aW.q(x8, "this$0");
        AbstractC2995aW.q(ei0, "$vungleError");
        Y8 y8 = x8.adListener;
        if (y8 != null) {
            y8.onAdFailedToLoad(x8, ei0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLoadSuccess$lambda-1, reason: not valid java name */
    public static final void m217onLoadSuccess$lambda1(X8 x8) {
        AbstractC2995aW.q(x8, "this$0");
        Y8 y8 = x8.adListener;
        if (y8 != null) {
            y8.onAdLoaded(x8);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A0
    public Boolean canPlayAd() {
        return Boolean.valueOf(Q1.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null);
    }

    public abstract Q1 constructAdInternal$vungle_ads_release(Context context);

    public final C3573h1 getAdConfig() {
        return this.adConfig;
    }

    public final Q1 getAdInternal$vungle_ads_release() {
        return (Q1) this.adInternal$delegate.getValue();
    }

    public final Y8 getAdListener() {
        return this.adListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final C5115yc0 getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final C3586h70 getLeaveApplicationMetric$vungle_ads_release() {
        return this.leaveApplicationMetric;
    }

    public final C4126nJ getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final C5115yc0 getPresentToDisplayMetric$vungle_ads_release() {
        return this.presentToDisplayMetric;
    }

    public final C5115yc0 getRequestToResponseMetric$vungle_ads_release() {
        return this.requestToResponseMetric;
    }

    public final C5115yc0 getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    public final C3586h70 getRewardedMetric$vungle_ads_release() {
        return this.rewardedMetric;
    }

    public final C5115yc0 getShowToCloseMetric$vungle_ads_release() {
        return this.showToCloseMetric;
    }

    public final C5115yc0 getShowToFailMetric$vungle_ads_release() {
        return this.showToFailMetric;
    }

    public final L60 getSignalManager$vungle_ads_release() {
        return (L60) this.signalManager$delegate.getValue();
    }

    public final O60 getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A0
    public void load(String str) {
        this.requestToResponseMetric.markStart();
        getAdInternal$vungle_ads_release().loadAd(this.placementId, str, new V8(this, str));
    }

    public void onAdLoaded$vungle_ads_release(C4980x2 c4980x2) {
        AbstractC2995aW.q(c4980x2, "advertisement");
        c4980x2.setAdConfig(this.adConfig);
        this.creativeId = c4980x2.getCreativeId();
        String strEventId = c4980x2.eventId();
        this.eventId = strEventId;
        O60 o60 = this.signaledAd;
        if (o60 == null) {
            return;
        }
        o60.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(X8 x8, Ei0 ei0) {
        AbstractC2995aW.q(x8, "baseAd");
        AbstractC2995aW.q(ei0, "vungleError");
        C3622hc0.INSTANCE.runOnUiThread(new Ff0(6, this, ei0));
        onLoadEnd();
    }

    public void onLoadSuccess$vungle_ads_release(X8 x8, String str) {
        AbstractC2995aW.q(x8, "baseAd");
        C3622hc0.INSTANCE.runOnUiThread(new RunnableC2928Zc(this, 26));
        onLoadEnd();
    }

    public final void setAdListener(Y8 y8) {
        this.adListener = y8;
    }

    public final void setSignaledAd$vungle_ads_release(O60 o60) {
        this.signaledAd = o60;
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getRequestToResponseMetric$vungle_ads_release$annotations() {
    }
}
