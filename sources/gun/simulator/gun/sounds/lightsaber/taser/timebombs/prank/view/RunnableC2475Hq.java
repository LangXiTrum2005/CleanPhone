package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2475Hq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdListener f3187a;
    public final /* synthetic */ com.facebook.ads.Ad b;

    public RunnableC2475Hq(AdListener adListener, com.facebook.ads.Ad ad) {
        this.f3187a = adListener;
        this.b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3187a.onError(this.b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
    }
}
