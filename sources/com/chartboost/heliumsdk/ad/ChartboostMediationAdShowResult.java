package com.chartboost.heliumsdk.ad;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdShowResult;", "", "metrics", "Lorg/json/JSONObject;", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "(Lorg/json/JSONObject;Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "setError", "(Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getMetrics", "()Lorg/json/JSONObject;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationAdShowResult {
    private ChartboostMediationError error;
    private final JSONObject metrics;

    public ChartboostMediationAdShowResult(JSONObject metrics, ChartboostMediationError chartboostMediationError) {
        Intrinsics.f(metrics, "metrics");
        this.metrics = metrics;
        this.error = chartboostMediationError;
    }

    public final ChartboostMediationError getError() {
        return this.error;
    }

    public final JSONObject getMetrics() {
        return this.metrics;
    }

    public final void setError(ChartboostMediationError chartboostMediationError) {
        this.error = chartboostMediationError;
    }
}
