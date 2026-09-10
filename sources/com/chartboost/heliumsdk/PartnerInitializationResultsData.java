package com.chartboost.heliumsdk;

import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/chartboost/heliumsdk/PartnerInitializationResultsData;", "", "data", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getData", "()Lorg/json/JSONObject;", "component1", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PartnerInitializationResultsData {
    private final JSONObject data;

    public PartnerInitializationResultsData(JSONObject data) {
        Intrinsics.f(data, "data");
        this.data = data;
    }

    public static /* synthetic */ PartnerInitializationResultsData copy$default(PartnerInitializationResultsData partnerInitializationResultsData, JSONObject jSONObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jSONObject = partnerInitializationResultsData.data;
        }
        return partnerInitializationResultsData.copy(jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JSONObject getData() {
        return this.data;
    }

    public final PartnerInitializationResultsData copy(JSONObject data) {
        Intrinsics.f(data, "data");
        return new PartnerInitializationResultsData(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PartnerInitializationResultsData) && Intrinsics.a(this.data, ((PartnerInitializationResultsData) other).data);
    }

    public final JSONObject getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "PartnerInitializationResultsData(data=" + this.data + ')';
    }
}
