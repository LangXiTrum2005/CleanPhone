package sg.bigo.ads.api;

import sg.bigo.ads.ad.e.h;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes7.dex */
public class RewardVideoAdLoader extends AbstractAdLoader<RewardVideoAd, RewardVideoAdRequest> {

    public static class Builder implements AdLoader.Builder<RewardVideoAd, Builder, RewardVideoAdLoader> {
        private AdLoadListener<RewardVideoAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(AdLoadListener adLoadListener) {
            return withAdLoadListener((AdLoadListener<RewardVideoAd>) adLoadListener);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public RewardVideoAdLoader build() {
            return new RewardVideoAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<RewardVideoAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public RewardVideoAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    public final /* synthetic */ Ad a(g gVar) {
        if (gVar.f47032a.x() != 4) {
            return (RewardVideoAd) super.a(gVar);
        }
        int iW = gVar.f47032a.w();
        if (iW == 1 || iW == 2) {
            return new h(gVar);
        }
        if (iW != 3) {
            return null;
        }
        return new sg.bigo.ads.ad.e.b(gVar);
    }
}
