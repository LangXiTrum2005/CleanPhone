package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006)"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueData;", "", "eventId", "Ljava/util/UUID;", "revenue", "", "countryCode", "", "networkName", "adUnitId", "thirdPartyAdPlacementId", "adFormat", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "(Ljava/util/UUID;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;)V", "getAdFormat", "()Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "getAdUnitId", "()Ljava/lang/String;", "getCountryCode", "getEventId", "()Ljava/util/UUID;", "getNetworkName", "getRevenue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getThirdPartyAdPlacementId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/UUID;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;)Lcom/unity3d/ads/core/data/model/AdRevenueData;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class AdRevenueData {
    private final AdRevenueAdFormat adFormat;
    private final String adUnitId;
    private final String countryCode;
    private final UUID eventId;
    private final String networkName;
    private final Double revenue;
    private final String thirdPartyAdPlacementId;

    public AdRevenueData(UUID eventId, Double d10, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat) {
        n.f(eventId, "eventId");
        this.eventId = eventId;
        this.revenue = d10;
        this.countryCode = str;
        this.networkName = str2;
        this.adUnitId = str3;
        this.thirdPartyAdPlacementId = str4;
        this.adFormat = adRevenueAdFormat;
    }

    public static /* synthetic */ AdRevenueData copy$default(AdRevenueData adRevenueData, UUID uuid, Double d10, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uuid = adRevenueData.eventId;
        }
        if ((i10 & 2) != 0) {
            d10 = adRevenueData.revenue;
        }
        if ((i10 & 4) != 0) {
            str = adRevenueData.countryCode;
        }
        if ((i10 & 8) != 0) {
            str2 = adRevenueData.networkName;
        }
        if ((i10 & 16) != 0) {
            str3 = adRevenueData.adUnitId;
        }
        if ((i10 & 32) != 0) {
            str4 = adRevenueData.thirdPartyAdPlacementId;
        }
        if ((i10 & 64) != 0) {
            adRevenueAdFormat = adRevenueData.adFormat;
        }
        String str5 = str4;
        AdRevenueAdFormat adRevenueAdFormat2 = adRevenueAdFormat;
        String str6 = str3;
        String str7 = str;
        return adRevenueData.copy(uuid, d10, str7, str2, str6, str5, adRevenueAdFormat2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getRevenue() {
        return this.revenue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AdRevenueAdFormat getAdFormat() {
        return this.adFormat;
    }

    public final AdRevenueData copy(UUID eventId, Double revenue, String countryCode, String networkName, String adUnitId, String thirdPartyAdPlacementId, AdRevenueAdFormat adFormat) {
        n.f(eventId, "eventId");
        return new AdRevenueData(eventId, revenue, countryCode, networkName, adUnitId, thirdPartyAdPlacementId, adFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdRevenueData)) {
            return false;
        }
        AdRevenueData adRevenueData = (AdRevenueData) other;
        return n.a(this.eventId, adRevenueData.eventId) && n.a(this.revenue, adRevenueData.revenue) && n.a(this.countryCode, adRevenueData.countryCode) && n.a(this.networkName, adRevenueData.networkName) && n.a(this.adUnitId, adRevenueData.adUnitId) && n.a(this.thirdPartyAdPlacementId, adRevenueData.thirdPartyAdPlacementId) && this.adFormat == adRevenueData.adFormat;
    }

    public final AdRevenueAdFormat getAdFormat() {
        return this.adFormat;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final Double getRevenue() {
        return this.revenue;
    }

    public final String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId;
    }

    public int hashCode() {
        int iHashCode = this.eventId.hashCode() * 31;
        Double d10 = this.revenue;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.networkName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adUnitId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thirdPartyAdPlacementId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdRevenueAdFormat adRevenueAdFormat = this.adFormat;
        return iHashCode6 + (adRevenueAdFormat != null ? adRevenueAdFormat.hashCode() : 0);
    }

    public String toString() {
        return "AdRevenueData(eventId=" + this.eventId + ", revenue=" + this.revenue + ", countryCode=" + this.countryCode + ", networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", thirdPartyAdPlacementId=" + this.thirdPartyAdPlacementId + ", adFormat=" + this.adFormat + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdRevenueData(UUID uuid, Double d10, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat, int i10, g gVar) {
        if ((i10 & 1) != 0) {
            uuid = UUID.randomUUID();
            n.e(uuid, "randomUUID()");
        }
        this(uuid, d10, str, str2, str3, str4, adRevenueAdFormat);
    }
}
