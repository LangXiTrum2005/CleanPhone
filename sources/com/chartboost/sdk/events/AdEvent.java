package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/chartboost/sdk/events/AdEvent;", "", "ad", "Lcom/chartboost/sdk/ads/Ad;", "getAd", "()Lcom/chartboost/sdk/ads/Ad;", "adID", "", "getAdID", "()Ljava/lang/String;", "Lcom/chartboost/sdk/events/CacheEvent;", "Lcom/chartboost/sdk/events/ClickEvent;", "Lcom/chartboost/sdk/events/DismissEvent;", "Lcom/chartboost/sdk/events/ImpressionEvent;", "Lcom/chartboost/sdk/events/RewardEvent;", "Lcom/chartboost/sdk/events/ShowEvent;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AdEvent {
    Ad getAd();

    String getAdID();
}
