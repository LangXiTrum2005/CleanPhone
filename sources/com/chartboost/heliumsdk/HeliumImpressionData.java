package com.chartboost.heliumsdk;

import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/heliumsdk/HeliumImpressionData;", "", "placementId", "", "ilrdInfo", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getIlrdInfo", "()Lorg/json/JSONObject;", "getPlacementId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HeliumImpressionData {
    private final JSONObject ilrdInfo;
    private final String placementId;

    public HeliumImpressionData(String placementId, JSONObject ilrdInfo) {
        Intrinsics.f(placementId, "placementId");
        Intrinsics.f(ilrdInfo, "ilrdInfo");
        this.placementId = placementId;
        this.ilrdInfo = ilrdInfo;
    }

    public static /* synthetic */ HeliumImpressionData copy$default(HeliumImpressionData heliumImpressionData, String str, JSONObject jSONObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = heliumImpressionData.placementId;
        }
        if ((i2 & 2) != 0) {
            jSONObject = heliumImpressionData.ilrdInfo;
        }
        return heliumImpressionData.copy(str, jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JSONObject getIlrdInfo() {
        return this.ilrdInfo;
    }

    public final HeliumImpressionData copy(String placementId, JSONObject ilrdInfo) {
        Intrinsics.f(placementId, "placementId");
        Intrinsics.f(ilrdInfo, "ilrdInfo");
        return new HeliumImpressionData(placementId, ilrdInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeliumImpressionData)) {
            return false;
        }
        HeliumImpressionData heliumImpressionData = (HeliumImpressionData) other;
        return Intrinsics.a(this.placementId, heliumImpressionData.placementId) && Intrinsics.a(this.ilrdInfo, heliumImpressionData.ilrdInfo);
    }

    public final JSONObject getIlrdInfo() {
        return this.ilrdInfo;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        return this.ilrdInfo.hashCode() + (this.placementId.hashCode() * 31);
    }

    public String toString() {
        return "HeliumImpressionData(placementId=" + this.placementId + ", ilrdInfo=" + this.ilrdInfo + ')';
    }
}
