package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2781Tl implements InterfaceC2565Lc {
    final /* synthetic */ C4664tU $placement;
    final /* synthetic */ C2807Ul this$0;

    public C2781Tl(C2807Ul c2807Ul, C4664tU c4664tU) {
        this.this$0 = c2807Ul;
        this.$placement = c4664tU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onFailure$lambda-1, reason: not valid java name */
    public static final void m211onFailure$lambda1(C2807Ul c2807Ul, Throwable th) {
        AbstractC2995aW.q(c2807Ul, "this$0");
        c2807Ul.onAdLoadFailed(c2807Ul.retrofitToVungleError(th).setLogEntry$vungle_ads_release(c2807Ul.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResponse$lambda-0, reason: not valid java name */
    public static final void m212onResponse$lambda0(C2807Ul c2807Ul, C4664tU c4664tU, C5109yZ c5109yZ) {
        AbstractC2995aW.q(c2807Ul, "this$0");
        AbstractC2995aW.q(c4664tU, "$placement");
        if (c2807Ul.getVungleApiClient().getRetryAfterHeaderValue(c4664tU.getReferenceId()) > 0) {
            c2807Ul.onAdLoadFailed(new K2().setLogEntry$vungle_ads_release(c2807Ul.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        if (c5109yZ != null && !c5109yZ.isSuccessful()) {
            c2807Ul.onAdLoadFailed(new C3041b("ads API: " + c5109yZ.code()).setLogEntry$vungle_ads_release(c2807Ul.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            C4980x2 c4980x2 = c5109yZ != null ? (C4980x2) c5109yZ.body() : null;
            if ((c4980x2 != null ? c4980x2.adUnit() : null) == null) {
                c2807Ul.onAdLoadFailed(new H2("Ad response is empty").setLogEntry$vungle_ads_release(c2807Ul.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            } else {
                c2807Ul.handleAdMetaData$vungle_ads_release(c4980x2, new C3586h70(B30.CONFIG_LOADED_FROM_AD_LOAD));
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2565Lc
    public void onFailure(InterfaceC2435Gc interfaceC2435Gc, Throwable th) {
        ((C4893w20) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new Ff0(13, this.this$0, th));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2565Lc
    public void onResponse(InterfaceC2435Gc interfaceC2435Gc, C5109yZ c5109yZ) {
        ((C4893w20) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new RunnableC4746uO(this.this$0, this.$placement, c5109yZ, 17));
    }
}
