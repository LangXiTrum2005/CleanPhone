package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes2.dex */
public final class kp0 extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f4619a;
    public final MediationInterstitialListener b;

    public kp0(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f4619a = abstractAdViewAdapter;
        this.b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.b.onAdClosed(this.f4619a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.b.onAdOpened(this.f4619a);
    }
}
