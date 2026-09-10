package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class HQ implements InterfaceC5156z2 {
    final /* synthetic */ PQ this$0;

    public HQ(PQ pq) {
        this.this$0 = pq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdClick$lambda-3, reason: not valid java name */
    public static final void m164onAdClick$lambda3(PQ pq) {
        AbstractC2995aW.q(pq, "this$0");
        Y8 adListener = pq.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(pq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdEnd$lambda-2, reason: not valid java name */
    public static final void m165onAdEnd$lambda2(PQ pq) {
        AbstractC2995aW.q(pq, "this$0");
        Y8 adListener = pq.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(pq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdImpression$lambda-1, reason: not valid java name */
    public static final void m166onAdImpression$lambda1(PQ pq) {
        AbstractC2995aW.q(pq, "this$0");
        Y8 adListener = pq.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(pq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdLeftApplication$lambda-4, reason: not valid java name */
    public static final void m167onAdLeftApplication$lambda4(PQ pq) {
        AbstractC2995aW.q(pq, "this$0");
        Y8 adListener = pq.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(pq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdStart$lambda-0, reason: not valid java name */
    public static final void m168onAdStart$lambda0(PQ pq) {
        AbstractC2995aW.q(pq, "this$0");
        Y8 adListener = pq.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(pq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onFailure$lambda-5, reason: not valid java name */
    public static final void m169onFailure$lambda5(PQ pq, Ei0 ei0) {
        AbstractC2995aW.q(pq, "this$0");
        AbstractC2995aW.q(ei0, "$error");
        Y8 adListener = pq.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(pq, ei0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdClick(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new GQ(this.this$0, 4));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdEnd(String str) {
        this.this$0.getAdInternal$vungle_ads_release().setAdState(B1.FINISHED);
        C3622hc0.INSTANCE.runOnUiThread(new GQ(this.this$0, 1));
        this.this$0.getShowToCloseMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getShowToCloseMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdImpression(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new GQ(this.this$0, 0));
        this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdLeftApplication(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new GQ(this.this$0, 3));
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getLeaveApplicationMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdStart(String str) {
        this.this$0.getAdInternal$vungle_ads_release().setAdState(B1.PLAYING);
        this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
        this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
        C3622hc0.INSTANCE.runOnUiThread(new GQ(this.this$0, 2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onFailure(Ei0 ei0) {
        AbstractC2995aW.q(ei0, "error");
        this.this$0.getAdInternal$vungle_ads_release().setAdState(B1.ERROR);
        C3622hc0.INSTANCE.runOnUiThread(new Ff0(8, this.this$0, ei0));
        this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
        C2961a4.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), String.valueOf(ei0.getCode()));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdRewarded(String str) {
    }
}
