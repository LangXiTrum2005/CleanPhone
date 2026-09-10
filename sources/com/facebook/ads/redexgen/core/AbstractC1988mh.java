package com.facebook.ads.redexgen.core;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1988mh implements AnonymousClass23 {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0H();

    public abstract C2S A0I();

    public abstract boolean A0J();

    public final void A00(int i) {
        this.A00 = i;
    }

    public final void A01(long j) {
        this.A01 = j;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final AdPlacementType A8a() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
