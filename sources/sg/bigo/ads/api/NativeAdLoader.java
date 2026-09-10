package sg.bigo.ads.api;

import com.p004ironsource.ne;
import java.util.Map;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* JADX INFO: loaded from: classes7.dex */
public class NativeAdLoader extends AbstractAdLoader<NativeAd, NativeAdRequest> {

    public static class Builder implements AdLoader.Builder<NativeAd, Builder, NativeAdLoader> {
        private AdLoadListener<NativeAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public /* bridge */ /* synthetic */ AdLoader.Builder withAdLoadListener(AdLoadListener adLoadListener) {
            return withAdLoadListener((AdLoadListener<NativeAd>) adLoadListener);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public NativeAdLoader build() {
            return new NativeAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<NativeAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public NativeAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    public final /* synthetic */ Ad a(g gVar) {
        Map<String, String> map;
        if (gVar.f47032a.x() != 1) {
            return (NativeAd) super.a(gVar);
        }
        sg.bigo.ads.ad.b.c cVarA = sg.bigo.ads.ad.b.a.a(gVar);
        if (cVarA != null) {
            sg.bigo.ads.api.core.c cVar = (sg.bigo.ads.core.a.a) cVarA.f();
            if ((cVar instanceof sg.bigo.ads.controller.c.b) && cVar.al() && (map = ((sg.bigo.ads.controller.c.b) cVar).f47943B) != null && !q.a((Object) ne.H0) && !q.a((Object) "1") && !map.containsKey(ne.H0)) {
                map.put(ne.H0, "1");
            }
        }
        return cVarA;
    }
}
