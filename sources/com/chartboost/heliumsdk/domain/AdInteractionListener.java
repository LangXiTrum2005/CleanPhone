package com.chartboost.heliumsdk.domain;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/chartboost/heliumsdk/domain/AdInteractionListener;", "", "onClicked", "", "partnerAd", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "onDismissed", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationAdException;", "onExpired", "onImpressionTracked", "onRewarded", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface AdInteractionListener {
    void onClicked(PartnerAd partnerAd);

    void onDismissed(PartnerAd partnerAd, ChartboostMediationAdException error);

    void onExpired(PartnerAd partnerAd);

    void onImpressionTracked(PartnerAd partnerAd);

    void onRewarded(PartnerAd partnerAd);
}
