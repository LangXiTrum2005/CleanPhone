package com.chartboost.heliumsdk.network;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/chartboost/heliumsdk/network/NetworkError;", "", "code", "", "chartboostMediationError", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "(ILcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getChartboostMediationError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "getCode", "()I", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "toString", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NetworkError extends Throwable {
    private final ChartboostMediationError chartboostMediationError;
    private final int code;

    public NetworkError(int i2, ChartboostMediationError chartboostMediationError) {
        Intrinsics.f(chartboostMediationError, "chartboostMediationError");
        this.code = i2;
        this.chartboostMediationError = chartboostMediationError;
    }

    public static /* synthetic */ NetworkError copy$default(NetworkError networkError, int i2, ChartboostMediationError chartboostMediationError, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = networkError.code;
        }
        if ((i3 & 2) != 0) {
            chartboostMediationError = networkError.chartboostMediationError;
        }
        return networkError.copy(i2, chartboostMediationError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChartboostMediationError getChartboostMediationError() {
        return this.chartboostMediationError;
    }

    public final NetworkError copy(int code, ChartboostMediationError chartboostMediationError) {
        Intrinsics.f(chartboostMediationError, "chartboostMediationError");
        return new NetworkError(code, chartboostMediationError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkError)) {
            return false;
        }
        NetworkError networkError = (NetworkError) other;
        return this.code == networkError.code && this.chartboostMediationError == networkError.chartboostMediationError;
    }

    public final ChartboostMediationError getChartboostMediationError() {
        return this.chartboostMediationError;
    }

    public final int getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.chartboostMediationError.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "NetworkError(code=" + this.code + ", chartboostMediationError=" + this.chartboostMediationError + ')';
    }
}
