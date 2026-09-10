package com.chartboost.heliumsdk.ad;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/chartboost/heliumsdk/ad/AdLoadResult;", "", "loadId", "", "metrics", "Lorg/json/JSONObject;", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "(Ljava/lang/String;Lorg/json/JSONObject;Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "setError", "(Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getLoadId", "()Ljava/lang/String;", "getMetrics", "()Lorg/json/JSONObject;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AdLoadResult {
    private ChartboostMediationError error;
    private final String loadId;
    private final JSONObject metrics;

    public AdLoadResult(String loadId, JSONObject metrics, ChartboostMediationError chartboostMediationError) {
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(metrics, "metrics");
        this.loadId = loadId;
        this.metrics = metrics;
        this.error = chartboostMediationError;
    }

    public final ChartboostMediationError getError() {
        return this.error;
    }

    public final String getLoadId() {
        return this.loadId;
    }

    public final JSONObject getMetrics() {
        return this.metrics;
    }

    public final void setError(ChartboostMediationError chartboostMediationError) {
        this.error = chartboostMediationError;
    }
}
