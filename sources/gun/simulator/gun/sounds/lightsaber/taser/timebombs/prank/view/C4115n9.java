package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4115n9 implements InterfaceC5156z2 {
    final /* synthetic */ AbstractC4203o9 this$0;

    public C4115n9(AbstractC4203o9 abstractC4203o9) {
        this.this$0 = abstractC4203o9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdClick$lambda-3, reason: not valid java name */
    public static final void m252onAdClick$lambda3(AbstractC4203o9 abstractC4203o9) {
        AbstractC2995aW.q(abstractC4203o9, "this$0");
        Y8 adListener = abstractC4203o9.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(abstractC4203o9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdEnd$lambda-2, reason: not valid java name */
    public static final void m253onAdEnd$lambda2(AbstractC4203o9 abstractC4203o9) {
        AbstractC2995aW.q(abstractC4203o9, "this$0");
        Y8 adListener = abstractC4203o9.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(abstractC4203o9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdImpression$lambda-1, reason: not valid java name */
    public static final void m254onAdImpression$lambda1(AbstractC4203o9 abstractC4203o9) {
        AbstractC2995aW.q(abstractC4203o9, "this$0");
        Y8 adListener = abstractC4203o9.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(abstractC4203o9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdLeftApplication$lambda-5, reason: not valid java name */
    public static final void m255onAdLeftApplication$lambda5(AbstractC4203o9 abstractC4203o9) {
        AbstractC2995aW.q(abstractC4203o9, "this$0");
        Y8 adListener = abstractC4203o9.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(abstractC4203o9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdRewarded$lambda-4, reason: not valid java name */
    public static final void m256onAdRewarded$lambda4(AbstractC4203o9 abstractC4203o9) {
        AbstractC2995aW.q(abstractC4203o9, "this$0");
        Y8 adListener = abstractC4203o9.getAdListener();
        InterfaceC3043b00 interfaceC3043b00 = adListener instanceof InterfaceC3043b00 ? (InterfaceC3043b00) adListener : null;
        if (interfaceC3043b00 != null) {
            interfaceC3043b00.onAdRewarded(abstractC4203o9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onAdStart$lambda-0, reason: not valid java name */
    public static final void m257onAdStart$lambda0(AbstractC4203o9 abstractC4203o9) {
        AbstractC2995aW.q(abstractC4203o9, "this$0");
        Y8 adListener = abstractC4203o9.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(abstractC4203o9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onFailure$lambda-6, reason: not valid java name */
    public static final void m258onFailure$lambda6(AbstractC4203o9 abstractC4203o9, Ei0 ei0) {
        AbstractC2995aW.q(abstractC4203o9, "this$0");
        AbstractC2995aW.q(ei0, "$error");
        Y8 adListener = abstractC4203o9.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(abstractC4203o9, ei0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdClick(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new RunnableC4027m9(this.this$0, 2));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdEnd(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new RunnableC4027m9(this.this$0, 3));
        this.this$0.getShowToCloseMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getShowToCloseMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdImpression(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new RunnableC4027m9(this.this$0, 5));
        this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdLeftApplication(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new RunnableC4027m9(this.this$0, 1));
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getLeaveApplicationMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdRewarded(String str) {
        C3622hc0.INSTANCE.runOnUiThread(new RunnableC4027m9(this.this$0, 4));
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.this$0.getRewardedMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onAdStart(String str) {
        this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
        this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
        C3622hc0.INSTANCE.runOnUiThread(new RunnableC4027m9(this.this$0, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5156z2
    public void onFailure(Ei0 ei0) {
        AbstractC2995aW.q(ei0, "error");
        C3622hc0.INSTANCE.runOnUiThread(new Ff0(7, this.this$0, ei0));
        this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
        C2961a4.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), String.valueOf(ei0.getCode()));
    }
}
