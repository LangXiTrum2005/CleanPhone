package sg.bigo.ads.api;

/* JADX INFO: loaded from: classes7.dex */
public interface RewardVideoAd extends InterstitialAd {
    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    @Deprecated
    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener);
}
