package com.chartboost.heliumsdk.ad;

import com.chartboost.heliumsdk.domain.Keywords;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;", "", "placementName", "", "keywords", "Lcom/chartboost/heliumsdk/domain/Keywords;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/domain/Keywords;)V", "getKeywords", "()Lcom/chartboost/heliumsdk/domain/Keywords;", "setKeywords", "(Lcom/chartboost/heliumsdk/domain/Keywords;)V", "getPlacementName", "()Ljava/lang/String;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationAdLoadRequest {
    private Keywords keywords;
    private final String placementName;

    public ChartboostMediationAdLoadRequest(String placementName, Keywords keywords) {
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(keywords, "keywords");
        this.placementName = placementName;
        this.keywords = keywords;
    }

    public final Keywords getKeywords() {
        return this.keywords;
    }

    public final String getPlacementName() {
        return this.placementName;
    }

    public final void setKeywords(Keywords keywords) {
        Intrinsics.f(keywords, "<set-?>");
        this.keywords = keywords;
    }
}
