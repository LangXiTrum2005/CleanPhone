package com.chartboost.heliumsdk.domain;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/chartboost/heliumsdk/domain/PreBidRequest;", "", "chartboostPlacement", "", "format", "Lcom/chartboost/heliumsdk/domain/AdFormat;", "loadId", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/domain/AdFormat;Ljava/lang/String;)V", "getChartboostPlacement", "()Ljava/lang/String;", "getFormat", "()Lcom/chartboost/heliumsdk/domain/AdFormat;", "getLoadId", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PreBidRequest {
    private final String chartboostPlacement;
    private final AdFormat format;
    private final String loadId;

    public PreBidRequest(String chartboostPlacement, AdFormat format, String loadId) {
        Intrinsics.f(chartboostPlacement, "chartboostPlacement");
        Intrinsics.f(format, "format");
        Intrinsics.f(loadId, "loadId");
        this.chartboostPlacement = chartboostPlacement;
        this.format = format;
        this.loadId = loadId;
    }

    public static /* synthetic */ PreBidRequest copy$default(PreBidRequest preBidRequest, String str, AdFormat adFormat, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = preBidRequest.chartboostPlacement;
        }
        if ((i2 & 2) != 0) {
            adFormat = preBidRequest.format;
        }
        if ((i2 & 4) != 0) {
            str2 = preBidRequest.loadId;
        }
        return preBidRequest.copy(str, adFormat, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChartboostPlacement() {
        return this.chartboostPlacement;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AdFormat getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLoadId() {
        return this.loadId;
    }

    public final PreBidRequest copy(String chartboostPlacement, AdFormat format, String loadId) {
        Intrinsics.f(chartboostPlacement, "chartboostPlacement");
        Intrinsics.f(format, "format");
        Intrinsics.f(loadId, "loadId");
        return new PreBidRequest(chartboostPlacement, format, loadId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreBidRequest)) {
            return false;
        }
        PreBidRequest preBidRequest = (PreBidRequest) other;
        return Intrinsics.a(this.chartboostPlacement, preBidRequest.chartboostPlacement) && this.format == preBidRequest.format && Intrinsics.a(this.loadId, preBidRequest.loadId);
    }

    public final String getChartboostPlacement() {
        return this.chartboostPlacement;
    }

    public final AdFormat getFormat() {
        return this.format;
    }

    public final String getLoadId() {
        return this.loadId;
    }

    public int hashCode() {
        return this.loadId.hashCode() + ((this.format.hashCode() + (this.chartboostPlacement.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreBidRequest(chartboostPlacement=");
        sb.append(this.chartboostPlacement);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", loadId=");
        return a.p(sb, this.loadId, ')');
    }
}
