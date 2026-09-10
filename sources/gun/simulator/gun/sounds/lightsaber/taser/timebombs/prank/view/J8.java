package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class J8 implements InterfaceC5156z2 {
    final /* synthetic */ K8 this$0;

    public J8(K8 k8) {
        this.this$0 = k8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdClick$lambda-3, reason: not valid java name */
    public static final void m176onAdClick$lambda3(K8 k8) {
        AbstractC2995aW.q(k8, "this$0");
        Y8 adListener = k8.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdEnd$lambda-2, reason: not valid java name */
    public static final void m177onAdEnd$lambda2(K8 k8) {
        AbstractC2995aW.q(k8, "this$0");
        Y8 adListener = k8.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdImpression$lambda-1, reason: not valid java name */
    public static final void m178onAdImpression$lambda1(K8 k8) {
        AbstractC2995aW.q(k8, "this$0");
        Y8 adListener = k8.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdLeftApplication$lambda-4, reason: not valid java name */
    public static final void m179onAdLeftApplication$lambda4(K8 k8) {
        AbstractC2995aW.q(k8, "this$0");
        Y8 adListener = k8.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdStart$lambda-0, reason: not valid java name */
    public static final void m180onAdStart$lambda0(K8 k8) {
        AbstractC2995aW.q(k8, "this$0");
        Y8 adListener = k8.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onFailure$lambda-5, reason: not valid java name */
    public static final void m181onFailure$lambda5(K8 k8, Ei0 ei0) {
        AbstractC2995aW.q(k8, "this$0");
        AbstractC2995aW.q(ei0, "$error");
        Y8 adListener = k8.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(k8, ei0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdClick(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new I8(this.this$0, 0));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdEnd(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new I8(this.this$0, 2));
        this.this$0.getShowToCloseMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getShowToCloseMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdImpression(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new I8(this.this$0, 3));
        this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdLeftApplication(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new I8(this.this$0, 1));
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getLeaveApplicationMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdStart(String str) {
        this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
        this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
        C3622hc0.INSTANCE.runOnUiThread(new I8(this.this$0, 4));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onFailure(Ei0 ei0) {
        AbstractC2995aW.q(ei0, "error");
        C3622hc0.INSTANCE.runOnUiThread(new Ff0(10, this.this$0, ei0));
        this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
        C2961a4.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), String.valueOf(ei0.getCode()));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdRewarded(String str) {
    }
}
