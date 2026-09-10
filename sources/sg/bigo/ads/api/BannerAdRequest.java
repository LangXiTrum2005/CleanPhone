package sg.bigo.ads.api;

import com.thinkup.core.common.oo0.on;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class BannerAdRequest extends b<BannerAdRequest> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<AdSize> f46959h;

    public static class Builder extends c<Builder, BannerAdRequest> {
        private List<AdSize> mAdSizes;

        @Override // sg.bigo.ads.api.c
        public BannerAdRequest createAdRequest() {
            return new BannerAdRequest(this.mSlotId, this.mAdSizes, this.mServerBidPayload);
        }

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }
    }

    public BannerAdRequest(String str, List<AdSize> list, String str2) {
        super(str, str2);
        this.f46959h = new ArrayList();
        if (list != null) {
            for (AdSize adSize : list) {
                if (adSize != null) {
                    this.f46959h.add(adSize);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.b
    public final /* synthetic */ b a() {
        BannerAdRequest bannerAdRequest = new BannerAdRequest(this.f46987a, new ArrayList(this.f46959h), this.f46988b);
        bannerAdRequest.a(this.g.f46991a);
        bannerAdRequest.f46989c = this.f46989c;
        return bannerAdRequest;
    }

    @Override // sg.bigo.ads.api.b
    public final sg.bigo.ads.api.core.d b() {
        sg.bigo.ads.api.core.d dVarB = super.b();
        if (dVarB != null) {
            return dVarB;
        }
        if (this.f46959h.isEmpty()) {
            return new sg.bigo.ads.api.core.d(1001, on.f42285n, "Ad sizes cannot be empty.");
        }
        return null;
    }

    @Override // sg.bigo.ads.api.b
    public int c() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> d() {
        HashMap map = new HashMap();
        map.put("ad_size", sg.bigo.ads.ad.banner.a.a(this.f46959h));
        return map;
    }
}
