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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013BA\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/LoadConfiguration;", "", "placementId", "", "adMarkup", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "mediationAdUnitId", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/MediationInfo;Ljava/lang/String;Ljava/util/Map;)V", "getAdMarkup", "()Ljava/lang/String;", "getExtras", "()Ljava/util/Map;", "getMediationAdUnitId", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getPlacementId", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class LoadConfiguration {
    private final String adMarkup;
    private final Map<String, String> extras;
    private final String mediationAdUnitId;
    private final MediationInfo mediationInfo;
    private final String placementId;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003J\u001a\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/LoadConfiguration$Builder;", "", "placementId", "", "(Ljava/lang/String;)V", "adMarkup", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "mediationAdUnitId", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "getPlacementId", "()Ljava/lang/String;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/unity3d/ads/LoadConfiguration;", "withAdMarkup", "withExtras", "withMediationAdUnitId", "withMediationInfo", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Builder {
        private String adMarkup;
        private Map<String, String> extras;
        private String mediationAdUnitId;
        private MediationInfo mediationInfo;
        private final String placementId;

        public Builder(String placementId) {
            n.f(placementId, "placementId");
            this.placementId = placementId;
            this.extras = w.f53867a;
        }

        public final LoadConfiguration build() {
            return new LoadConfiguration(this.placementId, this.adMarkup, this.mediationInfo, this.mediationAdUnitId, this.extras, null);
        }

        public final String getPlacementId() {
            return this.placementId;
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

    public /* synthetic */ LoadConfiguration(String str, String str2, MediationInfo mediationInfo, String str3, Map map, g gVar) {
        this(str, str2, mediationInfo, str3, map);
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
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

    private LoadConfiguration(String str, String str2, MediationInfo mediationInfo, String str3, Map<String, String> map) {
        this.placementId = str;
        this.adMarkup = str2;
        this.mediationInfo = mediationInfo;
        this.mediationAdUnitId = str3;
        this.extras = map;
    }
}
