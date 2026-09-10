package sg.bigo.ads.api;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public interface InnerBannerAd extends BannerAd {
    void destroyInMainThread();

    sg.bigo.ads.api.core.c getInnerBannerAdData();

    WebView getWebView();

    void handleInnerBannerAdResponse(sg.bigo.ads.api.b.d.a<InnerBannerAd> aVar);

    boolean isInnerBannerAdFromAutoRefresh();

    void markFromAutoFresh(sg.bigo.ads.api.core.c cVar);

    int updateFormOpenTimes();
}
