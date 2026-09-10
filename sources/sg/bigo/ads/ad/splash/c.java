package sg.bigo.ads.ad.splash;

import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* JADX INFO: loaded from: classes7.dex */
public class c implements SplashAdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SplashAdInteractionListener f46955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SplashAdInteractionListener f46956c;
    private boolean d = false;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        SplashAdInteractionListener splashAdInteractionListener = this.f46955b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdClicked();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f46956c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
        SplashAdInteractionListener splashAdInteractionListener = this.f46955b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdClosed();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f46956c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdClosed();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(AdError adError) {
        if (adError.getCode() == 2002 && this.d) {
            sg.bigo.ads.common.t.a.a(0, 3, "SplashAdInteractionListenerWrapper", "don't call onAdError when video has impressed");
            return;
        }
        SplashAdInteractionListener splashAdInteractionListener = this.f46955b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdError(adError);
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f46956c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdError(adError);
        }
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public void onAdFinished() {
        if (this.f46954a) {
            return;
        }
        SplashAdInteractionListener splashAdInteractionListener = this.f46955b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdFinished();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f46956c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdFinished();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdImpression() {
        SplashAdInteractionListener splashAdInteractionListener = this.f46955b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdImpression();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f46956c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdImpression();
        }
        this.d = true;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdOpened() {
        SplashAdInteractionListener splashAdInteractionListener = this.f46955b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdOpened();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f46956c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdOpened();
        }
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public void onAdSkipped() {
        SplashAdInteractionListener splashAdInteractionListener = this.f46955b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdSkipped();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.f46956c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdSkipped();
        }
        this.f46954a = true;
    }
}
