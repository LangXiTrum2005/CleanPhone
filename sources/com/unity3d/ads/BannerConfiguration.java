package com.unity3d.ads;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@UnityAdsExperimental
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bBY\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/BannerConfiguration;", "", "placementId", "", "bannerSize", "Lcom/unity3d/ads/BannerSize;", "listener", "Lcom/unity3d/ads/BannerShowListener;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "adMarkup", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "mediationAdUnitId", "(Ljava/lang/String;Lcom/unity3d/ads/BannerSize;Lcom/unity3d/ads/BannerShowListener;Ljava/util/Map;Ljava/lang/String;Lcom/unity3d/ads/MediationInfo;Ljava/lang/String;)V", "getAdMarkup", "()Ljava/lang/String;", "getBannerSize", "()Lcom/unity3d/ads/BannerSize;", "getExtras", "()Ljava/util/Map;", "getListener", "()Lcom/unity3d/ads/BannerShowListener;", "getMediationAdUnitId", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getPlacementId", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class BannerConfiguration {
    private final String adMarkup;
    private final BannerSize bannerSize;
    private final Map<String, String> extras;
    private final BannerShowListener listener;
    private final String mediationAdUnitId;
    private final MediationInfo mediationInfo;
    private final String placementId;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003J\u001a\u0010\u0012\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/BannerConfiguration$Builder;", "", "placementId", "", "bannerSize", "Lcom/unity3d/ads/BannerSize;", "listener", "Lcom/unity3d/ads/BannerShowListener;", "(Ljava/lang/String;Lcom/unity3d/ads/BannerSize;Lcom/unity3d/ads/BannerShowListener;)V", "adMarkup", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "mediationAdUnitId", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/unity3d/ads/BannerConfiguration;", "withAdMarkup", "withExtras", "withMediationAdUnitId", "withMediationInfo", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Builder {
        private String adMarkup;
        private final BannerSize bannerSize;
        private Map<String, String> extras;
        private final BannerShowListener listener;
        private String mediationAdUnitId;
        private MediationInfo mediationInfo;
        private final String placementId;

        public Builder(String placementId, BannerSize bannerSize, BannerShowListener listener) {
            n.f(placementId, "placementId");
            n.f(bannerSize, "bannerSize");
            n.f(listener, "listener");
            this.placementId = placementId;
            this.bannerSize = bannerSize;
            this.listener = listener;
            this.extras = w.f53867a;
        }

        public final BannerConfiguration build() {
            return new BannerConfiguration(this.placementId, this.bannerSize, this.listener, this.extras, this.adMarkup, this.mediationInfo, this.mediationAdUnitId, null);
        }

        public final Builder withAdMarkup(String adMarkup) {
            n.f(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final Builder withExtras(Map<String, String> extras) {
            n.f(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withMediationAdUnitId(String mediationAdUnitId) {
            n.f(mediationAdUnitId, "mediationAdUnitId");
            this.mediationAdUnitId = mediationAdUnitId;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            n.f(mediationInfo, "mediationInfo");
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public /* synthetic */ BannerConfiguration(String str, BannerSize bannerSize, BannerShowListener bannerShowListener, Map map, String str2, MediationInfo mediationInfo, String str3, g gVar) {
        this(str, bannerSize, bannerShowListener, map, str2, mediationInfo, str3);
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final BannerSize getBannerSize() {
        return this.bannerSize;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final BannerShowListener getListener() {
        return this.listener;
    }

    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    private BannerConfiguration(String str, BannerSize bannerSize, BannerShowListener bannerShowListener, Map<String, String> map, String str2, MediationInfo mediationInfo, String str3) {
        this.placementId = str;
        this.bannerSize = bannerSize;
        this.listener = bannerShowListener;
        this.extras = map;
        this.adMarkup = str2;
        this.mediationInfo = mediationInfo;
        this.mediationAdUnitId = str3;
    }

    public /* synthetic */ BannerConfiguration(String str, BannerSize bannerSize, BannerShowListener bannerShowListener, Map map, String str2, MediationInfo mediationInfo, String str3, int i10, g gVar) {
        this(str, bannerSize, bannerShowListener, (i10 & 8) != 0 ? w.f53867a : map, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : mediationInfo, (i10 & 64) != 0 ? null : str3);
    }
}
