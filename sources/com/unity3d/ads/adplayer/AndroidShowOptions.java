package com.unity3d.ads.adplayer;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003Js\u0010 \u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidShowOptions;", "Lcom/unity3d/ads/adplayer/ShowOptions;", "unityAdsShowOptions", "", "", "", "placementId", "isScarAd", "", "scarQueryId", "scarAdString", "scarAdUnitId", "isOfferwallAd", "offerwallPlacementName", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "()Z", "getOfferwallPlacementName", "()Ljava/lang/String;", "getPlacementId", "getScarAdString", "getScarAdUnitId", "getScarQueryId", "getUnityAdsShowOptions", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final boolean isScarAd;
    private final String offerwallPlacementName;
    private final String placementId;
    private final String scarAdString;
    private final String scarAdUnitId;
    private final String scarQueryId;
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(Map<String, ? extends Object> map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z10;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i10 & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i10 & 4) != 0) {
            z10 = androidShowOptions.isScarAd;
        }
        if ((i10 & 8) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        if ((i10 & 16) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        if ((i10 & 32) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        if ((i10 & 64) != 0) {
            z11 = androidShowOptions.isOfferwallAd;
        }
        if ((i10 & 128) != 0) {
            str5 = androidShowOptions.offerwallPlacementName;
        }
        boolean z12 = z11;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return androidShowOptions.copy(map, str, z10, str2, str7, str8, z12, str6);
    }

    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsScarAd() {
        return this.isScarAd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getScarAdString() {
        return this.scarAdString;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final AndroidShowOptions copy(Map<String, ? extends Object> unityAdsShowOptions, String placementId, boolean isScarAd, String scarQueryId, String scarAdString, String scarAdUnitId, boolean isOfferwallAd, String offerwallPlacementName) {
        return new AndroidShowOptions(unityAdsShowOptions, placementId, isScarAd, scarQueryId, scarAdString, scarAdUnitId, isOfferwallAd, offerwallPlacementName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) other;
        return n.a(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && n.a(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && n.a(this.scarQueryId, androidShowOptions.scarQueryId) && n.a(this.scarAdString, androidShowOptions.scarAdString) && n.a(this.scarAdUnitId, androidShowOptions.scarAdUnitId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && n.a(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        Map<String, Object> map = this.unityAdsShowOptions;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.placementId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.isScarAd;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        int i10 = (iHashCode2 + r2) * 31;
        String str2 = this.scarQueryId;
        int iHashCode3 = (i10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        int i11 = (iHashCode5 + (z11 ? 1 : z11)) * 31;
        String str5 = this.offerwallPlacementName;
        return i11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidShowOptions(unityAdsShowOptions=");
        sb2.append(this.unityAdsShowOptions);
        sb2.append(", placementId=");
        sb2.append(this.placementId);
        sb2.append(", isScarAd=");
        sb2.append(this.isScarAd);
        sb2.append(", scarQueryId=");
        sb2.append(this.scarQueryId);
        sb2.append(", scarAdString=");
        sb2.append(this.scarAdString);
        sb2.append(", scarAdUnitId=");
        sb2.append(this.scarAdUnitId);
        sb2.append(", isOfferwallAd=");
        sb2.append(this.isOfferwallAd);
        sb2.append(", offerwallPlacementName=");
        return d.k(sb2, this.offerwallPlacementName, ')');
    }

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5, int i10, g gVar) {
        this(map, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? null : str5);
    }
}
