package sg.bigo.ads.api;

import sg.bigo.ads.ad.interstitial.j;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes7.dex */
public class InterstitialAdLoader extends AbstractAdLoader<InterstitialAd, InterstitialAdRequest> {

    public static class Builder implements AdLoader.Builder<InterstitialAd, Builder, InterstitialAdLoader> {
        private AdLoadListener<InterstitialAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(AdLoadListener adLoadListener) {
            return withAdLoadListener((AdLoadListener<InterstitialAd>) adLoadListener);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public InterstitialAdLoader build() {
            return new InterstitialAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<InterstitialAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public InterstitialAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    public final /* synthetic */ Ad a(g gVar) {
        if (gVar.f47032a.x() != 3 && gVar.f47032a.x() != 20) {
            return (InterstitialAd) super.a(gVar);
        }
        int iW = gVar.f47032a.w();
        if (iW == 1 || iW == 2) {
            if (j.f46341a == null) {
                j.f46341a = (k.a) sg.bigo.ads.common.r.a.a("sg.bigo.ads.api.INAdCreator", k.a.class);
            }
            k.a<?> aVar = j.f46341a;
            if (aVar == null) {
                return null;
            }
            return aVar.getAdInstance(gVar);
        }
        if (iW != 3) {
            return null;
        }
        if (j.f46342b == null) {
            j.f46342b = (k.a) sg.bigo.ads.common.r.a.a("sg.bigo.ads.api.IBAdCreator", k.a.class);
        }
        k.a<?> aVar2 = j.f46342b;
        if (aVar2 == null) {
            return null;
        }
        return aVar2.getAdInstance(gVar);
    }
}
