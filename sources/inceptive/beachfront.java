package inceptive;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: compiled from: ScarInterstitialAdListener.java */
/* JADX INFO: loaded from: classes4.dex */
public class beachfront extends inceptive.saneness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.beachfront f28596dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial f28598saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final InterstitialAdLoadCallback f28599wireman = new attabal();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final FullScreenContentCallback f28597marial = new saneness();

    /* JADX INFO: compiled from: ScarInterstitialAdListener.java */
    public class attabal extends InterstitialAdLoadCallback {
        public attabal() {
        }
    }

    /* JADX INFO: compiled from: ScarInterstitialAdListener.java */
    public class saneness extends FullScreenContentCallback {
        public saneness() {
        }
    }

    public beachfront(com.unity3d.scar.adapter.common.beachfront beachfrontVar, marial marialVar) {
        this.f28596dern = beachfrontVar;
        this.f28598saneness = marialVar;
    }

    public InterstitialAdLoadCallback saneness() {
        return this.f28599wireman;
    }
}
