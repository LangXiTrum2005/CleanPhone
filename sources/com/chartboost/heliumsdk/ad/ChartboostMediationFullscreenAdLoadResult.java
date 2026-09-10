package com.chartboost.heliumsdk.ad;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdLoadResult;", "Lcom/chartboost/heliumsdk/ad/AdLoadResult;", "ad", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd;", "loadId", "", "metrics", "Lorg/json/JSONObject;", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "(Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd;Ljava/lang/String;Lorg/json/JSONObject;Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getAd", "()Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationFullscreenAdLoadResult extends AdLoadResult {
    private final ChartboostMediationFullscreenAd ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationFullscreenAdLoadResult(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd, String loadId, JSONObject metrics, ChartboostMediationError chartboostMediationError) {
        super(loadId, metrics, chartboostMediationError);
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(metrics, "metrics");
        this.ad = chartboostMediationFullscreenAd;
    }

    public final ChartboostMediationFullscreenAd getAd() {
        return this.ad;
    }
}
