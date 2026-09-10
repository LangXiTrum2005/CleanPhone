package sg.bigo.ads.api;

/* JADX INFO: loaded from: classes7.dex */
public interface AdInteractionListener {
    void onAdClicked();

    void onAdClosed();

    void onAdError(AdError adError);

    void onAdImpression();

    void onAdOpened();
}
