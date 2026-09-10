package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2807Ul extends AbstractC3325e9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2807Ul(Context context, VungleApiClient vungleApiClient, InterfaceC4615ss interfaceC4615ss, C3080bS c3080bS, InterfaceC2526Jp interfaceC2526Jp, ZT zt, F2 f2) {
        super(context, vungleApiClient, interfaceC4615ss, c3080bS, interfaceC2526Jp, zt, f2);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(vungleApiClient, "vungleApiClient");
        AbstractC2995aW.q(interfaceC4615ss, "sdkExecutors");
        AbstractC2995aW.q(c3080bS, "omInjector");
        AbstractC2995aW.q(interfaceC2526Jp, "downloader");
        AbstractC2995aW.q(zt, "pathProvider");
        AbstractC2995aW.q(f2, "adRequest");
    }

    private final void fetchAdMetadata(C3105bi0 c3105bi0, C4664tU c4664tU) {
        if (getVungleApiClient().checkIsRetryAfterActive(c4664tU.getReferenceId())) {
            onAdLoadFailed(new J2().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        InterfaceC2435Gc interfaceC2435GcRequestAd = getVungleApiClient().requestAd(c4664tU.getReferenceId(), c3105bi0);
        if (interfaceC2435GcRequestAd == null) {
            onAdLoadFailed(new CR("adsCall is null").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            ((C4662tS) interfaceC2435GcRequestAd).enqueue(new C2781Tl(this, c4664tU));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ei0 retrofitToVungleError(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return new C5189zR();
        }
        StringBuilder sb = new StringBuilder("ads request fail: ");
        sb.append(th != null ? th.getMessage() : null);
        return new CR(sb.toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3325e9
    public void requestAd() {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3325e9
    public void onAdLoadReady() {
    }
}
