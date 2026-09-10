package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.p004ironsource.sv;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH&J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/chartboost/sdk/callbacks/AdCallback;", "", sv.f, "", "event", "Lcom/chartboost/sdk/events/ClickEvent;", "error", "Lcom/chartboost/sdk/events/ClickError;", "onAdExpired", "Lcom/chartboost/sdk/events/ExpirationEvent;", sv.j, "Lcom/chartboost/sdk/events/CacheEvent;", "Lcom/chartboost/sdk/events/CacheError;", "onAdRequestedToShow", "Lcom/chartboost/sdk/events/ShowEvent;", "onAdShown", "Lcom/chartboost/sdk/events/ShowError;", "onImpressionRecorded", "Lcom/chartboost/sdk/events/ImpressionEvent;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AdCallback {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdExpired(AdCallback adCallback, ExpirationEvent event) {
            Intrinsics.f(event, "event");
        }
    }

    void onAdClicked(ClickEvent event, ClickError error);

    void onAdExpired(ExpirationEvent event);

    void onAdLoaded(CacheEvent event, CacheError error);

    void onAdRequestedToShow(ShowEvent event);

    void onAdShown(ShowEvent event, ShowError error);

    void onImpressionRecorded(ImpressionEvent event);
}
