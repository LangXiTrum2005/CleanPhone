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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001'B_\b\u0013\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0013R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010\"¨\u0006("}, d2 = {"Lcom/unity3d/ads/TokenConfiguration;", "", "adFormat", "Lcom/unity3d/ads/AdFormat;", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "placementId", "", "bannerSize", "Lcom/unity3d/ads/BannerSize;", "mediationAdUnitId", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "isNewApi", "", "(Lcom/unity3d/ads/AdFormat;Lcom/unity3d/ads/MediationInfo;Ljava/lang/String;Lcom/unity3d/ads/BannerSize;Ljava/lang/String;Ljava/util/Map;Z)V", "(Lcom/unity3d/ads/AdFormat;Ljava/util/Map;)V", "_bannerSize", "get_bannerSize$annotations", "()V", "_isNewApi", "_mediationAdUnitId", "_mediationInfo", "get_mediationInfo$annotations", "_placementId", "getAdFormat", "()Lcom/unity3d/ads/AdFormat;", "getBannerSize$annotations", "getBannerSize", "()Lcom/unity3d/ads/BannerSize;", "getExtras", "()Ljava/util/Map;", "()Z", "getMediationAdUnitId", "()Ljava/lang/String;", "getMediationInfo$annotations", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getPlacementId", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class TokenConfiguration {
    private BannerSize _bannerSize;
    private boolean _isNewApi;
    private String _mediationAdUnitId;
    private MediationInfo _mediationInfo;
    private String _placementId;
    private final AdFormat adFormat;
    private final Map<String, String> extras;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @UnityAdsExperimental
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/TokenConfiguration$Builder;", "", "adFormat", "Lcom/unity3d/ads/AdFormat;", "(Lcom/unity3d/ads/AdFormat;)V", "bannerSize", "Lcom/unity3d/ads/BannerSize;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "", "mediationAdUnitId", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "placementId", InAppPurchaseConstants.METHOD_BUILD, "Lcom/unity3d/ads/TokenConfiguration;", "withBannerSize", "withExtras", "withMediationAdUnitId", "withMediationInfo", "withPlacementId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Builder {
        private final AdFormat adFormat;
        private BannerSize bannerSize;
        private Map<String, String> extras;
        private String mediationAdUnitId;
        private MediationInfo mediationInfo;
        private String placementId;

        public Builder(AdFormat adFormat) {
            n.f(adFormat, "adFormat");
            this.adFormat = adFormat;
            this.extras = w.f53867a;
        }

        public final TokenConfiguration build() {
            return new TokenConfiguration(this.adFormat, this.mediationInfo, this.placementId, this.bannerSize, this.mediationAdUnitId, this.extras, true, null);
        }

        public final Builder withBannerSize(BannerSize bannerSize) {
            this.bannerSize = bannerSize;
            return this;
        }

        public final Builder withExtras(Map<String, String> extras) {
            n.f(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withMediationAdUnitId(String mediationAdUnitId) {
            this.mediationAdUnitId = mediationAdUnitId;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }

        public final Builder withPlacementId(String placementId) {
            this.placementId = placementId;
            return this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenConfiguration(AdFormat adFormat) {
        this(adFormat, null, 2, 0 == true ? 1 : 0);
        n.f(adFormat, "adFormat");
    }

    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    /* JADX INFO: renamed from: getBannerSize, reason: from getter */
    public final BannerSize get_bannerSize() {
        return this._bannerSize;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: getMediationAdUnitId, reason: from getter */
    public final String get_mediationAdUnitId() {
        return this._mediationAdUnitId;
    }

    /* JADX INFO: renamed from: getMediationInfo, reason: from getter */
    public final MediationInfo get_mediationInfo() {
        return this._mediationInfo;
    }

    /* JADX INFO: renamed from: getPlacementId, reason: from getter */
    public final String get_placementId() {
        return this._placementId;
    }

    /* JADX INFO: renamed from: isNewApi, reason: from getter */
    public final boolean get_isNewApi() {
        return this._isNewApi;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map map, boolean z10, g gVar) {
        this(adFormat, mediationInfo, str, bannerSize, str2, map, z10);
    }

    public TokenConfiguration(AdFormat adFormat, Map<String, String> extras) {
        n.f(adFormat, "adFormat");
        n.f(extras, "extras");
        this.adFormat = adFormat;
        this.extras = extras;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i10, g gVar) {
        this(adFormat, (i10 & 2) != 0 ? w.f53867a : map);
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map map, boolean z10, int i10, g gVar) {
        this(adFormat, (i10 & 2) != 0 ? null : mediationInfo, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : bannerSize, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? w.f53867a : map, (i10 & 64) != 0 ? false : z10);
    }

    @UnityAdsExperimental
    private TokenConfiguration(AdFormat adFormat, MediationInfo mediationInfo, String str, BannerSize bannerSize, String str2, Map<String, String> map, boolean z10) {
        this(adFormat, map);
        this._mediationInfo = mediationInfo;
        this._placementId = str;
        this._bannerSize = bannerSize;
        this._mediationAdUnitId = str2;
        this._isNewApi = z10;
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getBannerSize$annotations() {
    }

    @UnityAdsExperimental
    public static /* synthetic */ void getMediationInfo$annotations() {
    }

    @UnityAdsExperimental
    private static /* synthetic */ void get_bannerSize$annotations() {
    }

    @UnityAdsExperimental
    private static /* synthetic */ void get_mediationInfo$annotations() {
    }
}
