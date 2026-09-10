package com.unity3d.ads;

import android.view.View;
import cn.a0;
import cn.d0;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@UnityAdsExperimental
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/BannerAd;", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "view", "Landroid/view/View;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "(Lcom/unity3d/ads/core/data/model/AdObject;Landroid/view/View;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "onAdExpired", "Lcom/unity3d/ads/AdExpiredListener;", "getOnAdExpired", "()Lcom/unity3d/ads/AdExpiredListener;", "setOnAdExpired", "(Lcom/unity3d/ads/AdExpiredListener;)V", "getView", "()Landroid/view/View;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class BannerAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<BannerAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final View view;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/BannerAd$Companion;", "", "<init>", "()V", "Lcom/unity3d/ads/BannerConfiguration;", "configuration", "Lcom/unity3d/ads/LoadListener;", "Lcom/unity3d/ads/BannerAd;", "listener", "Lwj/r;", "load", "(Lcom/unity3d/ads/BannerConfiguration;Lcom/unity3d/ads/LoadListener;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void load(BannerConfiguration configuration, LoadListener<BannerAd> listener) {
            n.f(configuration, "configuration");
            n.f(listener, "listener");
            d0.w((a0) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, kotlin.jvm.internal.d0.f44761a.b(a0.class))), null, new BannerAd$Companion$load$1(listener, configuration, null), 3);
        }

        private Companion() {
        }
    }

    public BannerAd(AdObject adObject, View view, SafeCallbackInvoke safeCallbackInvoke) {
        a0 scope;
        n.f(adObject, "adObject");
        n.f(view, "view");
        n.f(safeCallbackInvoke, "safeCallbackInvoke");
        this.adObject = adObject;
        this.view = view;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        d0.w(scope, null, new BannerAd$1$1(this, null), 3);
    }

    public static final void load(BannerConfiguration bannerConfiguration, LoadListener<BannerAd> loadListener) {
        INSTANCE.load(bannerConfiguration, loadListener);
    }

    public final AdExpiredListener<BannerAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final View getView() {
        return this.view;
    }

    public final void setOnAdExpired(AdExpiredListener<BannerAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }
}
