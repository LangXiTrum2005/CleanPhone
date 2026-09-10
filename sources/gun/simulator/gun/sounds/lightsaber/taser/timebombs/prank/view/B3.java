package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class B3 extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2851a = 0;
    public final C3644hn0 b;
    public final /* synthetic */ InterfaceC3240dB c;
    public final /* synthetic */ Jn0 d;

    public B3(C3927l3 c3927l3, WeakReference weakReference, J5 j5, BS bs, Tm0 tm0) {
        this.d = c3927l3;
        this.c = tm0;
        Context applicationContext = ((Activity) weakReference.get()).getApplicationContext();
        C3927l3 c3927l4 = C3927l3.C;
        c3927l3.getClass();
        this.b = new C3644hn0(c3927l3, bs, j5, new WeakReference(applicationContext));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        int i = this.f2851a;
        C3644hn0 c3644hn0 = this.b;
        switch (i) {
            case 0:
                c3644hn0.onAdClicked();
                ((C3) this.d).getClass();
                AbstractC3570h.x();
                X0.j.k();
                break;
            default:
                c3644hn0.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        AppOpenAd appOpenAd;
        int i = this.f2851a;
        C3644hn0 c3644hn0 = this.b;
        Jn0 jn0 = this.d;
        InterfaceC3240dB interfaceC3240dB = this.c;
        switch (i) {
            case 0:
                Sm0 sm0 = (Sm0) interfaceC3240dB;
                if (sm0 != null) {
                    InterstitialAd interstitialAd = sm0.f3735a;
                    if (interstitialAd != null) {
                        interstitialAd.setFullScreenContentCallback(null);
                    }
                    sm0.f3735a = null;
                }
                ((C3) jn0).g = null;
                c3644hn0.onAdDismissedFullScreenContent();
                break;
            default:
                Tm0 tm0 = (Tm0) interfaceC3240dB;
                if (tm0 != null && (appOpenAd = tm0.f3792a) != null) {
                    appOpenAd.setFullScreenContentCallback(null);
                }
                C3927l3 c3927l3 = C3927l3.C;
                ((C3927l3) jn0).g = null;
                c3644hn0.onAdDismissedFullScreenContent();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        InterstitialAd interstitialAd;
        AppOpenAd appOpenAd;
        int i = this.f2851a;
        C3644hn0 c3644hn0 = this.b;
        Jn0 jn0 = this.d;
        InterfaceC3240dB interfaceC3240dB = this.c;
        switch (i) {
            case 0:
                Sm0 sm0 = (Sm0) interfaceC3240dB;
                if (sm0 != null && (interstitialAd = sm0.f3735a) != null) {
                    interstitialAd.setFullScreenContentCallback(null);
                }
                ((C3) jn0).g = null;
                c3644hn0.onAdFailedToShowFullScreenContent(adError);
                break;
            default:
                Tm0 tm0 = (Tm0) interfaceC3240dB;
                if (tm0 != null && (appOpenAd = tm0.f3792a) != null) {
                    appOpenAd.setFullScreenContentCallback(null);
                }
                C3927l3 c3927l3 = C3927l3.C;
                ((C3927l3) jn0).g = null;
                c3644hn0.onAdFailedToShowFullScreenContent(adError);
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        int i = this.f2851a;
        C3644hn0 c3644hn0 = this.b;
        switch (i) {
            case 0:
                c3644hn0.onAdImpression();
                break;
            default:
                c3644hn0.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        int i = this.f2851a;
        C3644hn0 c3644hn0 = this.b;
        switch (i) {
            case 0:
                c3644hn0.onAdShowedFullScreenContent();
                break;
            default:
                c3644hn0.onAdShowedFullScreenContent();
                break;
        }
    }

    public B3(C3 c3, WeakReference weakReference, D3 d3, HS hs, Sm0 sm0) {
        this.d = c3;
        this.c = sm0;
        Context applicationContext = ((Activity) weakReference.get()).getApplicationContext();
        c3.getClass();
        this.b = new C3644hn0(c3, hs, d3, new WeakReference(applicationContext));
    }
}
