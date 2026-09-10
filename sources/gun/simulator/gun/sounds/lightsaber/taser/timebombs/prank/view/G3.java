package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.rewarded.RewardedAd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class G3 extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f3101a;
    public final C3644hn0 b;
    public final /* synthetic */ XZ c;
    public final /* synthetic */ QI d;
    public final /* synthetic */ RewardedAd e;
    public final /* synthetic */ H3 f;

    public G3(H3 h3, XZ xz, WeakReference weakReference, QI qi, RewardedAd rewardedAd) {
        this.f = h3;
        this.c = xz;
        this.d = qi;
        this.e = rewardedAd;
        this.f3101a = (C3491g4) xz.f3354a;
        Context applicationContext = ((Activity) weakReference.get()).getApplicationContext();
        h3.getClass();
        this.b = new C3644hn0(h3, qi, xz, new WeakReference(applicationContext));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        Context contextJ = X0.j.j();
        XZ xz = this.c;
        this.f.n(contextJ, (C3491g4) xz.f3354a, (String) xz.b);
        this.b.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        RewardedAd rewardedAd = this.e;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
        }
        H3 h3 = this.f;
        h3.g = null;
        this.b.onAdDismissedFullScreenContent();
        C3491g4 c3491g4 = this.f3101a;
        synchronized (h3.l) {
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        RewardedAd rewardedAd = this.e;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
        }
        H3 h3 = this.f;
        h3.g = null;
        this.b.onAdFailedToShowFullScreenContent(adError);
        C3491g4 c3491g4 = this.f3101a;
        synchronized (h3.l) {
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        this.b.onAdImpression();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        H3 h3 = this.f;
        C3491g4 c3491g4 = (C3491g4) this.c.f3354a;
        QI qi = this.d;
        synchronized (h3.l) {
            h3.l.put(c3491g4, qi);
        }
        H3 h4 = this.f;
        Context contextJ = X0.j.j();
        XZ xz = this.c;
        h4.E(contextJ, (C3491g4) xz.f3354a, (String) xz.b);
        this.b.onAdShowedFullScreenContent();
    }
}
