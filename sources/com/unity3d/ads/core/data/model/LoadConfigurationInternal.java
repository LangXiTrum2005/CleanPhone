package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JM\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "", "placementId", "", "adMarkup", "mediationAdUnitId", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/MediationInfo;Ljava/util/Map;)V", "getAdMarkup", "()Ljava/lang/String;", "getExtras", "()Ljava/util/Map;", "getMediationAdUnitId", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "getPlacementId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class LoadConfigurationInternal {
    private final String adMarkup;
    private final Map<String, String> extras;
    private final String mediationAdUnitId;
    private final MediationInfo mediationInfo;
    private final String placementId;

    public LoadConfigurationInternal(String placementId, String str, String str2, MediationInfo mediationInfo, Map<String, String> extras) {
        n.f(placementId, "placementId");
        n.f(extras, "extras");
        this.placementId = placementId;
        this.adMarkup = str;
        this.mediationAdUnitId = str2;
        this.mediationInfo = mediationInfo;
        this.extras = extras;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadConfigurationInternal copy$default(LoadConfigurationInternal loadConfigurationInternal, String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loadConfigurationInternal.placementId;
        }
        if ((i10 & 2) != 0) {
            str2 = loadConfigurationInternal.adMarkup;
        }
        if ((i10 & 4) != 0) {
            str3 = loadConfigurationInternal.mediationAdUnitId;
        }
        if ((i10 & 8) != 0) {
            mediationInfo = loadConfigurationInternal.mediationInfo;
        }
        if ((i10 & 16) != 0) {
            map = loadConfigurationInternal.extras;
        }
        Map map2 = map;
        String str4 = str3;
        return loadConfigurationInternal.copy(str, str2, str4, mediationInfo, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdMarkup() {
        return this.adMarkup;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMediationAdUnitId() {
        return this.mediationAdUnitId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final Map<String, String> component5() {
        return this.extras;
    }

    public final LoadConfigurationInternal copy(String placementId, String adMarkup, String mediationAdUnitId, MediationInfo mediationInfo, Map<String, String> extras) {
        n.f(placementId, "placementId");
        n.f(extras, "extras");
        return new LoadConfigurationInternal(placementId, adMarkup, mediationAdUnitId, mediationInfo, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadConfigurationInternal)) {
            return false;
        }
        LoadConfigurationInternal loadConfigurationInternal = (LoadConfigurationInternal) other;
        return n.a(this.placementId, loadConfigurationInternal.placementId) && n.a(this.adMarkup, loadConfigurationInternal.adMarkup) && n.a(this.mediationAdUnitId, loadConfigurationInternal.mediationAdUnitId) && n.a(this.mediationInfo, loadConfigurationInternal.mediationInfo) && n.a(this.extras, loadConfigurationInternal.extras);
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

    public int hashCode() {
        int iHashCode = this.placementId.hashCode() * 31;
        String str = this.adMarkup;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mediationAdUnitId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        return this.extras.hashCode() + ((iHashCode3 + (mediationInfo != null ? mediationInfo.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "LoadConfigurationInternal(placementId=" + this.placementId + ", adMarkup=" + this.adMarkup + ", mediationAdUnitId=" + this.mediationAdUnitId + ", mediationInfo=" + this.mediationInfo + ", extras=" + this.extras + ')';
    }

    public /* synthetic */ LoadConfigurationInternal(String str, String str2, String str3, MediationInfo mediationInfo, Map map, int i10, g gVar) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : mediationInfo, (i10 & 16) != 0 ? w.f53867a : map);
    }
}
