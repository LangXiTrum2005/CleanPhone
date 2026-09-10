package sg.bigo.ads.api;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements AdInteractionListener {
    public abstract void a(NativeAd nativeAd);

    public abstract void a(NativeAd nativeAd, AdError adError);

    public abstract void b(NativeAd nativeAd);

    public abstract void c(NativeAd nativeAd);

    public abstract void d(NativeAd nativeAd);

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdClicked() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdError(AdError adError) {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdImpression() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    @Deprecated
    public final void onAdOpened() {
    }
}
