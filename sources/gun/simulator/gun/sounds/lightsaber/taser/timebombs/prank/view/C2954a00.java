package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2954a00 extends AbstractC2662Ow implements InterfaceC5105yV {
    private String alertBodyText;
    private String alertCloseButtonText;
    private String alertContinueButtonText;
    private String alertTitleText;
    private String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2954a00(Context context) {
        super(context);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5105yV
    public String getAlertBodyText() {
        return this.alertBodyText;
    }

    public final String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5105yV
    public String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    public final String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5105yV
    public String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    public final String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5105yV
    public String getAlertTitleText() {
        return this.alertTitleText;
    }

    public final String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5105yV
    public String getUserId() {
        return this.userId;
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public boolean isValidAdTypeForPlacement(C4664tU c4664tU) {
        AbstractC2995aW.q(c4664tU, "placement");
        return c4664tU.isRewardedVideo();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q1
    public void renderAd$vungle_ads_release(InterfaceC5156z2 interfaceC5156z2, C4980x2 c4980x2) {
        AbstractC2995aW.q(c4980x2, "advertisement");
        J0.Companion.setPresenterDelegate$vungle_ads_release(this);
        super.renderAd$vungle_ads_release(interfaceC5156z2, c4980x2);
    }

    public final void setAlertBodyText$vungle_ads_release(String str) {
        this.alertBodyText = str;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(String str) {
        this.alertCloseButtonText = str;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(String str) {
        this.alertContinueButtonText = str;
    }

    public final void setAlertTitleText$vungle_ads_release(String str) {
        this.alertTitleText = str;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }
}
