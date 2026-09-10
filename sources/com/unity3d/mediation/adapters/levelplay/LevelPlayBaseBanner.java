package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import com.ironsource.InterfaceC0562s3;
import com.ironsource.mediationsdk.adunit.adapter.BaseBanner;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class LevelPlayBaseBanner<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseBanner<NetworkAdapter> implements InterfaceC0562s3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseBanner(NetworkSettings networkSettings) {
        super(networkSettings);
        n.f(networkSettings, "networkSettings");
    }

    @Override // com.ironsource.InterfaceC0562s3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        n.f(context, "context");
        n.f(biddingDataCallback, "biddingDataCallback");
    }
}
