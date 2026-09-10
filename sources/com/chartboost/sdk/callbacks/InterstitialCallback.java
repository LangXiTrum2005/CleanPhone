package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.ExpirationEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/chartboost/sdk/callbacks/InterstitialCallback;", "Lcom/chartboost/sdk/callbacks/DismissibleAdCallback;", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface InterstitialCallback extends DismissibleAdCallback {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdExpired(InterstitialCallback interstitialCallback, ExpirationEvent event) {
            Intrinsics.f(event, "event");
            DismissibleAdCallback.DefaultImpls.onAdExpired(interstitialCallback, event);
        }
    }
}
