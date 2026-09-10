package com.chartboost.heliumsdk.domain;

import com.p004ironsource.x4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AuctionResult;", "", "bids", "Lcom/chartboost/heliumsdk/domain/Bids;", "headers", "", "", "", "chartboostMediationError", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "(Lcom/chartboost/heliumsdk/domain/Bids;Ljava/util/Map;Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getBids", "()Lcom/chartboost/heliumsdk/domain/Bids;", "getChartboostMediationError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AuctionResult {
    private final Bids bids;
    private final ChartboostMediationError chartboostMediationError;
    private final Map<String, List<String>> headers;

    /* JADX WARN: Multi-variable type inference failed */
    public AuctionResult(Bids bids, Map<String, ? extends List<String>> headers, ChartboostMediationError chartboostMediationError) {
        Intrinsics.f(bids, "bids");
        Intrinsics.f(headers, "headers");
        this.bids = bids;
        this.headers = headers;
        this.chartboostMediationError = chartboostMediationError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuctionResult copy$default(AuctionResult auctionResult, Bids bids, Map map, ChartboostMediationError chartboostMediationError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bids = auctionResult.bids;
        }
        if ((i2 & 2) != 0) {
            map = auctionResult.headers;
        }
        if ((i2 & 4) != 0) {
            chartboostMediationError = auctionResult.chartboostMediationError;
        }
        return auctionResult.copy(bids, map, chartboostMediationError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bids getBids() {
        return this.bids;
    }

    public final Map<String, List<String>> component2() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChartboostMediationError getChartboostMediationError() {
        return this.chartboostMediationError;
    }

    public final AuctionResult copy(Bids bids, Map<String, ? extends List<String>> headers, ChartboostMediationError chartboostMediationError) {
        Intrinsics.f(bids, "bids");
        Intrinsics.f(headers, "headers");
        return new AuctionResult(bids, headers, chartboostMediationError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuctionResult)) {
            return false;
        }
        AuctionResult auctionResult = (AuctionResult) other;
        return Intrinsics.a(this.bids, auctionResult.bids) && Intrinsics.a(this.headers, auctionResult.headers) && this.chartboostMediationError == auctionResult.chartboostMediationError;
    }

    public final Bids getBids() {
        return this.bids;
    }

    public final ChartboostMediationError getChartboostMediationError() {
        return this.chartboostMediationError;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        int iHashCode = (this.headers.hashCode() + (this.bids.hashCode() * 31)) * 31;
        ChartboostMediationError chartboostMediationError = this.chartboostMediationError;
        return iHashCode + (chartboostMediationError == null ? 0 : chartboostMediationError.hashCode());
    }

    public String toString() {
        return "AuctionResult(bids=" + this.bids + ", headers=" + this.headers + ", chartboostMediationError=" + this.chartboostMediationError + ')';
    }

    public /* synthetic */ AuctionResult(Bids bids, Map map, ChartboostMediationError chartboostMediationError, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bids, map, (i2 & 4) != 0 ? null : chartboostMediationError);
    }
}
