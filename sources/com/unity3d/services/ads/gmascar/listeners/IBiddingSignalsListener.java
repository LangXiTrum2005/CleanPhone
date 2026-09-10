package com.unity3d.services.ads.gmascar.listeners;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface IBiddingSignalsListener {
    void onSignalsFailure(String str);

    void onSignalsReady(BiddingSignals biddingSignals);
}
