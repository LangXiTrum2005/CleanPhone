package sg.bigo.ads.api;

import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes7.dex */
public class IconAdsLoader extends AbstractAdLoader<IconAds, IconAdsRequest> {

    public static class a implements AdLoader.Builder<IconAds, a, IconAdsLoader> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AdLoadListener<IconAds> f46960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46961b;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public final /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(AdLoadListener adLoadListener) {
            this.f46960a = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public final /* bridge */ /* synthetic */ AdLoader.Builder withExt(String str) {
            this.f46961b = str;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IconAdsLoader build() {
            return new IconAdsLoader(this);
        }
    }

    public IconAdsLoader(a aVar) {
        super(aVar.f46960a, aVar.f46961b);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    public final /* synthetic */ Ad a(b bVar, g[] gVarArr) {
        return new sg.bigo.ads.ad.a.a(bVar, gVarArr);
    }
}
